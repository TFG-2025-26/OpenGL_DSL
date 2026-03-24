#include "Node.h"
#include <glm/gtc/matrix_transform.hpp>
#include <glm/gtc/type_ptr.hpp>

Node::Node(dvec3 pos, dvec3 rot, dvec3 esc)
	:pos(pos), rot(rot),esc(esc)
{}

Node::~Node() {
	for (Abs_Entity* el : gObjects) {
		delete el;
		el = nullptr;
	}
	for (Node* el : nodes) {
		delete el;
		el = nullptr;
	}
}

void Node::addEntity(Abs_Entity* ent) {
	gObjects.push_back(ent);
}

void Node::addNode(Node* n) {
	nodes.push_back(n);
}

void Node::render(dmat4 const& modelViewMat) const
{
	for (Abs_Entity* el : gObjects) {
		el->render(modelViewMat);
	}

	glm::dmat4 matS = glm::translate(dmat4(1), dvec3(0, 200, 0)) * glm::rotate(dmat4(1), radians(-90.0), dvec3(1, 0, 0));
	dmat4 mModelMat = dmat4(1);
	mModelMat = mModelMat * glm::translate(dmat4(1), pos);
	mModelMat = mModelMat * glm::rotate(dmat4(1), radians(rot.x), dvec3(1, 0, 0));
	mModelMat = mModelMat * glm::rotate(dmat4(1), radians(rot.y), dvec3(0, 1, 0));
	mModelMat = mModelMat * glm::rotate(dmat4(1), radians(rot.z), dvec3(0, 0, 1));
	mModelMat = mModelMat * glm::scale(dmat4(1), esc);

	dmat4 aMat = modelViewMat * mModelMat;
	glMatrixMode(GL_MODELVIEW);
	glLoadMatrixd(value_ptr(aMat));

	for (Node* n : nodes) {
		n->render(aMat);
	}
}


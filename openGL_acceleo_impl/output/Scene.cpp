#include "Scene.h"

#include <glm/gtc/matrix_transform.hpp>
#include <glm/gtc/type_ptr.hpp>

using namespace glm;

void
Scene::init()
{
	setGL(); // OpenGL settings
	
}

void
Scene::free()
{ // release memory and resources

	for (Node* el : nodes) {
		delete el;
		el = nullptr;
	}
}

void
Scene::setGL()
{
	// OpenGL basic setting
	glClearColor(0.6, 0.7, 0.8, 1.0); // background color (alpha=1 -> opaque)
	glEnable(GL_DEPTH_TEST);          // enable Depth test
	glEnable(GL_TEXTURE_2D);
	glEnable(GL_BLEND);
	glEnable(GL_NORMALIZE);
	glEnable(GL_COLOR_MATERIAL);
	//glEnable(GL_LIGHTING);
}

void
Scene::resetGL()
{
	glClearColor(.0, .0, .0, .0); // background color (alpha=1 -> opaque)
	glDisable(GL_DEPTH_TEST);     // disable Depth test
	glDisable(GL_TEXTURE_2D);
	glDisable(GL_BLEND);
	glDisable(GL_NORMALIZE);
	glDisable(GL_COLOR_MATERIAL);
	//glDisable(GL_LIGHTING);
}

void
Scene::render(Camera const& cam) const
{
	
	cam.upload();

	for (Node* n : nodes) {
		n->render(cam.viewMat());
	}
}

void
Scene::addNode(Node* n)
{
	nodes.push_back(n);
}


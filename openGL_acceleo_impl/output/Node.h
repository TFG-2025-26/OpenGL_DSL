#ifndef _H_Node_H_
#define _H_Node_H_

#include <GL/freeglut.h>
#include <glm/glm.hpp>

#include "Entity.h"

#include <vector>

using namespace glm;

class Node
{
public:
	Node(dvec3 pos, dvec3 rot, dvec3 esc);
	~Node();

	void render(glm::dmat4 const& modelViewMat) const;

	void addEntity(Abs_Entity* ent);
	void addNode(Node* n);


protected:

	std::vector<Abs_Entity*> gObjects;
	std::vector<Node*> nodes;
	dvec3 pos;
	dvec3 rot;
	dvec3 esc;
dmat4 mModelMat;
};
#endif

#ifndef _H_Scene_H_
#define _H_Scene_H_

#include <GL/freeglut.h>
#include <glm/glm.hpp>

#include "Camera.h"
#include "Node.h"

#include <vector>

class Scene
{
public:
	Scene() = default;
	~Scene()
	{
		free();
		resetGL();
	};

	Scene(const Scene& s) = delete;            // no copy constructor
	Scene& operator=(const Scene& s) = delete; // no copy assignment

	void init();

	void render(Camera const& cam) const;

    void addNode(Node* n);
    void setVisible(bool v);


protected:
	void free();
	void setGL();
	void resetGL();

	std::vector<Node*> nodes; // Entities (graphic objects) of the scene
    bool visible;
	
};

#endif //_H_Scene_H_

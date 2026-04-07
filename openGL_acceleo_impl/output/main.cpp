#include <GL/freeglut.h>
#include <glm/glm.hpp>   // OpenGL Mathematics
#include <iostream>

#include "Viewport.h"
#include "Camera.h"
#include "Scene.h"
#include <vector>

using namespace std;

// Variables globales
Viewport* viewport = nullptr;
Camera* camera = nullptr;
vector<Scene*> scenes;




Node* Node_ejes2() {
    Node* node = new Node(
        dvec3(-200.0, -200.0, 0.0),//pos
        dvec3(0.0, -45.0, 0.0),//rot
        dvec3(2.0, 1.0, 1.0)//esc
    );

    node->addEntity(new EjesRGB(400.0));
    // Generar hijos recursivamente

    return node;
}

Node* Node_ejes() {
    Node* node = new Node(
        dvec3(100.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    node->addEntity(new EjesRGB(400.0));
    // Generar hijos recursivamente
    node->addNode(Node_ejes2());

    return node;
}

Scene* Scene_ejes(){
    Scene* scene= new Scene();
    scene->addNode(Node_ejes());
    return scene;
}


Node* Node_extra() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    node->addEntity(new EjesRGB(400.0));
    // Generar hijos recursivamente

    return node;
}

Scene* Scene_extra(){
    Scene* scene= new Scene();
    scene->addNode(Node_extra());
    return scene;
}

void display() {
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
    
    for (Scene* sc : scenes) {
		sc->render(*camera);
	}

    glutSwapBuffers();
}

void iniWinOpenGL() { // Initialization
	cout << "Starting glut...\n";
	int argc = 0;
	glutInit(&argc, nullptr);

	glutInitContextVersion(3, 3);
	glutInitContextProfile(GLUT_COMPATIBILITY_PROFILE); // GLUT_CORE_PROFILE
	glutInitContextFlags(GLUT_DEBUG);                   // GLUT_FORWARD_COMPATIBLE

	glutSetOption(GLUT_ACTION_ON_WINDOW_CLOSE, GLUT_ACTION_GLUTMAINLOOP_RETURNS);

	glutInitWindowSize(800, 600); // window size
	// glutInitWindowPosition (140, 140);

	glutInitDisplayMode(GLUT_RGBA | GLUT_DOUBLE |
	                    GLUT_DEPTH /*| GLUT_STENCIL*/); // RGBA colors, double buffer, depth
	                                                    // buffer and stencil buffer

	glutCreateWindow(
	  "OpenGL Engine - MDE Generated"); // with its associated OpenGL context, return window's identifier

	glutDisplayFunc(display);

	cout << glGetString(GL_VERSION) << '\n';
	cout << glGetString(GL_VENDOR) << '\n';
}

void init() {
    // create an OpenGL Context
    iniWinOpenGL();

    // create the scene after creating the context
    // allocate memory and resources
     // Inicialización de Viewport y Cámara
    viewport = new Viewport(800, 600);
    camera = new Camera(viewport);

    // CARGA DE ENTIDADES DESDE EL MODELO XMI
    Scene* sc;
    sc = Scene_ejes();
    scenes.push_back(sc);
    sc->init();
    sc = Scene_extra();
    scenes.push_back(sc);
    sc->init();

}

int main(int argc, char** argv) {
    init();
    glutMainLoop();

    // Limpieza de memoria
    for (Scene* sc : scenes) {
	delete sc;
	sc = nullptr;
    }
    delete camera;
    delete viewport;

    return 0;
}

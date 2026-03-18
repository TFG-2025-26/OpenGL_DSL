#include <GL/freeglut.h>
#include <glm/glm.hpp>   // OpenGL Mathematics
#include <iostream>

#include "Viewport.h"
#include "Camera.h"

using namespace std;

// Variables globales
Viewport* viewport = nullptr;
Camera* camera = nullptr;

void display() {
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
    
    camera->upload();

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

    glClearColor(0.6, 0.7, 0.8, 1.0);

    // CARGA DE ENTIDADES DESDE EL MODELO XMI
}

int main(int argc, char** argv) {
    init();
    glutMainLoop();

    // Limpieza de memoria
    delete camera;
    delete viewport;

    return 0;
}

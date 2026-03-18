#include <GL/freeglut.h>
#include <vector>
#include "Viewport.h"
#include "Camera.h"

// Inclusión de la estructura de clases del Ecore
#include "Abs_Entity.h"
#include "Esfera.h"
#include "Rectangulo.h"

// Variables globales
Viewport* viewport = nullptr;
Camera* camera = nullptr;
std::vector<Abs_Entity*> entities; // Vector de la clase base abstracta

void init() {
    glClearColor(0.1f, 0.1f, 0.1f, 1.0f);
    glEnable(GL_DEPTH_TEST);
    if (camera) camera->setVM();
}

void display() {
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
    
    if (viewport) viewport->upload();
    if (camera) camera->uploadVM();

    // LLAMADA REAL AL RENDER (Polimorfismo C++)
    // Recorremos el vector y cada objeto ejecuta su propio render() (.cpp de la hija)
    for (Abs_Entity* e : entities) {
        e->render();
    }

    glutSwapBuffers();
}

int main(int argc, char** argv) {
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB | GLUT_DEPTH);
    glutInitWindowSize(0, 0);
    glutCreateWindow("OpenGL Engine - MDE Generated");

    // Inicialización de Viewport y Cámara
    viewport = new Viewport(, );
    camera = new Camera(viewport);

    // CARGA DE ENTIDADES DESDE EL MODELO XMI
    entities.push_back(new Esfera()); 

    init();
    glutDisplayFunc(display);
    glutMainLoop();

    // Limpieza de memoria
    for (Abs_Entity* e : entities) delete e;
    delete camera;
    delete viewport;

    return 0;
}

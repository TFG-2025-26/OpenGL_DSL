#include <GL/glut.h>
#include <iostream>

// Configuración generada desde el modelo XMI
const int WIN_WIDTH = 0;
const int WIN_HEIGHT = 0;
const int WIN_ID = 0;

void init() {
    glClearColor(0.0, 0.0, 0.7, 1.0);
    glEnable(GL_DEPTH_TEST);
}

void display() {
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
    glLoadIdentity();

    // Generando Escena Scene
    glPushMatrix();
        // Renderizado de entidades del nodo
            // Renderizando Rectangulo
            glBegin(GL_QUADS);
                glVertex2f(-0.5, -0.5);
                glVertex2f(0.5, -0.5);
                glVertex2f(0.5, 0.5);
                glVertex2f(-0.5, 0.5);
            glEnd();
         
    glPopMatrix();

    glutSwapBuffers();
}

int main(int argc, char** argv) {
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB | GLUT_DEPTH);
    glutInitWindowSize(WIN_WIDTH, WIN_HEIGHT);
    glutCreateWindow("OpenGL Engine - ID: 0");
    
    init();
    glutDisplayFunc(display);
    glutMainLoop();
    return 0;
}

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

glm::dvec2 mMouseCoord;
int mMouseButt;



Node* Node_eje() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    node->addEntity(new EjesRGB(400.0));
    // Generar hijos recursivamente

    return node;
}

Scene* Scene_eje(){
    Scene* scene= new Scene();
    scene->addNode(Node_eje());
    scene->setVisible(true);
    return scene;
}



Node* Node_triangulo() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    auto e1 = new PoligonoRegular(3,100.0,false);
    node->addEntity(e1);
    e1->setColor(dvec4(1.0,0.0,0.0,1.0));
    // Generar hijos recursivamente

    return node;
}


Node* Node_cuadrado() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    auto e1 = new PoligonoRegular(4,200.0,true);
    node->addEntity(e1);
    e1->setColor(dvec4(0.0,1.0,0.0,1.0));
    // Generar hijos recursivamente

    return node;
}


Node* Node_pentagono() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    auto e1 = new PoligonoRegular(5,300.0,false);
    node->addEntity(e1);
    e1->setColor(dvec4(0.0,0.0,1.0,1.0));
    // Generar hijos recursivamente

    return node;
}


Node* Node_hexagono() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    auto e1 = new PoligonoRegular(6,400.0,true);
    node->addEntity(e1);
    e1->setColor(dvec4(1.0,1.0,0.0,1.0));
    // Generar hijos recursivamente

    return node;
}

Node* Node_poligonos() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    // Generar hijos recursivamente
    node->addNode(Node_triangulo());
    node->addNode(Node_cuadrado());
    node->addNode(Node_pentagono());
    node->addNode(Node_hexagono());

    return node;
}

Scene* Scene_poligonos(){
    Scene* scene= new Scene();
    scene->addNode(Node_poligonos());
    scene->setVisible(false);
    return scene;
}


Node* Node_rectangulos() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    auto e1 = new Rectangulo(100.0,50.0,false);
    node->addEntity(e1);
    e1->setColor(dvec4(0.0,0.0,0.0,1.0));
    auto e2 = new Rectangulo(200.0,100.0,true);
    node->addEntity(e2);
    auto e3 = new Rectangulo(300.0,200.0,false);
    node->addEntity(e3);
    e3->setColor(dvec4(1.0,0.0,0.0,1.0));
    // Generar hijos recursivamente

    return node;
}

Scene* Scene_rectangulos(){
    Scene* scene= new Scene();
    scene->addNode(Node_rectangulos());
    scene->setVisible(false);
    return scene;
}


Node* Node_circulos() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    auto e1 = new Circulo(100.0,false);
    node->addEntity(e1);
    auto e2 = new Circulo(200.0,true);
    node->addEntity(e2);
    e2->setColor(dvec4(1.0,0.0,0.0,1.0));
    // Generar hijos recursivamente

    return node;
}

Scene* Scene_circulos(){
    Scene* scene= new Scene();
    scene->addNode(Node_circulos());
    scene->setVisible(false);
    return scene;
}



Node* Node_esfera1() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    auto e1 = new Sphere(200.0);
    node->addEntity(e1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_esfera2() {
    Node* node = new Node(
        dvec3(100.0, 100.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    auto e1 = new Sphere(100.0);
    node->addEntity(e1);
    e1->setColor(dvec4(0.6,0.6,0.6,1.0));
    // Generar hijos recursivamente

    return node;
}

Node* Node_esferas() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    // Generar hijos recursivamente
    node->addNode(Node_esfera1());
    node->addNode(Node_esfera2());

    return node;
}

Scene* Scene_esferas(){
    Scene* scene= new Scene();
    scene->addNode(Node_esferas());
    scene->setVisible(false);
    return scene;
}



Node* Node_cilindro1() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    auto e1 = new Cylinder(50.0,50.0,100.0);
    node->addEntity(e1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_cilindro2() {
    Node* node = new Node(
        dvec3(200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    auto e1 = new Cylinder(100.0,100.0,200.0);
    node->addEntity(e1);
    e1->setColor(dvec4(0.0,1.0,1.0,1.0));
    // Generar hijos recursivamente

    return node;
}

Node* Node_cilindros() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(-90.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    // Generar hijos recursivamente
    node->addNode(Node_cilindro1());
    node->addNode(Node_cilindro2());

    return node;
}

Scene* Scene_cilindros(){
    Scene* scene= new Scene();
    scene->addNode(Node_cilindros());
    scene->setVisible(false);
    return scene;
}



Node* Node_disco1() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    auto e1 = new Disk(50.0,100.0);
    node->addEntity(e1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_disco2() {
    Node* node = new Node(
        dvec3(200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    auto e1 = new Disk(100.0,200.0);
    node->addEntity(e1);
    e1->setColor(dvec4(1.0,0.0,1.0,1.0));
    // Generar hijos recursivamente

    return node;
}

Node* Node_discos() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    // Generar hijos recursivamente
    node->addNode(Node_disco1());
    node->addNode(Node_disco2());

    return node;
}

Scene* Scene_discos(){
    Scene* scene= new Scene();
    scene->addNode(Node_discos());
    scene->setVisible(false);
    return scene;
}



Node* Node_discoParcial1() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    auto e1 = new PartialDisk(50.0,100.0,0.0,90.0);
    node->addEntity(e1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_discoParcial2() {
    Node* node = new Node(
        dvec3(300.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    auto e1 = new PartialDisk(100.0,200.0,180.0,45.0);
    node->addEntity(e1);
    e1->setColor(dvec4(0.0,0.0,0.0,1.0));
    // Generar hijos recursivamente

    return node;
}

Node* Node_discosParciales() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    // Generar hijos recursivamente
    node->addNode(Node_discoParcial1());
    node->addNode(Node_discoParcial2());

    return node;
}

Scene* Scene_discosParciales(){
    Scene* scene= new Scene();
    scene->addNode(Node_discosParciales());
    scene->setVisible(true);
    return scene;
}

void display() {
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
    
    for (Scene* sc : scenes) {
		sc->render(*camera);
	}

    glutSwapBuffers();
}

void resize(int newWidth, int newHeight){

    // Resize Viewport to the new window size
    viewport->setSize(newWidth, newHeight);

    // Resize Scene Visible Area such that the scale is not modified
    camera->setSize(viewport->width(), viewport->height());
}

void mouse(int button, int state, int x, int y) {
    mMouseButt = button;
    y = glutGet(GLUT_WINDOW_HEIGHT) - y;
    mMouseCoord = glm::dvec2(x, y);
}

void motion(int x, int y) {
    y = glutGet(GLUT_WINDOW_HEIGHT) - y;
    glm::dvec2 mp = mMouseCoord - glm::dvec2(x, y);
    mMouseCoord = glm::dvec2(x, y);
    if (mMouseButt == 0) {
        camera->orbit(mp.x * 0.05, mp.y);
    }
    else if (mMouseButt == 2) {
        camera->moveLR(mp.x);
        camera->moveUD(mp.y);
    }
    glutPostRedisplay();
}

void mouseWheel(int wheelButtonNumber, int direction, int x, int y) {
    int mdf = glutGetModifiers();
    if (mdf == GLUT_ACTIVE_CTRL) {
        camera->setScale(direction);
    }
    else {
        camera->moveFB(direction);
    }
    glutPostRedisplay();
}

void key(unsigned char key, int x, int y)
{
    bool need_redisplay = true;

    switch (key) {
    case 27:                     // Escape key
        glutLeaveMainLoop(); // stops main loop and destroy the OpenGL context
        break;
    case '+':
        camera->setScale(+0.01); // zoom in  (increases the scale)
        break;
    case '-':
        camera->setScale(-0.01); // zoom out (decreases the scale)
        break;
    default:
        need_redisplay = false;
        break;
    } // switch

    if (need_redisplay)
        glutPostRedisplay(); // marks the window as needing to be redisplayed -> calls to
    // display()
}

void specialKey(int key, int x, int y)
{
    bool need_redisplay = true;
    int mdf = glutGetModifiers(); // returns the modifiers (Shift, Ctrl, Alt)

    switch (key) {
    case GLUT_KEY_RIGHT:
        if (mdf == GLUT_ACTIVE_CTRL)
            //mCamera->pitch(-1); // rotates -1 on the X axis
            //mCamera->moveLR(-1);
            camera->pitchReal(1);
        else
            //mCamera->pitch(1); // rotates 1 on the X axis
            //mCamera->moveLR(1);
            camera->pitchReal(-1);
        break;
    case GLUT_KEY_LEFT:
        if (mdf == GLUT_ACTIVE_CTRL)
            //mCamera->yaw(1); // rotates 1 on the Y axis
            //mCamera->moveUD(-1);
            camera->yawReal(-1);
        else
            //mCamera->yaw(-1); // rotate -1 on the Y axis
            //mCamera->moveUD(1);
            camera->yawReal(1);
        break;
    case GLUT_KEY_UP:
        //mCamera->roll(1); // rotates 1 on the Z axis
        //mCamera->moveFB(1);
        camera->rollReal(1);
        break;
    case GLUT_KEY_DOWN:
        //mCamera->roll(-1); // rotates -1 on the Z axis
        //mCamera->moveFB(-1);
        camera->rollReal(-1);
        break;
    default:
        need_redisplay = false;
        break;
    } // switch

    if (need_redisplay)
        glutPostRedisplay(); // marks the window as needing to be redisplayed -> calls to
    // display()
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
    glutReshapeFunc(resize);
    glutMouseFunc(mouse);
    glutMotionFunc(motion);
    glutMouseWheelFunc(mouseWheel);
    glutKeyboardFunc(key);
    glutSpecialFunc(specialKey);

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
    sc = Scene_eje();
    scenes.push_back(sc);
    sc->init();
    sc = Scene_poligonos();
    scenes.push_back(sc);
    sc->init();
    sc = Scene_rectangulos();
    scenes.push_back(sc);
    sc->init();
    sc = Scene_circulos();
    scenes.push_back(sc);
    sc->init();
    sc = Scene_esferas();
    scenes.push_back(sc);
    sc->init();
    sc = Scene_cilindros();
    scenes.push_back(sc);
    sc->init();
    sc = Scene_discos();
    scenes.push_back(sc);
    sc->init();
    sc = Scene_discosParciales();
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

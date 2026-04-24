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


    auto e1 = new EjesRGB(400.0);
    node->addEntity(e1);
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


    auto e1 = new PoligonoRegular(3,100.0,false,1,1);
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


    auto e1 = new PoligonoRegular(4,200.0,true,1,1);
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


    auto e1 = new PoligonoRegular(5,300.0,false,1,1);
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


    auto e1 = new PoligonoRegular(6,400.0,true,1,1);
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


    auto e1 = new Rectangulo(100.0,50.0,false,1,1);
    node->addEntity(e1);
    e1->setColor(dvec4(0.0,0.0,0.0,1.0));
    auto e2 = new Rectangulo(200.0,100.0,true,1,1);
    node->addEntity(e2);
    auto e3 = new Rectangulo(300.0,200.0,false,1,1);
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


    auto e1 = new Circulo(100.0,false,1,1);
    node->addEntity(e1);
    auto e2 = new Circulo(200.0,true,1,1);
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
    scene->setVisible(false);
    return scene;
}



Node* Node_cubo1() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new IndexedBox(100.0);
    node->addEntity(e1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_cubo2() {
    Node* node = new Node(
        dvec3(200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 45.0),//rot
        dvec3(2.0, 1.0, 1.0)//esc
    );


    auto e1 = new IndexedBox(200.0);
    node->addEntity(e1);
    e1->setColor(dvec4(0.0,0.0,1.0,1.0));
    // Generar hijos recursivamente

    return node;
}

Node* Node_cubos() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    // Generar hijos recursivamente
    node->addNode(Node_cubo1());
    node->addNode(Node_cubo2());

    return node;
}

Scene* Scene_cubos(){
    Scene* scene= new Scene();
    scene->addNode(Node_cubos());
    scene->setVisible(false);
    return scene;
}



Node* Node_toroide1() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Toroid(10.0,100.0);
    node->addEntity(e1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_toroide2() {
    Node* node = new Node(
        dvec3(300.0, 0.0, 0.0),//pos
        dvec3(0.0, 90.0, 90.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Toroid(5.0,200.0);
    node->addEntity(e1);
    e1->setColor(dvec4(0.0,1.0,0.0,1.0));
    // Generar hijos recursivamente

    return node;
}

Node* Node_toroides() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    // Generar hijos recursivamente
    node->addNode(Node_toroide1());
    node->addNode(Node_toroide2());

    return node;
}

Scene* Scene_toroides(){
    Scene* scene= new Scene();
    scene->addNode(Node_toroides());
    scene->setVisible(false);
    return scene;
}



Node* Node_esferaLuces1() {
    Node* node = new Node(
        dvec3(-300.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Sphere(100.0);
    node->addEntity(e1);
    e1->setColor(dvec4(1.0,0.0,0.0,1.0));
    // Generar hijos recursivamente

    return node;
}


Node* Node_esferaLuces2() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Sphere(100.0);
    node->addEntity(e1);
    e1->setColor(dvec4(0.0,1.0,0.0,1.0));
    // Generar hijos recursivamente

    return node;
}


Node* Node_esferaLuces3() {
    Node* node = new Node(
        dvec3(300.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Sphere(100.0);
    node->addEntity(e1);
    e1->setColor(dvec4(0.0,0.0,1.0,1.0));
    // Generar hijos recursivamente

    return node;
}


Node* Node_posLight() {
    Node* node = new Node(
        dvec3(-200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    auto l1 = new PosLight();
    l1->setAtte(1.0,0.0,0.0);

    node->addLight(l1);

    // Generar hijos recursivamente

    return node;
}


Node* Node_spotLight() {
    Node* node = new Node(
        dvec3(200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    auto l1 = new SpotLight();
    l1->setSpot(fvec3(-1.0,0.0,0.0),180.0,0.0);
    l1->setAtte(1.0,0.0,0.0);
    node->addLight(l1);

    // Generar hijos recursivamente

    return node;
}

Node* Node_luces() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );

    auto l1 = new DirLight();
    l1->setPosDir(fvec3(1.0,1.0,0.0));
    node->addLight(l1);

    // Generar hijos recursivamente
    node->addNode(Node_esferaLuces1());
    node->addNode(Node_esferaLuces2());
    node->addNode(Node_esferaLuces3());
    node->addNode(Node_posLight());
    node->addNode(Node_spotLight());

    return node;
}

Scene* Scene_luces(){
    Scene* scene= new Scene();
    scene->addNode(Node_luces());
    scene->setVisible(false);
    return scene;
}



Node* Node_fondo() {
    Node* node = new Node(
        dvec3(1000.0, 0.0, -500.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Rectangulo(3000.0,1000.0,true,50,50);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setFrontTexture(frontTexture1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}




Node* Node_cuadradoDoble() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new PoligonoRegular(4,100.0,true,1,1);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setFrontTexture(frontTexture1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_cuadradoFrente() {
    Node* node = new Node(
        dvec3(200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new PoligonoRegular(4,100.0,true,1,1);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setFrontTexture(frontTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_cuadradoEspalda() {
    Node* node = new Node(
        dvec3(-200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new PoligonoRegular(4,100.0,true,1,1);
    node->addEntity(e1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}

Node* Node_cuadradosRellenos() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    // Generar hijos recursivamente
    node->addNode(Node_cuadradoDoble());
    node->addNode(Node_cuadradoFrente());
    node->addNode(Node_cuadradoEspalda());

    return node;
}



Node* Node_cuadradoDobleSin() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new PoligonoRegular(4,100.0,false,1,1);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setFrontTexture(frontTexture1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_cuadradoFrenteSin() {
    Node* node = new Node(
        dvec3(200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new PoligonoRegular(4,100.0,false,1,1);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setFrontTexture(frontTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_cuadradoEspaldaSin() {
    Node* node = new Node(
        dvec3(-200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new PoligonoRegular(4,100.0,false,1,1);
    node->addEntity(e1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}

Node* Node_cuadradosSinRellenos() {
    Node* node = new Node(
        dvec3(0.0, 200.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    // Generar hijos recursivamente
    node->addNode(Node_cuadradoDobleSin());
    node->addNode(Node_cuadradoFrenteSin());
    node->addNode(Node_cuadradoEspaldaSin());

    return node;
}



Node* Node_cuadradoDobleMenosAlfa() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new PoligonoRegular(4,100.0,true,1,1);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 150);
    e1->setFrontTexture(frontTexture1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 150);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_cuadradoFrenteMenosAlfa() {
    Node* node = new Node(
        dvec3(200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new PoligonoRegular(4,100.0,true,1,1);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 150);
    e1->setFrontTexture(frontTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_cuadradoEspaldaMenosAlfa() {
    Node* node = new Node(
        dvec3(-200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new PoligonoRegular(4,100.0,true,1,1);
    node->addEntity(e1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 150);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}

Node* Node_cuadradosRellenosMenosAlfa() {
    Node* node = new Node(
        dvec3(0.0, -200.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    // Generar hijos recursivamente
    node->addNode(Node_cuadradoDobleMenosAlfa());
    node->addNode(Node_cuadradoFrenteMenosAlfa());
    node->addNode(Node_cuadradoEspaldaMenosAlfa());

    return node;
}



Node* Node_cuadradoDobleMulti() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new PoligonoRegular(4,100.0,true,5,5);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setFrontTexture(frontTexture1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_cuadradoFrenteMulti() {
    Node* node = new Node(
        dvec3(0.0, 200.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new PoligonoRegular(4,100.0,true,5,5);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setFrontTexture(frontTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_cuadradoEspaldaMulti() {
    Node* node = new Node(
        dvec3(0.0, -200.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new PoligonoRegular(4,100.0,true,5,5);
    node->addEntity(e1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}

Node* Node_cuadradosMulti() {
    Node* node = new Node(
        dvec3(-400.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    // Generar hijos recursivamente
    node->addNode(Node_cuadradoDobleMulti());
    node->addNode(Node_cuadradoFrenteMulti());
    node->addNode(Node_cuadradoEspaldaMulti());

    return node;
}



Node* Node_trianguloT() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new PoligonoRegular(3,100.0,true,1,1);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setFrontTexture(frontTexture1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_pentagonoT() {
    Node* node = new Node(
        dvec3(0.0, 200.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new PoligonoRegular(5,100.0,true,1,1);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setFrontTexture(frontTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_hexagonoT() {
    Node* node = new Node(
        dvec3(0.0, -200.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new PoligonoRegular(6,100.0,true,1,1);
    node->addEntity(e1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}

Node* Node_otrosPoligonos() {
    Node* node = new Node(
        dvec3(400.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    // Generar hijos recursivamente
    node->addNode(Node_trianguloT());
    node->addNode(Node_pentagonoT());
    node->addNode(Node_hexagonoT());

    return node;
}



Node* Node_trianguloTMulti() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new PoligonoRegular(3,100.0,true,3,3);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setFrontTexture(frontTexture1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_pentagonoTMulti() {
    Node* node = new Node(
        dvec3(0.0, 200.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new PoligonoRegular(5,100.0,true,5,5);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setFrontTexture(frontTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_hexagonoTMulti() {
    Node* node = new Node(
        dvec3(0.0, -200.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new PoligonoRegular(6,100.0,true,6,6);
    node->addEntity(e1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}

Node* Node_otrosPoligonosMulti() {
    Node* node = new Node(
        dvec3(600.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    // Generar hijos recursivamente
    node->addNode(Node_trianguloTMulti());
    node->addNode(Node_pentagonoTMulti());
    node->addNode(Node_hexagonoTMulti());

    return node;
}



Node* Node_cuadradoDobleColor() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new PoligonoRegular(4,100.0,true,1,1);
    node->addEntity(e1);
    e1->setColor(dvec4(1.0,0.0,0.0,1.0));
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setFrontTexture(frontTexture1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_cuadradoFrenteColor() {
    Node* node = new Node(
        dvec3(200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new PoligonoRegular(4,100.0,true,1,1);
    node->addEntity(e1);
    e1->setColor(dvec4(1.0,0.0,0.0,1.0));
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setFrontTexture(frontTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_cuadradoEspaldaColor() {
    Node* node = new Node(
        dvec3(-200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new PoligonoRegular(4,100.0,true,1,1);
    node->addEntity(e1);
    e1->setColor(dvec4(1.0,0.0,0.0,1.0));
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}

Node* Node_cuadradosRellenosColor() {
    Node* node = new Node(
        dvec3(0.0, 500.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    // Generar hijos recursivamente
    node->addNode(Node_cuadradoDobleColor());
    node->addNode(Node_cuadradoFrenteColor());
    node->addNode(Node_cuadradoEspaldaColor());

    return node;
}

Node* Node_poligonosT() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    // Generar hijos recursivamente
    node->addNode(Node_cuadradosRellenos());
    node->addNode(Node_cuadradosSinRellenos());
    node->addNode(Node_cuadradosRellenosMenosAlfa());
    node->addNode(Node_cuadradosMulti());
    node->addNode(Node_otrosPoligonos());
    node->addNode(Node_otrosPoligonosMulti());
    node->addNode(Node_cuadradosRellenosColor());

    return node;
}




Node* Node_circuloDoble() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Circulo(100.0,true,1,1);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setFrontTexture(frontTexture1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_circuloFrente() {
    Node* node = new Node(
        dvec3(200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Circulo(100.0,true,1,1);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setFrontTexture(frontTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_circuloEspalda() {
    Node* node = new Node(
        dvec3(-200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Circulo(100.0,true,1,1);
    node->addEntity(e1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}

Node* Node_circulosRellenos() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    // Generar hijos recursivamente
    node->addNode(Node_circuloDoble());
    node->addNode(Node_circuloFrente());
    node->addNode(Node_circuloEspalda());

    return node;
}



Node* Node_circuloDobleSin() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Circulo(100.0,false,1,1);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setFrontTexture(frontTexture1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_circuloFrenteSin() {
    Node* node = new Node(
        dvec3(200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Circulo(100.0,false,1,1);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setFrontTexture(frontTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_circuloEspaldaSIn() {
    Node* node = new Node(
        dvec3(-200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Circulo(100.0,false,1,1);
    node->addEntity(e1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}

Node* Node_circulosSinRellenos() {
    Node* node = new Node(
        dvec3(0.0, 200.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    // Generar hijos recursivamente
    node->addNode(Node_circuloDobleSin());
    node->addNode(Node_circuloFrenteSin());
    node->addNode(Node_circuloEspaldaSIn());

    return node;
}



Node* Node_circuloDobleMenosAlfa() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Circulo(100.0,true,1,1);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 150);
    e1->setFrontTexture(frontTexture1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 150);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_circuloFrenteMenosAlfa() {
    Node* node = new Node(
        dvec3(200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Circulo(100.0,true,1,1);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 150);
    e1->setFrontTexture(frontTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_circuloEspaldaMenosAlfa() {
    Node* node = new Node(
        dvec3(-200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Circulo(100.0,true,1,1);
    node->addEntity(e1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 150);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}

Node* Node_circulosRellenosMenosAlfa() {
    Node* node = new Node(
        dvec3(0.0, -200.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    // Generar hijos recursivamente
    node->addNode(Node_circuloDobleMenosAlfa());
    node->addNode(Node_circuloFrenteMenosAlfa());
    node->addNode(Node_circuloEspaldaMenosAlfa());

    return node;
}

Node* Node_circulosT() {
    Node* node = new Node(
        dvec3(1000.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    // Generar hijos recursivamente
    node->addNode(Node_circulosRellenos());
    node->addNode(Node_circulosSinRellenos());
    node->addNode(Node_circulosRellenosMenosAlfa());

    return node;
}




Node* Node_rectanguloDoble() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Rectangulo(200.0,200.0,true,1,1);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setFrontTexture(frontTexture1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_rectanguloFrente() {
    Node* node = new Node(
        dvec3(-200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Rectangulo(200.0,200.0,true,1,1);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setFrontTexture(frontTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_rectanguloEspalda() {
    Node* node = new Node(
        dvec3(200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Rectangulo(200.0,200.0,true,1,1);
    node->addEntity(e1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}

Node* Node_rectangulosRellenos() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    // Generar hijos recursivamente
    node->addNode(Node_rectanguloDoble());
    node->addNode(Node_rectanguloFrente());
    node->addNode(Node_rectanguloEspalda());

    return node;
}



Node* Node_rectanguloSDoble() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Rectangulo(200.0,200.0,false,1,1);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setFrontTexture(frontTexture1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_rectanguloSFrente() {
    Node* node = new Node(
        dvec3(-200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Rectangulo(200.0,200.0,false,1,1);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setFrontTexture(frontTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_rectanguloSEspalda() {
    Node* node = new Node(
        dvec3(200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Rectangulo(200.0,200.0,false,1,1);
    node->addEntity(e1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 255);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}

Node* Node_rectangulosSinRellenos() {
    Node* node = new Node(
        dvec3(0.0, 200.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    // Generar hijos recursivamente
    node->addNode(Node_rectanguloSDoble());
    node->addNode(Node_rectanguloSFrente());
    node->addNode(Node_rectanguloSEspalda());

    return node;
}



Node* Node_rectanguloDobleMenosAlfa() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Rectangulo(200.0,200.0,true,1,1);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 150);
    e1->setFrontTexture(frontTexture1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 150);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_rectanguloFrenteMenosAlfa() {
    Node* node = new Node(
        dvec3(-200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Rectangulo(200.0,200.0,true,1,1);
    node->addEntity(e1);
    Texture* frontTexture1 = new Texture();
	frontTexture1->load("../bmps/baldosaC.bmp", 150);
    e1->setFrontTexture(frontTexture1);
    // Generar hijos recursivamente

    return node;
}


Node* Node_rectanguloEspaldaMenosAlfa() {
    Node* node = new Node(
        dvec3(200.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    auto e1 = new Rectangulo(200.0,200.0,true,1,1);
    node->addEntity(e1);
    Texture* backTexture1 = new Texture();
	backTexture1->load("../bmps/baldosaC.bmp", 150);
    e1->setBackTexture(backTexture1);
    // Generar hijos recursivamente

    return node;
}

Node* Node_rectangulosRellenosMenosAlfa() {
    Node* node = new Node(
        dvec3(0.0, -200.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    // Generar hijos recursivamente
    node->addNode(Node_rectanguloDobleMenosAlfa());
    node->addNode(Node_rectanguloFrenteMenosAlfa());
    node->addNode(Node_rectanguloEspaldaMenosAlfa());

    return node;
}

Node* Node_rectangulosT() {
    Node* node = new Node(
        dvec3(1600.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    // Generar hijos recursivamente
    node->addNode(Node_rectangulosRellenos());
    node->addNode(Node_rectangulosSinRellenos());
    node->addNode(Node_rectangulosRellenosMenosAlfa());

    return node;
}

Node* Node_texturas() {
    Node* node = new Node(
        dvec3(0.0, 0.0, 0.0),//pos
        dvec3(0.0, 0.0, 0.0),//rot
        dvec3(1.0, 1.0, 1.0)//esc
    );


    // Generar hijos recursivamente
    node->addNode(Node_fondo());
    node->addNode(Node_poligonosT());
    node->addNode(Node_circulosT());
    node->addNode(Node_rectangulosT());

    return node;
}

Scene* Scene_texturas(){
    Scene* scene= new Scene();
    scene->addNode(Node_texturas());
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
    sc = Scene_cubos();
    scenes.push_back(sc);
    sc->init();
    sc = Scene_toroides();
    scenes.push_back(sc);
    sc->init();
    sc = Scene_luces();
    scenes.push_back(sc);
    sc->init();
    sc = Scene_texturas();
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

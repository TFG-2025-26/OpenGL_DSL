#include "Esfera.h"

void Esfera::render() {
    // Estilo de renderizado segun tu codigo de ejemplo
    glPushMatrix();
    // Aqui se podria añadir glColor o glTranslate segun el Nodo
    glutWireSphere(mRadius, 20, 20);
    glPopMatrix();
}

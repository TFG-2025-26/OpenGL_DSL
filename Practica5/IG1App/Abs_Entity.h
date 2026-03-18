#ifndef _H_Abs_Entity_H_
#define _H_Abs_Entity_H_

#include <GL/freeglut.h>
#include <glm/glm.hpp>

class Abs_Entity {
public:
    Abs_Entity() {}
    virtual ~Abs_Entity() = default;
    virtual void render() = 0; // Metodo virtual puro
};

#endif

#ifndef _H_Esfera_H_
#define _H_Esfera_H_

#include "Abs_Entity.h"

class Esfera : public Abs_Entity {
public:
    Esfera(double r = 1.0) : mRadius(r) {}
    virtual ~Esfera() = default;
    virtual void render() override;
private:
    double mRadius;
};
#endif

#ifndef _H_Rectangulo_H_
#define _H_Rectangulo_H_

#include "Abs_Entity.h"

class Rectangulo : public Abs_Entity {
public:
    Rectangulo() {}
    virtual ~Rectangulo() = default;
    virtual void render() override;
};
#endif

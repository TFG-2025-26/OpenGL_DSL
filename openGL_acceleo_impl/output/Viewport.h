#ifndef _H_Viewport_H_
#define _H_Viewport_H_

#include <GL/freeglut.h>

class Viewport {
public:
    // Declaración del constructor
    Viewport(GLsizei xw, GLsizei yh);
    ~Viewport() = default;

    void upload() const;
    void setSize(GLsizei xw, GLsizei yh);
    void setPos(GLsizei xl, GLsizei yb);

private:
    GLsizei xLeft, yBot, xWidth, yHeight;
};
#endif

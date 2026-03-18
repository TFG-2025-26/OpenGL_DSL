#include "Viewport.h"

// El constructor usa los parámetros xw/yh y los valores del modelo xLeft/yBolt
Viewport::Viewport(GLsizei xw, GLsizei yh)
    : xWidth(xw)
    , yHeight(yh)
    , xLeft(0)
    , yBot(0)
{
}

void Viewport::upload() const {
    glViewport(xLeft, yBot, xWidth, yHeight);
}

void Viewport::setSize(GLsizei xw, GLsizei yh) {
    xWidth = xw;
    yHeight = yh;
}

void Viewport::setPos(GLsizei xl, GLsizei yb) {
    xLeft = xl;
    yBot = yb;
}

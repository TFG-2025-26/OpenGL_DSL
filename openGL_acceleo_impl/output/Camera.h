#ifndef _H_Camera_H_
#define _H_Camera_H_

#include <glm/glm.hpp>
#include "Viewport.h"

class Camera {
public:
    Camera(Viewport* vp);
    void uploadVM() const;
    void setVM();

private:
    glm::dmat4 mViewMat;
    glm::dmat4 mProjMat;
    double mNear, mFar;
    Viewport* mViewPort;
};
#endif

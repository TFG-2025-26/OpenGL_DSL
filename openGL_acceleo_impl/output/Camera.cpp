#include "Camera.h"
#include <glm/gtc/matrix_transform.hpp>
#include <glm/gtc/type_ptr.hpp>

Camera::Camera(Viewport* vp) 
    : mViewPort(vp), mViewMat(1.0), mProjMat(1.0) {
    mNear = 0.0;
    mFar = 10000.0;
}

void Camera::setVM() {
    // Valores por defecto inspirados en tu codigo fuente
    glm::dvec3 eye(0, 0, 500);
    glm::dvec3 look(0, 0, 0);
    glm::dvec3 up(0, 1, 0);
    mViewMat = glm::lookAt(eye, look, up);
}

void Camera::uploadVM() const {
    glMatrixMode(GL_MODELVIEW);
    glLoadMatrixd(glm::value_ptr(mViewMat));
}

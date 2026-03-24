#include "Camera.h"

#include <glm/gtc/matrix_transform.hpp>
#include <glm/gtc/type_ptr.hpp>
#include <glm/gtc/matrix_access.hpp>

using namespace glm;

Camera::Camera(Viewport* vp)
  : mViewMat(1.0)
  , mProjMat(1.0)
  , xRight(vp->width() / 2.0)
  , xLeft(-xRight)
  , yTop(vp->height() / 2.0)
  , yBot(-yTop)
  , mViewPort(vp)
{
    setVM();
	setPM();
}

void
Camera::uploadVM() const
{
	glMatrixMode(GL_MODELVIEW);
	glLoadMatrixd(value_ptr(mViewMat)); // transfers view matrix to the GPU
}

void
Camera::setVM()
{
	mViewMat = lookAt(mEye, mLook, mUp); // glm::lookAt defines the view matrix
	setAxes();
}

void
Camera::pitch(GLdouble a)
{
	mViewMat = rotate(mViewMat, glm::radians(a), glm::dvec3(1.0, 0, 0));
	// glm::rotate returns mViewMat * rotationMatrix
}

void
Camera::yaw(GLdouble a)
{
	mViewMat = rotate(mViewMat, glm::radians(a), glm::dvec3(0, 1.0, 0));
	// glm::rotate returns mViewMat * rotationMatrix
}

void
Camera::roll(GLdouble a)
{
	mViewMat = rotate(mViewMat, glm::radians(a), glm::dvec3(0, 0, 1.0));
	// glm::rotate returns mViewMat * rotationMatrix
}

void
Camera::setSize(GLdouble xw, GLdouble yh)
{
	xRight = xw / 2.0;
	xLeft = -xRight;
	yTop = yh / 2.0;
	yBot = -yTop;
	setPM();
}

void
Camera::setScale(GLdouble s)
{
	mScaleFact -= s;
	if (mScaleFact < 0)
		mScaleFact = 0.01;
	setPM();
}

void
Camera::setPM()
{
	if (bOrto) { //  if orthogonal projection
		mProjMat = ortho(xLeft * mScaleFact,
		                 xRight * mScaleFact,
		                 yBot * mScaleFact,
		                 yTop * mScaleFact,
		                 mNearVal,
		                 mFarVal);
		// glm::ortho defines the orthogonal projection matrix
	}
	else {
		mProjMat = frustum(xLeft * mScaleFact,
			               xRight * mScaleFact,
			               yBot * mScaleFact,
			               yTop * mScaleFact,
			               mNearVal,
			               mFarVal);
	}
}

void
Camera::uploadPM() const
{
	glMatrixMode(GL_PROJECTION);
	glLoadMatrixd(value_ptr(mProjMat)); // transfers projection matrix to the GPU
	glMatrixMode(GL_MODELVIEW);
}

void
Camera::setAxes() {
	mRight = row(mViewMat, 0);
	mUpward = row(mViewMat, 1);
	mFront = -row(mViewMat, 2);
}

void
Camera::moveLR(GLdouble cs) {
	mEye += mRight * cs;
	mLook += mRight * cs;
	setVM();
}

void
Camera::moveFB(GLdouble cs) {
	mEye += mFront * cs;
	mLook += mFront * cs;
	setVM();
}

void
Camera::moveUD(GLdouble cs) {
	mEye += mUpward * cs;
	mLook += mUpward * cs;
	setVM();
}

void
Camera::changePrj() {
	bOrto = !bOrto;
	setPM();
}

void
Camera::pitchReal(GLdouble cs) {
	dmat4 rot = rotate(dmat4(1), glm::radians(cs), glm::dvec3(1.0, 0, 0));
	mViewMat = rot * mViewMat;
}

void
Camera::yawReal(GLdouble cs) {
	dmat4 rot = rotate(dmat4(1), glm::radians(cs), glm::dvec3(0, 1.0, 0));
	mViewMat = rot * mViewMat;
}

void
Camera::rollReal(GLdouble cs) {
	dmat4 rot = rotate(dmat4(1), glm::radians(cs), glm::dvec3(0, 0, 1.0));
	mViewMat = rot * mViewMat;
}

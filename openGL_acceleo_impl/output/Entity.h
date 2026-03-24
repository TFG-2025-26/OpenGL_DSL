#ifndef _H_Entity_H_
#define _H_Entity_H_

#include <GL/freeglut.h>
#include <glm/glm.hpp>

#include "Mesh.h"

class Abs_Entity // abstract class
{
public:
	Abs_Entity()
	  : mModelMat(1.0), mColor(1){}; // 4x4 identity matrix
	virtual ~Abs_Entity() = default;

	Abs_Entity(const Abs_Entity& e) = delete;            // no copy constructor
	Abs_Entity& operator=(const Abs_Entity& e) = delete; // no copy assignment

	virtual void render(glm::dmat4 const& modelViewMat) const = 0; // abstract method

	// modeling matrix
	glm::dmat4 const& modelMat() const { return mModelMat; };
	void setModelMat(glm::dmat4 const& aMat) { mModelMat = aMat; };

	glm::dvec4 const& color() const { return mColor; };
	void setColor(glm::dvec4 const& aColor) { mColor = aColor; };

protected:
	Mesh* mMesh = nullptr; // the mesh
	glm::dmat4 mModelMat;  // modeling matrix
	glm::dvec4 mColor;     // entity color

	// transfers modelViewMat to the GPU
	virtual void upload(glm::dmat4 const& mModelViewMat) const;
};

class EjesRGB : public Abs_Entity
{
public:
	explicit EjesRGB(GLdouble l);
	~EjesRGB();
	virtual void render(glm::dmat4 const& modelViewMat) const;
};
class Esfera : public Abs_Entity {
public:
    Esfera(double r = 1.0) : mRadius(r) {}
    virtual ~Esfera() = default;
    virtual void render(glm::dmat4 const& modelViewMat);
private:
    double mRadius;
};

class Rectangulo : public Abs_Entity {
public:
    Rectangulo() {}
    virtual ~Rectangulo() = default;
    virtual void render(glm::dmat4 const& modelViewMat);
};

#endif

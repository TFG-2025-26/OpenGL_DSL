#ifndef _H_Entity_H_
#define _H_Entity_H_

#include <GL/freeglut.h>
#include <glm/glm.hpp>

#include "Mesh.h"
#include "Texture.h"
#include "Material.h"

class Abs_Entity // abstract class
{
public:
	Abs_Entity()
		: mModelMat(1.0), mColor(1) {
	}; // 4x4 identity matrix
	virtual ~Abs_Entity() = default;

	Abs_Entity(const Abs_Entity& e) = delete;            // no copy constructor
	Abs_Entity& operator=(const Abs_Entity& e) = delete; // no copy assignment

	virtual void render(glm::dmat4 const& modelViewMat) const = 0; // abstract method

	// modeling matrix
	glm::dmat4 const& modelMat() const { return mModelMat; };
	void setModelMat(glm::dmat4 const& aMat) { mModelMat = aMat; };

	glm::dvec4 const& color() const { return mColor; };
	void setColor(glm::dvec4 const& aColor) { mColor = aColor; };
    void setFrontTexture(Texture* aTexture) { mTexture = aTexture; };
    void setBackTexture(Texture* aTexture) { mBackTexture = aTexture; };
    void setMaterial(Material* matl) { material = matl; };

protected:
	Mesh* mMesh = nullptr; // the mesh
	glm::dmat4 mModelMat;  // modeling matrix
	glm::dvec4 mColor;     // entity color
    Texture* mTexture = nullptr;
    Texture* mBackTexture = nullptr;
    Material* material = nullptr;

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

class PoligonoRegular : public Abs_Entity
{
public:
	explicit PoligonoRegular(GLuint num, GLdouble r,bool rellenar, GLuint rw, GLuint rh);
	~PoligonoRegular();
	virtual void render(glm::dmat4 const& modelViewMat) const;
};

class Rectangulo : public Abs_Entity
{
public:
	explicit Rectangulo(GLdouble w, GLdouble h, bool rellenar, GLuint rw, GLuint rh);
	~Rectangulo();
	virtual void render(glm::dmat4 const& modelViewMat) const;
private:
    bool rellenar;
};

class Circulo : public Abs_Entity
{
public:
	explicit Circulo(GLdouble r, bool rellenar, GLuint rw, GLuint rh);
	~Circulo();
	virtual void render(glm::dmat4 const& modelViewMat) const;
};

class QuadricEntity : public Abs_Entity {
public:
	QuadricEntity();
	virtual ~QuadricEntity() { gluDeleteQuadric(q); };
protected:
	GLUquadricObj* q;
};

class Sphere : public QuadricEntity {
public:
	Sphere(GLdouble r); // r es el radio de la esfera
	virtual void render(glm::dmat4 const& modelViewMat) const;
protected:
	GLdouble r;
};

class Cylinder : public QuadricEntity {
public:
	Cylinder(GLdouble baseRadius, GLdouble topRadius, GLdouble height); // r es el radio de la esfera
	virtual void render(glm::dmat4 const& modelViewMat) const;
protected:
	GLdouble baseRadius;
	GLdouble topRadius;
	GLdouble height;
};

class Disk : public QuadricEntity {
public:
	Disk(GLdouble innerRadius, GLdouble outerRadius); // r es el radio de la esfera
	virtual void render(glm::dmat4 const& modelViewMat) const;
protected:
	GLdouble innerRadius;
	GLdouble outerRadius;
};

class PartialDisk : public QuadricEntity {
public:
	PartialDisk(GLdouble innerRadius, GLdouble outerRadius, GLdouble startAngle, GLdouble sweepAngle); // r es el radio de la esfera
	virtual void render(glm::dmat4 const& modelViewMat) const;
protected:
	GLdouble innerRadius;
	GLdouble outerRadius;
	GLdouble startAngle;
	GLdouble sweepAngle;
};

class IndexedBox : public Abs_Entity {
public:
	IndexedBox(GLdouble l);
	~IndexedBox();
	virtual void render(glm::dmat4 const& modelViewMat) const;
};

class Toroid : public Abs_Entity {
public:
	Toroid(GLdouble r, GLdouble R);
	~Toroid();
	virtual void render(glm::dmat4 const& modelViewMat) const;
};

#endif

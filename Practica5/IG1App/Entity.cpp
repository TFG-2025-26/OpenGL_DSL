#include "Entity.h"

#include <glm/gtc/matrix_transform.hpp>
#include <glm/gtc/type_ptr.hpp>

using namespace glm;

void
Abs_Entity::upload(dmat4 const& modelViewMat) const
{
	glMatrixMode(GL_MODELVIEW);
	glLoadMatrixd(value_ptr(modelViewMat)); // transfers modelView matrix to the GPU
}

EjesRGB::EjesRGB(GLdouble l)
  : Abs_Entity()
{
	mMesh = Mesh::createRGBAxes(l);
}

EjesRGB::~EjesRGB()
{
	delete mMesh;
	mMesh = nullptr;
};

void
EjesRGB::render(dmat4 const& modelViewMat) const
{
	if (mMesh != nullptr) {
		dmat4 aMat = modelViewMat * mModelMat; // glm matrix multiplication
		upload(aMat);
		glLineWidth(2);
		mMesh->render();
		glLineWidth(1);
	}
}

PoligonoRegular::PoligonoRegular(GLuint num, GLdouble r,bool rellenar)
	: Abs_Entity()
{
	if (rellenar) {
	   mMesh = Mesh::generateRegularPolygon(num, r, GL_TRIANGLE_FAN);
    }
    else {
	   mMesh = Mesh::generateRegularPolygon(num, r, GL_LINE_LOOP);
    }
}

PoligonoRegular::~PoligonoRegular()
{
	delete mMesh;
	mMesh = nullptr;
};

void
PoligonoRegular::render(dmat4 const& modelViewMat) const
{
	if (mMesh != nullptr) {
		dmat4 aMat = modelViewMat * mModelMat; // glm matrix multiplication
		upload(aMat);
		glColor4d(mColor.r, mColor.g, mColor.b, mColor.a);
		glLineWidth(2);
		mMesh->render();
		glLineWidth(1);
		glColor4d(1, 1, 1, 1);
	}
}

Rectangulo::Rectangulo(GLdouble w, GLdouble h, bool rellenar)
	: Abs_Entity(), rellenar(rellenar)
{
	mMesh = Mesh::generateRectangle(w, h);
}

Rectangulo::~Rectangulo()
{
	delete mMesh;
	mMesh = nullptr;
};

void
Rectangulo::render(dmat4 const& modelViewMat) const
{
	if (mMesh != nullptr) {
        if(rellenar){
           glPolygonMode(GL_BACK, GL_FILL);
		   glPolygonMode(GL_FRONT, GL_FILL);
        }
        else{
           glPolygonMode(GL_BACK, GL_LINE);
		   glPolygonMode(GL_FRONT, GL_LINE);
        }
		dmat4 aMat = modelViewMat * mModelMat; // glm matrix multiplication
		upload(aMat);
        glColor4d(mColor.r, mColor.g, mColor.b, mColor.a);
		glLineWidth(2);
		mMesh->render();
		glLineWidth(1);
        glColor4d(1, 1, 1, 1);
	}
}

Circulo::Circulo(GLdouble r,bool rellenar)
	: Abs_Entity()
{
    if (rellenar) {
	   mMesh = Mesh::generateRegularPolygon(40, r, GL_TRIANGLE_FAN);
    }
    else {
	   mMesh = Mesh::generateRegularPolygon(40, r, GL_LINE_LOOP);
    }
}

Circulo::~Circulo()
{
	delete mMesh;
	mMesh = nullptr;
};

void
Circulo::render(dmat4 const& modelViewMat) const
{
	if (mMesh != nullptr) {
		dmat4 aMat = modelViewMat * mModelMat; // glm matrix multiplication
		upload(aMat);
		glColor4d(mColor.r, mColor.g, mColor.b, mColor.a);
		glLineWidth(2);
		mMesh->render();
		glLineWidth(1);
		glColor4d(1, 1, 1, 1);
	}
}

QuadricEntity::QuadricEntity() {
	q = gluNewQuadric();
}

Sphere::Sphere(GLdouble r)
	: r(r)
{}

void
Sphere::render(glm::dmat4 const& modelViewMat) const {
	dmat4 aMat = modelViewMat * mModelMat;
	upload(aMat);
	// Aquí se puede fijar el color de la esfera así:
	glEnable ( GL_COLOR_MATERIAL );
	glColor3f (mColor.r, mColor.g, mColor.b);
	// Aquí se puede fijar el modo de dibujar la esfera :
	gluQuadricDrawStyle (q, GLU_FILL);
	gluSphere(q, r, 50, 50);
	// Aquí se debe recuperar el color :
	glColor3f (1.0 , 1.0 , 1.0);
}

Cylinder::Cylinder(GLdouble baseRadius, GLdouble topRadius, GLdouble height)
	: baseRadius(baseRadius), topRadius(topRadius), height(height)
{}

void
Cylinder::render(glm::dmat4 const& modelViewMat) const {
	dmat4 aMat = modelViewMat * mModelMat;
	upload(aMat);
	// Aquí se puede fijar el color de la esfera así:
	glEnable ( GL_COLOR_MATERIAL );
	glColor3f (mColor.r, mColor.g, mColor.b);
	// Aquí se puede fijar el modo de dibujar la esfera :
	gluQuadricDrawStyle (q, GLU_FILL);
	gluCylinder(q, baseRadius, topRadius, height, 50, 50);
	// Aquí se debe recuperar el color :
	glColor3f (1.0 , 1.0 , 1.0);
}

Disk::Disk(GLdouble innerRadius, GLdouble outerRadius)
	:innerRadius(innerRadius), outerRadius(outerRadius)
{}

void
Disk::render(glm::dmat4 const& modelViewMat) const {
	dmat4 aMat = modelViewMat * mModelMat;
	upload(aMat);
	// Aquí se puede fijar el color de la esfera así:
	glEnable ( GL_COLOR_MATERIAL );
	glColor3f (mColor.r, mColor.g, mColor.b);
	// Aquí se puede fijar el modo de dibujar la esfera :
	gluQuadricDrawStyle (q, GLU_FILL);
	gluDisk(q, innerRadius, outerRadius, 50, 50);
	// Aquí se debe recuperar el color :
	glColor3f (1.0 , 1.0 , 1.0);
}

PartialDisk::PartialDisk(GLdouble innerRadius, GLdouble outerRadius, GLdouble startAngle, GLdouble sweepAngle)
	: innerRadius(innerRadius), outerRadius(outerRadius), startAngle(startAngle), sweepAngle(sweepAngle)
{}

void
PartialDisk::render(glm::dmat4 const& modelViewMat) const {
	dmat4 aMat = modelViewMat * mModelMat;
	upload(aMat);
	// Aquí se puede fijar el color de la esfera así:
	glEnable ( GL_COLOR_MATERIAL );
	glColor3f (mColor.r, mColor.g, mColor.b);
	// Aquí se puede fijar el modo de dibujar la esfera :
	gluQuadricDrawStyle (q, GLU_FILL);
	gluPartialDisk(q, innerRadius, outerRadius, 50, 50,
		startAngle, sweepAngle);
	// Aquí se debe recuperar el color :
	glColor3f (1.0 , 1.0 , 1.0);
}

IndexedBox::IndexedBox(GLdouble l)
	: Abs_Entity()
{
	mMesh = IndexMesh::generateIndexedBox(l);
}

IndexedBox::~IndexedBox()
{
	delete mMesh;
	mMesh = nullptr;
};

void
IndexedBox::render(dmat4 const& modelViewMat) const
{
	if (mMesh != nullptr) {
		dmat4 aMat = modelViewMat * mModelMat; // glm matrix multiplication
		upload(aMat);
		glColor4d(mColor.r, mColor.g, mColor.b, mColor.a);
		glLineWidth(2);
		mMesh->render();
		glLineWidth(1);
		glColor4d(1, 1, 1, 1);
	}
}

Toroid::Toroid(GLdouble r, GLdouble R)
	: Abs_Entity()
{
	int auxnum = 40*2 + 3;
	float alfa = 270.0, angsep = 360.0 / (auxnum-1);

	glm::dvec3* perfil = new glm::dvec3[auxnum];

	for (int i = 0; i < auxnum; i++)
	{
		auto alfaAux = glm::radians(alfa);

		auto x = r * glm::cos(alfaAux);
		auto y = r * glm::sin(alfaAux);

		perfil[i] = glm::dvec3(x+ R, y, 0);

		alfa += angsep;
	}


	mMesh = MbR::generateIndexMbR(auxnum, 40, perfil);
}

Toroid::~Toroid()
{
	delete mMesh;
	mMesh = nullptr;
};

void
Toroid::render(dmat4 const& modelViewMat) const
{
	if (mMesh != nullptr) {
		dmat4 aMat = modelViewMat * mModelMat; // glm matrix multiplication
		upload(aMat);
		glColor4d(mColor.r, mColor.g, mColor.b, mColor.a);
		glLineWidth(2);
		mMesh->render();
		glLineWidth(1);
		glColor4d(1, 1, 1, 1);
	}
}

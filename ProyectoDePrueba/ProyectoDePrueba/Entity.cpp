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
    if (mTexture != nullptr) {
	    delete mTexture;
	    mTexture = nullptr;
    }
    if (mBackTexture != nullptr) {
	    delete mBackTexture;
	    mBackTexture = nullptr;
    }
    if (material != nullptr) {
	    delete material;
	    material = nullptr;
    }
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

PoligonoRegular::PoligonoRegular(GLuint num, GLdouble r, bool rellenar, GLuint rw, GLuint rh)
	: Abs_Entity()
{
	if (rellenar) {
	   mMesh = Mesh::generateRegularPolygon(num, r, GL_TRIANGLE_FAN, rw, rh);
    }
    else {
	   mMesh = Mesh::generateRegularPolygon(num, r, GL_LINE_LOOP, rw, rh);
    }
}

PoligonoRegular::~PoligonoRegular()
{
	delete mMesh;
	mMesh = nullptr;
    if (mTexture != nullptr) {
	    delete mTexture;
	    mTexture = nullptr;
    }
    if (mBackTexture != nullptr) {
	    delete mBackTexture;
	    mBackTexture = nullptr;
    }
    if (material != nullptr) {
	    delete material;
	    material = nullptr;
    }
};

void
PoligonoRegular::render(dmat4 const& modelViewMat) const
{
    if (mMesh != nullptr) {
	    glEnable(GL_CULL_FACE);

        if (mTexture != nullptr) {
            mTexture->setWrap(GL_REPEAT);
	        mTexture->bind(GL_MODULATE);
        }
	    glCullFace(GL_BACK);
	    dmat4 aMat = modelViewMat * mModelMat; // glm matrix multiplication
	    upload(aMat);
        glColor4d(mColor.r, mColor.g, mColor.b, mColor.a);
	    glLineWidth(2);
        if (mTexture != nullptr) {
            glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
        }
	    if (material != nullptr) {
	        glDisable(GL_COLOR_MATERIAL);
	        material->upload();
        }
        mMesh->render();
        glLineWidth(1);
        if (material != nullptr) {
	        glEnable(GL_COLOR_MATERIAL);
        }
        if (mTexture != nullptr) {
            mTexture->unbind();
        }

        if (mBackTexture != nullptr) {
            mBackTexture->setWrap(GL_REPEAT);
	        mBackTexture->bind(GL_MODULATE);
        }
	    glCullFace(GL_FRONT);
	    aMat = modelViewMat * mModelMat; // glm matrix multiplication
	    upload(aMat);
        glColor4d(mColor.r, mColor.g, mColor.b, mColor.a);
	    glLineWidth(2);
        if (mBackTexture != nullptr) {
            glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
        }
	    if (material != nullptr) {
	        glDisable(GL_COLOR_MATERIAL);
	        material->upload();
        }
        mMesh->render();
        glLineWidth(1);
        if (material != nullptr) {
	        glEnable(GL_COLOR_MATERIAL);
        }
        if (mBackTexture != nullptr) {
            mBackTexture->unbind();
        }

	    glDisable(GL_CULL_FACE);
    }
}

Rectangulo::Rectangulo(GLdouble w, GLdouble h, bool rellenar, GLuint rw, GLuint rh)
	: Abs_Entity(), rellenar(rellenar)
{
	mMesh = Mesh::generateRectangle(w, h, rw, rh);
}

Rectangulo::~Rectangulo()
{
	delete mMesh;
	mMesh = nullptr;
    if (mTexture != nullptr) {
	    delete mTexture;
	    mTexture = nullptr;
    }
    if (mBackTexture != nullptr) {
	    delete mBackTexture;
	    mBackTexture = nullptr;
    }
    if (material != nullptr) {
	    delete material;
	    material = nullptr;
    }
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

		glEnable(GL_CULL_FACE);

        if (mTexture != nullptr) {
            mTexture->setWrap(GL_REPEAT);
	        mTexture->bind(GL_MODULATE);
        }
	    glCullFace(GL_BACK);
	    dmat4 aMat = modelViewMat * mModelMat; // glm matrix multiplication
	    upload(aMat);
        glColor4d(mColor.r, mColor.g, mColor.b, mColor.a);
	    glLineWidth(2);
        if (mTexture != nullptr) {
            glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
        }
	    if (material != nullptr) {
	        glDisable(GL_COLOR_MATERIAL);
	        material->upload();
        }
        mMesh->render();
        glLineWidth(1);
        if (material != nullptr) {
	        glEnable(GL_COLOR_MATERIAL);
        }
        if (mTexture != nullptr) {
            mTexture->unbind();
        }

        if (mBackTexture != nullptr) {
            mBackTexture->setWrap(GL_REPEAT);
	        mBackTexture->bind(GL_MODULATE);
        }
	    glCullFace(GL_FRONT);
	    aMat = modelViewMat * mModelMat; // glm matrix multiplication
	    upload(aMat);
        glColor4d(mColor.r, mColor.g, mColor.b, mColor.a);
	    glLineWidth(2);
        if (mBackTexture != nullptr) {
            glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
        }
	    if (material != nullptr) {
	        glDisable(GL_COLOR_MATERIAL);
	        material->upload();
        }
        mMesh->render();
        glLineWidth(1);
        if (material != nullptr) {
	        glEnable(GL_COLOR_MATERIAL);
        }
        if (mBackTexture != nullptr) {
            mBackTexture->unbind();
        }

	    glDisable(GL_CULL_FACE);

        if(!rellenar){
           glPolygonMode(GL_BACK, GL_FILL);
		   glPolygonMode(GL_FRONT, GL_FILL);
        }
	}
}

Circulo::Circulo(GLdouble r, bool rellenar, GLuint rw, GLuint rh)
	: Abs_Entity()
{
    if (rellenar) {
	   mMesh = Mesh::generateRegularPolygon(40, r, GL_TRIANGLE_FAN, rw, rh);
    }
    else {
	   mMesh = Mesh::generateRegularPolygon(40, r, GL_LINE_LOOP, rw, rh);
    }
}

Circulo::~Circulo()
{
	delete mMesh;
	mMesh = nullptr;
    if (mTexture != nullptr) {
	    delete mTexture;
	    mTexture = nullptr;
    }
    if (mBackTexture != nullptr) {
	    delete mBackTexture;
	    mBackTexture = nullptr;
    }
    if (material != nullptr) {
	    delete material;
	    material = nullptr;
    }
};

void
Circulo::render(dmat4 const& modelViewMat) const
{
	if (mMesh != nullptr) {
	    glEnable(GL_CULL_FACE);

        if (mTexture != nullptr) {
            mTexture->setWrap(GL_REPEAT);
	        mTexture->bind(GL_MODULATE);
        }
	    glCullFace(GL_BACK);
	    dmat4 aMat = modelViewMat * mModelMat; // glm matrix multiplication
	    upload(aMat);
        glColor4d(mColor.r, mColor.g, mColor.b, mColor.a);
	    glLineWidth(2);
        if (mTexture != nullptr) {
            glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
        }
	    if (material != nullptr) {
	        glDisable(GL_COLOR_MATERIAL);
	        material->upload();
        }
        mMesh->render();
        glLineWidth(1);
        if (material != nullptr) {
	        glEnable(GL_COLOR_MATERIAL);
        }
        if (mTexture != nullptr) {
            mTexture->unbind();
        }

        if (mBackTexture != nullptr) {
            mBackTexture->setWrap(GL_REPEAT);
	        mBackTexture->bind(GL_MODULATE);
        }
	    glCullFace(GL_FRONT);
	    aMat = modelViewMat * mModelMat; // glm matrix multiplication
	    upload(aMat);
        glColor4d(mColor.r, mColor.g, mColor.b, mColor.a);
	    glLineWidth(2);
        if (mBackTexture != nullptr) {
            glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
        }
	    if (material != nullptr) {
	        glDisable(GL_COLOR_MATERIAL);
	        material->upload();
        }
        mMesh->render();
        glLineWidth(1);
        if (material != nullptr) {
	        glEnable(GL_COLOR_MATERIAL);
        }
        if (mBackTexture != nullptr) {
            mBackTexture->unbind();
        }

	    glDisable(GL_CULL_FACE);
    }
}

QuadricEntity::QuadricEntity() {
	q = gluNewQuadric();
}

Sphere::Sphere(GLdouble r, GLuint rw, GLuint rh)
	: r(r), rw(rw), rh(rh)
{}

Sphere::~Sphere()
{
    if (mTexture != nullptr) {
	    delete mTexture;
	    mTexture = nullptr;
    }
    if (mBackTexture != nullptr) {
	    delete mBackTexture;
	    mBackTexture = nullptr;
    }
    if (material != nullptr) {
	    delete material;
	    material = nullptr;
    }
};

void
Sphere::render(glm::dmat4 const& modelViewMat) const {
    gluQuadricTexture(q, GL_TRUE);
    glEnable(GL_CULL_FACE);

    if (mTexture != nullptr) {
        mTexture->setWrap(GL_REPEAT);
	    mTexture->bind(GL_MODULATE);
    }
	glCullFace(GL_BACK);
	dmat4 aMat = modelViewMat * mModelMat;
	upload(aMat);
    glMatrixMode(GL_TEXTURE);
    glPushMatrix();
    glScalef(rw, rh, 1.0f);
    glMatrixMode(GL_MODELVIEW);
	// Aquí se puede fijar el color de la esfera así:
	glEnable ( GL_COLOR_MATERIAL );
	glColor3f (mColor.r, mColor.g, mColor.b);
	// Aquí se puede fijar el modo de dibujar la esfera :
    if (mTexture != nullptr) {
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
    }
    gluQuadricNormals(q, GLU_SMOOTH);
    if (material != nullptr) {
	    glDisable(GL_COLOR_MATERIAL);
	    material->upload();
    }
	gluQuadricDrawStyle (q, GLU_FILL);
	gluSphere(q, r, 50, 50);
	// Aquí se debe recuperar el color :
    glMatrixMode(GL_TEXTURE);
    glPopMatrix();
    glMatrixMode(GL_MODELVIEW);
    if (material != nullptr) {
	    glEnable(GL_COLOR_MATERIAL);
    }
    if (mTexture != nullptr) {
        mTexture->unbind();
    }
	glColor3f (1.0 , 1.0 , 1.0);

    if (mBackTexture != nullptr) {
        mBackTexture->setWrap(GL_REPEAT);
	    mBackTexture->bind(GL_MODULATE);
    }
	glCullFace(GL_FRONT);
	aMat = modelViewMat * mModelMat;
	upload(aMat);
    glMatrixMode(GL_TEXTURE);
    glPushMatrix();
    glScalef(rw, rh, 1.0f);
    glMatrixMode(GL_MODELVIEW);
	// Aquí se puede fijar el color de la esfera así:
	glEnable ( GL_COLOR_MATERIAL );
	glColor3f (mColor.r, mColor.g, mColor.b);
	// Aquí se puede fijar el modo de dibujar la esfera :
    if (mBackTexture != nullptr) {
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
    }
    gluQuadricNormals(q, GLU_SMOOTH);
    if (material != nullptr) {
	    glDisable(GL_COLOR_MATERIAL);
	    material->upload();
    }
	gluQuadricDrawStyle (q, GLU_FILL);
	gluSphere(q, r, 50, 50);
	// Aquí se debe recuperar el color :
    glMatrixMode(GL_TEXTURE);
    glPopMatrix();
    glMatrixMode(GL_MODELVIEW);
    if (material != nullptr) {
	    glEnable(GL_COLOR_MATERIAL);
    }
    if (mBackTexture != nullptr) {
        mBackTexture->unbind();
    }
	glColor3f (1.0 , 1.0 , 1.0);

    glDisable(GL_CULL_FACE);
}

Cylinder::Cylinder(GLdouble baseRadius, GLdouble topRadius, GLdouble height, GLuint rw, GLuint rh)
	: baseRadius(baseRadius), topRadius(topRadius), height(height), rw(rw), rh(rh)
{}

Cylinder::~Cylinder()
{
    if (mTexture != nullptr) {
	    delete mTexture;
	    mTexture = nullptr;
    }
    if (mBackTexture != nullptr) {
	    delete mBackTexture;
	    mBackTexture = nullptr;
    }
    if (material != nullptr) {
	    delete material;
	    material = nullptr;
    }
};

void
Cylinder::render(glm::dmat4 const& modelViewMat) const {
	gluQuadricTexture(q, GL_TRUE);
    glEnable(GL_CULL_FACE);

    if (mTexture != nullptr) {
        mTexture->setWrap(GL_REPEAT);
	    mTexture->bind(GL_MODULATE);
    }
	glCullFace(GL_BACK);
	dmat4 aMat = modelViewMat * mModelMat;
	upload(aMat);
    glMatrixMode(GL_TEXTURE);
    glPushMatrix();
    glScalef(rw, rh, 1.0f);
    glMatrixMode(GL_MODELVIEW);
	// Aquí se puede fijar el color de la esfera así:
	glEnable ( GL_COLOR_MATERIAL );
	glColor3f (mColor.r, mColor.g, mColor.b);
	// Aquí se puede fijar el modo de dibujar la esfera :
    if (mTexture != nullptr) {
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
    }
    gluQuadricNormals(q, GLU_SMOOTH);
    if (material != nullptr) {
	    glDisable(GL_COLOR_MATERIAL);
	    material->upload();
    }
	gluQuadricDrawStyle (q, GLU_FILL);
	gluCylinder(q, baseRadius, topRadius, height, 50, 50);
	// Aquí se debe recuperar el color :
    glMatrixMode(GL_TEXTURE);
    glPopMatrix();
    glMatrixMode(GL_MODELVIEW);
    if (material != nullptr) {
	    glEnable(GL_COLOR_MATERIAL);
    }
    if (mTexture != nullptr) {
        mTexture->unbind();
    }
	glColor3f (1.0 , 1.0 , 1.0);

    if (mBackTexture != nullptr) {
        mBackTexture->setWrap(GL_REPEAT);
	    mBackTexture->bind(GL_MODULATE);
    }
	glCullFace(GL_FRONT);
	aMat = modelViewMat * mModelMat;
	upload(aMat);
    glMatrixMode(GL_TEXTURE);
    glPushMatrix();
    glScalef(rw, rh, 1.0f);
    glMatrixMode(GL_MODELVIEW);
	// Aquí se puede fijar el color de la esfera así:
	glEnable ( GL_COLOR_MATERIAL );
	glColor3f (mColor.r, mColor.g, mColor.b);
	// Aquí se puede fijar el modo de dibujar la esfera :
    if (mBackTexture != nullptr) {
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
    }
    gluQuadricNormals(q, GLU_SMOOTH);
    if (material != nullptr) {
	    glDisable(GL_COLOR_MATERIAL);
	    material->upload();
    }
	gluQuadricDrawStyle (q, GLU_FILL);
	gluCylinder(q, baseRadius, topRadius, height, 50, 50);
	// Aquí se debe recuperar el color :
    glMatrixMode(GL_TEXTURE);
    glPopMatrix();
    glMatrixMode(GL_MODELVIEW);
    if (material != nullptr) {
	    glEnable(GL_COLOR_MATERIAL);
    }
    if (mBackTexture != nullptr) {
        mBackTexture->unbind();
    }
	glColor3f (1.0 , 1.0 , 1.0);

    glDisable(GL_CULL_FACE);
}

Disk::Disk(GLdouble innerRadius, GLdouble outerRadius, GLuint rw, GLuint rh)
	:innerRadius(innerRadius), outerRadius(outerRadius), rw(rw), rh(rh)
{}

Disk::~Disk()
{
    if (mTexture != nullptr) {
	    delete mTexture;
	    mTexture = nullptr;
    }
    if (mBackTexture != nullptr) {
	    delete mBackTexture;
	    mBackTexture = nullptr;
    }
    if (material != nullptr) {
	    delete material;
	    material = nullptr;
    }
};

void
Disk::render(glm::dmat4 const& modelViewMat) const {
	gluQuadricTexture(q, GL_TRUE);
    glEnable(GL_CULL_FACE);

    if (mTexture != nullptr) {
        mTexture->setWrap(GL_REPEAT);
	    mTexture->bind(GL_MODULATE);
    }
	glCullFace(GL_BACK);
	dmat4 aMat = modelViewMat * mModelMat;
	upload(aMat);
    glMatrixMode(GL_TEXTURE);
    glPushMatrix();
    glScalef(rw, rh, 1.0f);
    glMatrixMode(GL_MODELVIEW);
	// Aquí se puede fijar el color de la esfera así:
	glEnable ( GL_COLOR_MATERIAL );
	glColor3f (mColor.r, mColor.g, mColor.b);
	// Aquí se puede fijar el modo de dibujar la esfera :
    if (mTexture != nullptr) {
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
    }
    gluQuadricNormals(q, GLU_SMOOTH);
    if (material != nullptr) {
	    glDisable(GL_COLOR_MATERIAL);
	    material->upload();
    }
	gluQuadricDrawStyle (q, GLU_FILL);
	gluDisk(q, innerRadius, outerRadius, 50, 50);
	// Aquí se debe recuperar el color :
    glMatrixMode(GL_TEXTURE);
    glPopMatrix();
    glMatrixMode(GL_MODELVIEW);
    if (material != nullptr) {
	    glEnable(GL_COLOR_MATERIAL);
    }
    if (mTexture != nullptr) {
        mTexture->unbind();
    }
	glColor3f (1.0 , 1.0 , 1.0);

    if (mBackTexture != nullptr) {
        mBackTexture->setWrap(GL_REPEAT);
	    mBackTexture->bind(GL_MODULATE);
    }
	glCullFace(GL_FRONT);
	aMat = modelViewMat * mModelMat;
	upload(aMat);
    glMatrixMode(GL_TEXTURE);
    glPushMatrix();
    glScalef(rw, rh, 1.0f);
    glMatrixMode(GL_MODELVIEW);
	// Aquí se puede fijar el color de la esfera así:
	glEnable ( GL_COLOR_MATERIAL );
	glColor3f (mColor.r, mColor.g, mColor.b);
	// Aquí se puede fijar el modo de dibujar la esfera :
    if (mBackTexture != nullptr) {
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
    }
    gluQuadricNormals(q, GLU_SMOOTH);
    if (material != nullptr) {
	    glDisable(GL_COLOR_MATERIAL);
	    material->upload();
    }
	gluQuadricDrawStyle (q, GLU_FILL);
	gluDisk(q, innerRadius, outerRadius, 50, 50);
	// Aquí se debe recuperar el color :
    glMatrixMode(GL_TEXTURE);
    glPopMatrix();
    glMatrixMode(GL_MODELVIEW);
    if (material != nullptr) {
	    glEnable(GL_COLOR_MATERIAL);
    }
    if (mBackTexture != nullptr) {
        mBackTexture->unbind();
    }
	glColor3f (1.0 , 1.0 , 1.0);

    glDisable(GL_CULL_FACE);
}

PartialDisk::PartialDisk(GLdouble innerRadius, GLdouble outerRadius, GLdouble startAngle, GLdouble sweepAngle, GLuint rw, GLuint rh)
	: innerRadius(innerRadius), outerRadius(outerRadius), startAngle(startAngle), sweepAngle(sweepAngle), rw(rw), rh(rh)
{}

PartialDisk::~PartialDisk()
{
    if (mTexture != nullptr) {
	    delete mTexture;
	    mTexture = nullptr;
    }
    if (mBackTexture != nullptr) {
	    delete mBackTexture;
	    mBackTexture = nullptr;
    }
    if (material != nullptr) {
	    delete material;
	    material = nullptr;
    }
};

void
PartialDisk::render(glm::dmat4 const& modelViewMat) const {
	gluQuadricTexture(q, GL_TRUE);
    glEnable(GL_CULL_FACE);

    if (mTexture != nullptr) {
        mTexture->setWrap(GL_REPEAT);
	    mTexture->bind(GL_MODULATE);
    }
	glCullFace(GL_BACK);
	dmat4 aMat = modelViewMat * mModelMat;
	upload(aMat);
    glMatrixMode(GL_TEXTURE);
    glPushMatrix();
    glScalef(rw, rh, 1.0f);
    glMatrixMode(GL_MODELVIEW);
	// Aquí se puede fijar el color de la esfera así:
	glEnable ( GL_COLOR_MATERIAL );
	glColor3f (mColor.r, mColor.g, mColor.b);
	// Aquí se puede fijar el modo de dibujar la esfera :
    if (mTexture != nullptr) {
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
    }
    gluQuadricNormals(q, GLU_SMOOTH);
    if (material != nullptr) {
	    glDisable(GL_COLOR_MATERIAL);
	    material->upload();
    }
	gluQuadricDrawStyle (q, GLU_FILL);
	gluPartialDisk(q, innerRadius, outerRadius, 50, 50,
		startAngle, sweepAngle);
	// Aquí se debe recuperar el color :
    glMatrixMode(GL_TEXTURE);
    glPopMatrix();
    glMatrixMode(GL_MODELVIEW);
    if (material != nullptr) {
	    glEnable(GL_COLOR_MATERIAL);
    }
    if (mTexture != nullptr) {
        mTexture->unbind();
    }
	glColor3f (1.0 , 1.0 , 1.0);

    if (mBackTexture != nullptr) {
        mBackTexture->setWrap(GL_REPEAT);
	    mBackTexture->bind(GL_MODULATE);
    }
	glCullFace(GL_FRONT);
	aMat = modelViewMat * mModelMat;
	upload(aMat);
    glMatrixMode(GL_TEXTURE);
    glPushMatrix();
    glScalef(rw, rh, 1.0f);
    glMatrixMode(GL_MODELVIEW);
	// Aquí se puede fijar el color de la esfera así:
	glEnable ( GL_COLOR_MATERIAL );
	glColor3f (mColor.r, mColor.g, mColor.b);
	// Aquí se puede fijar el modo de dibujar la esfera :
    if (mBackTexture != nullptr) {
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
    }
    gluQuadricNormals(q, GLU_SMOOTH);
    if (material != nullptr) {
	    glDisable(GL_COLOR_MATERIAL);
	    material->upload();
    }
	gluQuadricDrawStyle (q, GLU_FILL);
	gluPartialDisk(q, innerRadius, outerRadius, 50, 50,
		startAngle, sweepAngle);
	// Aquí se debe recuperar el color :
    glMatrixMode(GL_TEXTURE);
    glPopMatrix();
    glMatrixMode(GL_MODELVIEW);
    if (material != nullptr) {
	    glEnable(GL_COLOR_MATERIAL);
    }
    if (mBackTexture != nullptr) {
        mBackTexture->unbind();
    }
	glColor3f (1.0 , 1.0 , 1.0);

    glDisable(GL_CULL_FACE);
}

IndexedBox::IndexedBox(GLdouble l, GLuint rw, GLuint rh)
	: Abs_Entity()
{
	mMesh = IndexMesh::generateIndexedBox(l, rw, rh);
}

IndexedBox::~IndexedBox()
{
	delete mMesh;
	mMesh = nullptr;
    if (mTexture != nullptr) {
	    delete mTexture;
	    mTexture = nullptr;
    }
    if (mBackTexture != nullptr) {
	    delete mBackTexture;
	    mBackTexture = nullptr;
    }
    if (material != nullptr) {
	    delete material;
	    material = nullptr;
    }
};

void
IndexedBox::render(dmat4 const& modelViewMat) const
{
	if (mMesh != nullptr) {
		glEnable(GL_CULL_FACE);

        if (mTexture != nullptr) {
            mTexture->setWrap(GL_REPEAT);
	        mTexture->bind(GL_MODULATE);
        }
	    glCullFace(GL_BACK);
	    dmat4 aMat = modelViewMat * mModelMat; // glm matrix multiplication
	    upload(aMat);
        glColor4d(mColor.r, mColor.g, mColor.b, mColor.a);
	    glLineWidth(2);
        if (mTexture != nullptr) {
            glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
        }
	    if (material != nullptr) {
	        glDisable(GL_COLOR_MATERIAL);
	        material->upload();
        }
        mMesh->render();
        glLineWidth(1);
        if (material != nullptr) {
	        glEnable(GL_COLOR_MATERIAL);
        }
        if (mTexture != nullptr) {
            mTexture->unbind();
        }

        if (mBackTexture != nullptr) {
            mBackTexture->setWrap(GL_REPEAT);
	        mBackTexture->bind(GL_MODULATE);
        }
	    glCullFace(GL_FRONT);
	    aMat = modelViewMat * mModelMat; // glm matrix multiplication
	    upload(aMat);
        glColor4d(mColor.r, mColor.g, mColor.b, mColor.a);
	    glLineWidth(2);
        if (mBackTexture != nullptr) {
            glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
        }
	    if (material != nullptr) {
	        glDisable(GL_COLOR_MATERIAL);
	        material->upload();
        }
        mMesh->render();
        glLineWidth(1);
        if (material != nullptr) {
	        glEnable(GL_COLOR_MATERIAL);
        }
        if (mBackTexture != nullptr) {
            mBackTexture->unbind();
        }

	    glDisable(GL_CULL_FACE);
	}
}

Toroid::Toroid(GLdouble r, GLdouble R, GLuint rw, GLuint rh)
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


	mMesh = MbR::generateIndexMbR(auxnum, 40, perfil, rw, rh);
}

Toroid::~Toroid()
{
	delete mMesh;
	mMesh = nullptr;
    if (mTexture != nullptr) {
	    delete mTexture;
	    mTexture = nullptr;
    }
    if (mBackTexture != nullptr) {
	    delete mBackTexture;
	    mBackTexture = nullptr;
    }
    if (material != nullptr) {
	    delete material;
	    material = nullptr;
    }
};

void
Toroid::render(dmat4 const& modelViewMat) const
{
	if (mMesh != nullptr) {
		glEnable(GL_CULL_FACE);

        if (mTexture != nullptr) {
            mTexture->setWrap(GL_REPEAT);
	        mTexture->bind(GL_MODULATE);
        }
	    glCullFace(GL_BACK);
	    dmat4 aMat = modelViewMat * mModelMat; // glm matrix multiplication
	    upload(aMat);
        glColor4d(mColor.r, mColor.g, mColor.b, mColor.a);
	    glLineWidth(2);
        if (mTexture != nullptr) {
            glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
        }
	    if (material != nullptr) {
	        glDisable(GL_COLOR_MATERIAL);
	        material->upload();
        }
        mMesh->render();
        glLineWidth(1);
        if (material != nullptr) {
	        glEnable(GL_COLOR_MATERIAL);
        }
        if (mTexture != nullptr) {
            mTexture->unbind();
        }

        if (mBackTexture != nullptr) {
            mBackTexture->setWrap(GL_REPEAT);
	        mBackTexture->bind(GL_MODULATE);
        }
	    glCullFace(GL_FRONT);
	    aMat = modelViewMat * mModelMat; // glm matrix multiplication
	    upload(aMat);
        glColor4d(mColor.r, mColor.g, mColor.b, mColor.a);
	    glLineWidth(2);
        if (mBackTexture != nullptr) {
            glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
        }
	    if (material != nullptr) {
	        glDisable(GL_COLOR_MATERIAL);
	        material->upload();
        }
        mMesh->render();
        glLineWidth(1);
        if (material != nullptr) {
	        glEnable(GL_COLOR_MATERIAL);
        }
        if (mBackTexture != nullptr) {
            mBackTexture->unbind();
        }

	    glDisable(GL_CULL_FACE);
	}
}

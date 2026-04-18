#ifndef _H_Mesh_H_
#define _H_Mesh_H_

#include <GL/freeglut.h>
#include <glm/glm.hpp>

#include <vector>

class Mesh
{
public:
	static Mesh* createRGBAxes(GLdouble l); // creates a new 3D-RGB axes mesh

	Mesh() = default;
	virtual ~Mesh() = default;

	Mesh(const Mesh& m) = delete;            // no copy constructor
	Mesh& operator=(const Mesh& m) = delete; // no copy assignment

	virtual void render() const;

	GLuint size() const { return mNumVertices; }; // number of elements
	std::vector<glm::dvec3> const& vertices() const { return vVertices; };
	std::vector<glm::dvec4> const& colors() const { return vColors; };

	void addColorVertice(double r, double g, double b, double a);

    static Mesh* generateRegularPolygon(GLuint num, GLdouble r, GLuint primitive);

    static Mesh* generateRectangle(GLdouble w, GLdouble h);

protected:
	GLuint mPrimitive =
	  GL_TRIANGLES;          // graphic primitive: GL_POINTS, GL_LINES, GL_TRIANGLES, ...
	GLuint mNumVertices = 0; // number of elements ( = vVertices.size())
	std::vector<glm::dvec3> vVertices; // vertex array
	std::vector<glm::dvec4> vColors;   // color array
	std::vector<glm::dvec2> vTexCoords; //vector de coordenadas de textura
	std::vector<glm::dvec3> vNormals; // vector de normales
	virtual void draw() const;
};

class IndexMesh : public Mesh {
protected:
	GLuint* vIndices = nullptr; // tabla de índices
	GLuint nNumIndices = 0;
public:
	IndexMesh() { mPrimitive = GL_TRIANGLES; }
	virtual ~IndexMesh() { delete[] vIndices; }
	virtual void render() const;
	virtual void draw() const;
	void buildNormalVectors();

	static IndexMesh* generateIndexedBox(GLdouble l);
};

class MbR : public IndexMesh {
protected:
	int n;
	glm::dvec3* perfil = nullptr;
	int m;
public:
	MbR(int n, glm::dvec3* perfil, int m):n(n), perfil(perfil), m(m) {};
	virtual ~MbR() { delete[] perfil; }

	static MbR* generateIndexMbR(int mm, int nn, glm::dvec3* perfil);
};

#endif //_H_Scene_H_

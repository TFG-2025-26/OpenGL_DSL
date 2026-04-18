#include "Mesh.h"

#include <fstream>
using namespace std;
using namespace glm;

void
Mesh::draw() const
{
	glDrawArrays(
	  mPrimitive,
	  0,
	  size()); // primitive graphic, first index and number of elements to be rendered
}

void
Mesh::render() const
{
	if (vVertices.size() > 0) { // transfer data
		// transfer the coordinates of the vertices
		glEnableClientState(GL_VERTEX_ARRAY);
		glVertexPointer(
		  3, GL_DOUBLE, 0, vVertices.data()); // number of coordinates per vertex, type of
		                                      // each coordinate, stride, pointer
		if (vColors.size() > 0) {             // transfer colors
			glEnableClientState(GL_COLOR_ARRAY);
			glColorPointer(
			  4, GL_DOUBLE, 0, vColors.data()); // components number (rgba=4), type of
			                                    // each component, stride, pointer
		}
		if (vTexCoords.size() > 0) {
			glEnableClientState(GL_TEXTURE_COORD_ARRAY);
			glTexCoordPointer(2, GL_DOUBLE, 0, vTexCoords.data());
		}
		if (vNormals.size() > 0) {
			glEnableClientState(GL_NORMAL_ARRAY);
			glNormalPointer(GL_DOUBLE, 0, vNormals.data());
		}
		draw();

		glDisableClientState(GL_NORMAL_ARRAY);
		glDisableClientState(GL_TEXTURE_COORD_ARRAY);
		glDisableClientState(GL_COLOR_ARRAY);
		glDisableClientState(GL_VERTEX_ARRAY);
	}
}

void Mesh::addColorVertice(double r, double g, double b, double a) {
	vColors.emplace_back(r, g, b, a);
}

Mesh*
Mesh::createRGBAxes(GLdouble l)
{
	Mesh* mesh = new Mesh();

	mesh->mPrimitive = GL_LINES;

	mesh->mNumVertices = 6;
	mesh->vVertices.reserve(mesh->mNumVertices);

	// X axis vertices
	mesh->vVertices.emplace_back(0.0, 0.0, 0.0);
	mesh->vVertices.emplace_back(l, 0.0, 0.0);
	// Y axis vertices
	mesh->vVertices.emplace_back(0.0, 0.0, 0.0);
	mesh->vVertices.emplace_back(0.0, l, 0.0);
	// Z axis vertices
	mesh->vVertices.emplace_back(0.0, 0.0, 0.0);
	mesh->vVertices.emplace_back(0.0, 0.0, l);

	mesh->vColors.reserve(mesh->mNumVertices);
	// X axis color: red  (Alpha = 1 : fully opaque)
	mesh->vColors.emplace_back(1.0, 0.0, 0.0, 1.0);
	mesh->vColors.emplace_back(1.0, 0.0, 0.0, 1.0);
	// Y axis color: green
	mesh->vColors.emplace_back(0.0, 1.0, 0.0, 1.0);
	mesh->vColors.emplace_back(0.0, 1.0, 0.0, 1.0);
	// Z axis color: blue
	mesh->vColors.emplace_back(0.0, 0.0, 1.0, 1.0);
	mesh->vColors.emplace_back(0.0, 0.0, 1.0, 1.0);

	return mesh;
}

Mesh*
Mesh::generateRegularPolygon(GLuint num, GLdouble r, GLuint primitive)
{
	// variables
	int auxnum = num;
	float alfa = 90.0, angsep = 360 / num;

	Mesh* mesh = new Mesh();

	mesh->mPrimitive = primitive;

	mesh->mNumVertices = num;
	mesh->vVertices.reserve(mesh->mNumVertices);

	for (int i = 0; i < auxnum; i++)
	{
		auto alfaAux = glm::radians(alfa);

		auto x = r * glm::cos(alfaAux);
		auto y = r * glm::sin(alfaAux);

		mesh->vVertices.emplace_back(x, y, 0.0);

		alfa += angsep;
	}

	mesh->vColors.reserve(mesh->mNumVertices);

	return mesh;
}

Mesh*
Mesh::generateRectangle(GLdouble w, GLdouble h) {

	Mesh* mesh = new Mesh();

	mesh->mPrimitive = GL_TRIANGLE_STRIP;

	mesh->mNumVertices = 4;
	mesh->vVertices.reserve(mesh->mNumVertices);

	mesh->vVertices.emplace_back((w / 2) * -1, h / 2, 0.0);
	mesh->vVertices.emplace_back((w / 2) * -1, (h / 2) * -1, 0.0);
	mesh->vVertices.emplace_back(w/2, h/2, 0.0);
	mesh->vVertices.emplace_back(w / 2, (h / 2) * -1, 0.0);

	mesh->vColors.reserve(mesh->mNumVertices);

	return mesh;
}

void IndexMesh::render() const {
	 // Comandos OpenGL para enviar datos de arrays a GPU
	if (vVertices.size() > 0) { // transfer data
		// transfer the coordinates of the vertices
		glEnableClientState(GL_VERTEX_ARRAY);
		glVertexPointer(
			3, GL_DOUBLE, 0, vVertices.data()); // number of coordinates per vertex, type of
		// each coordinate, stride, pointer
		if (vColors.size() > 0) {             // transfer colors
			glEnableClientState(GL_COLOR_ARRAY);
			glColorPointer(
				4, GL_DOUBLE, 0, vColors.data()); // components number (rgba=4), type of
			// each component, stride, pointer
		}
		if (vTexCoords.size() > 0) {
			glEnableClientState(GL_TEXTURE_COORD_ARRAY);
			glTexCoordPointer(2, GL_DOUBLE, 0, vTexCoords.data());
		}
		if (vNormals.size() > 0) {
			glEnableClientState(GL_NORMAL_ARRAY);
			glNormalPointer(GL_DOUBLE, 0, vNormals.data());
		}
		// Nuevos comandos para la tabla de índices
		if (vIndices != nullptr) {
			glEnableClientState(GL_INDEX_ARRAY);
			glIndexPointer(GL_UNSIGNED_INT, 0, vIndices);
		}
		draw();
		// Comandos OpenGL para deshabilitar datos enviados
		glDisableClientState(GL_NORMAL_ARRAY);
		glDisableClientState(GL_TEXTURE_COORD_ARRAY);
		glDisableClientState(GL_COLOR_ARRAY);
		glDisableClientState(GL_VERTEX_ARRAY);
		// Nuevo comando para la tabla de índices :
		glDisableClientState(GL_INDEX_ARRAY);
	}
}
// Comando para renderizar la malla indexada enviada
void IndexMesh::draw() const {
	glDrawElements(mPrimitive, nNumIndices,
		GL_UNSIGNED_INT, vIndices);
}

void IndexMesh::buildNormalVectors() {
	vNormals.reserve(mNumVertices);
	for (int i = 0; i < mNumVertices; i++) {
		vNormals.emplace_back(0,0,0);
	}

	for (int i = 0; i < nNumIndices/3; i++) {
		GLuint cara[]{ vIndices[i*3],vIndices[i*3+1],vIndices[i*3+2] };

		auto n = dvec3(0, 0, 0);
		for (int j = 0; j < 3; j++) {
			auto verticeActual = vVertices[cara[j]];
			auto verticeSiguiente = vVertices[cara[(j + 1) % 3]];

			n.x += (verticeActual.y - verticeSiguiente.y) * (verticeActual.z + verticeSiguiente.z);
			n.y += (verticeActual.z - verticeSiguiente.z) * (verticeActual.x + verticeSiguiente.x);
			n.z += (verticeActual.x - verticeSiguiente.x) * (verticeActual.y + verticeSiguiente.y);
		}
		vNormals[cara[0]] += n;
		vNormals[cara[1]] += n;
		vNormals[cara[2]] += n;
	}

	for (int i = 0; i < mNumVertices; i++) {
		vNormals[i] = glm::normalize(vNormals[i]);
	}
}

IndexMesh*
IndexMesh::generateIndexedBox(GLdouble l) {
	IndexMesh* indexMesh = new IndexMesh();

	indexMesh->mNumVertices = 8;

	indexMesh->vVertices.reserve(indexMesh->mNumVertices);
	indexMesh->vVertices.emplace_back(dvec3(-l / 2, l / 2, l / 2));
	indexMesh->vVertices.emplace_back(dvec3(-l / 2, -l / 2, l / 2));
	indexMesh->vVertices.emplace_back(dvec3(l / 2, l / 2, l / 2));
	indexMesh->vVertices.emplace_back(dvec3(l / 2, -l / 2, l / 2));
	indexMesh->vVertices.emplace_back(dvec3(l / 2, l / 2, -l / 2));
	indexMesh->vVertices.emplace_back(dvec3(l / 2, -l / 2, -l / 2));
	indexMesh->vVertices.emplace_back(dvec3(-l / 2, l / 2, -l / 2));
	indexMesh->vVertices.emplace_back(dvec3(-l / 2, -l / 2, -l / 2));

	indexMesh->vColors.reserve(indexMesh->mNumVertices);
	for (int i = 0; i < 8; i++) {
		indexMesh->vColors.emplace_back(0, 1, 0, 1);
	}

	indexMesh->nNumIndices = 36;
	
	indexMesh->vIndices = new GLuint []{ 0,1,2, 1,3,2, 2,3,4, 3,5,4, 4,5,6, 5,7,6, 0,6,1, 6,7,1, 0,2,4, 4,6,0, 1,5,3, 1,7,5 };

	indexMesh->buildNormalVectors();

	return indexMesh;
}

MbR*
MbR::generateIndexMbR(int mm, int nn, glm::dvec3* perfil) {
	MbR* mesh = new MbR(nn, perfil, mm);
	// Definir la primitiva como GL_TRIANGLES
	mesh->mPrimitive = GL_TRIANGLES;
	// Definir el número de vértices como nn*mm
	mesh->mNumVertices = nn * mm;
	// Usar un vector auxiliar de vértices
	glm::dvec3* vs = new glm::dvec3[mesh->mNumVertices];

	int aux = 0;

	for (int i = 0; i < nn; i++) {
		// Generar la muestra i- ésima de vértices
		GLdouble theta = i * 360 / nn;
		GLdouble c = cos(radians(theta));
		GLdouble s = sin(radians(theta));
		for (int j = 0; j < mm; j++) {
			GLdouble z = -s * perfil[j].x + c * perfil[j].z;
			GLdouble x = c * perfil[j].x + s * perfil[j].z;
			vs[aux] = glm::dvec3(x, perfil[j].y, z);
			aux++;
		}
	}

	mesh->vVertices.reserve(mesh->mNumVertices);

	for (int i = 0; i < mesh->mNumVertices; i++) {
		mesh->vVertices.emplace_back(vs[i]);
	}

	mesh->nNumIndices = (mm-1) * nn * 6;
	mesh->vIndices = new GLuint[mesh->nNumIndices];

	int indiceMayor = 0;
	// El contador i recorre las muestras alrededor del eje Y
	for (int i = 0; i < nn; i++) {
		// El contador j recorre los vértices del perfil ,
		// de abajo arriba . Las caras cuadrangulares resultan
		// al unir la muestra i- ésima con la (i +1)% nn - ésima
		for (int j = 0; j < mm - 1; j++) {
			// El contador indice sirve para llevar cuenta
			// de los índices generados hasta ahora . Se recorre
			// la cara desde la esquina inferior izquierda
			int indice = i * mm + j;

			mesh->vIndices[indiceMayor] = indice;
			indiceMayor++;
			mesh->vIndices[indiceMayor] = (indice + mm) % (nn * mm);
			indiceMayor++;
			mesh->vIndices[indiceMayor] = (indice + mm + 1) % (nn * mm);
			indiceMayor++;

			mesh->vIndices[indiceMayor] = (indice + mm + 1) % (nn * mm);
			indiceMayor++;
			mesh->vIndices[indiceMayor] = indice + 1;
			indiceMayor++;
			mesh->vIndices[indiceMayor] = indice;
			indiceMayor++;
		}
	}
	
	// Y análogamente se añaden los otros tres índices

	mesh -> buildNormalVectors();
	return mesh;
}

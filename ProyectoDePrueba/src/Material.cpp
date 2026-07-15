#include "Material.h"

void Material::upload() {
	glMaterialfv(face, GL_AMBIENT, value_ptr(ambient));
	glMaterialfv(face, GL_DIFFUSE, value_ptr(diffuse));
	glMaterialfv(face, GL_SPECULAR, value_ptr(specular));
	glMaterialf(face, GL_SHININESS, expF);
	glShadeModel(sh);
	// glLightModeli ( GL_LIGHT_MODEL_TWO_SIDE , GL_FALSE ); // Defecto
}

void Material::setAmb(glm::fvec4 amb) {
	ambient = amb; upload();
}; 

void Material::setDiff(glm::fvec4 diff) {
	diffuse = diff; upload();
}; 

void Material::setSpec(glm::fvec4 spec) {
	specular = spec; upload();
};

void Material::setExpF(GLfloat eF) {
	expF = eF; upload();
}; 

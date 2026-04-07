/**
 */
package openGL_DSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see openGL_DSL.OpenGL_DSLPackage
 * @generated
 */
public interface OpenGL_DSLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenGL_DSLFactory eINSTANCE = openGL_DSL.impl.OpenGL_DSLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Scene Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scene Manager</em>'.
	 * @generated
	 */
	SceneManager createSceneManager();

	/**
	 * Returns a new object of class '<em>View Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Port</em>'.
	 * @generated
	 */
	ViewPort createViewPort();

	/**
	 * Returns a new object of class '<em>Camera</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera</em>'.
	 * @generated
	 */
	Camera createCamera();

	/**
	 * Returns a new object of class '<em>Scene</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scene</em>'.
	 * @generated
	 */
	Scene createScene();

	/**
	 * Returns a new object of class '<em>Dir Light</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dir Light</em>'.
	 * @generated
	 */
	DirLight createDirLight();

	/**
	 * Returns a new object of class '<em>Pos Light</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pos Light</em>'.
	 * @generated
	 */
	PosLight createPosLight();

	/**
	 * Returns a new object of class '<em>Spot Light</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spot Light</em>'.
	 * @generated
	 */
	SpotLight createSpotLight();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Esfera</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Esfera</em>'.
	 * @generated
	 */
	Esfera createEsfera();

	/**
	 * Returns a new object of class '<em>Circulo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circulo</em>'.
	 * @generated
	 */
	Circulo createCirculo();

	/**
	 * Returns a new object of class '<em>Rectangulo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectangulo</em>'.
	 * @generated
	 */
	Rectangulo createRectangulo();

	/**
	 * Returns a new object of class '<em>Material</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Material</em>'.
	 * @generated
	 */
	Material createMaterial();

	/**
	 * Returns a new object of class '<em>Mesh</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mesh</em>'.
	 * @generated
	 */
	Mesh createMesh();

	/**
	 * Returns a new object of class '<em>Mb R</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mb R</em>'.
	 * @generated
	 */
	MbR createMbR();

	/**
	 * Returns a new object of class '<em>Texture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Texture</em>'.
	 * @generated
	 */
	Texture createTexture();

	/**
	 * Returns a new object of class '<em>Index Mesh</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Mesh</em>'.
	 * @generated
	 */
	IndexMesh createIndexMesh();

	/**
	 * Returns a new object of class '<em>Ejes RGB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ejes RGB</em>'.
	 * @generated
	 */
	EjesRGB createEjesRGB();

	/**
	 * Returns a new object of class '<em>Vector3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vector3</em>'.
	 * @generated
	 */
	Vector3 createVector3();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OpenGL_DSLPackage getOpenGL_DSLPackage();

} //OpenGL_DSLFactory

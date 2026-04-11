/**
 */
package openGL_DSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abs Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.Abs_Entity#getTexture <em>Texture</em>}</li>
 *   <li>{@link openGL_DSL.Abs_Entity#getMaterial <em>Material</em>}</li>
 *   <li>{@link openGL_DSL.Abs_Entity#getMesh <em>Mesh</em>}</li>
 *   <li>{@link openGL_DSL.Abs_Entity#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getAbs_Entity()
 * @model abstract="true"
 * @generated
 */
public interface Abs_Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Texture</b></em>' containment reference list.
	 * The list contents are of type {@link openGL_DSL.Texture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture</em>' containment reference list.
	 * @see openGL_DSL.OpenGL_DSLPackage#getAbs_Entity_Texture()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<Texture> getTexture();

	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' containment reference.
	 * @see #setMaterial(Material)
	 * @see openGL_DSL.OpenGL_DSLPackage#getAbs_Entity_Material()
	 * @model containment="true"
	 * @generated
	 */
	Material getMaterial();

	/**
	 * Sets the value of the '{@link openGL_DSL.Abs_Entity#getMaterial <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' containment reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(Material value);

	/**
	 * Returns the value of the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesh</em>' containment reference.
	 * @see #setMesh(Mesh)
	 * @see openGL_DSL.OpenGL_DSLPackage#getAbs_Entity_Mesh()
	 * @model containment="true"
	 * @generated
	 */
	Mesh getMesh();

	/**
	 * Sets the value of the '{@link openGL_DSL.Abs_Entity#getMesh <em>Mesh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesh</em>' containment reference.
	 * @see #getMesh()
	 * @generated
	 */
	void setMesh(Mesh value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' containment reference.
	 * @see #setColor(Vector4)
	 * @see openGL_DSL.OpenGL_DSLPackage#getAbs_Entity_Color()
	 * @model containment="true"
	 * @generated
	 */
	Vector4 getColor();

	/**
	 * Sets the value of the '{@link openGL_DSL.Abs_Entity#getColor <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' containment reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Vector4 value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model modelViewMatDataType="openGL_DSL.mat4"
	 * @generated
	 */
	void render(Object modelViewMat);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void upload();

} // Abs_Entity

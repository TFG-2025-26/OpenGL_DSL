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
 *   <li>{@link openGL_DSL.Abs_Entity#getMModelMat <em>MModel Mat</em>}</li>
 *   <li>{@link openGL_DSL.Abs_Entity#getMColor <em>MColor</em>}</li>
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
	 * Returns the value of the '<em><b>MModel Mat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MModel Mat</em>' attribute.
	 * @see #setMModelMat(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getAbs_Entity_MModelMat()
	 * @model dataType="openGL_DSL.mat4"
	 * @generated
	 */
	Object getMModelMat();

	/**
	 * Sets the value of the '{@link openGL_DSL.Abs_Entity#getMModelMat <em>MModel Mat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MModel Mat</em>' attribute.
	 * @see #getMModelMat()
	 * @generated
	 */
	void setMModelMat(Object value);

	/**
	 * Returns the value of the '<em><b>MColor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MColor</em>' attribute.
	 * @see #setMColor(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getAbs_Entity_MColor()
	 * @model dataType="openGL_DSL.vec4"
	 * @generated
	 */
	Object getMColor();

	/**
	 * Sets the value of the '{@link openGL_DSL.Abs_Entity#getMColor <em>MColor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MColor</em>' attribute.
	 * @see #getMColor()
	 * @generated
	 */
	void setMColor(Object value);

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

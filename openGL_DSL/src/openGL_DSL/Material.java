/**
 */
package openGL_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.Material#getAmbient <em>Ambient</em>}</li>
 *   <li>{@link openGL_DSL.Material#getDifusse <em>Difusse</em>}</li>
 *   <li>{@link openGL_DSL.Material#getSpecular <em>Specular</em>}</li>
 *   <li>{@link openGL_DSL.Material#getExpF <em>Exp F</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getMaterial()
 * @model
 * @generated
 */
public interface Material extends EObject {
	/**
	 * Returns the value of the '<em><b>Ambient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambient</em>' containment reference.
	 * @see #setAmbient(Vector4)
	 * @see openGL_DSL.OpenGL_DSLPackage#getMaterial_Ambient()
	 * @model containment="true"
	 * @generated
	 */
	Vector4 getAmbient();

	/**
	 * Sets the value of the '{@link openGL_DSL.Material#getAmbient <em>Ambient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ambient</em>' containment reference.
	 * @see #getAmbient()
	 * @generated
	 */
	void setAmbient(Vector4 value);

	/**
	 * Returns the value of the '<em><b>Difusse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difusse</em>' containment reference.
	 * @see #setDifusse(Vector4)
	 * @see openGL_DSL.OpenGL_DSLPackage#getMaterial_Difusse()
	 * @model containment="true"
	 * @generated
	 */
	Vector4 getDifusse();

	/**
	 * Sets the value of the '{@link openGL_DSL.Material#getDifusse <em>Difusse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difusse</em>' containment reference.
	 * @see #getDifusse()
	 * @generated
	 */
	void setDifusse(Vector4 value);

	/**
	 * Returns the value of the '<em><b>Specular</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specular</em>' containment reference.
	 * @see #setSpecular(Vector4)
	 * @see openGL_DSL.OpenGL_DSLPackage#getMaterial_Specular()
	 * @model containment="true"
	 * @generated
	 */
	Vector4 getSpecular();

	/**
	 * Sets the value of the '{@link openGL_DSL.Material#getSpecular <em>Specular</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specular</em>' containment reference.
	 * @see #getSpecular()
	 * @generated
	 */
	void setSpecular(Vector4 value);

	/**
	 * Returns the value of the '<em><b>Exp F</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp F</em>' attribute.
	 * @see #setExpF(float)
	 * @see openGL_DSL.OpenGL_DSLPackage#getMaterial_ExpF()
	 * @model
	 * @generated
	 */
	float getExpF();

	/**
	 * Sets the value of the '{@link openGL_DSL.Material#getExpF <em>Exp F</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp F</em>' attribute.
	 * @see #getExpF()
	 * @generated
	 */
	void setExpF(float value);

} // Material

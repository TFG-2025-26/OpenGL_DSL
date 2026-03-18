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
 *   <li>{@link openGL_DSL.Material#getFace <em>Face</em>}</li>
 *   <li>{@link openGL_DSL.Material#getSh <em>Sh</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getMaterial()
 * @model
 * @generated
 */
public interface Material extends EObject {
	/**
	 * Returns the value of the '<em><b>Ambient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambient</em>' attribute.
	 * @see #setAmbient(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getMaterial_Ambient()
	 * @model dataType="openGL_DSL.vec4"
	 * @generated
	 */
	Object getAmbient();

	/**
	 * Sets the value of the '{@link openGL_DSL.Material#getAmbient <em>Ambient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ambient</em>' attribute.
	 * @see #getAmbient()
	 * @generated
	 */
	void setAmbient(Object value);

	/**
	 * Returns the value of the '<em><b>Difusse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difusse</em>' attribute.
	 * @see #setDifusse(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getMaterial_Difusse()
	 * @model dataType="openGL_DSL.vec4"
	 * @generated
	 */
	Object getDifusse();

	/**
	 * Sets the value of the '{@link openGL_DSL.Material#getDifusse <em>Difusse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difusse</em>' attribute.
	 * @see #getDifusse()
	 * @generated
	 */
	void setDifusse(Object value);

	/**
	 * Returns the value of the '<em><b>Specular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specular</em>' attribute.
	 * @see #setSpecular(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getMaterial_Specular()
	 * @model dataType="openGL_DSL.vec4"
	 * @generated
	 */
	Object getSpecular();

	/**
	 * Sets the value of the '{@link openGL_DSL.Material#getSpecular <em>Specular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specular</em>' attribute.
	 * @see #getSpecular()
	 * @generated
	 */
	void setSpecular(Object value);

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

	/**
	 * Returns the value of the '<em><b>Face</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Face</em>' attribute.
	 * @see #setFace(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getMaterial_Face()
	 * @model dataType="openGL_DSL.GLuint"
	 * @generated
	 */
	Object getFace();

	/**
	 * Sets the value of the '{@link openGL_DSL.Material#getFace <em>Face</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Face</em>' attribute.
	 * @see #getFace()
	 * @generated
	 */
	void setFace(Object value);

	/**
	 * Returns the value of the '<em><b>Sh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sh</em>' attribute.
	 * @see #setSh(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getMaterial_Sh()
	 * @model dataType="openGL_DSL.GLuint"
	 * @generated
	 */
	Object getSh();

	/**
	 * Sets the value of the '{@link openGL_DSL.Material#getSh <em>Sh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sh</em>' attribute.
	 * @see #getSh()
	 * @generated
	 */
	void setSh(Object value);

} // Material

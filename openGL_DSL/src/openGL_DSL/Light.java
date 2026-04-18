/**
 */
package openGL_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.Light#getCont <em>Cont</em>}</li>
 *   <li>{@link openGL_DSL.Light#getId <em>Id</em>}</li>
 *   <li>{@link openGL_DSL.Light#getPosDIr <em>Pos DIr</em>}</li>
 *   <li>{@link openGL_DSL.Light#getAmbient <em>Ambient</em>}</li>
 *   <li>{@link openGL_DSL.Light#getDifusse <em>Difusse</em>}</li>
 *   <li>{@link openGL_DSL.Light#getSpecular <em>Specular</em>}</li>
 *   <li>{@link openGL_DSL.Light#getDireccion <em>Direccion</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getLight()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Light extends EObject {
	/**
	 * Returns the value of the '<em><b>Cont</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cont</em>' attribute.
	 * @see #setCont(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getLight_Cont()
	 * @model dataType="openGL_DSL.GLuint"
	 * @generated
	 */
	Object getCont();

	/**
	 * Sets the value of the '{@link openGL_DSL.Light#getCont <em>Cont</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cont</em>' attribute.
	 * @see #getCont()
	 * @generated
	 */
	void setCont(Object value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getLight_Id()
	 * @model id="true" dataType="openGL_DSL.GLuint"
	 * @generated
	 */
	Object getId();

	/**
	 * Sets the value of the '{@link openGL_DSL.Light#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Object value);

	/**
	 * Returns the value of the '<em><b>Pos DIr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos DIr</em>' attribute.
	 * @see #setPosDIr(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getLight_PosDIr()
	 * @model dataType="openGL_DSL.vec4"
	 * @generated
	 */
	Object getPosDIr();

	/**
	 * Sets the value of the '{@link openGL_DSL.Light#getPosDIr <em>Pos DIr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos DIr</em>' attribute.
	 * @see #getPosDIr()
	 * @generated
	 */
	void setPosDIr(Object value);

	/**
	 * Returns the value of the '<em><b>Ambient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambient</em>' containment reference.
	 * @see #setAmbient(Vector4)
	 * @see openGL_DSL.OpenGL_DSLPackage#getLight_Ambient()
	 * @model containment="true"
	 * @generated
	 */
	Vector4 getAmbient();

	/**
	 * Sets the value of the '{@link openGL_DSL.Light#getAmbient <em>Ambient</em>}' containment reference.
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
	 * @see openGL_DSL.OpenGL_DSLPackage#getLight_Difusse()
	 * @model containment="true"
	 * @generated
	 */
	Vector4 getDifusse();

	/**
	 * Sets the value of the '{@link openGL_DSL.Light#getDifusse <em>Difusse</em>}' containment reference.
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
	 * @see openGL_DSL.OpenGL_DSLPackage#getLight_Specular()
	 * @model containment="true"
	 * @generated
	 */
	Vector4 getSpecular();

	/**
	 * Sets the value of the '{@link openGL_DSL.Light#getSpecular <em>Specular</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specular</em>' containment reference.
	 * @see #getSpecular()
	 * @generated
	 */
	void setSpecular(Vector4 value);

	/**
	 * Returns the value of the '<em><b>Direccion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direccion</em>' containment reference.
	 * @see #setDireccion(Vector3)
	 * @see openGL_DSL.OpenGL_DSLPackage#getLight_Direccion()
	 * @model containment="true"
	 * @generated
	 */
	Vector3 getDireccion();

	/**
	 * Sets the value of the '{@link openGL_DSL.Light#getDireccion <em>Direccion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direccion</em>' containment reference.
	 * @see #getDireccion()
	 * @generated
	 */
	void setDireccion(Vector3 value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model modelViewMatDataType="openGL_DSL.mat4"
	 * @generated
	 */
	void uploadL(Object modelViewMat);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void disable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enable();

} // Light

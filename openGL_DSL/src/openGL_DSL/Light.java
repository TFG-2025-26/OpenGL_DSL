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
 *   <li>{@link openGL_DSL.Light#getAmbient <em>Ambient</em>}</li>
 *   <li>{@link openGL_DSL.Light#getDifusse <em>Difusse</em>}</li>
 *   <li>{@link openGL_DSL.Light#getSpecular <em>Specular</em>}</li>
 *   <li>{@link openGL_DSL.Light#getPosDIr <em>Pos DIr</em>}</li>
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
	 * Returns the value of the '<em><b>Ambient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambient</em>' attribute.
	 * @see #setAmbient(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getLight_Ambient()
	 * @model dataType="openGL_DSL.vec4"
	 * @generated
	 */
	Object getAmbient();

	/**
	 * Sets the value of the '{@link openGL_DSL.Light#getAmbient <em>Ambient</em>}' attribute.
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
	 * @see openGL_DSL.OpenGL_DSLPackage#getLight_Difusse()
	 * @model dataType="openGL_DSL.vec4"
	 * @generated
	 */
	Object getDifusse();

	/**
	 * Sets the value of the '{@link openGL_DSL.Light#getDifusse <em>Difusse</em>}' attribute.
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
	 * @see openGL_DSL.OpenGL_DSLPackage#getLight_Specular()
	 * @model dataType="openGL_DSL.vec4"
	 * @generated
	 */
	Object getSpecular();

	/**
	 * Sets the value of the '{@link openGL_DSL.Light#getSpecular <em>Specular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specular</em>' attribute.
	 * @see #getSpecular()
	 * @generated
	 */
	void setSpecular(Object value);

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

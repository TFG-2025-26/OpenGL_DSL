/**
 */
package openGL_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.Camera#getMEye <em>MEye</em>}</li>
 *   <li>{@link openGL_DSL.Camera#getMLook <em>MLook</em>}</li>
 *   <li>{@link openGL_DSL.Camera#getMUp <em>MUp</em>}</li>
 *   <li>{@link openGL_DSL.Camera#getModelViewMat <em>Model View Mat</em>}</li>
 *   <li>{@link openGL_DSL.Camera#getMProjMat <em>MProj Mat</em>}</li>
 *   <li>{@link openGL_DSL.Camera#getMNearVal <em>MNear Val</em>}</li>
 *   <li>{@link openGL_DSL.Camera#getMFarVal <em>MFar Val</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getCamera()
 * @model
 * @generated
 */
public interface Camera extends EObject {
	/**
	 * Returns the value of the '<em><b>MEye</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MEye</em>' attribute.
	 * @see #setMEye(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getCamera_MEye()
	 * @model dataType="openGL_DSL.vec3"
	 * @generated
	 */
	Object getMEye();

	/**
	 * Sets the value of the '{@link openGL_DSL.Camera#getMEye <em>MEye</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MEye</em>' attribute.
	 * @see #getMEye()
	 * @generated
	 */
	void setMEye(Object value);

	/**
	 * Returns the value of the '<em><b>MLook</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MLook</em>' attribute.
	 * @see #setMLook(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getCamera_MLook()
	 * @model dataType="openGL_DSL.vec3"
	 * @generated
	 */
	Object getMLook();

	/**
	 * Sets the value of the '{@link openGL_DSL.Camera#getMLook <em>MLook</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MLook</em>' attribute.
	 * @see #getMLook()
	 * @generated
	 */
	void setMLook(Object value);

	/**
	 * Returns the value of the '<em><b>MUp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MUp</em>' attribute.
	 * @see #setMUp(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getCamera_MUp()
	 * @model dataType="openGL_DSL.vec3"
	 * @generated
	 */
	Object getMUp();

	/**
	 * Sets the value of the '{@link openGL_DSL.Camera#getMUp <em>MUp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MUp</em>' attribute.
	 * @see #getMUp()
	 * @generated
	 */
	void setMUp(Object value);

	/**
	 * Returns the value of the '<em><b>Model View Mat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model View Mat</em>' attribute.
	 * @see #setModelViewMat(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getCamera_ModelViewMat()
	 * @model dataType="openGL_DSL.mat4"
	 * @generated
	 */
	Object getModelViewMat();

	/**
	 * Sets the value of the '{@link openGL_DSL.Camera#getModelViewMat <em>Model View Mat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model View Mat</em>' attribute.
	 * @see #getModelViewMat()
	 * @generated
	 */
	void setModelViewMat(Object value);

	/**
	 * Returns the value of the '<em><b>MProj Mat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MProj Mat</em>' attribute.
	 * @see #setMProjMat(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getCamera_MProjMat()
	 * @model dataType="openGL_DSL.mat4"
	 * @generated
	 */
	Object getMProjMat();

	/**
	 * Sets the value of the '{@link openGL_DSL.Camera#getMProjMat <em>MProj Mat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MProj Mat</em>' attribute.
	 * @see #getMProjMat()
	 * @generated
	 */
	void setMProjMat(Object value);

	/**
	 * Returns the value of the '<em><b>MNear Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MNear Val</em>' attribute.
	 * @see #setMNearVal(double)
	 * @see openGL_DSL.OpenGL_DSLPackage#getCamera_MNearVal()
	 * @model
	 * @generated
	 */
	double getMNearVal();

	/**
	 * Sets the value of the '{@link openGL_DSL.Camera#getMNearVal <em>MNear Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MNear Val</em>' attribute.
	 * @see #getMNearVal()
	 * @generated
	 */
	void setMNearVal(double value);

	/**
	 * Returns the value of the '<em><b>MFar Val</b></em>' attribute.
	 * The default value is <code>"10000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFar Val</em>' attribute.
	 * @see #setMFarVal(double)
	 * @see openGL_DSL.OpenGL_DSLPackage#getCamera_MFarVal()
	 * @model default="10000"
	 * @generated
	 */
	double getMFarVal();

	/**
	 * Sets the value of the '{@link openGL_DSL.Camera#getMFarVal <em>MFar Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFar Val</em>' attribute.
	 * @see #getMFarVal()
	 * @generated
	 */
	void setMFarVal(double value);

} // Camera

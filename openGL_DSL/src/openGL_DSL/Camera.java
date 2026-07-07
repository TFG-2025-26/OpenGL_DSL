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
 *   <li>{@link openGL_DSL.Camera#isBOrto <em>BOrto</em>}</li>
 *   <li>{@link openGL_DSL.Camera#getEye <em>Eye</em>}</li>
 *   <li>{@link openGL_DSL.Camera#getLook <em>Look</em>}</li>
 *   <li>{@link openGL_DSL.Camera#getUp <em>Up</em>}</li>
 *   <li>{@link openGL_DSL.Camera#getPlanoCercano <em>Plano Cercano</em>}</li>
 *   <li>{@link openGL_DSL.Camera#getPlanoLejano <em>Plano Lejano</em>}</li>
 *   <li>{@link openGL_DSL.Camera#getRadio <em>Radio</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getCamera()
 * @model
 * @generated
 */
public interface Camera extends EObject {
	/**
	 * Returns the value of the '<em><b>BOrto</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BOrto</em>' attribute.
	 * @see #setBOrto(boolean)
	 * @see openGL_DSL.OpenGL_DSLPackage#getCamera_BOrto()
	 * @model default="true"
	 * @generated
	 */
	boolean isBOrto();

	/**
	 * Sets the value of the '{@link openGL_DSL.Camera#isBOrto <em>BOrto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BOrto</em>' attribute.
	 * @see #isBOrto()
	 * @generated
	 */
	void setBOrto(boolean value);

	/**
	 * Returns the value of the '<em><b>Eye</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eye</em>' containment reference.
	 * @see #setEye(Vector3)
	 * @see openGL_DSL.OpenGL_DSLPackage#getCamera_Eye()
	 * @model containment="true"
	 * @generated
	 */
	Vector3 getEye();

	/**
	 * Sets the value of the '{@link openGL_DSL.Camera#getEye <em>Eye</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eye</em>' containment reference.
	 * @see #getEye()
	 * @generated
	 */
	void setEye(Vector3 value);

	/**
	 * Returns the value of the '<em><b>Look</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Look</em>' containment reference.
	 * @see #setLook(Vector3)
	 * @see openGL_DSL.OpenGL_DSLPackage#getCamera_Look()
	 * @model containment="true"
	 * @generated
	 */
	Vector3 getLook();

	/**
	 * Sets the value of the '{@link openGL_DSL.Camera#getLook <em>Look</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Look</em>' containment reference.
	 * @see #getLook()
	 * @generated
	 */
	void setLook(Vector3 value);

	/**
	 * Returns the value of the '<em><b>Up</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Up</em>' containment reference.
	 * @see #setUp(Vector3)
	 * @see openGL_DSL.OpenGL_DSLPackage#getCamera_Up()
	 * @model containment="true"
	 * @generated
	 */
	Vector3 getUp();

	/**
	 * Sets the value of the '{@link openGL_DSL.Camera#getUp <em>Up</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Up</em>' containment reference.
	 * @see #getUp()
	 * @generated
	 */
	void setUp(Vector3 value);

	/**
	 * Returns the value of the '<em><b>Plano Cercano</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plano Cercano</em>' attribute.
	 * @see #setPlanoCercano(double)
	 * @see openGL_DSL.OpenGL_DSLPackage#getCamera_PlanoCercano()
	 * @model default="1"
	 * @generated
	 */
	double getPlanoCercano();

	/**
	 * Sets the value of the '{@link openGL_DSL.Camera#getPlanoCercano <em>Plano Cercano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plano Cercano</em>' attribute.
	 * @see #getPlanoCercano()
	 * @generated
	 */
	void setPlanoCercano(double value);

	/**
	 * Returns the value of the '<em><b>Plano Lejano</b></em>' attribute.
	 * The default value is <code>"10000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plano Lejano</em>' attribute.
	 * @see #setPlanoLejano(double)
	 * @see openGL_DSL.OpenGL_DSLPackage#getCamera_PlanoLejano()
	 * @model default="10000"
	 * @generated
	 */
	double getPlanoLejano();

	/**
	 * Sets the value of the '{@link openGL_DSL.Camera#getPlanoLejano <em>Plano Lejano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plano Lejano</em>' attribute.
	 * @see #getPlanoLejano()
	 * @generated
	 */
	void setPlanoLejano(double value);

	/**
	 * Returns the value of the '<em><b>Radio</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radio</em>' attribute.
	 * @see #setRadio(double)
	 * @see openGL_DSL.OpenGL_DSLPackage#getCamera_Radio()
	 * @model default="1000"
	 * @generated
	 */
	double getRadio();

	/**
	 * Sets the value of the '{@link openGL_DSL.Camera#getRadio <em>Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radio</em>' attribute.
	 * @see #getRadio()
	 * @generated
	 */
	void setRadio(double value);

} // Camera

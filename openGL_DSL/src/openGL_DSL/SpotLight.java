/**
 */
package openGL_DSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spot Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.SpotLight#getCutoff <em>Cutoff</em>}</li>
 *   <li>{@link openGL_DSL.SpotLight#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getSpotLight()
 * @model
 * @generated
 */
public interface SpotLight extends PosLight {
	/**
	 * Returns the value of the '<em><b>Cutoff</b></em>' attribute.
	 * The default value is <code>"180"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cutoff</em>' attribute.
	 * @see #setCutoff(float)
	 * @see openGL_DSL.OpenGL_DSLPackage#getSpotLight_Cutoff()
	 * @model default="180"
	 * @generated
	 */
	float getCutoff();

	/**
	 * Sets the value of the '{@link openGL_DSL.SpotLight#getCutoff <em>Cutoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cutoff</em>' attribute.
	 * @see #getCutoff()
	 * @generated
	 */
	void setCutoff(float value);

	/**
	 * Returns the value of the '<em><b>Exp</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' attribute.
	 * @see #setExp(float)
	 * @see openGL_DSL.OpenGL_DSLPackage#getSpotLight_Exp()
	 * @model default="0"
	 * @generated
	 */
	float getExp();

	/**
	 * Sets the value of the '{@link openGL_DSL.SpotLight#getExp <em>Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' attribute.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(float value);

} // SpotLight

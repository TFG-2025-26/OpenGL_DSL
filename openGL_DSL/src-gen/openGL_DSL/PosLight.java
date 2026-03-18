/**
 */
package openGL_DSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pos Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.PosLight#getKc <em>Kc</em>}</li>
 *   <li>{@link openGL_DSL.PosLight#getKl <em>Kl</em>}</li>
 *   <li>{@link openGL_DSL.PosLight#getKq <em>Kq</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getPosLight()
 * @model
 * @generated
 */
public interface PosLight extends Light {
	/**
	 * Returns the value of the '<em><b>Kc</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kc</em>' attribute.
	 * @see #setKc(float)
	 * @see openGL_DSL.OpenGL_DSLPackage#getPosLight_Kc()
	 * @model default="1"
	 * @generated
	 */
	float getKc();

	/**
	 * Sets the value of the '{@link openGL_DSL.PosLight#getKc <em>Kc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kc</em>' attribute.
	 * @see #getKc()
	 * @generated
	 */
	void setKc(float value);

	/**
	 * Returns the value of the '<em><b>Kl</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kl</em>' attribute.
	 * @see #setKl(float)
	 * @see openGL_DSL.OpenGL_DSLPackage#getPosLight_Kl()
	 * @model default="0"
	 * @generated
	 */
	float getKl();

	/**
	 * Sets the value of the '{@link openGL_DSL.PosLight#getKl <em>Kl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kl</em>' attribute.
	 * @see #getKl()
	 * @generated
	 */
	void setKl(float value);

	/**
	 * Returns the value of the '<em><b>Kq</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kq</em>' attribute.
	 * @see #setKq(float)
	 * @see openGL_DSL.OpenGL_DSLPackage#getPosLight_Kq()
	 * @model default="0"
	 * @generated
	 */
	float getKq();

	/**
	 * Sets the value of the '{@link openGL_DSL.PosLight#getKq <em>Kq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kq</em>' attribute.
	 * @see #getKq()
	 * @generated
	 */
	void setKq(float value);

} // PosLight

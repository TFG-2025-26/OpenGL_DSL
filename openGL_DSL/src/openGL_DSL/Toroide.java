/**
 */
package openGL_DSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toroide</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.Toroide#getRadioCentro <em>Radio Centro</em>}</li>
 *   <li>{@link openGL_DSL.Toroide#getRadioAnillo <em>Radio Anillo</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getToroide()
 * @model
 * @generated
 */
public interface Toroide extends Abs_Entity {
	/**
	 * Returns the value of the '<em><b>Radio Centro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radio Centro</em>' attribute.
	 * @see #setRadioCentro(double)
	 * @see openGL_DSL.OpenGL_DSLPackage#getToroide_RadioCentro()
	 * @model
	 * @generated
	 */
	double getRadioCentro();

	/**
	 * Sets the value of the '{@link openGL_DSL.Toroide#getRadioCentro <em>Radio Centro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radio Centro</em>' attribute.
	 * @see #getRadioCentro()
	 * @generated
	 */
	void setRadioCentro(double value);

	/**
	 * Returns the value of the '<em><b>Radio Anillo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radio Anillo</em>' attribute.
	 * @see #setRadioAnillo(double)
	 * @see openGL_DSL.OpenGL_DSLPackage#getToroide_RadioAnillo()
	 * @model
	 * @generated
	 */
	double getRadioAnillo();

	/**
	 * Sets the value of the '{@link openGL_DSL.Toroide#getRadioAnillo <em>Radio Anillo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radio Anillo</em>' attribute.
	 * @see #getRadioAnillo()
	 * @generated
	 */
	void setRadioAnillo(double value);

} // Toroide

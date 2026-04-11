/**
 */
package openGL_DSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangulo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.Rectangulo#getAncho <em>Ancho</em>}</li>
 *   <li>{@link openGL_DSL.Rectangulo#getAlto <em>Alto</em>}</li>
 *   <li>{@link openGL_DSL.Rectangulo#isRellenar <em>Rellenar</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getRectangulo()
 * @model
 * @generated
 */
public interface Rectangulo extends Abs_Entity {
	/**
	 * Returns the value of the '<em><b>Ancho</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ancho</em>' attribute.
	 * @see #setAncho(double)
	 * @see openGL_DSL.OpenGL_DSLPackage#getRectangulo_Ancho()
	 * @model
	 * @generated
	 */
	double getAncho();

	/**
	 * Sets the value of the '{@link openGL_DSL.Rectangulo#getAncho <em>Ancho</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ancho</em>' attribute.
	 * @see #getAncho()
	 * @generated
	 */
	void setAncho(double value);

	/**
	 * Returns the value of the '<em><b>Alto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alto</em>' attribute.
	 * @see #setAlto(double)
	 * @see openGL_DSL.OpenGL_DSLPackage#getRectangulo_Alto()
	 * @model
	 * @generated
	 */
	double getAlto();

	/**
	 * Sets the value of the '{@link openGL_DSL.Rectangulo#getAlto <em>Alto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alto</em>' attribute.
	 * @see #getAlto()
	 * @generated
	 */
	void setAlto(double value);

	/**
	 * Returns the value of the '<em><b>Rellenar</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rellenar</em>' attribute.
	 * @see #setRellenar(boolean)
	 * @see openGL_DSL.OpenGL_DSLPackage#getRectangulo_Rellenar()
	 * @model default="true"
	 * @generated
	 */
	boolean isRellenar();

	/**
	 * Sets the value of the '{@link openGL_DSL.Rectangulo#isRellenar <em>Rellenar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rellenar</em>' attribute.
	 * @see #isRellenar()
	 * @generated
	 */
	void setRellenar(boolean value);

} // Rectangulo

/**
 */
package openGL_DSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poligono Regular</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.PoligonoRegular#getNumVertices <em>Num Vertices</em>}</li>
 *   <li>{@link openGL_DSL.PoligonoRegular#getRadio <em>Radio</em>}</li>
 *   <li>{@link openGL_DSL.PoligonoRegular#isRellenar <em>Rellenar</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getPoligonoRegular()
 * @model
 * @generated
 */
public interface PoligonoRegular extends Abs_Entity {
	/**
	 * Returns the value of the '<em><b>Num Vertices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Vertices</em>' attribute.
	 * @see #setNumVertices(int)
	 * @see openGL_DSL.OpenGL_DSLPackage#getPoligonoRegular_NumVertices()
	 * @model
	 * @generated
	 */
	int getNumVertices();

	/**
	 * Sets the value of the '{@link openGL_DSL.PoligonoRegular#getNumVertices <em>Num Vertices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Vertices</em>' attribute.
	 * @see #getNumVertices()
	 * @generated
	 */
	void setNumVertices(int value);

	/**
	 * Returns the value of the '<em><b>Radio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radio</em>' attribute.
	 * @see #setRadio(double)
	 * @see openGL_DSL.OpenGL_DSLPackage#getPoligonoRegular_Radio()
	 * @model
	 * @generated
	 */
	double getRadio();

	/**
	 * Sets the value of the '{@link openGL_DSL.PoligonoRegular#getRadio <em>Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radio</em>' attribute.
	 * @see #getRadio()
	 * @generated
	 */
	void setRadio(double value);

	/**
	 * Returns the value of the '<em><b>Rellenar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rellenar</em>' attribute.
	 * @see #setRellenar(boolean)
	 * @see openGL_DSL.OpenGL_DSLPackage#getPoligonoRegular_Rellenar()
	 * @model
	 * @generated
	 */
	boolean isRellenar();

	/**
	 * Sets the value of the '{@link openGL_DSL.PoligonoRegular#isRellenar <em>Rellenar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rellenar</em>' attribute.
	 * @see #isRellenar()
	 * @generated
	 */
	void setRellenar(boolean value);

} // PoligonoRegular

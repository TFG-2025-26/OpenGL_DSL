/**
 */
package openGL_DSL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quadric Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.QuadricEntity#getQ <em>Q</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getQuadricEntity()
 * @model abstract="true"
 * @generated
 */
public interface QuadricEntity extends Abs_Entity {
	/**
	 * Returns the value of the '<em><b>Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Q</em>' attribute.
	 * @see #setQ(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getQuadricEntity_Q()
	 * @model dataType="openGL_DSL.GLquadricObj"
	 * @generated
	 */
	Object getQ();

	/**
	 * Sets the value of the '{@link openGL_DSL.QuadricEntity#getQ <em>Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q</em>' attribute.
	 * @see #getQ()
	 * @generated
	 */
	void setQ(Object value);

} // QuadricEntity

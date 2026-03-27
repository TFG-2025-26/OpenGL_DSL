/**
 */
package openGL_DSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Mesh</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.IndexMesh#getVIndices <em>VIndices</em>}</li>
 *   <li>{@link openGL_DSL.IndexMesh#getNNumIndices <em>NNum Indices</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getIndexMesh()
 * @model
 * @generated
 */
public interface IndexMesh extends Mesh {
	/**
	 * Returns the value of the '<em><b>VIndices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VIndices</em>' attribute.
	 * @see #setVIndices(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getIndexMesh_VIndices()
	 * @model dataType="openGL_DSL.GLuint"
	 * @generated
	 */
	Object getVIndices();

	/**
	 * Sets the value of the '{@link openGL_DSL.IndexMesh#getVIndices <em>VIndices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VIndices</em>' attribute.
	 * @see #getVIndices()
	 * @generated
	 */
	void setVIndices(Object value);

	/**
	 * Returns the value of the '<em><b>NNum Indices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NNum Indices</em>' attribute.
	 * @see #setNNumIndices(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getIndexMesh_NNumIndices()
	 * @model dataType="openGL_DSL.GLuint"
	 * @generated
	 */
	Object getNNumIndices();

	/**
	 * Sets the value of the '{@link openGL_DSL.IndexMesh#getNNumIndices <em>NNum Indices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NNum Indices</em>' attribute.
	 * @see #getNNumIndices()
	 * @generated
	 */
	void setNNumIndices(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void buildNormalVectors();

} // IndexMesh

/**
 */
package openGL_DSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mb R</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.MbR#getN <em>N</em>}</li>
 *   <li>{@link openGL_DSL.MbR#getM <em>M</em>}</li>
 *   <li>{@link openGL_DSL.MbR#getPerfil <em>Perfil</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getMbR()
 * @model
 * @generated
 */
public interface MbR extends IndexMesh {
	/**
	 * Returns the value of the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>N</em>' attribute.
	 * @see #setN(int)
	 * @see openGL_DSL.OpenGL_DSLPackage#getMbR_N()
	 * @model
	 * @generated
	 */
	int getN();

	/**
	 * Sets the value of the '{@link openGL_DSL.MbR#getN <em>N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>N</em>' attribute.
	 * @see #getN()
	 * @generated
	 */
	void setN(int value);

	/**
	 * Returns the value of the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M</em>' attribute.
	 * @see #setM(int)
	 * @see openGL_DSL.OpenGL_DSLPackage#getMbR_M()
	 * @model
	 * @generated
	 */
	int getM();

	/**
	 * Sets the value of the '{@link openGL_DSL.MbR#getM <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M</em>' attribute.
	 * @see #getM()
	 * @generated
	 */
	void setM(int value);

	/**
	 * Returns the value of the '<em><b>Perfil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perfil</em>' attribute.
	 * @see #setPerfil(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getMbR_Perfil()
	 * @model dataType="openGL_DSL.vec3"
	 * @generated
	 */
	Object getPerfil();

	/**
	 * Sets the value of the '{@link openGL_DSL.MbR#getPerfil <em>Perfil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perfil</em>' attribute.
	 * @see #getPerfil()
	 * @generated
	 */
	void setPerfil(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model perfilDataType="openGL_DSL.vec3"
	 * @generated
	 */
	MbR generateIndexMbR(int n, int m, Object perfil);

} // MbR

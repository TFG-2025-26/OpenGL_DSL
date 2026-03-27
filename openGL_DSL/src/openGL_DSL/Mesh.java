/**
 */
package openGL_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesh</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.Mesh#getMPrimitive <em>MPrimitive</em>}</li>
 *   <li>{@link openGL_DSL.Mesh#getNNumVertices <em>NNum Vertices</em>}</li>
 *   <li>{@link openGL_DSL.Mesh#getVColors <em>VColors</em>}</li>
 *   <li>{@link openGL_DSL.Mesh#getVVertices <em>VVertices</em>}</li>
 *   <li>{@link openGL_DSL.Mesh#getVTexCoords <em>VTex Coords</em>}</li>
 *   <li>{@link openGL_DSL.Mesh#getVNormals <em>VNormals</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getMesh()
 * @model
 * @generated
 */
public interface Mesh extends EObject {
	/**
	 * Returns the value of the '<em><b>MPrimitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPrimitive</em>' attribute.
	 * @see #setMPrimitive(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getMesh_MPrimitive()
	 * @model dataType="openGL_DSL.GLuint"
	 * @generated
	 */
	Object getMPrimitive();

	/**
	 * Sets the value of the '{@link openGL_DSL.Mesh#getMPrimitive <em>MPrimitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MPrimitive</em>' attribute.
	 * @see #getMPrimitive()
	 * @generated
	 */
	void setMPrimitive(Object value);

	/**
	 * Returns the value of the '<em><b>NNum Vertices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NNum Vertices</em>' attribute.
	 * @see #setNNumVertices(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getMesh_NNumVertices()
	 * @model dataType="openGL_DSL.GLuint"
	 * @generated
	 */
	Object getNNumVertices();

	/**
	 * Sets the value of the '{@link openGL_DSL.Mesh#getNNumVertices <em>NNum Vertices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NNum Vertices</em>' attribute.
	 * @see #getNNumVertices()
	 * @generated
	 */
	void setNNumVertices(Object value);

	/**
	 * Returns the value of the '<em><b>VColors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VColors</em>' attribute.
	 * @see #setVColors(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getMesh_VColors()
	 * @model dataType="openGL_DSL.vec4"
	 * @generated
	 */
	Object getVColors();

	/**
	 * Sets the value of the '{@link openGL_DSL.Mesh#getVColors <em>VColors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VColors</em>' attribute.
	 * @see #getVColors()
	 * @generated
	 */
	void setVColors(Object value);

	/**
	 * Returns the value of the '<em><b>VVertices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VVertices</em>' attribute.
	 * @see #setVVertices(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getMesh_VVertices()
	 * @model dataType="openGL_DSL.vec3"
	 * @generated
	 */
	Object getVVertices();

	/**
	 * Sets the value of the '{@link openGL_DSL.Mesh#getVVertices <em>VVertices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VVertices</em>' attribute.
	 * @see #getVVertices()
	 * @generated
	 */
	void setVVertices(Object value);

	/**
	 * Returns the value of the '<em><b>VTex Coords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VTex Coords</em>' attribute.
	 * @see #setVTexCoords(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getMesh_VTexCoords()
	 * @model dataType="openGL_DSL.vec2"
	 * @generated
	 */
	Object getVTexCoords();

	/**
	 * Sets the value of the '{@link openGL_DSL.Mesh#getVTexCoords <em>VTex Coords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VTex Coords</em>' attribute.
	 * @see #getVTexCoords()
	 * @generated
	 */
	void setVTexCoords(Object value);

	/**
	 * Returns the value of the '<em><b>VNormals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VNormals</em>' attribute.
	 * @see #setVNormals(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getMesh_VNormals()
	 * @model dataType="openGL_DSL.vec3"
	 * @generated
	 */
	Object getVNormals();

	/**
	 * Sets the value of the '{@link openGL_DSL.Mesh#getVNormals <em>VNormals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VNormals</em>' attribute.
	 * @see #getVNormals()
	 * @generated
	 */
	void setVNormals(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="openGL_DSL.GLuint"
	 * @generated
	 */
	Object mNumVertices();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void render();

} // Mesh

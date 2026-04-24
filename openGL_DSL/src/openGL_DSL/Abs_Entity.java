/**
 */
package openGL_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abs Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.Abs_Entity#getMaterial <em>Material</em>}</li>
 *   <li>{@link openGL_DSL.Abs_Entity#getMesh <em>Mesh</em>}</li>
 *   <li>{@link openGL_DSL.Abs_Entity#getColor <em>Color</em>}</li>
 *   <li>{@link openGL_DSL.Abs_Entity#getFrontTexture <em>Front Texture</em>}</li>
 *   <li>{@link openGL_DSL.Abs_Entity#getBackTexture <em>Back Texture</em>}</li>
 *   <li>{@link openGL_DSL.Abs_Entity#getTexturaRepeticionAncho <em>Textura Repeticion Ancho</em>}</li>
 *   <li>{@link openGL_DSL.Abs_Entity#getTexturaRepeticionAlto <em>Textura Repeticion Alto</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getAbs_Entity()
 * @model abstract="true"
 * @generated
 */
public interface Abs_Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' containment reference.
	 * @see #setMaterial(Material)
	 * @see openGL_DSL.OpenGL_DSLPackage#getAbs_Entity_Material()
	 * @model containment="true"
	 * @generated
	 */
	Material getMaterial();

	/**
	 * Sets the value of the '{@link openGL_DSL.Abs_Entity#getMaterial <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' containment reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(Material value);

	/**
	 * Returns the value of the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesh</em>' containment reference.
	 * @see #setMesh(Mesh)
	 * @see openGL_DSL.OpenGL_DSLPackage#getAbs_Entity_Mesh()
	 * @model containment="true"
	 * @generated
	 */
	Mesh getMesh();

	/**
	 * Sets the value of the '{@link openGL_DSL.Abs_Entity#getMesh <em>Mesh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesh</em>' containment reference.
	 * @see #getMesh()
	 * @generated
	 */
	void setMesh(Mesh value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' containment reference.
	 * @see #setColor(Vector4)
	 * @see openGL_DSL.OpenGL_DSLPackage#getAbs_Entity_Color()
	 * @model containment="true"
	 * @generated
	 */
	Vector4 getColor();

	/**
	 * Sets the value of the '{@link openGL_DSL.Abs_Entity#getColor <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' containment reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Vector4 value);

	/**
	 * Returns the value of the '<em><b>Front Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Front Texture</em>' containment reference.
	 * @see #setFrontTexture(Texture)
	 * @see openGL_DSL.OpenGL_DSLPackage#getAbs_Entity_FrontTexture()
	 * @model containment="true"
	 * @generated
	 */
	Texture getFrontTexture();

	/**
	 * Sets the value of the '{@link openGL_DSL.Abs_Entity#getFrontTexture <em>Front Texture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Front Texture</em>' containment reference.
	 * @see #getFrontTexture()
	 * @generated
	 */
	void setFrontTexture(Texture value);

	/**
	 * Returns the value of the '<em><b>Back Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Back Texture</em>' containment reference.
	 * @see #setBackTexture(Texture)
	 * @see openGL_DSL.OpenGL_DSLPackage#getAbs_Entity_BackTexture()
	 * @model containment="true"
	 * @generated
	 */
	Texture getBackTexture();

	/**
	 * Sets the value of the '{@link openGL_DSL.Abs_Entity#getBackTexture <em>Back Texture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back Texture</em>' containment reference.
	 * @see #getBackTexture()
	 * @generated
	 */
	void setBackTexture(Texture value);

	/**
	 * Returns the value of the '<em><b>Textura Repeticion Ancho</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textura Repeticion Ancho</em>' attribute.
	 * @see #setTexturaRepeticionAncho(int)
	 * @see openGL_DSL.OpenGL_DSLPackage#getAbs_Entity_TexturaRepeticionAncho()
	 * @model default="1"
	 * @generated
	 */
	int getTexturaRepeticionAncho();

	/**
	 * Sets the value of the '{@link openGL_DSL.Abs_Entity#getTexturaRepeticionAncho <em>Textura Repeticion Ancho</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textura Repeticion Ancho</em>' attribute.
	 * @see #getTexturaRepeticionAncho()
	 * @generated
	 */
	void setTexturaRepeticionAncho(int value);

	/**
	 * Returns the value of the '<em><b>Textura Repeticion Alto</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textura Repeticion Alto</em>' attribute.
	 * @see #setTexturaRepeticionAlto(int)
	 * @see openGL_DSL.OpenGL_DSLPackage#getAbs_Entity_TexturaRepeticionAlto()
	 * @model default="1"
	 * @generated
	 */
	int getTexturaRepeticionAlto();

	/**
	 * Sets the value of the '{@link openGL_DSL.Abs_Entity#getTexturaRepeticionAlto <em>Textura Repeticion Alto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textura Repeticion Alto</em>' attribute.
	 * @see #getTexturaRepeticionAlto()
	 * @generated
	 */
	void setTexturaRepeticionAlto(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model modelViewMatDataType="openGL_DSL.mat4"
	 * @generated
	 */
	void render(Object modelViewMat);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void upload();

} // Abs_Entity

/**
 */
package openGL_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Texture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.Texture#getTextura <em>Textura</em>}</li>
 *   <li>{@link openGL_DSL.Texture#getAlfa <em>Alfa</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getTexture()
 * @model
 * @generated
 */
public interface Texture extends EObject {
	/**
	 * Returns the value of the '<em><b>Textura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textura</em>' attribute.
	 * @see #setTextura(String)
	 * @see openGL_DSL.OpenGL_DSLPackage#getTexture_Textura()
	 * @model
	 * @generated
	 */
	String getTextura();

	/**
	 * Sets the value of the '{@link openGL_DSL.Texture#getTextura <em>Textura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textura</em>' attribute.
	 * @see #getTextura()
	 * @generated
	 */
	void setTextura(String value);

	/**
	 * Returns the value of the '<em><b>Alfa</b></em>' attribute.
	 * The default value is <code>"255"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alfa</em>' attribute.
	 * @see #setAlfa(int)
	 * @see openGL_DSL.OpenGL_DSLPackage#getTexture_Alfa()
	 * @model default="255"
	 * @generated
	 */
	int getAlfa();

	/**
	 * Sets the value of the '{@link openGL_DSL.Texture#getAlfa <em>Alfa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alfa</em>' attribute.
	 * @see #getAlfa()
	 * @generated
	 */
	void setAlfa(int value);

} // Texture

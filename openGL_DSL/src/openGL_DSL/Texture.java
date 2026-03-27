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
 *   <li>{@link openGL_DSL.Texture#getMWidth <em>MWidth</em>}</li>
 *   <li>{@link openGL_DSL.Texture#getMHeight <em>MHeight</em>}</li>
 *   <li>{@link openGL_DSL.Texture#getMId <em>MId</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getTexture()
 * @model
 * @generated
 */
public interface Texture extends EObject {
	/**
	 * Returns the value of the '<em><b>MWidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MWidth</em>' attribute.
	 * @see #setMWidth(int)
	 * @see openGL_DSL.OpenGL_DSLPackage#getTexture_MWidth()
	 * @model
	 * @generated
	 */
	int getMWidth();

	/**
	 * Sets the value of the '{@link openGL_DSL.Texture#getMWidth <em>MWidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MWidth</em>' attribute.
	 * @see #getMWidth()
	 * @generated
	 */
	void setMWidth(int value);

	/**
	 * Returns the value of the '<em><b>MHeight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MHeight</em>' attribute.
	 * @see #setMHeight(int)
	 * @see openGL_DSL.OpenGL_DSLPackage#getTexture_MHeight()
	 * @model
	 * @generated
	 */
	int getMHeight();

	/**
	 * Sets the value of the '{@link openGL_DSL.Texture#getMHeight <em>MHeight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MHeight</em>' attribute.
	 * @see #getMHeight()
	 * @generated
	 */
	void setMHeight(int value);

	/**
	 * Returns the value of the '<em><b>MId</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MId</em>' attribute.
	 * @see #setMId(int)
	 * @see openGL_DSL.OpenGL_DSLPackage#getTexture_MId()
	 * @model id="true"
	 * @generated
	 */
	int getMId();

	/**
	 * Sets the value of the '{@link openGL_DSL.Texture#getMId <em>MId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MId</em>' attribute.
	 * @see #getMId()
	 * @generated
	 */
	void setMId(int value);

} // Texture

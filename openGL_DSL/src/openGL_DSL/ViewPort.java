/**
 */
package openGL_DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.ViewPort#getXLeft <em>XLeft</em>}</li>
 *   <li>{@link openGL_DSL.ViewPort#getYBot <em>YBot</em>}</li>
 *   <li>{@link openGL_DSL.ViewPort#getXWidth <em>XWidth</em>}</li>
 *   <li>{@link openGL_DSL.ViewPort#getYHeight <em>YHeight</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getViewPort()
 * @model
 * @generated
 */
public interface ViewPort extends EObject {
	/**
	 * Returns the value of the '<em><b>XLeft</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XLeft</em>' attribute.
	 * @see #setXLeft(int)
	 * @see openGL_DSL.OpenGL_DSLPackage#getViewPort_XLeft()
	 * @model default="0"
	 * @generated
	 */
	int getXLeft();

	/**
	 * Sets the value of the '{@link openGL_DSL.ViewPort#getXLeft <em>XLeft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XLeft</em>' attribute.
	 * @see #getXLeft()
	 * @generated
	 */
	void setXLeft(int value);

	/**
	 * Returns the value of the '<em><b>YBot</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YBot</em>' attribute.
	 * @see #setYBot(int)
	 * @see openGL_DSL.OpenGL_DSLPackage#getViewPort_YBot()
	 * @model default="0"
	 * @generated
	 */
	int getYBot();

	/**
	 * Sets the value of the '{@link openGL_DSL.ViewPort#getYBot <em>YBot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YBot</em>' attribute.
	 * @see #getYBot()
	 * @generated
	 */
	void setYBot(int value);

	/**
	 * Returns the value of the '<em><b>XWidth</b></em>' attribute.
	 * The default value is <code>"800"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XWidth</em>' attribute.
	 * @see #setXWidth(int)
	 * @see openGL_DSL.OpenGL_DSLPackage#getViewPort_XWidth()
	 * @model default="800"
	 * @generated
	 */
	int getXWidth();

	/**
	 * Sets the value of the '{@link openGL_DSL.ViewPort#getXWidth <em>XWidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XWidth</em>' attribute.
	 * @see #getXWidth()
	 * @generated
	 */
	void setXWidth(int value);

	/**
	 * Returns the value of the '<em><b>YHeight</b></em>' attribute.
	 * The default value is <code>"600"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YHeight</em>' attribute.
	 * @see #setYHeight(int)
	 * @see openGL_DSL.OpenGL_DSLPackage#getViewPort_YHeight()
	 * @model default="600"
	 * @generated
	 */
	int getYHeight();

	/**
	 * Sets the value of the '{@link openGL_DSL.ViewPort#getYHeight <em>YHeight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YHeight</em>' attribute.
	 * @see #getYHeight()
	 * @generated
	 */
	void setYHeight(int value);

} // ViewPort

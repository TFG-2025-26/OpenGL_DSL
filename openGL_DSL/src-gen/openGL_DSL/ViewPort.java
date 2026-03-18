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
 *   <li>{@link openGL_DSL.ViewPort#getYBolt <em>YBolt</em>}</li>
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XLeft</em>' attribute.
	 * @see #setXLeft(int)
	 * @see openGL_DSL.OpenGL_DSLPackage#getViewPort_XLeft()
	 * @model
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
	 * Returns the value of the '<em><b>YBolt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YBolt</em>' attribute.
	 * @see #setYBolt(int)
	 * @see openGL_DSL.OpenGL_DSLPackage#getViewPort_YBolt()
	 * @model
	 * @generated
	 */
	int getYBolt();

	/**
	 * Sets the value of the '{@link openGL_DSL.ViewPort#getYBolt <em>YBolt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YBolt</em>' attribute.
	 * @see #getYBolt()
	 * @generated
	 */
	void setYBolt(int value);

	/**
	 * Returns the value of the '<em><b>XWidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XWidth</em>' attribute.
	 * @see #setXWidth(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getViewPort_XWidth()
	 * @model dataType="openGL_DSL.GLsizei"
	 * @generated
	 */
	Object getXWidth();

	/**
	 * Sets the value of the '{@link openGL_DSL.ViewPort#getXWidth <em>XWidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XWidth</em>' attribute.
	 * @see #getXWidth()
	 * @generated
	 */
	void setXWidth(Object value);

	/**
	 * Returns the value of the '<em><b>YHeight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YHeight</em>' attribute.
	 * @see #setYHeight(Object)
	 * @see openGL_DSL.OpenGL_DSLPackage#getViewPort_YHeight()
	 * @model dataType="openGL_DSL.GLsizei"
	 * @generated
	 */
	Object getYHeight();

	/**
	 * Sets the value of the '{@link openGL_DSL.ViewPort#getYHeight <em>YHeight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YHeight</em>' attribute.
	 * @see #getYHeight()
	 * @generated
	 */
	void setYHeight(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void upload();

} // ViewPort

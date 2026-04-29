/**
 */
package openGL_DSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scene</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.Scene#getName <em>Name</em>}</li>
 *   <li>{@link openGL_DSL.Scene#isVisible <em>Visible</em>}</li>
 *   <li>{@link openGL_DSL.Scene#getNodo <em>Nodo</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getScene()
 * @model
 * @generated
 */
public interface Scene extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see openGL_DSL.OpenGL_DSLPackage#getScene_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link openGL_DSL.Scene#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see openGL_DSL.OpenGL_DSLPackage#getScene_Visible()
	 * @model default="true"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link openGL_DSL.Scene#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Nodo</b></em>' containment reference list.
	 * The list contents are of type {@link openGL_DSL.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodo</em>' containment reference list.
	 * @see openGL_DSL.OpenGL_DSLPackage#getScene_Nodo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addNode();

} // Scene

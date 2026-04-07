/**
 */
package openGL_DSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.Node#getName <em>Name</em>}</li>
 *   <li>{@link openGL_DSL.Node#getLight <em>Light</em>}</li>
 *   <li>{@link openGL_DSL.Node#getNodo <em>Nodo</em>}</li>
 *   <li>{@link openGL_DSL.Node#getAbs_entity <em>Abs entity</em>}</li>
 *   <li>{@link openGL_DSL.Node#getPosicion <em>Posicion</em>}</li>
 *   <li>{@link openGL_DSL.Node#getRotacion <em>Rotacion</em>}</li>
 *   <li>{@link openGL_DSL.Node#getEscala <em>Escala</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see openGL_DSL.OpenGL_DSLPackage#getNode_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link openGL_DSL.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light</em>' containment reference.
	 * @see #setLight(Light)
	 * @see openGL_DSL.OpenGL_DSLPackage#getNode_Light()
	 * @model containment="true"
	 * @generated
	 */
	Light getLight();

	/**
	 * Sets the value of the '{@link openGL_DSL.Node#getLight <em>Light</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' containment reference.
	 * @see #getLight()
	 * @generated
	 */
	void setLight(Light value);

	/**
	 * Returns the value of the '<em><b>Nodo</b></em>' containment reference list.
	 * The list contents are of type {@link openGL_DSL.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodo</em>' containment reference list.
	 * @see openGL_DSL.OpenGL_DSLPackage#getNode_Nodo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodo();

	/**
	 * Returns the value of the '<em><b>Abs entity</b></em>' containment reference list.
	 * The list contents are of type {@link openGL_DSL.Abs_Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abs entity</em>' containment reference list.
	 * @see openGL_DSL.OpenGL_DSLPackage#getNode_Abs_entity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Abs_Entity> getAbs_entity();

	/**
	 * Returns the value of the '<em><b>Posicion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posicion</em>' containment reference.
	 * @see #setPosicion(Vector3)
	 * @see openGL_DSL.OpenGL_DSLPackage#getNode_Posicion()
	 * @model containment="true"
	 * @generated
	 */
	Vector3 getPosicion();

	/**
	 * Sets the value of the '{@link openGL_DSL.Node#getPosicion <em>Posicion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posicion</em>' containment reference.
	 * @see #getPosicion()
	 * @generated
	 */
	void setPosicion(Vector3 value);

	/**
	 * Returns the value of the '<em><b>Rotacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotacion</em>' containment reference.
	 * @see #setRotacion(Vector3)
	 * @see openGL_DSL.OpenGL_DSLPackage#getNode_Rotacion()
	 * @model containment="true"
	 * @generated
	 */
	Vector3 getRotacion();

	/**
	 * Sets the value of the '{@link openGL_DSL.Node#getRotacion <em>Rotacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotacion</em>' containment reference.
	 * @see #getRotacion()
	 * @generated
	 */
	void setRotacion(Vector3 value);

	/**
	 * Returns the value of the '<em><b>Escala</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escala</em>' containment reference.
	 * @see #setEscala(Vector3)
	 * @see openGL_DSL.OpenGL_DSLPackage#getNode_Escala()
	 * @model containment="true"
	 * @generated
	 */
	Vector3 getEscala();

	/**
	 * Sets the value of the '{@link openGL_DSL.Node#getEscala <em>Escala</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escala</em>' containment reference.
	 * @see #getEscala()
	 * @generated
	 */
	void setEscala(Vector3 value);

} // Node

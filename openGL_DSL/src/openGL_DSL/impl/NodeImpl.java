/**
 */
package openGL_DSL.impl;

import java.util.Collection;

import openGL_DSL.Abs_Entity;
import openGL_DSL.Light;
import openGL_DSL.Node;
import openGL_DSL.OpenGL_DSLPackage;
import openGL_DSL.Vector3;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link openGL_DSL.impl.NodeImpl#getLight <em>Light</em>}</li>
 *   <li>{@link openGL_DSL.impl.NodeImpl#getNodo <em>Nodo</em>}</li>
 *   <li>{@link openGL_DSL.impl.NodeImpl#getAbs_entity <em>Abs entity</em>}</li>
 *   <li>{@link openGL_DSL.impl.NodeImpl#getPosicion <em>Posicion</em>}</li>
 *   <li>{@link openGL_DSL.impl.NodeImpl#getRotacion <em>Rotacion</em>}</li>
 *   <li>{@link openGL_DSL.impl.NodeImpl#getEscala <em>Escala</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLight() <em>Light</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLight()
	 * @generated
	 * @ordered
	 */
	protected EList<Light> light;

	/**
	 * The cached value of the '{@link #getNodo() <em>Nodo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodo()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodo;

	/**
	 * The cached value of the '{@link #getAbs_entity() <em>Abs entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbs_entity()
	 * @generated
	 * @ordered
	 */
	protected EList<Abs_Entity> abs_entity;

	/**
	 * The cached value of the '{@link #getPosicion() <em>Posicion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosicion()
	 * @generated
	 * @ordered
	 */
	protected Vector3 posicion;

	/**
	 * The cached value of the '{@link #getRotacion() <em>Rotacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotacion()
	 * @generated
	 * @ordered
	 */
	protected Vector3 rotacion;

	/**
	 * The cached value of the '{@link #getEscala() <em>Escala</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscala()
	 * @generated
	 * @ordered
	 */
	protected Vector3 escala;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenGL_DSLPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Light> getLight() {
		if (light == null) {
			light = new EObjectContainmentEList<Light>(Light.class, this, OpenGL_DSLPackage.NODE__LIGHT);
		}
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getNodo() {
		if (nodo == null) {
			nodo = new EObjectContainmentEList<Node>(Node.class, this, OpenGL_DSLPackage.NODE__NODO);
		}
		return nodo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Abs_Entity> getAbs_entity() {
		if (abs_entity == null) {
			abs_entity = new EObjectContainmentEList<Abs_Entity>(Abs_Entity.class, this, OpenGL_DSLPackage.NODE__ABS_ENTITY);
		}
		return abs_entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vector3 getPosicion() {
		return posicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosicion(Vector3 newPosicion, NotificationChain msgs) {
		Vector3 oldPosicion = posicion;
		posicion = newPosicion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.NODE__POSICION, oldPosicion, newPosicion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosicion(Vector3 newPosicion) {
		if (newPosicion != posicion) {
			NotificationChain msgs = null;
			if (posicion != null)
				msgs = ((InternalEObject)posicion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.NODE__POSICION, null, msgs);
			if (newPosicion != null)
				msgs = ((InternalEObject)newPosicion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.NODE__POSICION, null, msgs);
			msgs = basicSetPosicion(newPosicion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.NODE__POSICION, newPosicion, newPosicion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vector3 getRotacion() {
		return rotacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotacion(Vector3 newRotacion, NotificationChain msgs) {
		Vector3 oldRotacion = rotacion;
		rotacion = newRotacion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.NODE__ROTACION, oldRotacion, newRotacion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRotacion(Vector3 newRotacion) {
		if (newRotacion != rotacion) {
			NotificationChain msgs = null;
			if (rotacion != null)
				msgs = ((InternalEObject)rotacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.NODE__ROTACION, null, msgs);
			if (newRotacion != null)
				msgs = ((InternalEObject)newRotacion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.NODE__ROTACION, null, msgs);
			msgs = basicSetRotacion(newRotacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.NODE__ROTACION, newRotacion, newRotacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vector3 getEscala() {
		return escala;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEscala(Vector3 newEscala, NotificationChain msgs) {
		Vector3 oldEscala = escala;
		escala = newEscala;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.NODE__ESCALA, oldEscala, newEscala);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEscala(Vector3 newEscala) {
		if (newEscala != escala) {
			NotificationChain msgs = null;
			if (escala != null)
				msgs = ((InternalEObject)escala).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.NODE__ESCALA, null, msgs);
			if (newEscala != null)
				msgs = ((InternalEObject)newEscala).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.NODE__ESCALA, null, msgs);
			msgs = basicSetEscala(newEscala, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.NODE__ESCALA, newEscala, newEscala));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenGL_DSLPackage.NODE__LIGHT:
				return ((InternalEList<?>)getLight()).basicRemove(otherEnd, msgs);
			case OpenGL_DSLPackage.NODE__NODO:
				return ((InternalEList<?>)getNodo()).basicRemove(otherEnd, msgs);
			case OpenGL_DSLPackage.NODE__ABS_ENTITY:
				return ((InternalEList<?>)getAbs_entity()).basicRemove(otherEnd, msgs);
			case OpenGL_DSLPackage.NODE__POSICION:
				return basicSetPosicion(null, msgs);
			case OpenGL_DSLPackage.NODE__ROTACION:
				return basicSetRotacion(null, msgs);
			case OpenGL_DSLPackage.NODE__ESCALA:
				return basicSetEscala(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenGL_DSLPackage.NODE__NAME:
				return getName();
			case OpenGL_DSLPackage.NODE__LIGHT:
				return getLight();
			case OpenGL_DSLPackage.NODE__NODO:
				return getNodo();
			case OpenGL_DSLPackage.NODE__ABS_ENTITY:
				return getAbs_entity();
			case OpenGL_DSLPackage.NODE__POSICION:
				return getPosicion();
			case OpenGL_DSLPackage.NODE__ROTACION:
				return getRotacion();
			case OpenGL_DSLPackage.NODE__ESCALA:
				return getEscala();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpenGL_DSLPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case OpenGL_DSLPackage.NODE__LIGHT:
				getLight().clear();
				getLight().addAll((Collection<? extends Light>)newValue);
				return;
			case OpenGL_DSLPackage.NODE__NODO:
				getNodo().clear();
				getNodo().addAll((Collection<? extends Node>)newValue);
				return;
			case OpenGL_DSLPackage.NODE__ABS_ENTITY:
				getAbs_entity().clear();
				getAbs_entity().addAll((Collection<? extends Abs_Entity>)newValue);
				return;
			case OpenGL_DSLPackage.NODE__POSICION:
				setPosicion((Vector3)newValue);
				return;
			case OpenGL_DSLPackage.NODE__ROTACION:
				setRotacion((Vector3)newValue);
				return;
			case OpenGL_DSLPackage.NODE__ESCALA:
				setEscala((Vector3)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OpenGL_DSLPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpenGL_DSLPackage.NODE__LIGHT:
				getLight().clear();
				return;
			case OpenGL_DSLPackage.NODE__NODO:
				getNodo().clear();
				return;
			case OpenGL_DSLPackage.NODE__ABS_ENTITY:
				getAbs_entity().clear();
				return;
			case OpenGL_DSLPackage.NODE__POSICION:
				setPosicion((Vector3)null);
				return;
			case OpenGL_DSLPackage.NODE__ROTACION:
				setRotacion((Vector3)null);
				return;
			case OpenGL_DSLPackage.NODE__ESCALA:
				setEscala((Vector3)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OpenGL_DSLPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpenGL_DSLPackage.NODE__LIGHT:
				return light != null && !light.isEmpty();
			case OpenGL_DSLPackage.NODE__NODO:
				return nodo != null && !nodo.isEmpty();
			case OpenGL_DSLPackage.NODE__ABS_ENTITY:
				return abs_entity != null && !abs_entity.isEmpty();
			case OpenGL_DSLPackage.NODE__POSICION:
				return posicion != null;
			case OpenGL_DSLPackage.NODE__ROTACION:
				return rotacion != null;
			case OpenGL_DSLPackage.NODE__ESCALA:
				return escala != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NodeImpl

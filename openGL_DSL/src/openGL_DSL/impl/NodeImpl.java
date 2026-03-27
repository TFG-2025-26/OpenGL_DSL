/**
 */
package openGL_DSL.impl;

import java.util.Collection;

import openGL_DSL.Abs_Entity;
import openGL_DSL.Light;
import openGL_DSL.Node;
import openGL_DSL.OpenGL_DSLPackage;

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
	 * The cached value of the '{@link #getLight() <em>Light</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLight()
	 * @generated
	 * @ordered
	 */
	protected Light light;

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
	 * The default value of the '{@link #getPosicion() <em>Posicion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosicion()
	 * @generated
	 * @ordered
	 */
	protected static final Object POSICION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosicion() <em>Posicion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosicion()
	 * @generated
	 * @ordered
	 */
	protected Object posicion = POSICION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotacion() <em>Rotacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotacion()
	 * @generated
	 * @ordered
	 */
	protected static final Object ROTACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotacion() <em>Rotacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotacion()
	 * @generated
	 * @ordered
	 */
	protected Object rotacion = ROTACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEscala() <em>Escala</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscala()
	 * @generated
	 * @ordered
	 */
	protected static final Object ESCALA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEscala() <em>Escala</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscala()
	 * @generated
	 * @ordered
	 */
	protected Object escala = ESCALA_EDEFAULT;

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
	public Light getLight() {
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLight(Light newLight, NotificationChain msgs) {
		Light oldLight = light;
		light = newLight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.NODE__LIGHT, oldLight, newLight);
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
	public void setLight(Light newLight) {
		if (newLight != light) {
			NotificationChain msgs = null;
			if (light != null)
				msgs = ((InternalEObject)light).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.NODE__LIGHT, null, msgs);
			if (newLight != null)
				msgs = ((InternalEObject)newLight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.NODE__LIGHT, null, msgs);
			msgs = basicSetLight(newLight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.NODE__LIGHT, newLight, newLight));
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
	public Object getPosicion() {
		return posicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosicion(Object newPosicion) {
		Object oldPosicion = posicion;
		posicion = newPosicion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.NODE__POSICION, oldPosicion, posicion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getRotacion() {
		return rotacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRotacion(Object newRotacion) {
		Object oldRotacion = rotacion;
		rotacion = newRotacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.NODE__ROTACION, oldRotacion, rotacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getEscala() {
		return escala;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEscala(Object newEscala) {
		Object oldEscala = escala;
		escala = newEscala;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.NODE__ESCALA, oldEscala, escala));
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
				return basicSetLight(null, msgs);
			case OpenGL_DSLPackage.NODE__NODO:
				return ((InternalEList<?>)getNodo()).basicRemove(otherEnd, msgs);
			case OpenGL_DSLPackage.NODE__ABS_ENTITY:
				return ((InternalEList<?>)getAbs_entity()).basicRemove(otherEnd, msgs);
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
				setLight((Light)newValue);
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
				setPosicion(newValue);
				return;
			case OpenGL_DSLPackage.NODE__ROTACION:
				setRotacion(newValue);
				return;
			case OpenGL_DSLPackage.NODE__ESCALA:
				setEscala(newValue);
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
				setLight((Light)null);
				return;
			case OpenGL_DSLPackage.NODE__NODO:
				getNodo().clear();
				return;
			case OpenGL_DSLPackage.NODE__ABS_ENTITY:
				getAbs_entity().clear();
				return;
			case OpenGL_DSLPackage.NODE__POSICION:
				setPosicion(POSICION_EDEFAULT);
				return;
			case OpenGL_DSLPackage.NODE__ROTACION:
				setRotacion(ROTACION_EDEFAULT);
				return;
			case OpenGL_DSLPackage.NODE__ESCALA:
				setEscala(ESCALA_EDEFAULT);
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
				return light != null;
			case OpenGL_DSLPackage.NODE__NODO:
				return nodo != null && !nodo.isEmpty();
			case OpenGL_DSLPackage.NODE__ABS_ENTITY:
				return abs_entity != null && !abs_entity.isEmpty();
			case OpenGL_DSLPackage.NODE__POSICION:
				return POSICION_EDEFAULT == null ? posicion != null : !POSICION_EDEFAULT.equals(posicion);
			case OpenGL_DSLPackage.NODE__ROTACION:
				return ROTACION_EDEFAULT == null ? rotacion != null : !ROTACION_EDEFAULT.equals(rotacion);
			case OpenGL_DSLPackage.NODE__ESCALA:
				return ESCALA_EDEFAULT == null ? escala != null : !ESCALA_EDEFAULT.equals(escala);
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
		result.append(", posicion: ");
		result.append(posicion);
		result.append(", rotacion: ");
		result.append(rotacion);
		result.append(", escala: ");
		result.append(escala);
		result.append(')');
		return result.toString();
	}

} //NodeImpl

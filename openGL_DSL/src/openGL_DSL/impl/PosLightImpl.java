/**
 */
package openGL_DSL.impl;

import openGL_DSL.OpenGL_DSLPackage;
import openGL_DSL.PosLight;
import openGL_DSL.Vector3;
import openGL_DSL.Vector4;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pos Light</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.impl.PosLightImpl#getAmbient <em>Ambient</em>}</li>
 *   <li>{@link openGL_DSL.impl.PosLightImpl#getDifusse <em>Difusse</em>}</li>
 *   <li>{@link openGL_DSL.impl.PosLightImpl#getSpecular <em>Specular</em>}</li>
 *   <li>{@link openGL_DSL.impl.PosLightImpl#getDireccion <em>Direccion</em>}</li>
 *   <li>{@link openGL_DSL.impl.PosLightImpl#getKc <em>Kc</em>}</li>
 *   <li>{@link openGL_DSL.impl.PosLightImpl#getKl <em>Kl</em>}</li>
 *   <li>{@link openGL_DSL.impl.PosLightImpl#getKq <em>Kq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PosLightImpl extends MinimalEObjectImpl.Container implements PosLight {
	/**
	 * The cached value of the '{@link #getAmbient() <em>Ambient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbient()
	 * @generated
	 * @ordered
	 */
	protected Vector4 ambient;

	/**
	 * The cached value of the '{@link #getDifusse() <em>Difusse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifusse()
	 * @generated
	 * @ordered
	 */
	protected Vector4 difusse;

	/**
	 * The cached value of the '{@link #getSpecular() <em>Specular</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecular()
	 * @generated
	 * @ordered
	 */
	protected Vector4 specular;

	/**
	 * The cached value of the '{@link #getDireccion() <em>Direccion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccion()
	 * @generated
	 * @ordered
	 */
	protected Vector3 direccion;

	/**
	 * The default value of the '{@link #getKc() <em>Kc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKc()
	 * @generated
	 * @ordered
	 */
	protected static final float KC_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getKc() <em>Kc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKc()
	 * @generated
	 * @ordered
	 */
	protected float kc = KC_EDEFAULT;

	/**
	 * The default value of the '{@link #getKl() <em>Kl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKl()
	 * @generated
	 * @ordered
	 */
	protected static final float KL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getKl() <em>Kl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKl()
	 * @generated
	 * @ordered
	 */
	protected float kl = KL_EDEFAULT;

	/**
	 * The default value of the '{@link #getKq() <em>Kq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKq()
	 * @generated
	 * @ordered
	 */
	protected static final float KQ_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getKq() <em>Kq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKq()
	 * @generated
	 * @ordered
	 */
	protected float kq = KQ_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PosLightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenGL_DSLPackage.Literals.POS_LIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vector4 getAmbient() {
		return ambient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmbient(Vector4 newAmbient, NotificationChain msgs) {
		Vector4 oldAmbient = ambient;
		ambient = newAmbient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.POS_LIGHT__AMBIENT, oldAmbient, newAmbient);
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
	public void setAmbient(Vector4 newAmbient) {
		if (newAmbient != ambient) {
			NotificationChain msgs = null;
			if (ambient != null)
				msgs = ((InternalEObject)ambient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.POS_LIGHT__AMBIENT, null, msgs);
			if (newAmbient != null)
				msgs = ((InternalEObject)newAmbient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.POS_LIGHT__AMBIENT, null, msgs);
			msgs = basicSetAmbient(newAmbient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.POS_LIGHT__AMBIENT, newAmbient, newAmbient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vector4 getDifusse() {
		return difusse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDifusse(Vector4 newDifusse, NotificationChain msgs) {
		Vector4 oldDifusse = difusse;
		difusse = newDifusse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.POS_LIGHT__DIFUSSE, oldDifusse, newDifusse);
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
	public void setDifusse(Vector4 newDifusse) {
		if (newDifusse != difusse) {
			NotificationChain msgs = null;
			if (difusse != null)
				msgs = ((InternalEObject)difusse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.POS_LIGHT__DIFUSSE, null, msgs);
			if (newDifusse != null)
				msgs = ((InternalEObject)newDifusse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.POS_LIGHT__DIFUSSE, null, msgs);
			msgs = basicSetDifusse(newDifusse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.POS_LIGHT__DIFUSSE, newDifusse, newDifusse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vector4 getSpecular() {
		return specular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecular(Vector4 newSpecular, NotificationChain msgs) {
		Vector4 oldSpecular = specular;
		specular = newSpecular;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.POS_LIGHT__SPECULAR, oldSpecular, newSpecular);
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
	public void setSpecular(Vector4 newSpecular) {
		if (newSpecular != specular) {
			NotificationChain msgs = null;
			if (specular != null)
				msgs = ((InternalEObject)specular).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.POS_LIGHT__SPECULAR, null, msgs);
			if (newSpecular != null)
				msgs = ((InternalEObject)newSpecular).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.POS_LIGHT__SPECULAR, null, msgs);
			msgs = basicSetSpecular(newSpecular, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.POS_LIGHT__SPECULAR, newSpecular, newSpecular));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vector3 getDireccion() {
		return direccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDireccion(Vector3 newDireccion, NotificationChain msgs) {
		Vector3 oldDireccion = direccion;
		direccion = newDireccion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.POS_LIGHT__DIRECCION, oldDireccion, newDireccion);
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
	public void setDireccion(Vector3 newDireccion) {
		if (newDireccion != direccion) {
			NotificationChain msgs = null;
			if (direccion != null)
				msgs = ((InternalEObject)direccion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.POS_LIGHT__DIRECCION, null, msgs);
			if (newDireccion != null)
				msgs = ((InternalEObject)newDireccion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.POS_LIGHT__DIRECCION, null, msgs);
			msgs = basicSetDireccion(newDireccion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.POS_LIGHT__DIRECCION, newDireccion, newDireccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getKc() {
		return kc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKc(float newKc) {
		float oldKc = kc;
		kc = newKc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.POS_LIGHT__KC, oldKc, kc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getKl() {
		return kl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKl(float newKl) {
		float oldKl = kl;
		kl = newKl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.POS_LIGHT__KL, oldKl, kl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getKq() {
		return kq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKq(float newKq) {
		float oldKq = kq;
		kq = newKq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.POS_LIGHT__KQ, oldKq, kq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenGL_DSLPackage.POS_LIGHT__AMBIENT:
				return basicSetAmbient(null, msgs);
			case OpenGL_DSLPackage.POS_LIGHT__DIFUSSE:
				return basicSetDifusse(null, msgs);
			case OpenGL_DSLPackage.POS_LIGHT__SPECULAR:
				return basicSetSpecular(null, msgs);
			case OpenGL_DSLPackage.POS_LIGHT__DIRECCION:
				return basicSetDireccion(null, msgs);
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
			case OpenGL_DSLPackage.POS_LIGHT__AMBIENT:
				return getAmbient();
			case OpenGL_DSLPackage.POS_LIGHT__DIFUSSE:
				return getDifusse();
			case OpenGL_DSLPackage.POS_LIGHT__SPECULAR:
				return getSpecular();
			case OpenGL_DSLPackage.POS_LIGHT__DIRECCION:
				return getDireccion();
			case OpenGL_DSLPackage.POS_LIGHT__KC:
				return getKc();
			case OpenGL_DSLPackage.POS_LIGHT__KL:
				return getKl();
			case OpenGL_DSLPackage.POS_LIGHT__KQ:
				return getKq();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpenGL_DSLPackage.POS_LIGHT__AMBIENT:
				setAmbient((Vector4)newValue);
				return;
			case OpenGL_DSLPackage.POS_LIGHT__DIFUSSE:
				setDifusse((Vector4)newValue);
				return;
			case OpenGL_DSLPackage.POS_LIGHT__SPECULAR:
				setSpecular((Vector4)newValue);
				return;
			case OpenGL_DSLPackage.POS_LIGHT__DIRECCION:
				setDireccion((Vector3)newValue);
				return;
			case OpenGL_DSLPackage.POS_LIGHT__KC:
				setKc((Float)newValue);
				return;
			case OpenGL_DSLPackage.POS_LIGHT__KL:
				setKl((Float)newValue);
				return;
			case OpenGL_DSLPackage.POS_LIGHT__KQ:
				setKq((Float)newValue);
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
			case OpenGL_DSLPackage.POS_LIGHT__AMBIENT:
				setAmbient((Vector4)null);
				return;
			case OpenGL_DSLPackage.POS_LIGHT__DIFUSSE:
				setDifusse((Vector4)null);
				return;
			case OpenGL_DSLPackage.POS_LIGHT__SPECULAR:
				setSpecular((Vector4)null);
				return;
			case OpenGL_DSLPackage.POS_LIGHT__DIRECCION:
				setDireccion((Vector3)null);
				return;
			case OpenGL_DSLPackage.POS_LIGHT__KC:
				setKc(KC_EDEFAULT);
				return;
			case OpenGL_DSLPackage.POS_LIGHT__KL:
				setKl(KL_EDEFAULT);
				return;
			case OpenGL_DSLPackage.POS_LIGHT__KQ:
				setKq(KQ_EDEFAULT);
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
			case OpenGL_DSLPackage.POS_LIGHT__AMBIENT:
				return ambient != null;
			case OpenGL_DSLPackage.POS_LIGHT__DIFUSSE:
				return difusse != null;
			case OpenGL_DSLPackage.POS_LIGHT__SPECULAR:
				return specular != null;
			case OpenGL_DSLPackage.POS_LIGHT__DIRECCION:
				return direccion != null;
			case OpenGL_DSLPackage.POS_LIGHT__KC:
				return kc != KC_EDEFAULT;
			case OpenGL_DSLPackage.POS_LIGHT__KL:
				return kl != KL_EDEFAULT;
			case OpenGL_DSLPackage.POS_LIGHT__KQ:
				return kq != KQ_EDEFAULT;
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
		result.append(" (kc: ");
		result.append(kc);
		result.append(", kl: ");
		result.append(kl);
		result.append(", kq: ");
		result.append(kq);
		result.append(')');
		return result.toString();
	}

} //PosLightImpl

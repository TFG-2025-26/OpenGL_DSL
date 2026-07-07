/**
 */
package openGL_DSL.impl;

import openGL_DSL.Camera;
import openGL_DSL.OpenGL_DSLPackage;
import openGL_DSL.Vector3;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camera</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.impl.CameraImpl#isBOrto <em>BOrto</em>}</li>
 *   <li>{@link openGL_DSL.impl.CameraImpl#getEye <em>Eye</em>}</li>
 *   <li>{@link openGL_DSL.impl.CameraImpl#getLook <em>Look</em>}</li>
 *   <li>{@link openGL_DSL.impl.CameraImpl#getUp <em>Up</em>}</li>
 *   <li>{@link openGL_DSL.impl.CameraImpl#getPlanoCercano <em>Plano Cercano</em>}</li>
 *   <li>{@link openGL_DSL.impl.CameraImpl#getPlanoLejano <em>Plano Lejano</em>}</li>
 *   <li>{@link openGL_DSL.impl.CameraImpl#getRadio <em>Radio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CameraImpl extends MinimalEObjectImpl.Container implements Camera {
	/**
	 * The default value of the '{@link #isBOrto() <em>BOrto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBOrto()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BORTO_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isBOrto() <em>BOrto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBOrto()
	 * @generated
	 * @ordered
	 */
	protected boolean bOrto = BORTO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEye() <em>Eye</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEye()
	 * @generated
	 * @ordered
	 */
	protected Vector3 eye;

	/**
	 * The cached value of the '{@link #getLook() <em>Look</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLook()
	 * @generated
	 * @ordered
	 */
	protected Vector3 look;

	/**
	 * The cached value of the '{@link #getUp() <em>Up</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUp()
	 * @generated
	 * @ordered
	 */
	protected Vector3 up;

	/**
	 * The default value of the '{@link #getPlanoCercano() <em>Plano Cercano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanoCercano()
	 * @generated
	 * @ordered
	 */
	protected static final double PLANO_CERCANO_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getPlanoCercano() <em>Plano Cercano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanoCercano()
	 * @generated
	 * @ordered
	 */
	protected double planoCercano = PLANO_CERCANO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlanoLejano() <em>Plano Lejano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanoLejano()
	 * @generated
	 * @ordered
	 */
	protected static final double PLANO_LEJANO_EDEFAULT = 10000.0;

	/**
	 * The cached value of the '{@link #getPlanoLejano() <em>Plano Lejano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanoLejano()
	 * @generated
	 * @ordered
	 */
	protected double planoLejano = PLANO_LEJANO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadio() <em>Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadio()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIO_EDEFAULT = 1000.0;

	/**
	 * The cached value of the '{@link #getRadio() <em>Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadio()
	 * @generated
	 * @ordered
	 */
	protected double radio = RADIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CameraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenGL_DSLPackage.Literals.CAMERA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBOrto() {
		return bOrto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBOrto(boolean newBOrto) {
		boolean oldBOrto = bOrto;
		bOrto = newBOrto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CAMERA__BORTO, oldBOrto, bOrto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vector3 getEye() {
		return eye;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEye(Vector3 newEye, NotificationChain msgs) {
		Vector3 oldEye = eye;
		eye = newEye;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CAMERA__EYE, oldEye, newEye);
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
	public void setEye(Vector3 newEye) {
		if (newEye != eye) {
			NotificationChain msgs = null;
			if (eye != null)
				msgs = ((InternalEObject)eye).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.CAMERA__EYE, null, msgs);
			if (newEye != null)
				msgs = ((InternalEObject)newEye).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.CAMERA__EYE, null, msgs);
			msgs = basicSetEye(newEye, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CAMERA__EYE, newEye, newEye));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vector3 getLook() {
		return look;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLook(Vector3 newLook, NotificationChain msgs) {
		Vector3 oldLook = look;
		look = newLook;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CAMERA__LOOK, oldLook, newLook);
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
	public void setLook(Vector3 newLook) {
		if (newLook != look) {
			NotificationChain msgs = null;
			if (look != null)
				msgs = ((InternalEObject)look).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.CAMERA__LOOK, null, msgs);
			if (newLook != null)
				msgs = ((InternalEObject)newLook).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.CAMERA__LOOK, null, msgs);
			msgs = basicSetLook(newLook, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CAMERA__LOOK, newLook, newLook));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vector3 getUp() {
		return up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUp(Vector3 newUp, NotificationChain msgs) {
		Vector3 oldUp = up;
		up = newUp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CAMERA__UP, oldUp, newUp);
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
	public void setUp(Vector3 newUp) {
		if (newUp != up) {
			NotificationChain msgs = null;
			if (up != null)
				msgs = ((InternalEObject)up).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.CAMERA__UP, null, msgs);
			if (newUp != null)
				msgs = ((InternalEObject)newUp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.CAMERA__UP, null, msgs);
			msgs = basicSetUp(newUp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CAMERA__UP, newUp, newUp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPlanoCercano() {
		return planoCercano;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlanoCercano(double newPlanoCercano) {
		double oldPlanoCercano = planoCercano;
		planoCercano = newPlanoCercano;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CAMERA__PLANO_CERCANO, oldPlanoCercano, planoCercano));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPlanoLejano() {
		return planoLejano;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlanoLejano(double newPlanoLejano) {
		double oldPlanoLejano = planoLejano;
		planoLejano = newPlanoLejano;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CAMERA__PLANO_LEJANO, oldPlanoLejano, planoLejano));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRadio() {
		return radio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRadio(double newRadio) {
		double oldRadio = radio;
		radio = newRadio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CAMERA__RADIO, oldRadio, radio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenGL_DSLPackage.CAMERA__EYE:
				return basicSetEye(null, msgs);
			case OpenGL_DSLPackage.CAMERA__LOOK:
				return basicSetLook(null, msgs);
			case OpenGL_DSLPackage.CAMERA__UP:
				return basicSetUp(null, msgs);
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
			case OpenGL_DSLPackage.CAMERA__BORTO:
				return isBOrto();
			case OpenGL_DSLPackage.CAMERA__EYE:
				return getEye();
			case OpenGL_DSLPackage.CAMERA__LOOK:
				return getLook();
			case OpenGL_DSLPackage.CAMERA__UP:
				return getUp();
			case OpenGL_DSLPackage.CAMERA__PLANO_CERCANO:
				return getPlanoCercano();
			case OpenGL_DSLPackage.CAMERA__PLANO_LEJANO:
				return getPlanoLejano();
			case OpenGL_DSLPackage.CAMERA__RADIO:
				return getRadio();
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
			case OpenGL_DSLPackage.CAMERA__BORTO:
				setBOrto((Boolean)newValue);
				return;
			case OpenGL_DSLPackage.CAMERA__EYE:
				setEye((Vector3)newValue);
				return;
			case OpenGL_DSLPackage.CAMERA__LOOK:
				setLook((Vector3)newValue);
				return;
			case OpenGL_DSLPackage.CAMERA__UP:
				setUp((Vector3)newValue);
				return;
			case OpenGL_DSLPackage.CAMERA__PLANO_CERCANO:
				setPlanoCercano((Double)newValue);
				return;
			case OpenGL_DSLPackage.CAMERA__PLANO_LEJANO:
				setPlanoLejano((Double)newValue);
				return;
			case OpenGL_DSLPackage.CAMERA__RADIO:
				setRadio((Double)newValue);
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
			case OpenGL_DSLPackage.CAMERA__BORTO:
				setBOrto(BORTO_EDEFAULT);
				return;
			case OpenGL_DSLPackage.CAMERA__EYE:
				setEye((Vector3)null);
				return;
			case OpenGL_DSLPackage.CAMERA__LOOK:
				setLook((Vector3)null);
				return;
			case OpenGL_DSLPackage.CAMERA__UP:
				setUp((Vector3)null);
				return;
			case OpenGL_DSLPackage.CAMERA__PLANO_CERCANO:
				setPlanoCercano(PLANO_CERCANO_EDEFAULT);
				return;
			case OpenGL_DSLPackage.CAMERA__PLANO_LEJANO:
				setPlanoLejano(PLANO_LEJANO_EDEFAULT);
				return;
			case OpenGL_DSLPackage.CAMERA__RADIO:
				setRadio(RADIO_EDEFAULT);
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
			case OpenGL_DSLPackage.CAMERA__BORTO:
				return bOrto != BORTO_EDEFAULT;
			case OpenGL_DSLPackage.CAMERA__EYE:
				return eye != null;
			case OpenGL_DSLPackage.CAMERA__LOOK:
				return look != null;
			case OpenGL_DSLPackage.CAMERA__UP:
				return up != null;
			case OpenGL_DSLPackage.CAMERA__PLANO_CERCANO:
				return planoCercano != PLANO_CERCANO_EDEFAULT;
			case OpenGL_DSLPackage.CAMERA__PLANO_LEJANO:
				return planoLejano != PLANO_LEJANO_EDEFAULT;
			case OpenGL_DSLPackage.CAMERA__RADIO:
				return radio != RADIO_EDEFAULT;
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
		result.append(" (bOrto: ");
		result.append(bOrto);
		result.append(", PlanoCercano: ");
		result.append(planoCercano);
		result.append(", PlanoLejano: ");
		result.append(planoLejano);
		result.append(", Radio: ");
		result.append(radio);
		result.append(')');
		return result.toString();
	}

} //CameraImpl

/**
 */
package openGL_DSL.impl;

import openGL_DSL.Camera;
import openGL_DSL.OpenGL_DSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link openGL_DSL.impl.CameraImpl#getMEye <em>MEye</em>}</li>
 *   <li>{@link openGL_DSL.impl.CameraImpl#getMLook <em>MLook</em>}</li>
 *   <li>{@link openGL_DSL.impl.CameraImpl#getMUp <em>MUp</em>}</li>
 *   <li>{@link openGL_DSL.impl.CameraImpl#getModelViewMat <em>Model View Mat</em>}</li>
 *   <li>{@link openGL_DSL.impl.CameraImpl#getMProjMat <em>MProj Mat</em>}</li>
 *   <li>{@link openGL_DSL.impl.CameraImpl#getMNearVal <em>MNear Val</em>}</li>
 *   <li>{@link openGL_DSL.impl.CameraImpl#getMFarVal <em>MFar Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CameraImpl extends MinimalEObjectImpl.Container implements Camera {
	/**
	 * The default value of the '{@link #getMEye() <em>MEye</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMEye()
	 * @generated
	 * @ordered
	 */
	protected static final Object MEYE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMEye() <em>MEye</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMEye()
	 * @generated
	 * @ordered
	 */
	protected Object mEye = MEYE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMLook() <em>MLook</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLook()
	 * @generated
	 * @ordered
	 */
	protected static final Object MLOOK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMLook() <em>MLook</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLook()
	 * @generated
	 * @ordered
	 */
	protected Object mLook = MLOOK_EDEFAULT;

	/**
	 * The default value of the '{@link #getMUp() <em>MUp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMUp()
	 * @generated
	 * @ordered
	 */
	protected static final Object MUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMUp() <em>MUp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMUp()
	 * @generated
	 * @ordered
	 */
	protected Object mUp = MUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelViewMat() <em>Model View Mat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelViewMat()
	 * @generated
	 * @ordered
	 */
	protected static final Object MODEL_VIEW_MAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelViewMat() <em>Model View Mat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelViewMat()
	 * @generated
	 * @ordered
	 */
	protected Object modelViewMat = MODEL_VIEW_MAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMProjMat() <em>MProj Mat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMProjMat()
	 * @generated
	 * @ordered
	 */
	protected static final Object MPROJ_MAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMProjMat() <em>MProj Mat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMProjMat()
	 * @generated
	 * @ordered
	 */
	protected Object mProjMat = MPROJ_MAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMNearVal() <em>MNear Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMNearVal()
	 * @generated
	 * @ordered
	 */
	protected static final double MNEAR_VAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMNearVal() <em>MNear Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMNearVal()
	 * @generated
	 * @ordered
	 */
	protected double mNearVal = MNEAR_VAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMFarVal() <em>MFar Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFarVal()
	 * @generated
	 * @ordered
	 */
	protected static final double MFAR_VAL_EDEFAULT = 10000.0;

	/**
	 * The cached value of the '{@link #getMFarVal() <em>MFar Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFarVal()
	 * @generated
	 * @ordered
	 */
	protected double mFarVal = MFAR_VAL_EDEFAULT;

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
	public Object getMEye() {
		return mEye;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMEye(Object newMEye) {
		Object oldMEye = mEye;
		mEye = newMEye;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CAMERA__MEYE, oldMEye, mEye));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getMLook() {
		return mLook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMLook(Object newMLook) {
		Object oldMLook = mLook;
		mLook = newMLook;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CAMERA__MLOOK, oldMLook, mLook));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getMUp() {
		return mUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMUp(Object newMUp) {
		Object oldMUp = mUp;
		mUp = newMUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CAMERA__MUP, oldMUp, mUp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getModelViewMat() {
		return modelViewMat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelViewMat(Object newModelViewMat) {
		Object oldModelViewMat = modelViewMat;
		modelViewMat = newModelViewMat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CAMERA__MODEL_VIEW_MAT, oldModelViewMat, modelViewMat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getMProjMat() {
		return mProjMat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMProjMat(Object newMProjMat) {
		Object oldMProjMat = mProjMat;
		mProjMat = newMProjMat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CAMERA__MPROJ_MAT, oldMProjMat, mProjMat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMNearVal() {
		return mNearVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMNearVal(double newMNearVal) {
		double oldMNearVal = mNearVal;
		mNearVal = newMNearVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CAMERA__MNEAR_VAL, oldMNearVal, mNearVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMFarVal() {
		return mFarVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMFarVal(double newMFarVal) {
		double oldMFarVal = mFarVal;
		mFarVal = newMFarVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CAMERA__MFAR_VAL, oldMFarVal, mFarVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenGL_DSLPackage.CAMERA__MEYE:
				return getMEye();
			case OpenGL_DSLPackage.CAMERA__MLOOK:
				return getMLook();
			case OpenGL_DSLPackage.CAMERA__MUP:
				return getMUp();
			case OpenGL_DSLPackage.CAMERA__MODEL_VIEW_MAT:
				return getModelViewMat();
			case OpenGL_DSLPackage.CAMERA__MPROJ_MAT:
				return getMProjMat();
			case OpenGL_DSLPackage.CAMERA__MNEAR_VAL:
				return getMNearVal();
			case OpenGL_DSLPackage.CAMERA__MFAR_VAL:
				return getMFarVal();
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
			case OpenGL_DSLPackage.CAMERA__MEYE:
				setMEye(newValue);
				return;
			case OpenGL_DSLPackage.CAMERA__MLOOK:
				setMLook(newValue);
				return;
			case OpenGL_DSLPackage.CAMERA__MUP:
				setMUp(newValue);
				return;
			case OpenGL_DSLPackage.CAMERA__MODEL_VIEW_MAT:
				setModelViewMat(newValue);
				return;
			case OpenGL_DSLPackage.CAMERA__MPROJ_MAT:
				setMProjMat(newValue);
				return;
			case OpenGL_DSLPackage.CAMERA__MNEAR_VAL:
				setMNearVal((Double)newValue);
				return;
			case OpenGL_DSLPackage.CAMERA__MFAR_VAL:
				setMFarVal((Double)newValue);
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
			case OpenGL_DSLPackage.CAMERA__MEYE:
				setMEye(MEYE_EDEFAULT);
				return;
			case OpenGL_DSLPackage.CAMERA__MLOOK:
				setMLook(MLOOK_EDEFAULT);
				return;
			case OpenGL_DSLPackage.CAMERA__MUP:
				setMUp(MUP_EDEFAULT);
				return;
			case OpenGL_DSLPackage.CAMERA__MODEL_VIEW_MAT:
				setModelViewMat(MODEL_VIEW_MAT_EDEFAULT);
				return;
			case OpenGL_DSLPackage.CAMERA__MPROJ_MAT:
				setMProjMat(MPROJ_MAT_EDEFAULT);
				return;
			case OpenGL_DSLPackage.CAMERA__MNEAR_VAL:
				setMNearVal(MNEAR_VAL_EDEFAULT);
				return;
			case OpenGL_DSLPackage.CAMERA__MFAR_VAL:
				setMFarVal(MFAR_VAL_EDEFAULT);
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
			case OpenGL_DSLPackage.CAMERA__MEYE:
				return MEYE_EDEFAULT == null ? mEye != null : !MEYE_EDEFAULT.equals(mEye);
			case OpenGL_DSLPackage.CAMERA__MLOOK:
				return MLOOK_EDEFAULT == null ? mLook != null : !MLOOK_EDEFAULT.equals(mLook);
			case OpenGL_DSLPackage.CAMERA__MUP:
				return MUP_EDEFAULT == null ? mUp != null : !MUP_EDEFAULT.equals(mUp);
			case OpenGL_DSLPackage.CAMERA__MODEL_VIEW_MAT:
				return MODEL_VIEW_MAT_EDEFAULT == null ? modelViewMat != null : !MODEL_VIEW_MAT_EDEFAULT.equals(modelViewMat);
			case OpenGL_DSLPackage.CAMERA__MPROJ_MAT:
				return MPROJ_MAT_EDEFAULT == null ? mProjMat != null : !MPROJ_MAT_EDEFAULT.equals(mProjMat);
			case OpenGL_DSLPackage.CAMERA__MNEAR_VAL:
				return mNearVal != MNEAR_VAL_EDEFAULT;
			case OpenGL_DSLPackage.CAMERA__MFAR_VAL:
				return mFarVal != MFAR_VAL_EDEFAULT;
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
		result.append(" (mEye: ");
		result.append(mEye);
		result.append(", mLook: ");
		result.append(mLook);
		result.append(", mUp: ");
		result.append(mUp);
		result.append(", modelViewMat: ");
		result.append(modelViewMat);
		result.append(", mProjMat: ");
		result.append(mProjMat);
		result.append(", mNearVal: ");
		result.append(mNearVal);
		result.append(", mFarVal: ");
		result.append(mFarVal);
		result.append(')');
		return result.toString();
	}

} //CameraImpl

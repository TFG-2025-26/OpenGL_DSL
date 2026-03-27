/**
 */
package openGL_DSL.impl;

import openGL_DSL.Material;
import openGL_DSL.OpenGL_DSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.impl.MaterialImpl#getAmbient <em>Ambient</em>}</li>
 *   <li>{@link openGL_DSL.impl.MaterialImpl#getDifusse <em>Difusse</em>}</li>
 *   <li>{@link openGL_DSL.impl.MaterialImpl#getSpecular <em>Specular</em>}</li>
 *   <li>{@link openGL_DSL.impl.MaterialImpl#getExpF <em>Exp F</em>}</li>
 *   <li>{@link openGL_DSL.impl.MaterialImpl#getFace <em>Face</em>}</li>
 *   <li>{@link openGL_DSL.impl.MaterialImpl#getSh <em>Sh</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialImpl extends MinimalEObjectImpl.Container implements Material {
	/**
	 * The default value of the '{@link #getAmbient() <em>Ambient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbient()
	 * @generated
	 * @ordered
	 */
	protected static final Object AMBIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmbient() <em>Ambient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbient()
	 * @generated
	 * @ordered
	 */
	protected Object ambient = AMBIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDifusse() <em>Difusse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifusse()
	 * @generated
	 * @ordered
	 */
	protected static final Object DIFUSSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDifusse() <em>Difusse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifusse()
	 * @generated
	 * @ordered
	 */
	protected Object difusse = DIFUSSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecular() <em>Specular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecular()
	 * @generated
	 * @ordered
	 */
	protected static final Object SPECULAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecular() <em>Specular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecular()
	 * @generated
	 * @ordered
	 */
	protected Object specular = SPECULAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpF() <em>Exp F</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpF()
	 * @generated
	 * @ordered
	 */
	protected static final float EXP_F_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getExpF() <em>Exp F</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpF()
	 * @generated
	 * @ordered
	 */
	protected float expF = EXP_F_EDEFAULT;

	/**
	 * The default value of the '{@link #getFace() <em>Face</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFace()
	 * @generated
	 * @ordered
	 */
	protected static final Object FACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFace() <em>Face</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFace()
	 * @generated
	 * @ordered
	 */
	protected Object face = FACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSh() <em>Sh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSh()
	 * @generated
	 * @ordered
	 */
	protected static final Object SH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSh() <em>Sh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSh()
	 * @generated
	 * @ordered
	 */
	protected Object sh = SH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenGL_DSLPackage.Literals.MATERIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAmbient() {
		return ambient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmbient(Object newAmbient) {
		Object oldAmbient = ambient;
		ambient = newAmbient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.MATERIAL__AMBIENT, oldAmbient, ambient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getDifusse() {
		return difusse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDifusse(Object newDifusse) {
		Object oldDifusse = difusse;
		difusse = newDifusse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.MATERIAL__DIFUSSE, oldDifusse, difusse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getSpecular() {
		return specular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecular(Object newSpecular) {
		Object oldSpecular = specular;
		specular = newSpecular;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.MATERIAL__SPECULAR, oldSpecular, specular));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getExpF() {
		return expF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpF(float newExpF) {
		float oldExpF = expF;
		expF = newExpF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.MATERIAL__EXP_F, oldExpF, expF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getFace() {
		return face;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFace(Object newFace) {
		Object oldFace = face;
		face = newFace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.MATERIAL__FACE, oldFace, face));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getSh() {
		return sh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSh(Object newSh) {
		Object oldSh = sh;
		sh = newSh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.MATERIAL__SH, oldSh, sh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenGL_DSLPackage.MATERIAL__AMBIENT:
				return getAmbient();
			case OpenGL_DSLPackage.MATERIAL__DIFUSSE:
				return getDifusse();
			case OpenGL_DSLPackage.MATERIAL__SPECULAR:
				return getSpecular();
			case OpenGL_DSLPackage.MATERIAL__EXP_F:
				return getExpF();
			case OpenGL_DSLPackage.MATERIAL__FACE:
				return getFace();
			case OpenGL_DSLPackage.MATERIAL__SH:
				return getSh();
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
			case OpenGL_DSLPackage.MATERIAL__AMBIENT:
				setAmbient(newValue);
				return;
			case OpenGL_DSLPackage.MATERIAL__DIFUSSE:
				setDifusse(newValue);
				return;
			case OpenGL_DSLPackage.MATERIAL__SPECULAR:
				setSpecular(newValue);
				return;
			case OpenGL_DSLPackage.MATERIAL__EXP_F:
				setExpF((Float)newValue);
				return;
			case OpenGL_DSLPackage.MATERIAL__FACE:
				setFace(newValue);
				return;
			case OpenGL_DSLPackage.MATERIAL__SH:
				setSh(newValue);
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
			case OpenGL_DSLPackage.MATERIAL__AMBIENT:
				setAmbient(AMBIENT_EDEFAULT);
				return;
			case OpenGL_DSLPackage.MATERIAL__DIFUSSE:
				setDifusse(DIFUSSE_EDEFAULT);
				return;
			case OpenGL_DSLPackage.MATERIAL__SPECULAR:
				setSpecular(SPECULAR_EDEFAULT);
				return;
			case OpenGL_DSLPackage.MATERIAL__EXP_F:
				setExpF(EXP_F_EDEFAULT);
				return;
			case OpenGL_DSLPackage.MATERIAL__FACE:
				setFace(FACE_EDEFAULT);
				return;
			case OpenGL_DSLPackage.MATERIAL__SH:
				setSh(SH_EDEFAULT);
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
			case OpenGL_DSLPackage.MATERIAL__AMBIENT:
				return AMBIENT_EDEFAULT == null ? ambient != null : !AMBIENT_EDEFAULT.equals(ambient);
			case OpenGL_DSLPackage.MATERIAL__DIFUSSE:
				return DIFUSSE_EDEFAULT == null ? difusse != null : !DIFUSSE_EDEFAULT.equals(difusse);
			case OpenGL_DSLPackage.MATERIAL__SPECULAR:
				return SPECULAR_EDEFAULT == null ? specular != null : !SPECULAR_EDEFAULT.equals(specular);
			case OpenGL_DSLPackage.MATERIAL__EXP_F:
				return expF != EXP_F_EDEFAULT;
			case OpenGL_DSLPackage.MATERIAL__FACE:
				return FACE_EDEFAULT == null ? face != null : !FACE_EDEFAULT.equals(face);
			case OpenGL_DSLPackage.MATERIAL__SH:
				return SH_EDEFAULT == null ? sh != null : !SH_EDEFAULT.equals(sh);
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
		result.append(" (ambient: ");
		result.append(ambient);
		result.append(", difusse: ");
		result.append(difusse);
		result.append(", specular: ");
		result.append(specular);
		result.append(", expF: ");
		result.append(expF);
		result.append(", face: ");
		result.append(face);
		result.append(", sh: ");
		result.append(sh);
		result.append(')');
		return result.toString();
	}

} //MaterialImpl

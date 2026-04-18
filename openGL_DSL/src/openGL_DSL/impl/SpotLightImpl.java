/**
 */
package openGL_DSL.impl;

import openGL_DSL.OpenGL_DSLPackage;
import openGL_DSL.SpotLight;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spot Light</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.impl.SpotLightImpl#getCutoff <em>Cutoff</em>}</li>
 *   <li>{@link openGL_DSL.impl.SpotLightImpl#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpotLightImpl extends PosLightImpl implements SpotLight {
	/**
	 * The default value of the '{@link #getCutoff() <em>Cutoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutoff()
	 * @generated
	 * @ordered
	 */
	protected static final float CUTOFF_EDEFAULT = 180.0F;

	/**
	 * The cached value of the '{@link #getCutoff() <em>Cutoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutoff()
	 * @generated
	 * @ordered
	 */
	protected float cutoff = CUTOFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getExp() <em>Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExp()
	 * @generated
	 * @ordered
	 */
	protected static final float EXP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getExp() <em>Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExp()
	 * @generated
	 * @ordered
	 */
	protected float exp = EXP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpotLightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenGL_DSLPackage.Literals.SPOT_LIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCutoff() {
		return cutoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCutoff(float newCutoff) {
		float oldCutoff = cutoff;
		cutoff = newCutoff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.SPOT_LIGHT__CUTOFF, oldCutoff, cutoff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getExp() {
		return exp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExp(float newExp) {
		float oldExp = exp;
		exp = newExp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.SPOT_LIGHT__EXP, oldExp, exp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenGL_DSLPackage.SPOT_LIGHT__CUTOFF:
				return getCutoff();
			case OpenGL_DSLPackage.SPOT_LIGHT__EXP:
				return getExp();
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
			case OpenGL_DSLPackage.SPOT_LIGHT__CUTOFF:
				setCutoff((Float)newValue);
				return;
			case OpenGL_DSLPackage.SPOT_LIGHT__EXP:
				setExp((Float)newValue);
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
			case OpenGL_DSLPackage.SPOT_LIGHT__CUTOFF:
				setCutoff(CUTOFF_EDEFAULT);
				return;
			case OpenGL_DSLPackage.SPOT_LIGHT__EXP:
				setExp(EXP_EDEFAULT);
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
			case OpenGL_DSLPackage.SPOT_LIGHT__CUTOFF:
				return cutoff != CUTOFF_EDEFAULT;
			case OpenGL_DSLPackage.SPOT_LIGHT__EXP:
				return exp != EXP_EDEFAULT;
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
		result.append(" (cutoff: ");
		result.append(cutoff);
		result.append(", exp: ");
		result.append(exp);
		result.append(')');
		return result.toString();
	}

} //SpotLightImpl

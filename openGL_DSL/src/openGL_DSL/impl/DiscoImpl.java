/**
 */
package openGL_DSL.impl;

import openGL_DSL.Disco;
import openGL_DSL.OpenGL_DSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disco</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.impl.DiscoImpl#getRadioInterno <em>Radio Interno</em>}</li>
 *   <li>{@link openGL_DSL.impl.DiscoImpl#getRadioExterno <em>Radio Externo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscoImpl extends QuadricEntityImpl implements Disco {
	/**
	 * The default value of the '{@link #getRadioInterno() <em>Radio Interno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioInterno()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIO_INTERNO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRadioInterno() <em>Radio Interno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioInterno()
	 * @generated
	 * @ordered
	 */
	protected double radioInterno = RADIO_INTERNO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadioExterno() <em>Radio Externo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioExterno()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIO_EXTERNO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRadioExterno() <em>Radio Externo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioExterno()
	 * @generated
	 * @ordered
	 */
	protected double radioExterno = RADIO_EXTERNO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenGL_DSLPackage.Literals.DISCO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRadioInterno() {
		return radioInterno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRadioInterno(double newRadioInterno) {
		double oldRadioInterno = radioInterno;
		radioInterno = newRadioInterno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.DISCO__RADIO_INTERNO, oldRadioInterno, radioInterno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRadioExterno() {
		return radioExterno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRadioExterno(double newRadioExterno) {
		double oldRadioExterno = radioExterno;
		radioExterno = newRadioExterno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.DISCO__RADIO_EXTERNO, oldRadioExterno, radioExterno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenGL_DSLPackage.DISCO__RADIO_INTERNO:
				return getRadioInterno();
			case OpenGL_DSLPackage.DISCO__RADIO_EXTERNO:
				return getRadioExterno();
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
			case OpenGL_DSLPackage.DISCO__RADIO_INTERNO:
				setRadioInterno((Double)newValue);
				return;
			case OpenGL_DSLPackage.DISCO__RADIO_EXTERNO:
				setRadioExterno((Double)newValue);
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
			case OpenGL_DSLPackage.DISCO__RADIO_INTERNO:
				setRadioInterno(RADIO_INTERNO_EDEFAULT);
				return;
			case OpenGL_DSLPackage.DISCO__RADIO_EXTERNO:
				setRadioExterno(RADIO_EXTERNO_EDEFAULT);
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
			case OpenGL_DSLPackage.DISCO__RADIO_INTERNO:
				return radioInterno != RADIO_INTERNO_EDEFAULT;
			case OpenGL_DSLPackage.DISCO__RADIO_EXTERNO:
				return radioExterno != RADIO_EXTERNO_EDEFAULT;
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
		result.append(" (RadioInterno: ");
		result.append(radioInterno);
		result.append(", RadioExterno: ");
		result.append(radioExterno);
		result.append(')');
		return result.toString();
	}

} //DiscoImpl

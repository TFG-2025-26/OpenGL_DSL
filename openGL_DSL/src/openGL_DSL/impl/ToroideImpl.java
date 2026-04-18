/**
 */
package openGL_DSL.impl;

import openGL_DSL.OpenGL_DSLPackage;
import openGL_DSL.Toroide;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Toroide</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.impl.ToroideImpl#getRadioCentro <em>Radio Centro</em>}</li>
 *   <li>{@link openGL_DSL.impl.ToroideImpl#getRadioAnillo <em>Radio Anillo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToroideImpl extends Abs_EntityImpl implements Toroide {
	/**
	 * The default value of the '{@link #getRadioCentro() <em>Radio Centro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioCentro()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIO_CENTRO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRadioCentro() <em>Radio Centro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioCentro()
	 * @generated
	 * @ordered
	 */
	protected double radioCentro = RADIO_CENTRO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadioAnillo() <em>Radio Anillo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioAnillo()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIO_ANILLO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRadioAnillo() <em>Radio Anillo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioAnillo()
	 * @generated
	 * @ordered
	 */
	protected double radioAnillo = RADIO_ANILLO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToroideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenGL_DSLPackage.Literals.TOROIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRadioCentro() {
		return radioCentro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRadioCentro(double newRadioCentro) {
		double oldRadioCentro = radioCentro;
		radioCentro = newRadioCentro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.TOROIDE__RADIO_CENTRO, oldRadioCentro, radioCentro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRadioAnillo() {
		return radioAnillo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRadioAnillo(double newRadioAnillo) {
		double oldRadioAnillo = radioAnillo;
		radioAnillo = newRadioAnillo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.TOROIDE__RADIO_ANILLO, oldRadioAnillo, radioAnillo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenGL_DSLPackage.TOROIDE__RADIO_CENTRO:
				return getRadioCentro();
			case OpenGL_DSLPackage.TOROIDE__RADIO_ANILLO:
				return getRadioAnillo();
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
			case OpenGL_DSLPackage.TOROIDE__RADIO_CENTRO:
				setRadioCentro((Double)newValue);
				return;
			case OpenGL_DSLPackage.TOROIDE__RADIO_ANILLO:
				setRadioAnillo((Double)newValue);
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
			case OpenGL_DSLPackage.TOROIDE__RADIO_CENTRO:
				setRadioCentro(RADIO_CENTRO_EDEFAULT);
				return;
			case OpenGL_DSLPackage.TOROIDE__RADIO_ANILLO:
				setRadioAnillo(RADIO_ANILLO_EDEFAULT);
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
			case OpenGL_DSLPackage.TOROIDE__RADIO_CENTRO:
				return radioCentro != RADIO_CENTRO_EDEFAULT;
			case OpenGL_DSLPackage.TOROIDE__RADIO_ANILLO:
				return radioAnillo != RADIO_ANILLO_EDEFAULT;
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
		result.append(" (RadioCentro: ");
		result.append(radioCentro);
		result.append(", RadioAnillo: ");
		result.append(radioAnillo);
		result.append(')');
		return result.toString();
	}

} //ToroideImpl

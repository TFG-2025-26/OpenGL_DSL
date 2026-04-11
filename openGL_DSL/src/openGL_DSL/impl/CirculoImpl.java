/**
 */
package openGL_DSL.impl;

import openGL_DSL.Circulo;
import openGL_DSL.OpenGL_DSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circulo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.impl.CirculoImpl#getRadio <em>Radio</em>}</li>
 *   <li>{@link openGL_DSL.impl.CirculoImpl#isRellenar <em>Rellenar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CirculoImpl extends Abs_EntityImpl implements Circulo {
	/**
	 * The default value of the '{@link #getRadio() <em>Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadio()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIO_EDEFAULT = 0.0;

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
	 * The default value of the '{@link #isRellenar() <em>Rellenar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRellenar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELLENAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRellenar() <em>Rellenar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRellenar()
	 * @generated
	 * @ordered
	 */
	protected boolean rellenar = RELLENAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CirculoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenGL_DSLPackage.Literals.CIRCULO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CIRCULO__RADIO, oldRadio, radio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRellenar() {
		return rellenar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRellenar(boolean newRellenar) {
		boolean oldRellenar = rellenar;
		rellenar = newRellenar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CIRCULO__RELLENAR, oldRellenar, rellenar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenGL_DSLPackage.CIRCULO__RADIO:
				return getRadio();
			case OpenGL_DSLPackage.CIRCULO__RELLENAR:
				return isRellenar();
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
			case OpenGL_DSLPackage.CIRCULO__RADIO:
				setRadio((Double)newValue);
				return;
			case OpenGL_DSLPackage.CIRCULO__RELLENAR:
				setRellenar((Boolean)newValue);
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
			case OpenGL_DSLPackage.CIRCULO__RADIO:
				setRadio(RADIO_EDEFAULT);
				return;
			case OpenGL_DSLPackage.CIRCULO__RELLENAR:
				setRellenar(RELLENAR_EDEFAULT);
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
			case OpenGL_DSLPackage.CIRCULO__RADIO:
				return radio != RADIO_EDEFAULT;
			case OpenGL_DSLPackage.CIRCULO__RELLENAR:
				return rellenar != RELLENAR_EDEFAULT;
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
		result.append(" (Radio: ");
		result.append(radio);
		result.append(", Rellenar: ");
		result.append(rellenar);
		result.append(')');
		return result.toString();
	}

} //CirculoImpl

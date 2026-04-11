/**
 */
package openGL_DSL.impl;

import openGL_DSL.Cilindro;
import openGL_DSL.OpenGL_DSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cilindro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.impl.CilindroImpl#getRadioBase <em>Radio Base</em>}</li>
 *   <li>{@link openGL_DSL.impl.CilindroImpl#getRadioTope <em>Radio Tope</em>}</li>
 *   <li>{@link openGL_DSL.impl.CilindroImpl#getAltura <em>Altura</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CilindroImpl extends QuadricEntityImpl implements Cilindro {
	/**
	 * The default value of the '{@link #getRadioBase() <em>Radio Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioBase()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIO_BASE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRadioBase() <em>Radio Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioBase()
	 * @generated
	 * @ordered
	 */
	protected double radioBase = RADIO_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadioTope() <em>Radio Tope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioTope()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIO_TOPE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRadioTope() <em>Radio Tope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadioTope()
	 * @generated
	 * @ordered
	 */
	protected double radioTope = RADIO_TOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAltura() <em>Altura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltura()
	 * @generated
	 * @ordered
	 */
	protected static final double ALTURA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAltura() <em>Altura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltura()
	 * @generated
	 * @ordered
	 */
	protected double altura = ALTURA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CilindroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenGL_DSLPackage.Literals.CILINDRO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRadioBase() {
		return radioBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRadioBase(double newRadioBase) {
		double oldRadioBase = radioBase;
		radioBase = newRadioBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CILINDRO__RADIO_BASE, oldRadioBase, radioBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRadioTope() {
		return radioTope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRadioTope(double newRadioTope) {
		double oldRadioTope = radioTope;
		radioTope = newRadioTope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CILINDRO__RADIO_TOPE, oldRadioTope, radioTope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAltura() {
		return altura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAltura(double newAltura) {
		double oldAltura = altura;
		altura = newAltura;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.CILINDRO__ALTURA, oldAltura, altura));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenGL_DSLPackage.CILINDRO__RADIO_BASE:
				return getRadioBase();
			case OpenGL_DSLPackage.CILINDRO__RADIO_TOPE:
				return getRadioTope();
			case OpenGL_DSLPackage.CILINDRO__ALTURA:
				return getAltura();
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
			case OpenGL_DSLPackage.CILINDRO__RADIO_BASE:
				setRadioBase((Double)newValue);
				return;
			case OpenGL_DSLPackage.CILINDRO__RADIO_TOPE:
				setRadioTope((Double)newValue);
				return;
			case OpenGL_DSLPackage.CILINDRO__ALTURA:
				setAltura((Double)newValue);
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
			case OpenGL_DSLPackage.CILINDRO__RADIO_BASE:
				setRadioBase(RADIO_BASE_EDEFAULT);
				return;
			case OpenGL_DSLPackage.CILINDRO__RADIO_TOPE:
				setRadioTope(RADIO_TOPE_EDEFAULT);
				return;
			case OpenGL_DSLPackage.CILINDRO__ALTURA:
				setAltura(ALTURA_EDEFAULT);
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
			case OpenGL_DSLPackage.CILINDRO__RADIO_BASE:
				return radioBase != RADIO_BASE_EDEFAULT;
			case OpenGL_DSLPackage.CILINDRO__RADIO_TOPE:
				return radioTope != RADIO_TOPE_EDEFAULT;
			case OpenGL_DSLPackage.CILINDRO__ALTURA:
				return altura != ALTURA_EDEFAULT;
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
		result.append(" (RadioBase: ");
		result.append(radioBase);
		result.append(", RadioTope: ");
		result.append(radioTope);
		result.append(", Altura: ");
		result.append(altura);
		result.append(')');
		return result.toString();
	}

} //CilindroImpl

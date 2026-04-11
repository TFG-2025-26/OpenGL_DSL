/**
 */
package openGL_DSL.impl;

import openGL_DSL.DiscoParcial;
import openGL_DSL.OpenGL_DSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disco Parcial</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.impl.DiscoParcialImpl#getRadioInterno <em>Radio Interno</em>}</li>
 *   <li>{@link openGL_DSL.impl.DiscoParcialImpl#getRadioExterno <em>Radio Externo</em>}</li>
 *   <li>{@link openGL_DSL.impl.DiscoParcialImpl#getAnguloInicio <em>Angulo Inicio</em>}</li>
 *   <li>{@link openGL_DSL.impl.DiscoParcialImpl#getAmplitudAngulo <em>Amplitud Angulo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscoParcialImpl extends QuadricEntityImpl implements DiscoParcial {
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
	 * The default value of the '{@link #getAnguloInicio() <em>Angulo Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnguloInicio()
	 * @generated
	 * @ordered
	 */
	protected static final double ANGULO_INICIO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAnguloInicio() <em>Angulo Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnguloInicio()
	 * @generated
	 * @ordered
	 */
	protected double anguloInicio = ANGULO_INICIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmplitudAngulo() <em>Amplitud Angulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmplitudAngulo()
	 * @generated
	 * @ordered
	 */
	protected static final double AMPLITUD_ANGULO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAmplitudAngulo() <em>Amplitud Angulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmplitudAngulo()
	 * @generated
	 * @ordered
	 */
	protected double amplitudAngulo = AMPLITUD_ANGULO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscoParcialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenGL_DSLPackage.Literals.DISCO_PARCIAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.DISCO_PARCIAL__RADIO_INTERNO, oldRadioInterno, radioInterno));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.DISCO_PARCIAL__RADIO_EXTERNO, oldRadioExterno, radioExterno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAnguloInicio() {
		return anguloInicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnguloInicio(double newAnguloInicio) {
		double oldAnguloInicio = anguloInicio;
		anguloInicio = newAnguloInicio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.DISCO_PARCIAL__ANGULO_INICIO, oldAnguloInicio, anguloInicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAmplitudAngulo() {
		return amplitudAngulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmplitudAngulo(double newAmplitudAngulo) {
		double oldAmplitudAngulo = amplitudAngulo;
		amplitudAngulo = newAmplitudAngulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.DISCO_PARCIAL__AMPLITUD_ANGULO, oldAmplitudAngulo, amplitudAngulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenGL_DSLPackage.DISCO_PARCIAL__RADIO_INTERNO:
				return getRadioInterno();
			case OpenGL_DSLPackage.DISCO_PARCIAL__RADIO_EXTERNO:
				return getRadioExterno();
			case OpenGL_DSLPackage.DISCO_PARCIAL__ANGULO_INICIO:
				return getAnguloInicio();
			case OpenGL_DSLPackage.DISCO_PARCIAL__AMPLITUD_ANGULO:
				return getAmplitudAngulo();
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
			case OpenGL_DSLPackage.DISCO_PARCIAL__RADIO_INTERNO:
				setRadioInterno((Double)newValue);
				return;
			case OpenGL_DSLPackage.DISCO_PARCIAL__RADIO_EXTERNO:
				setRadioExterno((Double)newValue);
				return;
			case OpenGL_DSLPackage.DISCO_PARCIAL__ANGULO_INICIO:
				setAnguloInicio((Double)newValue);
				return;
			case OpenGL_DSLPackage.DISCO_PARCIAL__AMPLITUD_ANGULO:
				setAmplitudAngulo((Double)newValue);
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
			case OpenGL_DSLPackage.DISCO_PARCIAL__RADIO_INTERNO:
				setRadioInterno(RADIO_INTERNO_EDEFAULT);
				return;
			case OpenGL_DSLPackage.DISCO_PARCIAL__RADIO_EXTERNO:
				setRadioExterno(RADIO_EXTERNO_EDEFAULT);
				return;
			case OpenGL_DSLPackage.DISCO_PARCIAL__ANGULO_INICIO:
				setAnguloInicio(ANGULO_INICIO_EDEFAULT);
				return;
			case OpenGL_DSLPackage.DISCO_PARCIAL__AMPLITUD_ANGULO:
				setAmplitudAngulo(AMPLITUD_ANGULO_EDEFAULT);
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
			case OpenGL_DSLPackage.DISCO_PARCIAL__RADIO_INTERNO:
				return radioInterno != RADIO_INTERNO_EDEFAULT;
			case OpenGL_DSLPackage.DISCO_PARCIAL__RADIO_EXTERNO:
				return radioExterno != RADIO_EXTERNO_EDEFAULT;
			case OpenGL_DSLPackage.DISCO_PARCIAL__ANGULO_INICIO:
				return anguloInicio != ANGULO_INICIO_EDEFAULT;
			case OpenGL_DSLPackage.DISCO_PARCIAL__AMPLITUD_ANGULO:
				return amplitudAngulo != AMPLITUD_ANGULO_EDEFAULT;
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
		result.append(", AnguloInicio: ");
		result.append(anguloInicio);
		result.append(", AmplitudAngulo: ");
		result.append(amplitudAngulo);
		result.append(')');
		return result.toString();
	}

} //DiscoParcialImpl

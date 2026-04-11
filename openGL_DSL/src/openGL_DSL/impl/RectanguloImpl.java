/**
 */
package openGL_DSL.impl;

import openGL_DSL.OpenGL_DSLPackage;
import openGL_DSL.Rectangulo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangulo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.impl.RectanguloImpl#getAncho <em>Ancho</em>}</li>
 *   <li>{@link openGL_DSL.impl.RectanguloImpl#getAlto <em>Alto</em>}</li>
 *   <li>{@link openGL_DSL.impl.RectanguloImpl#isRellenar <em>Rellenar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectanguloImpl extends Abs_EntityImpl implements Rectangulo {
	/**
	 * The default value of the '{@link #getAncho() <em>Ancho</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAncho()
	 * @generated
	 * @ordered
	 */
	protected static final double ANCHO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAncho() <em>Ancho</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAncho()
	 * @generated
	 * @ordered
	 */
	protected double ancho = ANCHO_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlto() <em>Alto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlto()
	 * @generated
	 * @ordered
	 */
	protected static final double ALTO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAlto() <em>Alto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlto()
	 * @generated
	 * @ordered
	 */
	protected double alto = ALTO_EDEFAULT;

	/**
	 * The default value of the '{@link #isRellenar() <em>Rellenar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRellenar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELLENAR_EDEFAULT = true;

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
	protected RectanguloImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenGL_DSLPackage.Literals.RECTANGULO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAncho() {
		return ancho;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAncho(double newAncho) {
		double oldAncho = ancho;
		ancho = newAncho;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.RECTANGULO__ANCHO, oldAncho, ancho));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAlto() {
		return alto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlto(double newAlto) {
		double oldAlto = alto;
		alto = newAlto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.RECTANGULO__ALTO, oldAlto, alto));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.RECTANGULO__RELLENAR, oldRellenar, rellenar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenGL_DSLPackage.RECTANGULO__ANCHO:
				return getAncho();
			case OpenGL_DSLPackage.RECTANGULO__ALTO:
				return getAlto();
			case OpenGL_DSLPackage.RECTANGULO__RELLENAR:
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
			case OpenGL_DSLPackage.RECTANGULO__ANCHO:
				setAncho((Double)newValue);
				return;
			case OpenGL_DSLPackage.RECTANGULO__ALTO:
				setAlto((Double)newValue);
				return;
			case OpenGL_DSLPackage.RECTANGULO__RELLENAR:
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
			case OpenGL_DSLPackage.RECTANGULO__ANCHO:
				setAncho(ANCHO_EDEFAULT);
				return;
			case OpenGL_DSLPackage.RECTANGULO__ALTO:
				setAlto(ALTO_EDEFAULT);
				return;
			case OpenGL_DSLPackage.RECTANGULO__RELLENAR:
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
			case OpenGL_DSLPackage.RECTANGULO__ANCHO:
				return ancho != ANCHO_EDEFAULT;
			case OpenGL_DSLPackage.RECTANGULO__ALTO:
				return alto != ALTO_EDEFAULT;
			case OpenGL_DSLPackage.RECTANGULO__RELLENAR:
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
		result.append(" (Ancho: ");
		result.append(ancho);
		result.append(", Alto: ");
		result.append(alto);
		result.append(", Rellenar: ");
		result.append(rellenar);
		result.append(')');
		return result.toString();
	}

} //RectanguloImpl

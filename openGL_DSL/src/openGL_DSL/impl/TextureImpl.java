/**
 */
package openGL_DSL.impl;

import openGL_DSL.OpenGL_DSLPackage;
import openGL_DSL.Texture;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Texture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.impl.TextureImpl#getTextura <em>Textura</em>}</li>
 *   <li>{@link openGL_DSL.impl.TextureImpl#getAlfa <em>Alfa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextureImpl extends MinimalEObjectImpl.Container implements Texture {
	/**
	 * The default value of the '{@link #getTextura() <em>Textura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextura()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTURA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextura() <em>Textura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextura()
	 * @generated
	 * @ordered
	 */
	protected String textura = TEXTURA_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlfa() <em>Alfa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlfa()
	 * @generated
	 * @ordered
	 */
	protected static final int ALFA_EDEFAULT = 255;

	/**
	 * The cached value of the '{@link #getAlfa() <em>Alfa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlfa()
	 * @generated
	 * @ordered
	 */
	protected int alfa = ALFA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenGL_DSLPackage.Literals.TEXTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextura() {
		return textura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextura(String newTextura) {
		String oldTextura = textura;
		textura = newTextura;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.TEXTURE__TEXTURA, oldTextura, textura));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAlfa() {
		return alfa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlfa(int newAlfa) {
		int oldAlfa = alfa;
		alfa = newAlfa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.TEXTURE__ALFA, oldAlfa, alfa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenGL_DSLPackage.TEXTURE__TEXTURA:
				return getTextura();
			case OpenGL_DSLPackage.TEXTURE__ALFA:
				return getAlfa();
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
			case OpenGL_DSLPackage.TEXTURE__TEXTURA:
				setTextura((String)newValue);
				return;
			case OpenGL_DSLPackage.TEXTURE__ALFA:
				setAlfa((Integer)newValue);
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
			case OpenGL_DSLPackage.TEXTURE__TEXTURA:
				setTextura(TEXTURA_EDEFAULT);
				return;
			case OpenGL_DSLPackage.TEXTURE__ALFA:
				setAlfa(ALFA_EDEFAULT);
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
			case OpenGL_DSLPackage.TEXTURE__TEXTURA:
				return TEXTURA_EDEFAULT == null ? textura != null : !TEXTURA_EDEFAULT.equals(textura);
			case OpenGL_DSLPackage.TEXTURE__ALFA:
				return alfa != ALFA_EDEFAULT;
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
		result.append(" (Textura: ");
		result.append(textura);
		result.append(", Alfa: ");
		result.append(alfa);
		result.append(')');
		return result.toString();
	}

} //TextureImpl

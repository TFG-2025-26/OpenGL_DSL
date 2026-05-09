/**
 */
package openGL_DSL.impl;

import openGL_DSL.OpenGL_DSLPackage;
import openGL_DSL.ViewPort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.impl.ViewPortImpl#getXLeft <em>XLeft</em>}</li>
 *   <li>{@link openGL_DSL.impl.ViewPortImpl#getYBot <em>YBot</em>}</li>
 *   <li>{@link openGL_DSL.impl.ViewPortImpl#getXWidth <em>XWidth</em>}</li>
 *   <li>{@link openGL_DSL.impl.ViewPortImpl#getYHeight <em>YHeight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewPortImpl extends MinimalEObjectImpl.Container implements ViewPort {
	/**
	 * The default value of the '{@link #getXLeft() <em>XLeft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXLeft()
	 * @generated
	 * @ordered
	 */
	protected static final int XLEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXLeft() <em>XLeft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXLeft()
	 * @generated
	 * @ordered
	 */
	protected int xLeft = XLEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getYBot() <em>YBot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYBot()
	 * @generated
	 * @ordered
	 */
	protected static final int YBOT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYBot() <em>YBot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYBot()
	 * @generated
	 * @ordered
	 */
	protected int yBot = YBOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getXWidth() <em>XWidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int XWIDTH_EDEFAULT = 800;

	/**
	 * The cached value of the '{@link #getXWidth() <em>XWidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXWidth()
	 * @generated
	 * @ordered
	 */
	protected int xWidth = XWIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getYHeight() <em>YHeight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int YHEIGHT_EDEFAULT = 600;

	/**
	 * The cached value of the '{@link #getYHeight() <em>YHeight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYHeight()
	 * @generated
	 * @ordered
	 */
	protected int yHeight = YHEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenGL_DSLPackage.Literals.VIEW_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getXLeft() {
		return xLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXLeft(int newXLeft) {
		int oldXLeft = xLeft;
		xLeft = newXLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.VIEW_PORT__XLEFT, oldXLeft, xLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getYBot() {
		return yBot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYBot(int newYBot) {
		int oldYBot = yBot;
		yBot = newYBot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.VIEW_PORT__YBOT, oldYBot, yBot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getXWidth() {
		return xWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXWidth(int newXWidth) {
		int oldXWidth = xWidth;
		xWidth = newXWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.VIEW_PORT__XWIDTH, oldXWidth, xWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getYHeight() {
		return yHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYHeight(int newYHeight) {
		int oldYHeight = yHeight;
		yHeight = newYHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.VIEW_PORT__YHEIGHT, oldYHeight, yHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenGL_DSLPackage.VIEW_PORT__XLEFT:
				return getXLeft();
			case OpenGL_DSLPackage.VIEW_PORT__YBOT:
				return getYBot();
			case OpenGL_DSLPackage.VIEW_PORT__XWIDTH:
				return getXWidth();
			case OpenGL_DSLPackage.VIEW_PORT__YHEIGHT:
				return getYHeight();
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
			case OpenGL_DSLPackage.VIEW_PORT__XLEFT:
				setXLeft((Integer)newValue);
				return;
			case OpenGL_DSLPackage.VIEW_PORT__YBOT:
				setYBot((Integer)newValue);
				return;
			case OpenGL_DSLPackage.VIEW_PORT__XWIDTH:
				setXWidth((Integer)newValue);
				return;
			case OpenGL_DSLPackage.VIEW_PORT__YHEIGHT:
				setYHeight((Integer)newValue);
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
			case OpenGL_DSLPackage.VIEW_PORT__XLEFT:
				setXLeft(XLEFT_EDEFAULT);
				return;
			case OpenGL_DSLPackage.VIEW_PORT__YBOT:
				setYBot(YBOT_EDEFAULT);
				return;
			case OpenGL_DSLPackage.VIEW_PORT__XWIDTH:
				setXWidth(XWIDTH_EDEFAULT);
				return;
			case OpenGL_DSLPackage.VIEW_PORT__YHEIGHT:
				setYHeight(YHEIGHT_EDEFAULT);
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
			case OpenGL_DSLPackage.VIEW_PORT__XLEFT:
				return xLeft != XLEFT_EDEFAULT;
			case OpenGL_DSLPackage.VIEW_PORT__YBOT:
				return yBot != YBOT_EDEFAULT;
			case OpenGL_DSLPackage.VIEW_PORT__XWIDTH:
				return xWidth != XWIDTH_EDEFAULT;
			case OpenGL_DSLPackage.VIEW_PORT__YHEIGHT:
				return yHeight != YHEIGHT_EDEFAULT;
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
		result.append(" (xLeft: ");
		result.append(xLeft);
		result.append(", yBot: ");
		result.append(yBot);
		result.append(", xWidth: ");
		result.append(xWidth);
		result.append(", yHeight: ");
		result.append(yHeight);
		result.append(')');
		return result.toString();
	}

} //ViewPortImpl

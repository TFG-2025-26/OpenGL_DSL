/**
 */
package openGL_DSL.impl;

import java.lang.reflect.InvocationTargetException;

import openGL_DSL.OpenGL_DSLPackage;
import openGL_DSL.ViewPort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link openGL_DSL.impl.ViewPortImpl#getYBolt <em>YBolt</em>}</li>
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
	 * The default value of the '{@link #getYBolt() <em>YBolt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYBolt()
	 * @generated
	 * @ordered
	 */
	protected static final int YBOLT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYBolt() <em>YBolt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYBolt()
	 * @generated
	 * @ordered
	 */
	protected int yBolt = YBOLT_EDEFAULT;

	/**
	 * The default value of the '{@link #getXWidth() <em>XWidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Object XWIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXWidth() <em>XWidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXWidth()
	 * @generated
	 * @ordered
	 */
	protected Object xWidth = XWIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getYHeight() <em>YHeight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Object YHEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYHeight() <em>YHeight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYHeight()
	 * @generated
	 * @ordered
	 */
	protected Object yHeight = YHEIGHT_EDEFAULT;

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
	public int getYBolt() {
		return yBolt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYBolt(int newYBolt) {
		int oldYBolt = yBolt;
		yBolt = newYBolt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.VIEW_PORT__YBOLT, oldYBolt, yBolt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getXWidth() {
		return xWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXWidth(Object newXWidth) {
		Object oldXWidth = xWidth;
		xWidth = newXWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.VIEW_PORT__XWIDTH, oldXWidth,
					xWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getYHeight() {
		return yHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYHeight(Object newYHeight) {
		Object oldYHeight = yHeight;
		yHeight = newYHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.VIEW_PORT__YHEIGHT, oldYHeight,
					yHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void upload() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
		case OpenGL_DSLPackage.VIEW_PORT__YBOLT:
			return getYBolt();
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
			setXLeft((Integer) newValue);
			return;
		case OpenGL_DSLPackage.VIEW_PORT__YBOLT:
			setYBolt((Integer) newValue);
			return;
		case OpenGL_DSLPackage.VIEW_PORT__XWIDTH:
			setXWidth(newValue);
			return;
		case OpenGL_DSLPackage.VIEW_PORT__YHEIGHT:
			setYHeight(newValue);
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
		case OpenGL_DSLPackage.VIEW_PORT__YBOLT:
			setYBolt(YBOLT_EDEFAULT);
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
		case OpenGL_DSLPackage.VIEW_PORT__YBOLT:
			return yBolt != YBOLT_EDEFAULT;
		case OpenGL_DSLPackage.VIEW_PORT__XWIDTH:
			return XWIDTH_EDEFAULT == null ? xWidth != null : !XWIDTH_EDEFAULT.equals(xWidth);
		case OpenGL_DSLPackage.VIEW_PORT__YHEIGHT:
			return YHEIGHT_EDEFAULT == null ? yHeight != null : !YHEIGHT_EDEFAULT.equals(yHeight);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case OpenGL_DSLPackage.VIEW_PORT___UPLOAD:
			upload();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (xLeft: ");
		result.append(xLeft);
		result.append(", yBolt: ");
		result.append(yBolt);
		result.append(", xWidth: ");
		result.append(xWidth);
		result.append(", yHeight: ");
		result.append(yHeight);
		result.append(')');
		return result.toString();
	}

} //ViewPortImpl

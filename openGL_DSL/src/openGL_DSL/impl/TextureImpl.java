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
 *   <li>{@link openGL_DSL.impl.TextureImpl#getMWidth <em>MWidth</em>}</li>
 *   <li>{@link openGL_DSL.impl.TextureImpl#getMHeight <em>MHeight</em>}</li>
 *   <li>{@link openGL_DSL.impl.TextureImpl#getMId <em>MId</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextureImpl extends MinimalEObjectImpl.Container implements Texture {
	/**
	 * The default value of the '{@link #getMWidth() <em>MWidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int MWIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMWidth() <em>MWidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMWidth()
	 * @generated
	 * @ordered
	 */
	protected int mWidth = MWIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMHeight() <em>MHeight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int MHEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMHeight() <em>MHeight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMHeight()
	 * @generated
	 * @ordered
	 */
	protected int mHeight = MHEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMId() <em>MId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMId()
	 * @generated
	 * @ordered
	 */
	protected static final int MID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMId() <em>MId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMId()
	 * @generated
	 * @ordered
	 */
	protected int mId = MID_EDEFAULT;

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
	public int getMWidth() {
		return mWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMWidth(int newMWidth) {
		int oldMWidth = mWidth;
		mWidth = newMWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.TEXTURE__MWIDTH, oldMWidth, mWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMHeight() {
		return mHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMHeight(int newMHeight) {
		int oldMHeight = mHeight;
		mHeight = newMHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.TEXTURE__MHEIGHT, oldMHeight, mHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMId() {
		return mId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMId(int newMId) {
		int oldMId = mId;
		mId = newMId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.TEXTURE__MID, oldMId, mId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenGL_DSLPackage.TEXTURE__MWIDTH:
				return getMWidth();
			case OpenGL_DSLPackage.TEXTURE__MHEIGHT:
				return getMHeight();
			case OpenGL_DSLPackage.TEXTURE__MID:
				return getMId();
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
			case OpenGL_DSLPackage.TEXTURE__MWIDTH:
				setMWidth((Integer)newValue);
				return;
			case OpenGL_DSLPackage.TEXTURE__MHEIGHT:
				setMHeight((Integer)newValue);
				return;
			case OpenGL_DSLPackage.TEXTURE__MID:
				setMId((Integer)newValue);
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
			case OpenGL_DSLPackage.TEXTURE__MWIDTH:
				setMWidth(MWIDTH_EDEFAULT);
				return;
			case OpenGL_DSLPackage.TEXTURE__MHEIGHT:
				setMHeight(MHEIGHT_EDEFAULT);
				return;
			case OpenGL_DSLPackage.TEXTURE__MID:
				setMId(MID_EDEFAULT);
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
			case OpenGL_DSLPackage.TEXTURE__MWIDTH:
				return mWidth != MWIDTH_EDEFAULT;
			case OpenGL_DSLPackage.TEXTURE__MHEIGHT:
				return mHeight != MHEIGHT_EDEFAULT;
			case OpenGL_DSLPackage.TEXTURE__MID:
				return mId != MID_EDEFAULT;
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
		result.append(" (mWidth: ");
		result.append(mWidth);
		result.append(", mHeight: ");
		result.append(mHeight);
		result.append(", mId: ");
		result.append(mId);
		result.append(')');
		return result.toString();
	}

} //TextureImpl

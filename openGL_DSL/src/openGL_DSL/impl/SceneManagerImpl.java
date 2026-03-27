/**
 */
package openGL_DSL.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import openGL_DSL.Camera;
import openGL_DSL.OpenGL_DSLPackage;
import openGL_DSL.Scene;
import openGL_DSL.SceneManager;
import openGL_DSL.ViewPort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scene Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.impl.SceneManagerImpl#getWinId <em>Win Id</em>}</li>
 *   <li>{@link openGL_DSL.impl.SceneManagerImpl#getWinW <em>Win W</em>}</li>
 *   <li>{@link openGL_DSL.impl.SceneManagerImpl#getWinH <em>Win H</em>}</li>
 *   <li>{@link openGL_DSL.impl.SceneManagerImpl#getViewport <em>Viewport</em>}</li>
 *   <li>{@link openGL_DSL.impl.SceneManagerImpl#getCamera <em>Camera</em>}</li>
 *   <li>{@link openGL_DSL.impl.SceneManagerImpl#getScenes <em>Scenes</em>}</li>
 *   <li>{@link openGL_DSL.impl.SceneManagerImpl#isMStop <em>MStop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SceneManagerImpl extends MinimalEObjectImpl.Container implements SceneManager {
	/**
	 * The default value of the '{@link #getWinId() <em>Win Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinId()
	 * @generated
	 * @ordered
	 */
	protected static final int WIN_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWinId() <em>Win Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinId()
	 * @generated
	 * @ordered
	 */
	protected int winId = WIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWinW() <em>Win W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinW()
	 * @generated
	 * @ordered
	 */
	protected static final int WIN_W_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWinW() <em>Win W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinW()
	 * @generated
	 * @ordered
	 */
	protected int winW = WIN_W_EDEFAULT;

	/**
	 * The default value of the '{@link #getWinH() <em>Win H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinH()
	 * @generated
	 * @ordered
	 */
	protected static final int WIN_H_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWinH() <em>Win H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinH()
	 * @generated
	 * @ordered
	 */
	protected int winH = WIN_H_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViewport() <em>Viewport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewport()
	 * @generated
	 * @ordered
	 */
	protected ViewPort viewport;

	/**
	 * The cached value of the '{@link #getCamera() <em>Camera</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCamera()
	 * @generated
	 * @ordered
	 */
	protected Camera camera;

	/**
	 * The cached value of the '{@link #getScenes() <em>Scenes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenes()
	 * @generated
	 * @ordered
	 */
	protected EList<Scene> scenes;

	/**
	 * The default value of the '{@link #isMStop() <em>MStop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMStop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MSTOP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMStop() <em>MStop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMStop()
	 * @generated
	 * @ordered
	 */
	protected boolean mStop = MSTOP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SceneManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenGL_DSLPackage.Literals.SCENE_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWinId() {
		return winId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWinId(int newWinId) {
		int oldWinId = winId;
		winId = newWinId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.SCENE_MANAGER__WIN_ID, oldWinId, winId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWinW() {
		return winW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWinW(int newWinW) {
		int oldWinW = winW;
		winW = newWinW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.SCENE_MANAGER__WIN_W, oldWinW, winW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWinH() {
		return winH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWinH(int newWinH) {
		int oldWinH = winH;
		winH = newWinH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.SCENE_MANAGER__WIN_H, oldWinH, winH));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewPort getViewport() {
		return viewport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewport(ViewPort newViewport, NotificationChain msgs) {
		ViewPort oldViewport = viewport;
		viewport = newViewport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.SCENE_MANAGER__VIEWPORT, oldViewport, newViewport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewport(ViewPort newViewport) {
		if (newViewport != viewport) {
			NotificationChain msgs = null;
			if (viewport != null)
				msgs = ((InternalEObject)viewport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.SCENE_MANAGER__VIEWPORT, null, msgs);
			if (newViewport != null)
				msgs = ((InternalEObject)newViewport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.SCENE_MANAGER__VIEWPORT, null, msgs);
			msgs = basicSetViewport(newViewport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.SCENE_MANAGER__VIEWPORT, newViewport, newViewport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Camera getCamera() {
		return camera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCamera(Camera newCamera, NotificationChain msgs) {
		Camera oldCamera = camera;
		camera = newCamera;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.SCENE_MANAGER__CAMERA, oldCamera, newCamera);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCamera(Camera newCamera) {
		if (newCamera != camera) {
			NotificationChain msgs = null;
			if (camera != null)
				msgs = ((InternalEObject)camera).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.SCENE_MANAGER__CAMERA, null, msgs);
			if (newCamera != null)
				msgs = ((InternalEObject)newCamera).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.SCENE_MANAGER__CAMERA, null, msgs);
			msgs = basicSetCamera(newCamera, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.SCENE_MANAGER__CAMERA, newCamera, newCamera));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scene> getScenes() {
		if (scenes == null) {
			scenes = new EObjectContainmentEList<Scene>(Scene.class, this, OpenGL_DSLPackage.SCENE_MANAGER__SCENES);
		}
		return scenes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMStop() {
		return mStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMStop(boolean newMStop) {
		boolean oldMStop = mStop;
		mStop = newMStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.SCENE_MANAGER__MSTOP, oldMStop, mStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void run() {
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
	public void close() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenGL_DSLPackage.SCENE_MANAGER__VIEWPORT:
				return basicSetViewport(null, msgs);
			case OpenGL_DSLPackage.SCENE_MANAGER__CAMERA:
				return basicSetCamera(null, msgs);
			case OpenGL_DSLPackage.SCENE_MANAGER__SCENES:
				return ((InternalEList<?>)getScenes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenGL_DSLPackage.SCENE_MANAGER__WIN_ID:
				return getWinId();
			case OpenGL_DSLPackage.SCENE_MANAGER__WIN_W:
				return getWinW();
			case OpenGL_DSLPackage.SCENE_MANAGER__WIN_H:
				return getWinH();
			case OpenGL_DSLPackage.SCENE_MANAGER__VIEWPORT:
				return getViewport();
			case OpenGL_DSLPackage.SCENE_MANAGER__CAMERA:
				return getCamera();
			case OpenGL_DSLPackage.SCENE_MANAGER__SCENES:
				return getScenes();
			case OpenGL_DSLPackage.SCENE_MANAGER__MSTOP:
				return isMStop();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpenGL_DSLPackage.SCENE_MANAGER__WIN_ID:
				setWinId((Integer)newValue);
				return;
			case OpenGL_DSLPackage.SCENE_MANAGER__WIN_W:
				setWinW((Integer)newValue);
				return;
			case OpenGL_DSLPackage.SCENE_MANAGER__WIN_H:
				setWinH((Integer)newValue);
				return;
			case OpenGL_DSLPackage.SCENE_MANAGER__VIEWPORT:
				setViewport((ViewPort)newValue);
				return;
			case OpenGL_DSLPackage.SCENE_MANAGER__CAMERA:
				setCamera((Camera)newValue);
				return;
			case OpenGL_DSLPackage.SCENE_MANAGER__SCENES:
				getScenes().clear();
				getScenes().addAll((Collection<? extends Scene>)newValue);
				return;
			case OpenGL_DSLPackage.SCENE_MANAGER__MSTOP:
				setMStop((Boolean)newValue);
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
			case OpenGL_DSLPackage.SCENE_MANAGER__WIN_ID:
				setWinId(WIN_ID_EDEFAULT);
				return;
			case OpenGL_DSLPackage.SCENE_MANAGER__WIN_W:
				setWinW(WIN_W_EDEFAULT);
				return;
			case OpenGL_DSLPackage.SCENE_MANAGER__WIN_H:
				setWinH(WIN_H_EDEFAULT);
				return;
			case OpenGL_DSLPackage.SCENE_MANAGER__VIEWPORT:
				setViewport((ViewPort)null);
				return;
			case OpenGL_DSLPackage.SCENE_MANAGER__CAMERA:
				setCamera((Camera)null);
				return;
			case OpenGL_DSLPackage.SCENE_MANAGER__SCENES:
				getScenes().clear();
				return;
			case OpenGL_DSLPackage.SCENE_MANAGER__MSTOP:
				setMStop(MSTOP_EDEFAULT);
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
			case OpenGL_DSLPackage.SCENE_MANAGER__WIN_ID:
				return winId != WIN_ID_EDEFAULT;
			case OpenGL_DSLPackage.SCENE_MANAGER__WIN_W:
				return winW != WIN_W_EDEFAULT;
			case OpenGL_DSLPackage.SCENE_MANAGER__WIN_H:
				return winH != WIN_H_EDEFAULT;
			case OpenGL_DSLPackage.SCENE_MANAGER__VIEWPORT:
				return viewport != null;
			case OpenGL_DSLPackage.SCENE_MANAGER__CAMERA:
				return camera != null;
			case OpenGL_DSLPackage.SCENE_MANAGER__SCENES:
				return scenes != null && !scenes.isEmpty();
			case OpenGL_DSLPackage.SCENE_MANAGER__MSTOP:
				return mStop != MSTOP_EDEFAULT;
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
			case OpenGL_DSLPackage.SCENE_MANAGER___RUN:
				run();
				return null;
			case OpenGL_DSLPackage.SCENE_MANAGER___CLOSE:
				close();
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (WinId: ");
		result.append(winId);
		result.append(", WinW: ");
		result.append(winW);
		result.append(", WinH: ");
		result.append(winH);
		result.append(", mStop: ");
		result.append(mStop);
		result.append(')');
		return result.toString();
	}

} //SceneManagerImpl

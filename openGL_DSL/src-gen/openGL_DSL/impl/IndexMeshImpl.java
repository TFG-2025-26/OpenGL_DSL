/**
 */
package openGL_DSL.impl;

import java.lang.reflect.InvocationTargetException;

import openGL_DSL.IndexMesh;
import openGL_DSL.OpenGL_DSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index Mesh</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.impl.IndexMeshImpl#getVIndices <em>VIndices</em>}</li>
 *   <li>{@link openGL_DSL.impl.IndexMeshImpl#getNNumIndices <em>NNum Indices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndexMeshImpl extends MeshImpl implements IndexMesh {
	/**
	 * The default value of the '{@link #getVIndices() <em>VIndices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVIndices()
	 * @generated
	 * @ordered
	 */
	protected static final Object VINDICES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVIndices() <em>VIndices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVIndices()
	 * @generated
	 * @ordered
	 */
	protected Object vIndices = VINDICES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNNumIndices() <em>NNum Indices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNNumIndices()
	 * @generated
	 * @ordered
	 */
	protected static final Object NNUM_INDICES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNNumIndices() <em>NNum Indices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNNumIndices()
	 * @generated
	 * @ordered
	 */
	protected Object nNumIndices = NNUM_INDICES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexMeshImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenGL_DSLPackage.Literals.INDEX_MESH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getVIndices() {
		return vIndices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVIndices(Object newVIndices) {
		Object oldVIndices = vIndices;
		vIndices = newVIndices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.INDEX_MESH__VINDICES, oldVIndices,
					vIndices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getNNumIndices() {
		return nNumIndices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNNumIndices(Object newNNumIndices) {
		Object oldNNumIndices = nNumIndices;
		nNumIndices = newNNumIndices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.INDEX_MESH__NNUM_INDICES,
					oldNNumIndices, nNumIndices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void buildNormalVectors() {
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
		case OpenGL_DSLPackage.INDEX_MESH__VINDICES:
			return getVIndices();
		case OpenGL_DSLPackage.INDEX_MESH__NNUM_INDICES:
			return getNNumIndices();
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
		case OpenGL_DSLPackage.INDEX_MESH__VINDICES:
			setVIndices(newValue);
			return;
		case OpenGL_DSLPackage.INDEX_MESH__NNUM_INDICES:
			setNNumIndices(newValue);
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
		case OpenGL_DSLPackage.INDEX_MESH__VINDICES:
			setVIndices(VINDICES_EDEFAULT);
			return;
		case OpenGL_DSLPackage.INDEX_MESH__NNUM_INDICES:
			setNNumIndices(NNUM_INDICES_EDEFAULT);
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
		case OpenGL_DSLPackage.INDEX_MESH__VINDICES:
			return VINDICES_EDEFAULT == null ? vIndices != null : !VINDICES_EDEFAULT.equals(vIndices);
		case OpenGL_DSLPackage.INDEX_MESH__NNUM_INDICES:
			return NNUM_INDICES_EDEFAULT == null ? nNumIndices != null : !NNUM_INDICES_EDEFAULT.equals(nNumIndices);
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
		case OpenGL_DSLPackage.INDEX_MESH___BUILD_NORMAL_VECTORS:
			buildNormalVectors();
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
		result.append(" (vIndices: ");
		result.append(vIndices);
		result.append(", nNumIndices: ");
		result.append(nNumIndices);
		result.append(')');
		return result.toString();
	}

} //IndexMeshImpl

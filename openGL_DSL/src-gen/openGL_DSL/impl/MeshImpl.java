/**
 */
package openGL_DSL.impl;

import java.lang.reflect.InvocationTargetException;

import openGL_DSL.Mesh;
import openGL_DSL.OpenGL_DSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mesh</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.impl.MeshImpl#getMPrimitive <em>MPrimitive</em>}</li>
 *   <li>{@link openGL_DSL.impl.MeshImpl#getNNumVertices <em>NNum Vertices</em>}</li>
 *   <li>{@link openGL_DSL.impl.MeshImpl#getVColors <em>VColors</em>}</li>
 *   <li>{@link openGL_DSL.impl.MeshImpl#getVVertices <em>VVertices</em>}</li>
 *   <li>{@link openGL_DSL.impl.MeshImpl#getVTexCoords <em>VTex Coords</em>}</li>
 *   <li>{@link openGL_DSL.impl.MeshImpl#getVNormals <em>VNormals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeshImpl extends MinimalEObjectImpl.Container implements Mesh {
	/**
	 * The default value of the '{@link #getMPrimitive() <em>MPrimitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPrimitive()
	 * @generated
	 * @ordered
	 */
	protected static final Object MPRIMITIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMPrimitive() <em>MPrimitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPrimitive()
	 * @generated
	 * @ordered
	 */
	protected Object mPrimitive = MPRIMITIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNNumVertices() <em>NNum Vertices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNNumVertices()
	 * @generated
	 * @ordered
	 */
	protected static final Object NNUM_VERTICES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNNumVertices() <em>NNum Vertices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNNumVertices()
	 * @generated
	 * @ordered
	 */
	protected Object nNumVertices = NNUM_VERTICES_EDEFAULT;

	/**
	 * The default value of the '{@link #getVColors() <em>VColors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVColors()
	 * @generated
	 * @ordered
	 */
	protected static final Object VCOLORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVColors() <em>VColors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVColors()
	 * @generated
	 * @ordered
	 */
	protected Object vColors = VCOLORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVVertices() <em>VVertices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVVertices()
	 * @generated
	 * @ordered
	 */
	protected static final Object VVERTICES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVVertices() <em>VVertices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVVertices()
	 * @generated
	 * @ordered
	 */
	protected Object vVertices = VVERTICES_EDEFAULT;

	/**
	 * The default value of the '{@link #getVTexCoords() <em>VTex Coords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVTexCoords()
	 * @generated
	 * @ordered
	 */
	protected static final Object VTEX_COORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVTexCoords() <em>VTex Coords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVTexCoords()
	 * @generated
	 * @ordered
	 */
	protected Object vTexCoords = VTEX_COORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVNormals() <em>VNormals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVNormals()
	 * @generated
	 * @ordered
	 */
	protected static final Object VNORMALS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVNormals() <em>VNormals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVNormals()
	 * @generated
	 * @ordered
	 */
	protected Object vNormals = VNORMALS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeshImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenGL_DSLPackage.Literals.MESH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getMPrimitive() {
		return mPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMPrimitive(Object newMPrimitive) {
		Object oldMPrimitive = mPrimitive;
		mPrimitive = newMPrimitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.MESH__MPRIMITIVE, oldMPrimitive,
					mPrimitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getNNumVertices() {
		return nNumVertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNNumVertices(Object newNNumVertices) {
		Object oldNNumVertices = nNumVertices;
		nNumVertices = newNNumVertices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.MESH__NNUM_VERTICES,
					oldNNumVertices, nNumVertices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getVColors() {
		return vColors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVColors(Object newVColors) {
		Object oldVColors = vColors;
		vColors = newVColors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.MESH__VCOLORS, oldVColors,
					vColors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getVVertices() {
		return vVertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVVertices(Object newVVertices) {
		Object oldVVertices = vVertices;
		vVertices = newVVertices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.MESH__VVERTICES, oldVVertices,
					vVertices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getVTexCoords() {
		return vTexCoords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVTexCoords(Object newVTexCoords) {
		Object oldVTexCoords = vTexCoords;
		vTexCoords = newVTexCoords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.MESH__VTEX_COORDS, oldVTexCoords,
					vTexCoords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getVNormals() {
		return vNormals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVNormals(Object newVNormals) {
		Object oldVNormals = vNormals;
		vNormals = newVNormals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.MESH__VNORMALS, oldVNormals,
					vNormals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object mNumVertices() {
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
	public void render() {
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
		case OpenGL_DSLPackage.MESH__MPRIMITIVE:
			return getMPrimitive();
		case OpenGL_DSLPackage.MESH__NNUM_VERTICES:
			return getNNumVertices();
		case OpenGL_DSLPackage.MESH__VCOLORS:
			return getVColors();
		case OpenGL_DSLPackage.MESH__VVERTICES:
			return getVVertices();
		case OpenGL_DSLPackage.MESH__VTEX_COORDS:
			return getVTexCoords();
		case OpenGL_DSLPackage.MESH__VNORMALS:
			return getVNormals();
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
		case OpenGL_DSLPackage.MESH__MPRIMITIVE:
			setMPrimitive(newValue);
			return;
		case OpenGL_DSLPackage.MESH__NNUM_VERTICES:
			setNNumVertices(newValue);
			return;
		case OpenGL_DSLPackage.MESH__VCOLORS:
			setVColors(newValue);
			return;
		case OpenGL_DSLPackage.MESH__VVERTICES:
			setVVertices(newValue);
			return;
		case OpenGL_DSLPackage.MESH__VTEX_COORDS:
			setVTexCoords(newValue);
			return;
		case OpenGL_DSLPackage.MESH__VNORMALS:
			setVNormals(newValue);
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
		case OpenGL_DSLPackage.MESH__MPRIMITIVE:
			setMPrimitive(MPRIMITIVE_EDEFAULT);
			return;
		case OpenGL_DSLPackage.MESH__NNUM_VERTICES:
			setNNumVertices(NNUM_VERTICES_EDEFAULT);
			return;
		case OpenGL_DSLPackage.MESH__VCOLORS:
			setVColors(VCOLORS_EDEFAULT);
			return;
		case OpenGL_DSLPackage.MESH__VVERTICES:
			setVVertices(VVERTICES_EDEFAULT);
			return;
		case OpenGL_DSLPackage.MESH__VTEX_COORDS:
			setVTexCoords(VTEX_COORDS_EDEFAULT);
			return;
		case OpenGL_DSLPackage.MESH__VNORMALS:
			setVNormals(VNORMALS_EDEFAULT);
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
		case OpenGL_DSLPackage.MESH__MPRIMITIVE:
			return MPRIMITIVE_EDEFAULT == null ? mPrimitive != null : !MPRIMITIVE_EDEFAULT.equals(mPrimitive);
		case OpenGL_DSLPackage.MESH__NNUM_VERTICES:
			return NNUM_VERTICES_EDEFAULT == null ? nNumVertices != null : !NNUM_VERTICES_EDEFAULT.equals(nNumVertices);
		case OpenGL_DSLPackage.MESH__VCOLORS:
			return VCOLORS_EDEFAULT == null ? vColors != null : !VCOLORS_EDEFAULT.equals(vColors);
		case OpenGL_DSLPackage.MESH__VVERTICES:
			return VVERTICES_EDEFAULT == null ? vVertices != null : !VVERTICES_EDEFAULT.equals(vVertices);
		case OpenGL_DSLPackage.MESH__VTEX_COORDS:
			return VTEX_COORDS_EDEFAULT == null ? vTexCoords != null : !VTEX_COORDS_EDEFAULT.equals(vTexCoords);
		case OpenGL_DSLPackage.MESH__VNORMALS:
			return VNORMALS_EDEFAULT == null ? vNormals != null : !VNORMALS_EDEFAULT.equals(vNormals);
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
		case OpenGL_DSLPackage.MESH___MNUM_VERTICES:
			return mNumVertices();
		case OpenGL_DSLPackage.MESH___RENDER:
			render();
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
		result.append(" (mPrimitive: ");
		result.append(mPrimitive);
		result.append(", nNumVertices: ");
		result.append(nNumVertices);
		result.append(", vColors: ");
		result.append(vColors);
		result.append(", vVertices: ");
		result.append(vVertices);
		result.append(", vTexCoords: ");
		result.append(vTexCoords);
		result.append(", vNormals: ");
		result.append(vNormals);
		result.append(')');
		return result.toString();
	}

} //MeshImpl

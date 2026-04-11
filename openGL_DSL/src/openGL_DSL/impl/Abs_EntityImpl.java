/**
 */
package openGL_DSL.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import openGL_DSL.Abs_Entity;
import openGL_DSL.Material;
import openGL_DSL.Mesh;
import openGL_DSL.OpenGL_DSLPackage;
import openGL_DSL.Texture;
import openGL_DSL.Vector4;

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
 * An implementation of the model object '<em><b>Abs Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.impl.Abs_EntityImpl#getTexture <em>Texture</em>}</li>
 *   <li>{@link openGL_DSL.impl.Abs_EntityImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link openGL_DSL.impl.Abs_EntityImpl#getMesh <em>Mesh</em>}</li>
 *   <li>{@link openGL_DSL.impl.Abs_EntityImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Abs_EntityImpl extends MinimalEObjectImpl.Container implements Abs_Entity {
	/**
	 * The cached value of the '{@link #getTexture() <em>Texture</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexture()
	 * @generated
	 * @ordered
	 */
	protected EList<Texture> texture;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected Material material;

	/**
	 * The cached value of the '{@link #getMesh() <em>Mesh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesh()
	 * @generated
	 * @ordered
	 */
	protected Mesh mesh;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Vector4 color;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Abs_EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenGL_DSLPackage.Literals.ABS_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Texture> getTexture() {
		if (texture == null) {
			texture = new EObjectContainmentEList<Texture>(Texture.class, this, OpenGL_DSLPackage.ABS_ENTITY__TEXTURE);
		}
		return texture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Material getMaterial() {
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterial(Material newMaterial, NotificationChain msgs) {
		Material oldMaterial = material;
		material = newMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.ABS_ENTITY__MATERIAL, oldMaterial, newMaterial);
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
	public void setMaterial(Material newMaterial) {
		if (newMaterial != material) {
			NotificationChain msgs = null;
			if (material != null)
				msgs = ((InternalEObject)material).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.ABS_ENTITY__MATERIAL, null, msgs);
			if (newMaterial != null)
				msgs = ((InternalEObject)newMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.ABS_ENTITY__MATERIAL, null, msgs);
			msgs = basicSetMaterial(newMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.ABS_ENTITY__MATERIAL, newMaterial, newMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mesh getMesh() {
		return mesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMesh(Mesh newMesh, NotificationChain msgs) {
		Mesh oldMesh = mesh;
		mesh = newMesh;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.ABS_ENTITY__MESH, oldMesh, newMesh);
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
	public void setMesh(Mesh newMesh) {
		if (newMesh != mesh) {
			NotificationChain msgs = null;
			if (mesh != null)
				msgs = ((InternalEObject)mesh).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.ABS_ENTITY__MESH, null, msgs);
			if (newMesh != null)
				msgs = ((InternalEObject)newMesh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.ABS_ENTITY__MESH, null, msgs);
			msgs = basicSetMesh(newMesh, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.ABS_ENTITY__MESH, newMesh, newMesh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vector4 getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColor(Vector4 newColor, NotificationChain msgs) {
		Vector4 oldColor = color;
		color = newColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.ABS_ENTITY__COLOR, oldColor, newColor);
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
	public void setColor(Vector4 newColor) {
		if (newColor != color) {
			NotificationChain msgs = null;
			if (color != null)
				msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.ABS_ENTITY__COLOR, null, msgs);
			if (newColor != null)
				msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.ABS_ENTITY__COLOR, null, msgs);
			msgs = basicSetColor(newColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.ABS_ENTITY__COLOR, newColor, newColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void render(Object modelViewMat) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenGL_DSLPackage.ABS_ENTITY__TEXTURE:
				return ((InternalEList<?>)getTexture()).basicRemove(otherEnd, msgs);
			case OpenGL_DSLPackage.ABS_ENTITY__MATERIAL:
				return basicSetMaterial(null, msgs);
			case OpenGL_DSLPackage.ABS_ENTITY__MESH:
				return basicSetMesh(null, msgs);
			case OpenGL_DSLPackage.ABS_ENTITY__COLOR:
				return basicSetColor(null, msgs);
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
			case OpenGL_DSLPackage.ABS_ENTITY__TEXTURE:
				return getTexture();
			case OpenGL_DSLPackage.ABS_ENTITY__MATERIAL:
				return getMaterial();
			case OpenGL_DSLPackage.ABS_ENTITY__MESH:
				return getMesh();
			case OpenGL_DSLPackage.ABS_ENTITY__COLOR:
				return getColor();
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
			case OpenGL_DSLPackage.ABS_ENTITY__TEXTURE:
				getTexture().clear();
				getTexture().addAll((Collection<? extends Texture>)newValue);
				return;
			case OpenGL_DSLPackage.ABS_ENTITY__MATERIAL:
				setMaterial((Material)newValue);
				return;
			case OpenGL_DSLPackage.ABS_ENTITY__MESH:
				setMesh((Mesh)newValue);
				return;
			case OpenGL_DSLPackage.ABS_ENTITY__COLOR:
				setColor((Vector4)newValue);
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
			case OpenGL_DSLPackage.ABS_ENTITY__TEXTURE:
				getTexture().clear();
				return;
			case OpenGL_DSLPackage.ABS_ENTITY__MATERIAL:
				setMaterial((Material)null);
				return;
			case OpenGL_DSLPackage.ABS_ENTITY__MESH:
				setMesh((Mesh)null);
				return;
			case OpenGL_DSLPackage.ABS_ENTITY__COLOR:
				setColor((Vector4)null);
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
			case OpenGL_DSLPackage.ABS_ENTITY__TEXTURE:
				return texture != null && !texture.isEmpty();
			case OpenGL_DSLPackage.ABS_ENTITY__MATERIAL:
				return material != null;
			case OpenGL_DSLPackage.ABS_ENTITY__MESH:
				return mesh != null;
			case OpenGL_DSLPackage.ABS_ENTITY__COLOR:
				return color != null;
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
			case OpenGL_DSLPackage.ABS_ENTITY___RENDER__OBJECT:
				render(arguments.get(0));
				return null;
			case OpenGL_DSLPackage.ABS_ENTITY___UPLOAD:
				upload();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //Abs_EntityImpl

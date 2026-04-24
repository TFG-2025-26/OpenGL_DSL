/**
 */
package openGL_DSL.impl;

import java.lang.reflect.InvocationTargetException;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abs Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.impl.Abs_EntityImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link openGL_DSL.impl.Abs_EntityImpl#getMesh <em>Mesh</em>}</li>
 *   <li>{@link openGL_DSL.impl.Abs_EntityImpl#getColor <em>Color</em>}</li>
 *   <li>{@link openGL_DSL.impl.Abs_EntityImpl#getFrontTexture <em>Front Texture</em>}</li>
 *   <li>{@link openGL_DSL.impl.Abs_EntityImpl#getBackTexture <em>Back Texture</em>}</li>
 *   <li>{@link openGL_DSL.impl.Abs_EntityImpl#getTexturaRepeticionAncho <em>Textura Repeticion Ancho</em>}</li>
 *   <li>{@link openGL_DSL.impl.Abs_EntityImpl#getTexturaRepeticionAlto <em>Textura Repeticion Alto</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Abs_EntityImpl extends MinimalEObjectImpl.Container implements Abs_Entity {
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
	 * The cached value of the '{@link #getFrontTexture() <em>Front Texture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontTexture()
	 * @generated
	 * @ordered
	 */
	protected Texture frontTexture;

	/**
	 * The cached value of the '{@link #getBackTexture() <em>Back Texture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackTexture()
	 * @generated
	 * @ordered
	 */
	protected Texture backTexture;

	/**
	 * The default value of the '{@link #getTexturaRepeticionAncho() <em>Textura Repeticion Ancho</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexturaRepeticionAncho()
	 * @generated
	 * @ordered
	 */
	protected static final int TEXTURA_REPETICION_ANCHO_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTexturaRepeticionAncho() <em>Textura Repeticion Ancho</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexturaRepeticionAncho()
	 * @generated
	 * @ordered
	 */
	protected int texturaRepeticionAncho = TEXTURA_REPETICION_ANCHO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTexturaRepeticionAlto() <em>Textura Repeticion Alto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexturaRepeticionAlto()
	 * @generated
	 * @ordered
	 */
	protected static final int TEXTURA_REPETICION_ALTO_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTexturaRepeticionAlto() <em>Textura Repeticion Alto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexturaRepeticionAlto()
	 * @generated
	 * @ordered
	 */
	protected int texturaRepeticionAlto = TEXTURA_REPETICION_ALTO_EDEFAULT;

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
	public Texture getFrontTexture() {
		return frontTexture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrontTexture(Texture newFrontTexture, NotificationChain msgs) {
		Texture oldFrontTexture = frontTexture;
		frontTexture = newFrontTexture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.ABS_ENTITY__FRONT_TEXTURE, oldFrontTexture, newFrontTexture);
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
	public void setFrontTexture(Texture newFrontTexture) {
		if (newFrontTexture != frontTexture) {
			NotificationChain msgs = null;
			if (frontTexture != null)
				msgs = ((InternalEObject)frontTexture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.ABS_ENTITY__FRONT_TEXTURE, null, msgs);
			if (newFrontTexture != null)
				msgs = ((InternalEObject)newFrontTexture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.ABS_ENTITY__FRONT_TEXTURE, null, msgs);
			msgs = basicSetFrontTexture(newFrontTexture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.ABS_ENTITY__FRONT_TEXTURE, newFrontTexture, newFrontTexture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Texture getBackTexture() {
		return backTexture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackTexture(Texture newBackTexture, NotificationChain msgs) {
		Texture oldBackTexture = backTexture;
		backTexture = newBackTexture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.ABS_ENTITY__BACK_TEXTURE, oldBackTexture, newBackTexture);
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
	public void setBackTexture(Texture newBackTexture) {
		if (newBackTexture != backTexture) {
			NotificationChain msgs = null;
			if (backTexture != null)
				msgs = ((InternalEObject)backTexture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.ABS_ENTITY__BACK_TEXTURE, null, msgs);
			if (newBackTexture != null)
				msgs = ((InternalEObject)newBackTexture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenGL_DSLPackage.ABS_ENTITY__BACK_TEXTURE, null, msgs);
			msgs = basicSetBackTexture(newBackTexture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.ABS_ENTITY__BACK_TEXTURE, newBackTexture, newBackTexture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTexturaRepeticionAncho() {
		return texturaRepeticionAncho;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTexturaRepeticionAncho(int newTexturaRepeticionAncho) {
		int oldTexturaRepeticionAncho = texturaRepeticionAncho;
		texturaRepeticionAncho = newTexturaRepeticionAncho;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.ABS_ENTITY__TEXTURA_REPETICION_ANCHO, oldTexturaRepeticionAncho, texturaRepeticionAncho));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTexturaRepeticionAlto() {
		return texturaRepeticionAlto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTexturaRepeticionAlto(int newTexturaRepeticionAlto) {
		int oldTexturaRepeticionAlto = texturaRepeticionAlto;
		texturaRepeticionAlto = newTexturaRepeticionAlto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.ABS_ENTITY__TEXTURA_REPETICION_ALTO, oldTexturaRepeticionAlto, texturaRepeticionAlto));
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
			case OpenGL_DSLPackage.ABS_ENTITY__MATERIAL:
				return basicSetMaterial(null, msgs);
			case OpenGL_DSLPackage.ABS_ENTITY__MESH:
				return basicSetMesh(null, msgs);
			case OpenGL_DSLPackage.ABS_ENTITY__COLOR:
				return basicSetColor(null, msgs);
			case OpenGL_DSLPackage.ABS_ENTITY__FRONT_TEXTURE:
				return basicSetFrontTexture(null, msgs);
			case OpenGL_DSLPackage.ABS_ENTITY__BACK_TEXTURE:
				return basicSetBackTexture(null, msgs);
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
			case OpenGL_DSLPackage.ABS_ENTITY__MATERIAL:
				return getMaterial();
			case OpenGL_DSLPackage.ABS_ENTITY__MESH:
				return getMesh();
			case OpenGL_DSLPackage.ABS_ENTITY__COLOR:
				return getColor();
			case OpenGL_DSLPackage.ABS_ENTITY__FRONT_TEXTURE:
				return getFrontTexture();
			case OpenGL_DSLPackage.ABS_ENTITY__BACK_TEXTURE:
				return getBackTexture();
			case OpenGL_DSLPackage.ABS_ENTITY__TEXTURA_REPETICION_ANCHO:
				return getTexturaRepeticionAncho();
			case OpenGL_DSLPackage.ABS_ENTITY__TEXTURA_REPETICION_ALTO:
				return getTexturaRepeticionAlto();
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
			case OpenGL_DSLPackage.ABS_ENTITY__MATERIAL:
				setMaterial((Material)newValue);
				return;
			case OpenGL_DSLPackage.ABS_ENTITY__MESH:
				setMesh((Mesh)newValue);
				return;
			case OpenGL_DSLPackage.ABS_ENTITY__COLOR:
				setColor((Vector4)newValue);
				return;
			case OpenGL_DSLPackage.ABS_ENTITY__FRONT_TEXTURE:
				setFrontTexture((Texture)newValue);
				return;
			case OpenGL_DSLPackage.ABS_ENTITY__BACK_TEXTURE:
				setBackTexture((Texture)newValue);
				return;
			case OpenGL_DSLPackage.ABS_ENTITY__TEXTURA_REPETICION_ANCHO:
				setTexturaRepeticionAncho((Integer)newValue);
				return;
			case OpenGL_DSLPackage.ABS_ENTITY__TEXTURA_REPETICION_ALTO:
				setTexturaRepeticionAlto((Integer)newValue);
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
			case OpenGL_DSLPackage.ABS_ENTITY__MATERIAL:
				setMaterial((Material)null);
				return;
			case OpenGL_DSLPackage.ABS_ENTITY__MESH:
				setMesh((Mesh)null);
				return;
			case OpenGL_DSLPackage.ABS_ENTITY__COLOR:
				setColor((Vector4)null);
				return;
			case OpenGL_DSLPackage.ABS_ENTITY__FRONT_TEXTURE:
				setFrontTexture((Texture)null);
				return;
			case OpenGL_DSLPackage.ABS_ENTITY__BACK_TEXTURE:
				setBackTexture((Texture)null);
				return;
			case OpenGL_DSLPackage.ABS_ENTITY__TEXTURA_REPETICION_ANCHO:
				setTexturaRepeticionAncho(TEXTURA_REPETICION_ANCHO_EDEFAULT);
				return;
			case OpenGL_DSLPackage.ABS_ENTITY__TEXTURA_REPETICION_ALTO:
				setTexturaRepeticionAlto(TEXTURA_REPETICION_ALTO_EDEFAULT);
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
			case OpenGL_DSLPackage.ABS_ENTITY__MATERIAL:
				return material != null;
			case OpenGL_DSLPackage.ABS_ENTITY__MESH:
				return mesh != null;
			case OpenGL_DSLPackage.ABS_ENTITY__COLOR:
				return color != null;
			case OpenGL_DSLPackage.ABS_ENTITY__FRONT_TEXTURE:
				return frontTexture != null;
			case OpenGL_DSLPackage.ABS_ENTITY__BACK_TEXTURE:
				return backTexture != null;
			case OpenGL_DSLPackage.ABS_ENTITY__TEXTURA_REPETICION_ANCHO:
				return texturaRepeticionAncho != TEXTURA_REPETICION_ANCHO_EDEFAULT;
			case OpenGL_DSLPackage.ABS_ENTITY__TEXTURA_REPETICION_ALTO:
				return texturaRepeticionAlto != TEXTURA_REPETICION_ALTO_EDEFAULT;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (TexturaRepeticionAncho: ");
		result.append(texturaRepeticionAncho);
		result.append(", TexturaRepeticionAlto: ");
		result.append(texturaRepeticionAlto);
		result.append(')');
		return result.toString();
	}

} //Abs_EntityImpl

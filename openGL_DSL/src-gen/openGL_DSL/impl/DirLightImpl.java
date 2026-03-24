/**
 */
package openGL_DSL.impl;

import java.lang.reflect.InvocationTargetException;

import openGL_DSL.DirLight;
import openGL_DSL.OpenGL_DSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dir Light</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.impl.DirLightImpl#getCont <em>Cont</em>}</li>
 *   <li>{@link openGL_DSL.impl.DirLightImpl#getId <em>Id</em>}</li>
 *   <li>{@link openGL_DSL.impl.DirLightImpl#getAmbient <em>Ambient</em>}</li>
 *   <li>{@link openGL_DSL.impl.DirLightImpl#getDifusse <em>Difusse</em>}</li>
 *   <li>{@link openGL_DSL.impl.DirLightImpl#getSpecular <em>Specular</em>}</li>
 *   <li>{@link openGL_DSL.impl.DirLightImpl#getPosDIr <em>Pos DIr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirLightImpl extends MinimalEObjectImpl.Container implements DirLight {
	/**
	 * The default value of the '{@link #getCont() <em>Cont</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCont()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCont() <em>Cont</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCont()
	 * @generated
	 * @ordered
	 */
	protected Object cont = CONT_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Object ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Object id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmbient() <em>Ambient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbient()
	 * @generated
	 * @ordered
	 */
	protected static final Object AMBIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmbient() <em>Ambient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbient()
	 * @generated
	 * @ordered
	 */
	protected Object ambient = AMBIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDifusse() <em>Difusse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifusse()
	 * @generated
	 * @ordered
	 */
	protected static final Object DIFUSSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDifusse() <em>Difusse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifusse()
	 * @generated
	 * @ordered
	 */
	protected Object difusse = DIFUSSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecular() <em>Specular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecular()
	 * @generated
	 * @ordered
	 */
	protected static final Object SPECULAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecular() <em>Specular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecular()
	 * @generated
	 * @ordered
	 */
	protected Object specular = SPECULAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosDIr() <em>Pos DIr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosDIr()
	 * @generated
	 * @ordered
	 */
	protected static final Object POS_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosDIr() <em>Pos DIr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosDIr()
	 * @generated
	 * @ordered
	 */
	protected Object posDIr = POS_DIR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirLightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenGL_DSLPackage.Literals.DIR_LIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getCont() {
		return cont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCont(Object newCont) {
		Object oldCont = cont;
		cont = newCont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.DIR_LIGHT__CONT, oldCont, cont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Object newId) {
		Object oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.DIR_LIGHT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAmbient() {
		return ambient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmbient(Object newAmbient) {
		Object oldAmbient = ambient;
		ambient = newAmbient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.DIR_LIGHT__AMBIENT, oldAmbient,
					ambient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getDifusse() {
		return difusse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDifusse(Object newDifusse) {
		Object oldDifusse = difusse;
		difusse = newDifusse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.DIR_LIGHT__DIFUSSE, oldDifusse,
					difusse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getSpecular() {
		return specular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecular(Object newSpecular) {
		Object oldSpecular = specular;
		specular = newSpecular;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.DIR_LIGHT__SPECULAR, oldSpecular,
					specular));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getPosDIr() {
		return posDIr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosDIr(Object newPosDIr) {
		Object oldPosDIr = posDIr;
		posDIr = newPosDIr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenGL_DSLPackage.DIR_LIGHT__POS_DIR, oldPosDIr,
					posDIr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void uploadL(Object modelViewMat) {
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
	public void disable() {
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
	public void enable() {
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
		case OpenGL_DSLPackage.DIR_LIGHT__CONT:
			return getCont();
		case OpenGL_DSLPackage.DIR_LIGHT__ID:
			return getId();
		case OpenGL_DSLPackage.DIR_LIGHT__AMBIENT:
			return getAmbient();
		case OpenGL_DSLPackage.DIR_LIGHT__DIFUSSE:
			return getDifusse();
		case OpenGL_DSLPackage.DIR_LIGHT__SPECULAR:
			return getSpecular();
		case OpenGL_DSLPackage.DIR_LIGHT__POS_DIR:
			return getPosDIr();
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
		case OpenGL_DSLPackage.DIR_LIGHT__CONT:
			setCont(newValue);
			return;
		case OpenGL_DSLPackage.DIR_LIGHT__ID:
			setId(newValue);
			return;
		case OpenGL_DSLPackage.DIR_LIGHT__AMBIENT:
			setAmbient(newValue);
			return;
		case OpenGL_DSLPackage.DIR_LIGHT__DIFUSSE:
			setDifusse(newValue);
			return;
		case OpenGL_DSLPackage.DIR_LIGHT__SPECULAR:
			setSpecular(newValue);
			return;
		case OpenGL_DSLPackage.DIR_LIGHT__POS_DIR:
			setPosDIr(newValue);
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
		case OpenGL_DSLPackage.DIR_LIGHT__CONT:
			setCont(CONT_EDEFAULT);
			return;
		case OpenGL_DSLPackage.DIR_LIGHT__ID:
			setId(ID_EDEFAULT);
			return;
		case OpenGL_DSLPackage.DIR_LIGHT__AMBIENT:
			setAmbient(AMBIENT_EDEFAULT);
			return;
		case OpenGL_DSLPackage.DIR_LIGHT__DIFUSSE:
			setDifusse(DIFUSSE_EDEFAULT);
			return;
		case OpenGL_DSLPackage.DIR_LIGHT__SPECULAR:
			setSpecular(SPECULAR_EDEFAULT);
			return;
		case OpenGL_DSLPackage.DIR_LIGHT__POS_DIR:
			setPosDIr(POS_DIR_EDEFAULT);
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
		case OpenGL_DSLPackage.DIR_LIGHT__CONT:
			return CONT_EDEFAULT == null ? cont != null : !CONT_EDEFAULT.equals(cont);
		case OpenGL_DSLPackage.DIR_LIGHT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case OpenGL_DSLPackage.DIR_LIGHT__AMBIENT:
			return AMBIENT_EDEFAULT == null ? ambient != null : !AMBIENT_EDEFAULT.equals(ambient);
		case OpenGL_DSLPackage.DIR_LIGHT__DIFUSSE:
			return DIFUSSE_EDEFAULT == null ? difusse != null : !DIFUSSE_EDEFAULT.equals(difusse);
		case OpenGL_DSLPackage.DIR_LIGHT__SPECULAR:
			return SPECULAR_EDEFAULT == null ? specular != null : !SPECULAR_EDEFAULT.equals(specular);
		case OpenGL_DSLPackage.DIR_LIGHT__POS_DIR:
			return POS_DIR_EDEFAULT == null ? posDIr != null : !POS_DIR_EDEFAULT.equals(posDIr);
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
		case OpenGL_DSLPackage.DIR_LIGHT___UPLOAD_L__OBJECT:
			uploadL(arguments.get(0));
			return null;
		case OpenGL_DSLPackage.DIR_LIGHT___DISABLE:
			disable();
			return null;
		case OpenGL_DSLPackage.DIR_LIGHT___ENABLE:
			enable();
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
		result.append(" (cont: ");
		result.append(cont);
		result.append(", id: ");
		result.append(id);
		result.append(", ambient: ");
		result.append(ambient);
		result.append(", difusse: ");
		result.append(difusse);
		result.append(", specular: ");
		result.append(specular);
		result.append(", posDIr: ");
		result.append(posDIr);
		result.append(')');
		return result.toString();
	}

} //DirLightImpl

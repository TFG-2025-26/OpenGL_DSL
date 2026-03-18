/**
 */
package openGL_DSL.util;

import openGL_DSL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see openGL_DSL.OpenGL_DSLPackage
 * @generated
 */
public class OpenGL_DSLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OpenGL_DSLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenGL_DSLSwitch() {
		if (modelPackage == null) {
			modelPackage = OpenGL_DSLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case OpenGL_DSLPackage.SCENE_MANAGER: {
			SceneManager sceneManager = (SceneManager) theEObject;
			T result = caseSceneManager(sceneManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OpenGL_DSLPackage.VIEW_PORT: {
			ViewPort viewPort = (ViewPort) theEObject;
			T result = caseViewPort(viewPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OpenGL_DSLPackage.CAMERA: {
			Camera camera = (Camera) theEObject;
			T result = caseCamera(camera);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OpenGL_DSLPackage.SCENE: {
			Scene scene = (Scene) theEObject;
			T result = caseScene(scene);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OpenGL_DSLPackage.LIGHT: {
			Light light = (Light) theEObject;
			T result = caseLight(light);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OpenGL_DSLPackage.DIR_LIGHT: {
			DirLight dirLight = (DirLight) theEObject;
			T result = caseDirLight(dirLight);
			if (result == null)
				result = caseLight(dirLight);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OpenGL_DSLPackage.POS_LIGHT: {
			PosLight posLight = (PosLight) theEObject;
			T result = casePosLight(posLight);
			if (result == null)
				result = caseLight(posLight);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OpenGL_DSLPackage.SPOT_LIGHT: {
			SpotLight spotLight = (SpotLight) theEObject;
			T result = caseSpotLight(spotLight);
			if (result == null)
				result = casePosLight(spotLight);
			if (result == null)
				result = caseLight(spotLight);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OpenGL_DSLPackage.NODE: {
			Node node = (Node) theEObject;
			T result = caseNode(node);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OpenGL_DSLPackage.ABS_ENTITY: {
			Abs_Entity abs_Entity = (Abs_Entity) theEObject;
			T result = caseAbs_Entity(abs_Entity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OpenGL_DSLPackage.QUADRIC_ENTITY: {
			QuadricEntity quadricEntity = (QuadricEntity) theEObject;
			T result = caseQuadricEntity(quadricEntity);
			if (result == null)
				result = caseAbs_Entity(quadricEntity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OpenGL_DSLPackage.ESFERA: {
			Esfera esfera = (Esfera) theEObject;
			T result = caseEsfera(esfera);
			if (result == null)
				result = caseQuadricEntity(esfera);
			if (result == null)
				result = caseAbs_Entity(esfera);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OpenGL_DSLPackage.CIRCULO: {
			Circulo circulo = (Circulo) theEObject;
			T result = caseCirculo(circulo);
			if (result == null)
				result = caseAbs_Entity(circulo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OpenGL_DSLPackage.RECTANGULO: {
			Rectangulo rectangulo = (Rectangulo) theEObject;
			T result = caseRectangulo(rectangulo);
			if (result == null)
				result = caseAbs_Entity(rectangulo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OpenGL_DSLPackage.MATERIAL: {
			Material material = (Material) theEObject;
			T result = caseMaterial(material);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OpenGL_DSLPackage.MESH: {
			Mesh mesh = (Mesh) theEObject;
			T result = caseMesh(mesh);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OpenGL_DSLPackage.MB_R: {
			MbR mbR = (MbR) theEObject;
			T result = caseMbR(mbR);
			if (result == null)
				result = caseIndexMesh(mbR);
			if (result == null)
				result = caseMesh(mbR);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OpenGL_DSLPackage.TEXTURE: {
			Texture texture = (Texture) theEObject;
			T result = caseTexture(texture);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OpenGL_DSLPackage.INDEX_MESH: {
			IndexMesh indexMesh = (IndexMesh) theEObject;
			T result = caseIndexMesh(indexMesh);
			if (result == null)
				result = caseMesh(indexMesh);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scene Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scene Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSceneManager(SceneManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewPort(ViewPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camera</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamera(Camera object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scene</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScene(Scene object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLight(Light object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dir Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dir Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirLight(DirLight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pos Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pos Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosLight(PosLight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spot Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spot Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpotLight(SpotLight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abs Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abs Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbs_Entity(Abs_Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quadric Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quadric Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuadricEntity(QuadricEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Esfera</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Esfera</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEsfera(Esfera object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circulo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circulo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCirculo(Circulo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangulo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangulo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangulo(Rectangulo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterial(Material object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mesh</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mesh</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMesh(Mesh object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mb R</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mb R</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMbR(MbR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Texture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Texture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTexture(Texture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Mesh</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Mesh</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexMesh(IndexMesh object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OpenGL_DSLSwitch

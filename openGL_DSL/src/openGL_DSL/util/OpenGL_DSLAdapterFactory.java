/**
 */
package openGL_DSL.util;

import openGL_DSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see openGL_DSL.OpenGL_DSLPackage
 * @generated
 */
public class OpenGL_DSLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OpenGL_DSLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenGL_DSLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OpenGL_DSLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenGL_DSLSwitch<Adapter> modelSwitch =
		new OpenGL_DSLSwitch<Adapter>() {
			@Override
			public Adapter caseSceneManager(SceneManager object) {
				return createSceneManagerAdapter();
			}
			@Override
			public Adapter caseViewPort(ViewPort object) {
				return createViewPortAdapter();
			}
			@Override
			public Adapter caseCamera(Camera object) {
				return createCameraAdapter();
			}
			@Override
			public Adapter caseScene(Scene object) {
				return createSceneAdapter();
			}
			@Override
			public Adapter caseLight(Light object) {
				return createLightAdapter();
			}
			@Override
			public Adapter caseDirLight(DirLight object) {
				return createDirLightAdapter();
			}
			@Override
			public Adapter casePosLight(PosLight object) {
				return createPosLightAdapter();
			}
			@Override
			public Adapter caseSpotLight(SpotLight object) {
				return createSpotLightAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseAbs_Entity(Abs_Entity object) {
				return createAbs_EntityAdapter();
			}
			@Override
			public Adapter caseQuadricEntity(QuadricEntity object) {
				return createQuadricEntityAdapter();
			}
			@Override
			public Adapter caseEsfera(Esfera object) {
				return createEsferaAdapter();
			}
			@Override
			public Adapter caseCirculo(Circulo object) {
				return createCirculoAdapter();
			}
			@Override
			public Adapter caseRectangulo(Rectangulo object) {
				return createRectanguloAdapter();
			}
			@Override
			public Adapter caseMaterial(Material object) {
				return createMaterialAdapter();
			}
			@Override
			public Adapter caseMesh(Mesh object) {
				return createMeshAdapter();
			}
			@Override
			public Adapter caseMbR(MbR object) {
				return createMbRAdapter();
			}
			@Override
			public Adapter caseTexture(Texture object) {
				return createTextureAdapter();
			}
			@Override
			public Adapter caseIndexMesh(IndexMesh object) {
				return createIndexMeshAdapter();
			}
			@Override
			public Adapter caseEjesRGB(EjesRGB object) {
				return createEjesRGBAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link openGL_DSL.SceneManager <em>Scene Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openGL_DSL.SceneManager
	 * @generated
	 */
	public Adapter createSceneManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openGL_DSL.ViewPort <em>View Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openGL_DSL.ViewPort
	 * @generated
	 */
	public Adapter createViewPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openGL_DSL.Camera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openGL_DSL.Camera
	 * @generated
	 */
	public Adapter createCameraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openGL_DSL.Scene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openGL_DSL.Scene
	 * @generated
	 */
	public Adapter createSceneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openGL_DSL.Light <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openGL_DSL.Light
	 * @generated
	 */
	public Adapter createLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openGL_DSL.DirLight <em>Dir Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openGL_DSL.DirLight
	 * @generated
	 */
	public Adapter createDirLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openGL_DSL.PosLight <em>Pos Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openGL_DSL.PosLight
	 * @generated
	 */
	public Adapter createPosLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openGL_DSL.SpotLight <em>Spot Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openGL_DSL.SpotLight
	 * @generated
	 */
	public Adapter createSpotLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openGL_DSL.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openGL_DSL.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openGL_DSL.Abs_Entity <em>Abs Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openGL_DSL.Abs_Entity
	 * @generated
	 */
	public Adapter createAbs_EntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openGL_DSL.QuadricEntity <em>Quadric Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openGL_DSL.QuadricEntity
	 * @generated
	 */
	public Adapter createQuadricEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openGL_DSL.Esfera <em>Esfera</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openGL_DSL.Esfera
	 * @generated
	 */
	public Adapter createEsferaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openGL_DSL.Circulo <em>Circulo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openGL_DSL.Circulo
	 * @generated
	 */
	public Adapter createCirculoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openGL_DSL.Rectangulo <em>Rectangulo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openGL_DSL.Rectangulo
	 * @generated
	 */
	public Adapter createRectanguloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openGL_DSL.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openGL_DSL.Material
	 * @generated
	 */
	public Adapter createMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openGL_DSL.Mesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openGL_DSL.Mesh
	 * @generated
	 */
	public Adapter createMeshAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openGL_DSL.MbR <em>Mb R</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openGL_DSL.MbR
	 * @generated
	 */
	public Adapter createMbRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openGL_DSL.Texture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openGL_DSL.Texture
	 * @generated
	 */
	public Adapter createTextureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openGL_DSL.IndexMesh <em>Index Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openGL_DSL.IndexMesh
	 * @generated
	 */
	public Adapter createIndexMeshAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link openGL_DSL.EjesRGB <em>Ejes RGB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see openGL_DSL.EjesRGB
	 * @generated
	 */
	public Adapter createEjesRGBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OpenGL_DSLAdapterFactory

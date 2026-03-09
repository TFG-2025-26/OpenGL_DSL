/**
 */
package openGL_DSL.impl;

import openGL_DSL.Abs_Entity;
import openGL_DSL.Camera;
import openGL_DSL.Circulo;
import openGL_DSL.DirLight;
import openGL_DSL.Esfera;
import openGL_DSL.IndexMesh;
import openGL_DSL.Light;
import openGL_DSL.Material;
import openGL_DSL.MbR;
import openGL_DSL.Mesh;
import openGL_DSL.Node;
import openGL_DSL.OpenGL_DSLFactory;
import openGL_DSL.OpenGL_DSLPackage;
import openGL_DSL.PosLight;
import openGL_DSL.QuadricEntity;
import openGL_DSL.Rectangulo;
import openGL_DSL.Scene;
import openGL_DSL.SceneManager;
import openGL_DSL.SpotLight;
import openGL_DSL.Texture;
import openGL_DSL.ViewPort;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenGL_DSLPackageImpl extends EPackageImpl implements OpenGL_DSLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sceneManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cameraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sceneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dirLightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass posLightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spotLightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abs_EntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quadricEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esferaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circuloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectanguloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meshEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mbREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexMeshEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gLsizeiEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gLuintEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vec2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vec3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vec4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mat4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gLquadricObjEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see openGL_DSL.OpenGL_DSLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpenGL_DSLPackageImpl() {
		super(eNS_URI, OpenGL_DSLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OpenGL_DSLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpenGL_DSLPackage init() {
		if (isInited)
			return (OpenGL_DSLPackage) EPackage.Registry.INSTANCE.getEPackage(OpenGL_DSLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOpenGL_DSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OpenGL_DSLPackageImpl theOpenGL_DSLPackage = registeredOpenGL_DSLPackage instanceof OpenGL_DSLPackageImpl
				? (OpenGL_DSLPackageImpl) registeredOpenGL_DSLPackage
				: new OpenGL_DSLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theOpenGL_DSLPackage.createPackageContents();

		// Initialize created meta-data
		theOpenGL_DSLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOpenGL_DSLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpenGL_DSLPackage.eNS_URI, theOpenGL_DSLPackage);
		return theOpenGL_DSLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSceneManager() {
		return sceneManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSceneManager_WinId() {
		return (EAttribute) sceneManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSceneManager_WinW() {
		return (EAttribute) sceneManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSceneManager_WinH() {
		return (EAttribute) sceneManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSceneManager_Viewport() {
		return (EReference) sceneManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSceneManager_Camera() {
		return (EReference) sceneManagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSceneManager_Scenes() {
		return (EReference) sceneManagerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSceneManager_MStop() {
		return (EAttribute) sceneManagerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSceneManager__Run() {
		return sceneManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSceneManager__Close() {
		return sceneManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewPort() {
		return viewPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewPort_XLeft() {
		return (EAttribute) viewPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewPort_YBolt() {
		return (EAttribute) viewPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewPort_XWidth() {
		return (EAttribute) viewPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewPort_YHeight() {
		return (EAttribute) viewPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getViewPort__Upload() {
		return viewPortEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCamera() {
		return cameraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCamera_MEye() {
		return (EAttribute) cameraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCamera_MLook() {
		return (EAttribute) cameraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCamera_MUp() {
		return (EAttribute) cameraEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCamera_ModelViewMat() {
		return (EAttribute) cameraEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCamera_MProjMat() {
		return (EAttribute) cameraEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCamera_MNearVal() {
		return (EAttribute) cameraEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCamera_MFarVal() {
		return (EAttribute) cameraEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScene() {
		return sceneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScene_Visible() {
		return (EAttribute) sceneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScene_Nodo() {
		return (EReference) sceneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getScene__AddNode() {
		return sceneEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLight() {
		return lightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLight_Cont() {
		return (EAttribute) lightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLight_Id() {
		return (EAttribute) lightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLight_Ambient() {
		return (EAttribute) lightEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLight_Difusse() {
		return (EAttribute) lightEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLight_Specular() {
		return (EAttribute) lightEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLight_PosDIr() {
		return (EAttribute) lightEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLight__UploadL__Object() {
		return lightEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLight__Disable() {
		return lightEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLight__Enable() {
		return lightEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDirLight() {
		return dirLightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosLight() {
		return posLightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosLight_Kc() {
		return (EAttribute) posLightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosLight_Kl() {
		return (EAttribute) posLightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosLight_Kq() {
		return (EAttribute) posLightEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpotLight() {
		return spotLightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpotLight_Direction() {
		return (EAttribute) spotLightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpotLight_Cutoff() {
		return (EAttribute) spotLightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpotLight_Exp() {
		return (EAttribute) spotLightEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Light() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Nodo() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Abs_entity() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Posicion() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Rotacion() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Escala() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbs_Entity() {
		return abs_EntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbs_Entity_Texture() {
		return (EReference) abs_EntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbs_Entity_Material() {
		return (EReference) abs_EntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbs_Entity_Mesh() {
		return (EReference) abs_EntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbs_Entity_MModelMat() {
		return (EAttribute) abs_EntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbs_Entity_MColor() {
		return (EAttribute) abs_EntityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbs_Entity__Render__Object() {
		return abs_EntityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbs_Entity__Upload() {
		return abs_EntityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuadricEntity() {
		return quadricEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuadricEntity_Q() {
		return (EAttribute) quadricEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEsfera() {
		return esferaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCirculo() {
		return circuloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRectangulo() {
		return rectanguloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaterial() {
		return materialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaterial_Ambient() {
		return (EAttribute) materialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaterial_Difusse() {
		return (EAttribute) materialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaterial_Specular() {
		return (EAttribute) materialEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaterial_ExpF() {
		return (EAttribute) materialEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaterial_Face() {
		return (EAttribute) materialEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaterial_Sh() {
		return (EAttribute) materialEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMesh() {
		return meshEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMesh_MPrimitive() {
		return (EAttribute) meshEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMesh_NNumVertices() {
		return (EAttribute) meshEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMesh_VColors() {
		return (EAttribute) meshEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMesh_VVertices() {
		return (EAttribute) meshEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMesh_VTexCoords() {
		return (EAttribute) meshEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMesh_VNormals() {
		return (EAttribute) meshEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMesh__MNumVertices() {
		return meshEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMesh__Render() {
		return meshEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMbR() {
		return mbREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMbR_N() {
		return (EAttribute) mbREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMbR_M() {
		return (EAttribute) mbREClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMbR_Perfil() {
		return (EAttribute) mbREClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMbR__GenerateIndexMbR__int_int_Object() {
		return mbREClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTexture() {
		return textureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTexture_MWidth() {
		return (EAttribute) textureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTexture_MHeight() {
		return (EAttribute) textureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTexture_MId() {
		return (EAttribute) textureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndexMesh() {
		return indexMeshEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIndexMesh_VIndices() {
		return (EAttribute) indexMeshEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIndexMesh_NNumIndices() {
		return (EAttribute) indexMeshEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIndexMesh__BuildNormalVectors() {
		return indexMeshEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGLsizei() {
		return gLsizeiEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGLuint() {
		return gLuintEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getvec2() {
		return vec2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getvec3() {
		return vec3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getvec4() {
		return vec4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getmat4() {
		return mat4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGLquadricObj() {
		return gLquadricObjEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenGL_DSLFactory getOpenGL_DSLFactory() {
		return (OpenGL_DSLFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		sceneManagerEClass = createEClass(SCENE_MANAGER);
		createEAttribute(sceneManagerEClass, SCENE_MANAGER__WIN_ID);
		createEAttribute(sceneManagerEClass, SCENE_MANAGER__WIN_W);
		createEAttribute(sceneManagerEClass, SCENE_MANAGER__WIN_H);
		createEReference(sceneManagerEClass, SCENE_MANAGER__VIEWPORT);
		createEReference(sceneManagerEClass, SCENE_MANAGER__CAMERA);
		createEReference(sceneManagerEClass, SCENE_MANAGER__SCENES);
		createEAttribute(sceneManagerEClass, SCENE_MANAGER__MSTOP);
		createEOperation(sceneManagerEClass, SCENE_MANAGER___RUN);
		createEOperation(sceneManagerEClass, SCENE_MANAGER___CLOSE);

		viewPortEClass = createEClass(VIEW_PORT);
		createEAttribute(viewPortEClass, VIEW_PORT__XLEFT);
		createEAttribute(viewPortEClass, VIEW_PORT__YBOLT);
		createEAttribute(viewPortEClass, VIEW_PORT__XWIDTH);
		createEAttribute(viewPortEClass, VIEW_PORT__YHEIGHT);
		createEOperation(viewPortEClass, VIEW_PORT___UPLOAD);

		cameraEClass = createEClass(CAMERA);
		createEAttribute(cameraEClass, CAMERA__MEYE);
		createEAttribute(cameraEClass, CAMERA__MLOOK);
		createEAttribute(cameraEClass, CAMERA__MUP);
		createEAttribute(cameraEClass, CAMERA__MODEL_VIEW_MAT);
		createEAttribute(cameraEClass, CAMERA__MPROJ_MAT);
		createEAttribute(cameraEClass, CAMERA__MNEAR_VAL);
		createEAttribute(cameraEClass, CAMERA__MFAR_VAL);

		sceneEClass = createEClass(SCENE);
		createEAttribute(sceneEClass, SCENE__VISIBLE);
		createEReference(sceneEClass, SCENE__NODO);
		createEOperation(sceneEClass, SCENE___ADD_NODE);

		lightEClass = createEClass(LIGHT);
		createEAttribute(lightEClass, LIGHT__CONT);
		createEAttribute(lightEClass, LIGHT__ID);
		createEAttribute(lightEClass, LIGHT__AMBIENT);
		createEAttribute(lightEClass, LIGHT__DIFUSSE);
		createEAttribute(lightEClass, LIGHT__SPECULAR);
		createEAttribute(lightEClass, LIGHT__POS_DIR);
		createEOperation(lightEClass, LIGHT___UPLOAD_L__OBJECT);
		createEOperation(lightEClass, LIGHT___DISABLE);
		createEOperation(lightEClass, LIGHT___ENABLE);

		dirLightEClass = createEClass(DIR_LIGHT);

		posLightEClass = createEClass(POS_LIGHT);
		createEAttribute(posLightEClass, POS_LIGHT__KC);
		createEAttribute(posLightEClass, POS_LIGHT__KL);
		createEAttribute(posLightEClass, POS_LIGHT__KQ);

		spotLightEClass = createEClass(SPOT_LIGHT);
		createEAttribute(spotLightEClass, SPOT_LIGHT__DIRECTION);
		createEAttribute(spotLightEClass, SPOT_LIGHT__CUTOFF);
		createEAttribute(spotLightEClass, SPOT_LIGHT__EXP);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__LIGHT);
		createEReference(nodeEClass, NODE__NODO);
		createEReference(nodeEClass, NODE__ABS_ENTITY);
		createEAttribute(nodeEClass, NODE__POSICION);
		createEAttribute(nodeEClass, NODE__ROTACION);
		createEAttribute(nodeEClass, NODE__ESCALA);

		abs_EntityEClass = createEClass(ABS_ENTITY);
		createEReference(abs_EntityEClass, ABS_ENTITY__TEXTURE);
		createEReference(abs_EntityEClass, ABS_ENTITY__MATERIAL);
		createEReference(abs_EntityEClass, ABS_ENTITY__MESH);
		createEAttribute(abs_EntityEClass, ABS_ENTITY__MMODEL_MAT);
		createEAttribute(abs_EntityEClass, ABS_ENTITY__MCOLOR);
		createEOperation(abs_EntityEClass, ABS_ENTITY___RENDER__OBJECT);
		createEOperation(abs_EntityEClass, ABS_ENTITY___UPLOAD);

		quadricEntityEClass = createEClass(QUADRIC_ENTITY);
		createEAttribute(quadricEntityEClass, QUADRIC_ENTITY__Q);

		esferaEClass = createEClass(ESFERA);

		circuloEClass = createEClass(CIRCULO);

		rectanguloEClass = createEClass(RECTANGULO);

		materialEClass = createEClass(MATERIAL);
		createEAttribute(materialEClass, MATERIAL__AMBIENT);
		createEAttribute(materialEClass, MATERIAL__DIFUSSE);
		createEAttribute(materialEClass, MATERIAL__SPECULAR);
		createEAttribute(materialEClass, MATERIAL__EXP_F);
		createEAttribute(materialEClass, MATERIAL__FACE);
		createEAttribute(materialEClass, MATERIAL__SH);

		meshEClass = createEClass(MESH);
		createEAttribute(meshEClass, MESH__MPRIMITIVE);
		createEAttribute(meshEClass, MESH__NNUM_VERTICES);
		createEAttribute(meshEClass, MESH__VCOLORS);
		createEAttribute(meshEClass, MESH__VVERTICES);
		createEAttribute(meshEClass, MESH__VTEX_COORDS);
		createEAttribute(meshEClass, MESH__VNORMALS);
		createEOperation(meshEClass, MESH___MNUM_VERTICES);
		createEOperation(meshEClass, MESH___RENDER);

		mbREClass = createEClass(MB_R);
		createEAttribute(mbREClass, MB_R__N);
		createEAttribute(mbREClass, MB_R__M);
		createEAttribute(mbREClass, MB_R__PERFIL);
		createEOperation(mbREClass, MB_R___GENERATE_INDEX_MB_R__INT_INT_OBJECT);

		textureEClass = createEClass(TEXTURE);
		createEAttribute(textureEClass, TEXTURE__MWIDTH);
		createEAttribute(textureEClass, TEXTURE__MHEIGHT);
		createEAttribute(textureEClass, TEXTURE__MID);

		indexMeshEClass = createEClass(INDEX_MESH);
		createEAttribute(indexMeshEClass, INDEX_MESH__VINDICES);
		createEAttribute(indexMeshEClass, INDEX_MESH__NNUM_INDICES);
		createEOperation(indexMeshEClass, INDEX_MESH___BUILD_NORMAL_VECTORS);

		// Create data types
		gLsizeiEDataType = createEDataType(GLSIZEI);
		gLuintEDataType = createEDataType(GLUINT);
		vec2EDataType = createEDataType(VEC2);
		vec3EDataType = createEDataType(VEC3);
		vec4EDataType = createEDataType(VEC4);
		mat4EDataType = createEDataType(MAT4);
		gLquadricObjEDataType = createEDataType(GLQUADRIC_OBJ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dirLightEClass.getESuperTypes().add(this.getLight());
		posLightEClass.getESuperTypes().add(this.getLight());
		spotLightEClass.getESuperTypes().add(this.getPosLight());
		quadricEntityEClass.getESuperTypes().add(this.getAbs_Entity());
		esferaEClass.getESuperTypes().add(this.getQuadricEntity());
		circuloEClass.getESuperTypes().add(this.getAbs_Entity());
		rectanguloEClass.getESuperTypes().add(this.getAbs_Entity());
		mbREClass.getESuperTypes().add(this.getIndexMesh());
		indexMeshEClass.getESuperTypes().add(this.getMesh());

		// Initialize classes, features, and operations; add parameters
		initEClass(sceneManagerEClass, SceneManager.class, "SceneManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSceneManager_WinId(), ecorePackage.getEInt(), "WinId", null, 0, 1, SceneManager.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneManager_WinW(), ecorePackage.getEInt(), "WinW", null, 0, 1, SceneManager.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneManager_WinH(), ecorePackage.getEInt(), "WinH", null, 0, 1, SceneManager.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSceneManager_Viewport(), this.getViewPort(), null, "viewport", null, 0, 1, SceneManager.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSceneManager_Camera(), this.getCamera(), null, "camera", null, 0, 1, SceneManager.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSceneManager_Scenes(), this.getScene(), null, "scenes", null, 0, -1, SceneManager.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneManager_MStop(), ecorePackage.getEBoolean(), "mStop", "False", 0, 1, SceneManager.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSceneManager__Run(), null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSceneManager__Close(), null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(viewPortEClass, ViewPort.class, "ViewPort", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewPort_XLeft(), ecorePackage.getEInt(), "xLeft", null, 0, 1, ViewPort.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewPort_YBolt(), ecorePackage.getEInt(), "yBolt", null, 0, 1, ViewPort.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewPort_XWidth(), this.getGLsizei(), "xWidth", null, 0, 1, ViewPort.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewPort_YHeight(), this.getGLsizei(), "yHeight", null, 0, 1, ViewPort.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getViewPort__Upload(), null, "upload", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cameraEClass, Camera.class, "Camera", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCamera_MEye(), this.getvec3(), "mEye", null, 0, 1, Camera.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamera_MLook(), this.getvec3(), "mLook", null, 0, 1, Camera.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamera_MUp(), this.getvec3(), "mUp", null, 0, 1, Camera.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamera_ModelViewMat(), this.getmat4(), "modelViewMat", null, 0, 1, Camera.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamera_MProjMat(), this.getmat4(), "mProjMat", null, 0, 1, Camera.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamera_MNearVal(), ecorePackage.getEDouble(), "mNearVal", null, 0, 1, Camera.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCamera_MFarVal(), ecorePackage.getEDouble(), "mFarVal", "10000", 0, 1, Camera.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sceneEClass, Scene.class, "Scene", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScene_Visible(), ecorePackage.getEBoolean(), "Visible", "true", 0, 1, Scene.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScene_Nodo(), this.getNode(), null, "nodo", null, 0, -1, Scene.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getScene__AddNode(), null, "addNode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lightEClass, Light.class, "Light", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLight_Cont(), this.getGLuint(), "cont", null, 0, 1, Light.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLight_Id(), this.getGLuint(), "id", null, 0, 1, Light.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLight_Ambient(), this.getvec4(), "ambient", null, 0, 1, Light.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLight_Difusse(), this.getvec4(), "difusse", null, 0, 1, Light.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLight_Specular(), this.getvec4(), "specular", null, 0, 1, Light.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLight_PosDIr(), this.getvec4(), "posDIr", null, 0, 1, Light.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getLight__UploadL__Object(), null, "uploadL", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getmat4(), "modelViewMat", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLight__Disable(), null, "disable", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLight__Enable(), null, "enable", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dirLightEClass, DirLight.class, "DirLight", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(posLightEClass, PosLight.class, "PosLight", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosLight_Kc(), ecorePackage.getEFloat(), "kc", "1", 0, 1, PosLight.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosLight_Kl(), ecorePackage.getEFloat(), "kl", "0", 0, 1, PosLight.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosLight_Kq(), ecorePackage.getEFloat(), "kq", "0", 0, 1, PosLight.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spotLightEClass, SpotLight.class, "SpotLight", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpotLight_Direction(), this.getvec4(), "direction", null, 0, 1, SpotLight.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpotLight_Cutoff(), ecorePackage.getEFloat(), "cutoff", "180", 0, 1, SpotLight.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpotLight_Exp(), ecorePackage.getEFloat(), "exp", "10", 0, 1, SpotLight.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Light(), this.getLight(), null, "light", null, 0, 1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getNode_Nodo(), this.getNode(), null, "nodo", null, 0, -1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getNode_Abs_entity(), this.getAbs_Entity(), null, "abs_entity", null, 0, -1, Node.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Posicion(), this.getvec3(), "posicion", null, 0, 1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Rotacion(), this.getvec3(), "rotacion", null, 0, 1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Escala(), this.getvec3(), "escala", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abs_EntityEClass, Abs_Entity.class, "Abs_Entity", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbs_Entity_Texture(), this.getTexture(), null, "texture", null, 0, 2, Abs_Entity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbs_Entity_Material(), this.getMaterial(), null, "material", null, 0, 1, Abs_Entity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbs_Entity_Mesh(), this.getMesh(), null, "mesh", null, 0, 1, Abs_Entity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getAbs_Entity_MModelMat(), this.getmat4(), "mModelMat", null, 0, 1, Abs_Entity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbs_Entity_MColor(), this.getvec4(), "mColor", null, 0, 1, Abs_Entity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAbs_Entity__Render__Object(), null, "render", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getmat4(), "modelViewMat", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbs_Entity__Upload(), null, "upload", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(quadricEntityEClass, QuadricEntity.class, "QuadricEntity", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuadricEntity_Q(), this.getGLquadricObj(), "q", null, 0, 1, QuadricEntity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esferaEClass, Esfera.class, "Esfera", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(circuloEClass, Circulo.class, "Circulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rectanguloEClass, Rectangulo.class, "Rectangulo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(materialEClass, Material.class, "Material", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaterial_Ambient(), this.getvec4(), "ambient", null, 0, 1, Material.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaterial_Difusse(), this.getvec4(), "difusse", null, 0, 1, Material.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaterial_Specular(), this.getvec4(), "specular", null, 0, 1, Material.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaterial_ExpF(), ecorePackage.getEFloat(), "expF", null, 0, 1, Material.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaterial_Face(), this.getGLuint(), "face", null, 0, 1, Material.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaterial_Sh(), this.getGLuint(), "sh", null, 0, 1, Material.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meshEClass, Mesh.class, "Mesh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMesh_MPrimitive(), this.getGLuint(), "mPrimitive", null, 0, 1, Mesh.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMesh_NNumVertices(), this.getGLuint(), "nNumVertices", null, 0, 1, Mesh.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMesh_VColors(), this.getvec4(), "vColors", null, 0, 1, Mesh.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMesh_VVertices(), this.getvec3(), "vVertices", null, 0, 1, Mesh.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMesh_VTexCoords(), this.getvec2(), "vTexCoords", null, 0, 1, Mesh.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMesh_VNormals(), this.getvec3(), "vNormals", null, 0, 1, Mesh.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMesh__MNumVertices(), this.getGLuint(), "mNumVertices", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMesh__Render(), null, "render", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mbREClass, MbR.class, "MbR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMbR_N(), ecorePackage.getEInt(), "n", null, 0, 1, MbR.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMbR_M(), ecorePackage.getEInt(), "m", null, 0, 1, MbR.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMbR_Perfil(), this.getvec3(), "perfil", null, 0, 1, MbR.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMbR__GenerateIndexMbR__int_int_Object(), this.getMbR(), "generateIndexMbR", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "m", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getvec3(), "perfil", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(textureEClass, Texture.class, "Texture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTexture_MWidth(), ecorePackage.getEInt(), "mWidth", null, 0, 1, Texture.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTexture_MHeight(), ecorePackage.getEInt(), "mHeight", null, 0, 1, Texture.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTexture_MId(), ecorePackage.getEInt(), "mId", null, 0, 1, Texture.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexMeshEClass, IndexMesh.class, "IndexMesh", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndexMesh_VIndices(), this.getGLuint(), "vIndices", null, 0, 1, IndexMesh.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexMesh_NNumIndices(), this.getGLuint(), "nNumIndices", null, 0, 1, IndexMesh.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getIndexMesh__BuildNormalVectors(), null, "buildNormalVectors", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(gLsizeiEDataType, Object.class, "GLsizei", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(gLuintEDataType, Object.class, "GLuint", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vec2EDataType, Object.class, "vec2", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vec3EDataType, Object.class, "vec3", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vec4EDataType, Object.class, "vec4", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mat4EDataType, Object.class, "mat4", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(gLquadricObjEDataType, Object.class, "GLquadricObj", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
		addAnnotation(getSceneManager_MStop(), source, new String[] {});
	}

} //OpenGL_DSLPackageImpl

/**
 */
package openGL_DSL.impl;

import openGL_DSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenGL_DSLFactoryImpl extends EFactoryImpl implements OpenGL_DSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpenGL_DSLFactory init() {
		try {
			OpenGL_DSLFactory theOpenGL_DSLFactory = (OpenGL_DSLFactory)EPackage.Registry.INSTANCE.getEFactory(OpenGL_DSLPackage.eNS_URI);
			if (theOpenGL_DSLFactory != null) {
				return theOpenGL_DSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpenGL_DSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenGL_DSLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OpenGL_DSLPackage.SCENE_MANAGER: return createSceneManager();
			case OpenGL_DSLPackage.VIEW_PORT: return createViewPort();
			case OpenGL_DSLPackage.CAMERA: return createCamera();
			case OpenGL_DSLPackage.SCENE: return createScene();
			case OpenGL_DSLPackage.DIR_LIGHT: return createDirLight();
			case OpenGL_DSLPackage.POS_LIGHT: return createPosLight();
			case OpenGL_DSLPackage.SPOT_LIGHT: return createSpotLight();
			case OpenGL_DSLPackage.NODE: return createNode();
			case OpenGL_DSLPackage.ESFERA: return createEsfera();
			case OpenGL_DSLPackage.CIRCULO: return createCirculo();
			case OpenGL_DSLPackage.RECTANGULO: return createRectangulo();
			case OpenGL_DSLPackage.MATERIAL: return createMaterial();
			case OpenGL_DSLPackage.MESH: return createMesh();
			case OpenGL_DSLPackage.MB_R: return createMbR();
			case OpenGL_DSLPackage.TEXTURE: return createTexture();
			case OpenGL_DSLPackage.INDEX_MESH: return createIndexMesh();
			case OpenGL_DSLPackage.EJES_RGB: return createEjesRGB();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OpenGL_DSLPackage.GLSIZEI:
				return createGLsizeiFromString(eDataType, initialValue);
			case OpenGL_DSLPackage.GLUINT:
				return createGLuintFromString(eDataType, initialValue);
			case OpenGL_DSLPackage.VEC2:
				return createvec2FromString(eDataType, initialValue);
			case OpenGL_DSLPackage.VEC3:
				return createvec3FromString(eDataType, initialValue);
			case OpenGL_DSLPackage.VEC4:
				return createvec4FromString(eDataType, initialValue);
			case OpenGL_DSLPackage.MAT4:
				return createmat4FromString(eDataType, initialValue);
			case OpenGL_DSLPackage.GLQUADRIC_OBJ:
				return createGLquadricObjFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OpenGL_DSLPackage.GLSIZEI:
				return convertGLsizeiToString(eDataType, instanceValue);
			case OpenGL_DSLPackage.GLUINT:
				return convertGLuintToString(eDataType, instanceValue);
			case OpenGL_DSLPackage.VEC2:
				return convertvec2ToString(eDataType, instanceValue);
			case OpenGL_DSLPackage.VEC3:
				return convertvec3ToString(eDataType, instanceValue);
			case OpenGL_DSLPackage.VEC4:
				return convertvec4ToString(eDataType, instanceValue);
			case OpenGL_DSLPackage.MAT4:
				return convertmat4ToString(eDataType, instanceValue);
			case OpenGL_DSLPackage.GLQUADRIC_OBJ:
				return convertGLquadricObjToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SceneManager createSceneManager() {
		SceneManagerImpl sceneManager = new SceneManagerImpl();
		return sceneManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewPort createViewPort() {
		ViewPortImpl viewPort = new ViewPortImpl();
		return viewPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Camera createCamera() {
		CameraImpl camera = new CameraImpl();
		return camera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scene createScene() {
		SceneImpl scene = new SceneImpl();
		return scene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirLight createDirLight() {
		DirLightImpl dirLight = new DirLightImpl();
		return dirLight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PosLight createPosLight() {
		PosLightImpl posLight = new PosLightImpl();
		return posLight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpotLight createSpotLight() {
		SpotLightImpl spotLight = new SpotLightImpl();
		return spotLight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Esfera createEsfera() {
		EsferaImpl esfera = new EsferaImpl();
		return esfera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Circulo createCirculo() {
		CirculoImpl circulo = new CirculoImpl();
		return circulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rectangulo createRectangulo() {
		RectanguloImpl rectangulo = new RectanguloImpl();
		return rectangulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Material createMaterial() {
		MaterialImpl material = new MaterialImpl();
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mesh createMesh() {
		MeshImpl mesh = new MeshImpl();
		return mesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MbR createMbR() {
		MbRImpl mbR = new MbRImpl();
		return mbR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Texture createTexture() {
		TextureImpl texture = new TextureImpl();
		return texture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexMesh createIndexMesh() {
		IndexMeshImpl indexMesh = new IndexMeshImpl();
		return indexMesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EjesRGB createEjesRGB() {
		EjesRGBImpl ejesRGB = new EjesRGBImpl();
		return ejesRGB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createGLsizeiFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGLsizeiToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createGLuintFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGLuintToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createvec2FromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertvec2ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createvec3FromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertvec3ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createvec4FromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertvec4ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createmat4FromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertmat4ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createGLquadricObjFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGLquadricObjToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenGL_DSLPackage getOpenGL_DSLPackage() {
		return (OpenGL_DSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpenGL_DSLPackage getPackage() {
		return OpenGL_DSLPackage.eINSTANCE;
	}

} //OpenGL_DSLFactoryImpl

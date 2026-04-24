/**
 */
package openGL_DSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see openGL_DSL.OpenGL_DSLFactory
 * @model kind="package"
 * @generated
 */
public interface OpenGL_DSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "openGL_DSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/openGL_DSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "openGL_DSL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenGL_DSLPackage eINSTANCE = openGL_DSL.impl.OpenGL_DSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.SceneManagerImpl <em>Scene Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.SceneManagerImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getSceneManager()
	 * @generated
	 */
	int SCENE_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Win Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_MANAGER__WIN_ID = 0;

	/**
	 * The feature id for the '<em><b>Win W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_MANAGER__WIN_W = 1;

	/**
	 * The feature id for the '<em><b>Win H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_MANAGER__WIN_H = 2;

	/**
	 * The feature id for the '<em><b>Viewport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_MANAGER__VIEWPORT = 3;

	/**
	 * The feature id for the '<em><b>Camera</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_MANAGER__CAMERA = 4;

	/**
	 * The feature id for the '<em><b>Scenes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_MANAGER__SCENES = 5;

	/**
	 * The feature id for the '<em><b>MStop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_MANAGER__MSTOP = 6;

	/**
	 * The number of structural features of the '<em>Scene Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_MANAGER_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_MANAGER___RUN = 0;

	/**
	 * The operation id for the '<em>Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_MANAGER___CLOSE = 1;

	/**
	 * The number of operations of the '<em>Scene Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_MANAGER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.ViewPortImpl <em>View Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.ViewPortImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getViewPort()
	 * @generated
	 */
	int VIEW_PORT = 1;

	/**
	 * The feature id for the '<em><b>XLeft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT__XLEFT = 0;

	/**
	 * The feature id for the '<em><b>YBolt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT__YBOLT = 1;

	/**
	 * The feature id for the '<em><b>XWidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT__XWIDTH = 2;

	/**
	 * The feature id for the '<em><b>YHeight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT__YHEIGHT = 3;

	/**
	 * The number of structural features of the '<em>View Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Upload</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT___UPLOAD = 0;

	/**
	 * The number of operations of the '<em>View Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PORT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.CameraImpl <em>Camera</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.CameraImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getCamera()
	 * @generated
	 */
	int CAMERA = 2;

	/**
	 * The feature id for the '<em><b>MEye</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__MEYE = 0;

	/**
	 * The feature id for the '<em><b>MLook</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__MLOOK = 1;

	/**
	 * The feature id for the '<em><b>MUp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__MUP = 2;

	/**
	 * The feature id for the '<em><b>Model View Mat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__MODEL_VIEW_MAT = 3;

	/**
	 * The feature id for the '<em><b>MProj Mat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__MPROJ_MAT = 4;

	/**
	 * The feature id for the '<em><b>MNear Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__MNEAR_VAL = 5;

	/**
	 * The feature id for the '<em><b>MFar Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__MFAR_VAL = 6;

	/**
	 * The number of structural features of the '<em>Camera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Camera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.SceneImpl <em>Scene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.SceneImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getScene()
	 * @generated
	 */
	int SCENE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__VISIBLE = 1;

	/**
	 * The feature id for the '<em><b>Nodo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__NODO = 2;

	/**
	 * The number of structural features of the '<em>Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Add Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE___ADD_NODE = 0;

	/**
	 * The number of operations of the '<em>Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link openGL_DSL.Light <em>Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.Light
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getLight()
	 * @generated
	 */
	int LIGHT = 4;

	/**
	 * The feature id for the '<em><b>Cont</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__CONT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__ID = 1;

	/**
	 * The feature id for the '<em><b>Pos DIr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__POS_DIR = 2;

	/**
	 * The feature id for the '<em><b>Ambient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__AMBIENT = 3;

	/**
	 * The feature id for the '<em><b>Difusse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__DIFUSSE = 4;

	/**
	 * The feature id for the '<em><b>Specular</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__SPECULAR = 5;

	/**
	 * The feature id for the '<em><b>Direccion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__DIRECCION = 6;

	/**
	 * The number of structural features of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Upload L</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT___UPLOAD_L__OBJECT = 0;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT___DISABLE = 1;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT___ENABLE = 2;

	/**
	 * The number of operations of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.DirLightImpl <em>Dir Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.DirLightImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getDirLight()
	 * @generated
	 */
	int DIR_LIGHT = 5;

	/**
	 * The feature id for the '<em><b>Cont</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_LIGHT__CONT = LIGHT__CONT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_LIGHT__ID = LIGHT__ID;

	/**
	 * The feature id for the '<em><b>Pos DIr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_LIGHT__POS_DIR = LIGHT__POS_DIR;

	/**
	 * The feature id for the '<em><b>Ambient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_LIGHT__AMBIENT = LIGHT__AMBIENT;

	/**
	 * The feature id for the '<em><b>Difusse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_LIGHT__DIFUSSE = LIGHT__DIFUSSE;

	/**
	 * The feature id for the '<em><b>Specular</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_LIGHT__SPECULAR = LIGHT__SPECULAR;

	/**
	 * The feature id for the '<em><b>Direccion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_LIGHT__DIRECCION = LIGHT__DIRECCION;

	/**
	 * The number of structural features of the '<em>Dir Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_LIGHT_FEATURE_COUNT = LIGHT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Upload L</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_LIGHT___UPLOAD_L__OBJECT = LIGHT___UPLOAD_L__OBJECT;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_LIGHT___DISABLE = LIGHT___DISABLE;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_LIGHT___ENABLE = LIGHT___ENABLE;

	/**
	 * The number of operations of the '<em>Dir Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_LIGHT_OPERATION_COUNT = LIGHT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.PosLightImpl <em>Pos Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.PosLightImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getPosLight()
	 * @generated
	 */
	int POS_LIGHT = 6;

	/**
	 * The feature id for the '<em><b>Cont</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POS_LIGHT__CONT = LIGHT__CONT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POS_LIGHT__ID = LIGHT__ID;

	/**
	 * The feature id for the '<em><b>Pos DIr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POS_LIGHT__POS_DIR = LIGHT__POS_DIR;

	/**
	 * The feature id for the '<em><b>Ambient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POS_LIGHT__AMBIENT = LIGHT__AMBIENT;

	/**
	 * The feature id for the '<em><b>Difusse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POS_LIGHT__DIFUSSE = LIGHT__DIFUSSE;

	/**
	 * The feature id for the '<em><b>Specular</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POS_LIGHT__SPECULAR = LIGHT__SPECULAR;

	/**
	 * The feature id for the '<em><b>Direccion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POS_LIGHT__DIRECCION = LIGHT__DIRECCION;

	/**
	 * The feature id for the '<em><b>Kc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POS_LIGHT__KC = LIGHT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POS_LIGHT__KL = LIGHT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POS_LIGHT__KQ = LIGHT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pos Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POS_LIGHT_FEATURE_COUNT = LIGHT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Upload L</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POS_LIGHT___UPLOAD_L__OBJECT = LIGHT___UPLOAD_L__OBJECT;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POS_LIGHT___DISABLE = LIGHT___DISABLE;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POS_LIGHT___ENABLE = LIGHT___ENABLE;

	/**
	 * The number of operations of the '<em>Pos Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POS_LIGHT_OPERATION_COUNT = LIGHT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.SpotLightImpl <em>Spot Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.SpotLightImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getSpotLight()
	 * @generated
	 */
	int SPOT_LIGHT = 7;

	/**
	 * The feature id for the '<em><b>Cont</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__CONT = POS_LIGHT__CONT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__ID = POS_LIGHT__ID;

	/**
	 * The feature id for the '<em><b>Pos DIr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__POS_DIR = POS_LIGHT__POS_DIR;

	/**
	 * The feature id for the '<em><b>Ambient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__AMBIENT = POS_LIGHT__AMBIENT;

	/**
	 * The feature id for the '<em><b>Difusse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__DIFUSSE = POS_LIGHT__DIFUSSE;

	/**
	 * The feature id for the '<em><b>Specular</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__SPECULAR = POS_LIGHT__SPECULAR;

	/**
	 * The feature id for the '<em><b>Direccion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__DIRECCION = POS_LIGHT__DIRECCION;

	/**
	 * The feature id for the '<em><b>Kc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__KC = POS_LIGHT__KC;

	/**
	 * The feature id for the '<em><b>Kl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__KL = POS_LIGHT__KL;

	/**
	 * The feature id for the '<em><b>Kq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__KQ = POS_LIGHT__KQ;

	/**
	 * The feature id for the '<em><b>Cutoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__CUTOFF = POS_LIGHT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__EXP = POS_LIGHT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spot Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT_FEATURE_COUNT = POS_LIGHT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Upload L</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT___UPLOAD_L__OBJECT = POS_LIGHT___UPLOAD_L__OBJECT;

	/**
	 * The operation id for the '<em>Disable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT___DISABLE = POS_LIGHT___DISABLE;

	/**
	 * The operation id for the '<em>Enable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT___ENABLE = POS_LIGHT___ENABLE;

	/**
	 * The number of operations of the '<em>Spot Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT_OPERATION_COUNT = POS_LIGHT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.NodeImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Light</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LIGHT = 1;

	/**
	 * The feature id for the '<em><b>Nodo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODO = 2;

	/**
	 * The feature id for the '<em><b>Abs entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ABS_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Posicion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__POSICION = 4;

	/**
	 * The feature id for the '<em><b>Rotacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ROTACION = 5;

	/**
	 * The feature id for the '<em><b>Escala</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ESCALA = 6;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.Abs_EntityImpl <em>Abs Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.Abs_EntityImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getAbs_Entity()
	 * @generated
	 */
	int ABS_ENTITY = 9;

	/**
	 * The feature id for the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_ENTITY__MATERIAL = 0;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_ENTITY__MESH = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_ENTITY__COLOR = 2;

	/**
	 * The feature id for the '<em><b>Front Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_ENTITY__FRONT_TEXTURE = 3;

	/**
	 * The feature id for the '<em><b>Back Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_ENTITY__BACK_TEXTURE = 4;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Ancho</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_ENTITY__TEXTURA_REPETICION_ANCHO = 5;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Alto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_ENTITY__TEXTURA_REPETICION_ALTO = 6;

	/**
	 * The number of structural features of the '<em>Abs Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_ENTITY_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_ENTITY___RENDER__OBJECT = 0;

	/**
	 * The operation id for the '<em>Upload</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_ENTITY___UPLOAD = 1;

	/**
	 * The number of operations of the '<em>Abs Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABS_ENTITY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.QuadricEntityImpl <em>Quadric Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.QuadricEntityImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getQuadricEntity()
	 * @generated
	 */
	int QUADRIC_ENTITY = 10;

	/**
	 * The feature id for the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUADRIC_ENTITY__MATERIAL = ABS_ENTITY__MATERIAL;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUADRIC_ENTITY__MESH = ABS_ENTITY__MESH;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUADRIC_ENTITY__COLOR = ABS_ENTITY__COLOR;

	/**
	 * The feature id for the '<em><b>Front Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUADRIC_ENTITY__FRONT_TEXTURE = ABS_ENTITY__FRONT_TEXTURE;

	/**
	 * The feature id for the '<em><b>Back Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUADRIC_ENTITY__BACK_TEXTURE = ABS_ENTITY__BACK_TEXTURE;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Ancho</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUADRIC_ENTITY__TEXTURA_REPETICION_ANCHO = ABS_ENTITY__TEXTURA_REPETICION_ANCHO;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Alto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUADRIC_ENTITY__TEXTURA_REPETICION_ALTO = ABS_ENTITY__TEXTURA_REPETICION_ALTO;

	/**
	 * The feature id for the '<em><b>Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUADRIC_ENTITY__Q = ABS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quadric Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUADRIC_ENTITY_FEATURE_COUNT = ABS_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUADRIC_ENTITY___RENDER__OBJECT = ABS_ENTITY___RENDER__OBJECT;

	/**
	 * The operation id for the '<em>Upload</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUADRIC_ENTITY___UPLOAD = ABS_ENTITY___UPLOAD;

	/**
	 * The number of operations of the '<em>Quadric Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUADRIC_ENTITY_OPERATION_COUNT = ABS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.MaterialImpl <em>Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.MaterialImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getMaterial()
	 * @generated
	 */
	int MATERIAL = 11;

	/**
	 * The feature id for the '<em><b>Ambient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__AMBIENT = 0;

	/**
	 * The feature id for the '<em><b>Difusse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__DIFUSSE = 1;

	/**
	 * The feature id for the '<em><b>Specular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__SPECULAR = 2;

	/**
	 * The feature id for the '<em><b>Exp F</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__EXP_F = 3;

	/**
	 * The feature id for the '<em><b>Face</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__FACE = 4;

	/**
	 * The feature id for the '<em><b>Sh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__SH = 5;

	/**
	 * The number of structural features of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.MeshImpl <em>Mesh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.MeshImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getMesh()
	 * @generated
	 */
	int MESH = 12;

	/**
	 * The feature id for the '<em><b>MPrimitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH__MPRIMITIVE = 0;

	/**
	 * The feature id for the '<em><b>NNum Vertices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH__NNUM_VERTICES = 1;

	/**
	 * The feature id for the '<em><b>VColors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH__VCOLORS = 2;

	/**
	 * The feature id for the '<em><b>VVertices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH__VVERTICES = 3;

	/**
	 * The feature id for the '<em><b>VTex Coords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH__VTEX_COORDS = 4;

	/**
	 * The feature id for the '<em><b>VNormals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH__VNORMALS = 5;

	/**
	 * The number of structural features of the '<em>Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>MNum Vertices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH___MNUM_VERTICES = 0;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH___RENDER = 1;

	/**
	 * The number of operations of the '<em>Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.IndexMeshImpl <em>Index Mesh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.IndexMeshImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getIndexMesh()
	 * @generated
	 */
	int INDEX_MESH = 15;

	/**
	 * The feature id for the '<em><b>MPrimitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MESH__MPRIMITIVE = MESH__MPRIMITIVE;

	/**
	 * The feature id for the '<em><b>NNum Vertices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MESH__NNUM_VERTICES = MESH__NNUM_VERTICES;

	/**
	 * The feature id for the '<em><b>VColors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MESH__VCOLORS = MESH__VCOLORS;

	/**
	 * The feature id for the '<em><b>VVertices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MESH__VVERTICES = MESH__VVERTICES;

	/**
	 * The feature id for the '<em><b>VTex Coords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MESH__VTEX_COORDS = MESH__VTEX_COORDS;

	/**
	 * The feature id for the '<em><b>VNormals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MESH__VNORMALS = MESH__VNORMALS;

	/**
	 * The feature id for the '<em><b>VIndices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MESH__VINDICES = MESH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>NNum Indices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MESH__NNUM_INDICES = MESH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Index Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MESH_FEATURE_COUNT = MESH_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>MNum Vertices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MESH___MNUM_VERTICES = MESH___MNUM_VERTICES;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MESH___RENDER = MESH___RENDER;

	/**
	 * The operation id for the '<em>Build Normal Vectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MESH___BUILD_NORMAL_VECTORS = MESH_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Index Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_MESH_OPERATION_COUNT = MESH_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.MbRImpl <em>Mb R</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.MbRImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getMbR()
	 * @generated
	 */
	int MB_R = 13;

	/**
	 * The feature id for the '<em><b>MPrimitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MB_R__MPRIMITIVE = INDEX_MESH__MPRIMITIVE;

	/**
	 * The feature id for the '<em><b>NNum Vertices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MB_R__NNUM_VERTICES = INDEX_MESH__NNUM_VERTICES;

	/**
	 * The feature id for the '<em><b>VColors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MB_R__VCOLORS = INDEX_MESH__VCOLORS;

	/**
	 * The feature id for the '<em><b>VVertices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MB_R__VVERTICES = INDEX_MESH__VVERTICES;

	/**
	 * The feature id for the '<em><b>VTex Coords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MB_R__VTEX_COORDS = INDEX_MESH__VTEX_COORDS;

	/**
	 * The feature id for the '<em><b>VNormals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MB_R__VNORMALS = INDEX_MESH__VNORMALS;

	/**
	 * The feature id for the '<em><b>VIndices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MB_R__VINDICES = INDEX_MESH__VINDICES;

	/**
	 * The feature id for the '<em><b>NNum Indices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MB_R__NNUM_INDICES = INDEX_MESH__NNUM_INDICES;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MB_R__N = INDEX_MESH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MB_R__M = INDEX_MESH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Perfil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MB_R__PERFIL = INDEX_MESH_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mb R</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MB_R_FEATURE_COUNT = INDEX_MESH_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>MNum Vertices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MB_R___MNUM_VERTICES = INDEX_MESH___MNUM_VERTICES;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MB_R___RENDER = INDEX_MESH___RENDER;

	/**
	 * The operation id for the '<em>Build Normal Vectors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MB_R___BUILD_NORMAL_VECTORS = INDEX_MESH___BUILD_NORMAL_VECTORS;

	/**
	 * The operation id for the '<em>Generate Index Mb R</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MB_R___GENERATE_INDEX_MB_R__INT_INT_OBJECT = INDEX_MESH_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mb R</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MB_R_OPERATION_COUNT = INDEX_MESH_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.TextureImpl <em>Texture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.TextureImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getTexture()
	 * @generated
	 */
	int TEXTURE = 14;

	/**
	 * The feature id for the '<em><b>Textura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE__TEXTURA = 0;

	/**
	 * The feature id for the '<em><b>Alfa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE__ALFA = 1;

	/**
	 * The number of structural features of the '<em>Texture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Texture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.EjesRGBImpl <em>Ejes RGB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.EjesRGBImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getEjesRGB()
	 * @generated
	 */
	int EJES_RGB = 16;

	/**
	 * The feature id for the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJES_RGB__MATERIAL = ABS_ENTITY__MATERIAL;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJES_RGB__MESH = ABS_ENTITY__MESH;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJES_RGB__COLOR = ABS_ENTITY__COLOR;

	/**
	 * The feature id for the '<em><b>Front Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJES_RGB__FRONT_TEXTURE = ABS_ENTITY__FRONT_TEXTURE;

	/**
	 * The feature id for the '<em><b>Back Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJES_RGB__BACK_TEXTURE = ABS_ENTITY__BACK_TEXTURE;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Ancho</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJES_RGB__TEXTURA_REPETICION_ANCHO = ABS_ENTITY__TEXTURA_REPETICION_ANCHO;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Alto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJES_RGB__TEXTURA_REPETICION_ALTO = ABS_ENTITY__TEXTURA_REPETICION_ALTO;

	/**
	 * The feature id for the '<em><b>Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJES_RGB__LENGHT = ABS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ejes RGB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJES_RGB_FEATURE_COUNT = ABS_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJES_RGB___RENDER__OBJECT = ABS_ENTITY___RENDER__OBJECT;

	/**
	 * The operation id for the '<em>Upload</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJES_RGB___UPLOAD = ABS_ENTITY___UPLOAD;

	/**
	 * The number of operations of the '<em>Ejes RGB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJES_RGB_OPERATION_COUNT = ABS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.Vector3Impl <em>Vector3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.Vector3Impl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getVector3()
	 * @generated
	 */
	int VECTOR3 = 17;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3__Z = 2;

	/**
	 * The number of structural features of the '<em>Vector3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Vector3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.PoligonoRegularImpl <em>Poligono Regular</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.PoligonoRegularImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getPoligonoRegular()
	 * @generated
	 */
	int POLIGONO_REGULAR = 18;

	/**
	 * The feature id for the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIGONO_REGULAR__MATERIAL = ABS_ENTITY__MATERIAL;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIGONO_REGULAR__MESH = ABS_ENTITY__MESH;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIGONO_REGULAR__COLOR = ABS_ENTITY__COLOR;

	/**
	 * The feature id for the '<em><b>Front Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIGONO_REGULAR__FRONT_TEXTURE = ABS_ENTITY__FRONT_TEXTURE;

	/**
	 * The feature id for the '<em><b>Back Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIGONO_REGULAR__BACK_TEXTURE = ABS_ENTITY__BACK_TEXTURE;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Ancho</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIGONO_REGULAR__TEXTURA_REPETICION_ANCHO = ABS_ENTITY__TEXTURA_REPETICION_ANCHO;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Alto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIGONO_REGULAR__TEXTURA_REPETICION_ALTO = ABS_ENTITY__TEXTURA_REPETICION_ALTO;

	/**
	 * The feature id for the '<em><b>Num Vertices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIGONO_REGULAR__NUM_VERTICES = ABS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Radio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIGONO_REGULAR__RADIO = ABS_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rellenar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIGONO_REGULAR__RELLENAR = ABS_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Poligono Regular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIGONO_REGULAR_FEATURE_COUNT = ABS_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIGONO_REGULAR___RENDER__OBJECT = ABS_ENTITY___RENDER__OBJECT;

	/**
	 * The operation id for the '<em>Upload</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIGONO_REGULAR___UPLOAD = ABS_ENTITY___UPLOAD;

	/**
	 * The number of operations of the '<em>Poligono Regular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLIGONO_REGULAR_OPERATION_COUNT = ABS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.Vector4Impl <em>Vector4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.Vector4Impl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getVector4()
	 * @generated
	 */
	int VECTOR4 = 19;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR4__R = 0;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR4__G = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR4__B = 2;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR4__A = 3;

	/**
	 * The number of structural features of the '<em>Vector4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR4_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Vector4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR4_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.RectanguloImpl <em>Rectangulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.RectanguloImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getRectangulo()
	 * @generated
	 */
	int RECTANGULO = 20;

	/**
	 * The feature id for the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULO__MATERIAL = ABS_ENTITY__MATERIAL;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULO__MESH = ABS_ENTITY__MESH;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULO__COLOR = ABS_ENTITY__COLOR;

	/**
	 * The feature id for the '<em><b>Front Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULO__FRONT_TEXTURE = ABS_ENTITY__FRONT_TEXTURE;

	/**
	 * The feature id for the '<em><b>Back Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULO__BACK_TEXTURE = ABS_ENTITY__BACK_TEXTURE;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Ancho</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULO__TEXTURA_REPETICION_ANCHO = ABS_ENTITY__TEXTURA_REPETICION_ANCHO;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Alto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULO__TEXTURA_REPETICION_ALTO = ABS_ENTITY__TEXTURA_REPETICION_ALTO;

	/**
	 * The feature id for the '<em><b>Ancho</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULO__ANCHO = ABS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULO__ALTO = ABS_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rellenar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULO__RELLENAR = ABS_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rectangulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULO_FEATURE_COUNT = ABS_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULO___RENDER__OBJECT = ABS_ENTITY___RENDER__OBJECT;

	/**
	 * The operation id for the '<em>Upload</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULO___UPLOAD = ABS_ENTITY___UPLOAD;

	/**
	 * The number of operations of the '<em>Rectangulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULO_OPERATION_COUNT = ABS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.CirculoImpl <em>Circulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.CirculoImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getCirculo()
	 * @generated
	 */
	int CIRCULO = 21;

	/**
	 * The feature id for the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULO__MATERIAL = ABS_ENTITY__MATERIAL;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULO__MESH = ABS_ENTITY__MESH;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULO__COLOR = ABS_ENTITY__COLOR;

	/**
	 * The feature id for the '<em><b>Front Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULO__FRONT_TEXTURE = ABS_ENTITY__FRONT_TEXTURE;

	/**
	 * The feature id for the '<em><b>Back Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULO__BACK_TEXTURE = ABS_ENTITY__BACK_TEXTURE;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Ancho</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULO__TEXTURA_REPETICION_ANCHO = ABS_ENTITY__TEXTURA_REPETICION_ANCHO;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Alto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULO__TEXTURA_REPETICION_ALTO = ABS_ENTITY__TEXTURA_REPETICION_ALTO;

	/**
	 * The feature id for the '<em><b>Radio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULO__RADIO = ABS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rellenar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULO__RELLENAR = ABS_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Circulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULO_FEATURE_COUNT = ABS_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULO___RENDER__OBJECT = ABS_ENTITY___RENDER__OBJECT;

	/**
	 * The operation id for the '<em>Upload</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULO___UPLOAD = ABS_ENTITY___UPLOAD;

	/**
	 * The number of operations of the '<em>Circulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULO_OPERATION_COUNT = ABS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.EsferaImpl <em>Esfera</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.EsferaImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getEsfera()
	 * @generated
	 */
	int ESFERA = 22;

	/**
	 * The feature id for the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESFERA__MATERIAL = QUADRIC_ENTITY__MATERIAL;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESFERA__MESH = QUADRIC_ENTITY__MESH;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESFERA__COLOR = QUADRIC_ENTITY__COLOR;

	/**
	 * The feature id for the '<em><b>Front Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESFERA__FRONT_TEXTURE = QUADRIC_ENTITY__FRONT_TEXTURE;

	/**
	 * The feature id for the '<em><b>Back Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESFERA__BACK_TEXTURE = QUADRIC_ENTITY__BACK_TEXTURE;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Ancho</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESFERA__TEXTURA_REPETICION_ANCHO = QUADRIC_ENTITY__TEXTURA_REPETICION_ANCHO;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Alto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESFERA__TEXTURA_REPETICION_ALTO = QUADRIC_ENTITY__TEXTURA_REPETICION_ALTO;

	/**
	 * The feature id for the '<em><b>Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESFERA__Q = QUADRIC_ENTITY__Q;

	/**
	 * The feature id for the '<em><b>Radio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESFERA__RADIO = QUADRIC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Esfera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESFERA_FEATURE_COUNT = QUADRIC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESFERA___RENDER__OBJECT = QUADRIC_ENTITY___RENDER__OBJECT;

	/**
	 * The operation id for the '<em>Upload</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESFERA___UPLOAD = QUADRIC_ENTITY___UPLOAD;

	/**
	 * The number of operations of the '<em>Esfera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESFERA_OPERATION_COUNT = QUADRIC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.CilindroImpl <em>Cilindro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.CilindroImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getCilindro()
	 * @generated
	 */
	int CILINDRO = 23;

	/**
	 * The feature id for the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILINDRO__MATERIAL = QUADRIC_ENTITY__MATERIAL;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILINDRO__MESH = QUADRIC_ENTITY__MESH;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILINDRO__COLOR = QUADRIC_ENTITY__COLOR;

	/**
	 * The feature id for the '<em><b>Front Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILINDRO__FRONT_TEXTURE = QUADRIC_ENTITY__FRONT_TEXTURE;

	/**
	 * The feature id for the '<em><b>Back Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILINDRO__BACK_TEXTURE = QUADRIC_ENTITY__BACK_TEXTURE;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Ancho</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILINDRO__TEXTURA_REPETICION_ANCHO = QUADRIC_ENTITY__TEXTURA_REPETICION_ANCHO;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Alto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILINDRO__TEXTURA_REPETICION_ALTO = QUADRIC_ENTITY__TEXTURA_REPETICION_ALTO;

	/**
	 * The feature id for the '<em><b>Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILINDRO__Q = QUADRIC_ENTITY__Q;

	/**
	 * The feature id for the '<em><b>Radio Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILINDRO__RADIO_BASE = QUADRIC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Radio Tope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILINDRO__RADIO_TOPE = QUADRIC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Altura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILINDRO__ALTURA = QUADRIC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cilindro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILINDRO_FEATURE_COUNT = QUADRIC_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILINDRO___RENDER__OBJECT = QUADRIC_ENTITY___RENDER__OBJECT;

	/**
	 * The operation id for the '<em>Upload</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILINDRO___UPLOAD = QUADRIC_ENTITY___UPLOAD;

	/**
	 * The number of operations of the '<em>Cilindro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CILINDRO_OPERATION_COUNT = QUADRIC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.DiscoImpl <em>Disco</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.DiscoImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getDisco()
	 * @generated
	 */
	int DISCO = 24;

	/**
	 * The feature id for the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__MATERIAL = QUADRIC_ENTITY__MATERIAL;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__MESH = QUADRIC_ENTITY__MESH;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__COLOR = QUADRIC_ENTITY__COLOR;

	/**
	 * The feature id for the '<em><b>Front Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__FRONT_TEXTURE = QUADRIC_ENTITY__FRONT_TEXTURE;

	/**
	 * The feature id for the '<em><b>Back Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__BACK_TEXTURE = QUADRIC_ENTITY__BACK_TEXTURE;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Ancho</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__TEXTURA_REPETICION_ANCHO = QUADRIC_ENTITY__TEXTURA_REPETICION_ANCHO;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Alto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__TEXTURA_REPETICION_ALTO = QUADRIC_ENTITY__TEXTURA_REPETICION_ALTO;

	/**
	 * The feature id for the '<em><b>Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__Q = QUADRIC_ENTITY__Q;

	/**
	 * The feature id for the '<em><b>Radio Interno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__RADIO_INTERNO = QUADRIC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Radio Externo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO__RADIO_EXTERNO = QUADRIC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Disco</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_FEATURE_COUNT = QUADRIC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO___RENDER__OBJECT = QUADRIC_ENTITY___RENDER__OBJECT;

	/**
	 * The operation id for the '<em>Upload</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO___UPLOAD = QUADRIC_ENTITY___UPLOAD;

	/**
	 * The number of operations of the '<em>Disco</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_OPERATION_COUNT = QUADRIC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.DiscoParcialImpl <em>Disco Parcial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.DiscoParcialImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getDiscoParcial()
	 * @generated
	 */
	int DISCO_PARCIAL = 25;

	/**
	 * The feature id for the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_PARCIAL__MATERIAL = QUADRIC_ENTITY__MATERIAL;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_PARCIAL__MESH = QUADRIC_ENTITY__MESH;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_PARCIAL__COLOR = QUADRIC_ENTITY__COLOR;

	/**
	 * The feature id for the '<em><b>Front Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_PARCIAL__FRONT_TEXTURE = QUADRIC_ENTITY__FRONT_TEXTURE;

	/**
	 * The feature id for the '<em><b>Back Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_PARCIAL__BACK_TEXTURE = QUADRIC_ENTITY__BACK_TEXTURE;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Ancho</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_PARCIAL__TEXTURA_REPETICION_ANCHO = QUADRIC_ENTITY__TEXTURA_REPETICION_ANCHO;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Alto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_PARCIAL__TEXTURA_REPETICION_ALTO = QUADRIC_ENTITY__TEXTURA_REPETICION_ALTO;

	/**
	 * The feature id for the '<em><b>Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_PARCIAL__Q = QUADRIC_ENTITY__Q;

	/**
	 * The feature id for the '<em><b>Radio Interno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_PARCIAL__RADIO_INTERNO = QUADRIC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Radio Externo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_PARCIAL__RADIO_EXTERNO = QUADRIC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Angulo Inicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_PARCIAL__ANGULO_INICIO = QUADRIC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Amplitud Angulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_PARCIAL__AMPLITUD_ANGULO = QUADRIC_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Disco Parcial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_PARCIAL_FEATURE_COUNT = QUADRIC_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_PARCIAL___RENDER__OBJECT = QUADRIC_ENTITY___RENDER__OBJECT;

	/**
	 * The operation id for the '<em>Upload</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_PARCIAL___UPLOAD = QUADRIC_ENTITY___UPLOAD;

	/**
	 * The number of operations of the '<em>Disco Parcial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCO_PARCIAL_OPERATION_COUNT = QUADRIC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.CuboImpl <em>Cubo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.CuboImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getCubo()
	 * @generated
	 */
	int CUBO = 26;

	/**
	 * The feature id for the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBO__MATERIAL = ABS_ENTITY__MATERIAL;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBO__MESH = ABS_ENTITY__MESH;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBO__COLOR = ABS_ENTITY__COLOR;

	/**
	 * The feature id for the '<em><b>Front Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBO__FRONT_TEXTURE = ABS_ENTITY__FRONT_TEXTURE;

	/**
	 * The feature id for the '<em><b>Back Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBO__BACK_TEXTURE = ABS_ENTITY__BACK_TEXTURE;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Ancho</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBO__TEXTURA_REPETICION_ANCHO = ABS_ENTITY__TEXTURA_REPETICION_ANCHO;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Alto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBO__TEXTURA_REPETICION_ALTO = ABS_ENTITY__TEXTURA_REPETICION_ALTO;

	/**
	 * The feature id for the '<em><b>Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBO__LENGHT = ABS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cubo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBO_FEATURE_COUNT = ABS_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBO___RENDER__OBJECT = ABS_ENTITY___RENDER__OBJECT;

	/**
	 * The operation id for the '<em>Upload</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBO___UPLOAD = ABS_ENTITY___UPLOAD;

	/**
	 * The number of operations of the '<em>Cubo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBO_OPERATION_COUNT = ABS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link openGL_DSL.impl.ToroideImpl <em>Toroide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openGL_DSL.impl.ToroideImpl
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getToroide()
	 * @generated
	 */
	int TOROIDE = 27;

	/**
	 * The feature id for the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOROIDE__MATERIAL = ABS_ENTITY__MATERIAL;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOROIDE__MESH = ABS_ENTITY__MESH;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOROIDE__COLOR = ABS_ENTITY__COLOR;

	/**
	 * The feature id for the '<em><b>Front Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOROIDE__FRONT_TEXTURE = ABS_ENTITY__FRONT_TEXTURE;

	/**
	 * The feature id for the '<em><b>Back Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOROIDE__BACK_TEXTURE = ABS_ENTITY__BACK_TEXTURE;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Ancho</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOROIDE__TEXTURA_REPETICION_ANCHO = ABS_ENTITY__TEXTURA_REPETICION_ANCHO;

	/**
	 * The feature id for the '<em><b>Textura Repeticion Alto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOROIDE__TEXTURA_REPETICION_ALTO = ABS_ENTITY__TEXTURA_REPETICION_ALTO;

	/**
	 * The feature id for the '<em><b>Radio Centro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOROIDE__RADIO_CENTRO = ABS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Radio Anillo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOROIDE__RADIO_ANILLO = ABS_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Toroide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOROIDE_FEATURE_COUNT = ABS_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOROIDE___RENDER__OBJECT = ABS_ENTITY___RENDER__OBJECT;

	/**
	 * The operation id for the '<em>Upload</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOROIDE___UPLOAD = ABS_ENTITY___UPLOAD;

	/**
	 * The number of operations of the '<em>Toroide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOROIDE_OPERATION_COUNT = ABS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>GLsizei</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getGLsizei()
	 * @generated
	 */
	int GLSIZEI = 28;

	/**
	 * The meta object id for the '<em>GLuint</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getGLuint()
	 * @generated
	 */
	int GLUINT = 29;

	/**
	 * The meta object id for the '<em>vec2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getvec2()
	 * @generated
	 */
	int VEC2 = 30;

	/**
	 * The meta object id for the '<em>vec3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getvec3()
	 * @generated
	 */
	int VEC3 = 31;

	/**
	 * The meta object id for the '<em>vec4</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getvec4()
	 * @generated
	 */
	int VEC4 = 32;

	/**
	 * The meta object id for the '<em>mat4</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getmat4()
	 * @generated
	 */
	int MAT4 = 33;

	/**
	 * The meta object id for the '<em>GLquadric Obj</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getGLquadricObj()
	 * @generated
	 */
	int GLQUADRIC_OBJ = 34;


	/**
	 * Returns the meta object for class '{@link openGL_DSL.SceneManager <em>Scene Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene Manager</em>'.
	 * @see openGL_DSL.SceneManager
	 * @generated
	 */
	EClass getSceneManager();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.SceneManager#getWinId <em>Win Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Win Id</em>'.
	 * @see openGL_DSL.SceneManager#getWinId()
	 * @see #getSceneManager()
	 * @generated
	 */
	EAttribute getSceneManager_WinId();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.SceneManager#getWinW <em>Win W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Win W</em>'.
	 * @see openGL_DSL.SceneManager#getWinW()
	 * @see #getSceneManager()
	 * @generated
	 */
	EAttribute getSceneManager_WinW();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.SceneManager#getWinH <em>Win H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Win H</em>'.
	 * @see openGL_DSL.SceneManager#getWinH()
	 * @see #getSceneManager()
	 * @generated
	 */
	EAttribute getSceneManager_WinH();

	/**
	 * Returns the meta object for the containment reference '{@link openGL_DSL.SceneManager#getViewport <em>Viewport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Viewport</em>'.
	 * @see openGL_DSL.SceneManager#getViewport()
	 * @see #getSceneManager()
	 * @generated
	 */
	EReference getSceneManager_Viewport();

	/**
	 * Returns the meta object for the containment reference '{@link openGL_DSL.SceneManager#getCamera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Camera</em>'.
	 * @see openGL_DSL.SceneManager#getCamera()
	 * @see #getSceneManager()
	 * @generated
	 */
	EReference getSceneManager_Camera();

	/**
	 * Returns the meta object for the containment reference list '{@link openGL_DSL.SceneManager#getScenes <em>Scenes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenes</em>'.
	 * @see openGL_DSL.SceneManager#getScenes()
	 * @see #getSceneManager()
	 * @generated
	 */
	EReference getSceneManager_Scenes();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.SceneManager#isMStop <em>MStop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MStop</em>'.
	 * @see openGL_DSL.SceneManager#isMStop()
	 * @see #getSceneManager()
	 * @generated
	 */
	EAttribute getSceneManager_MStop();

	/**
	 * Returns the meta object for the '{@link openGL_DSL.SceneManager#run() <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see openGL_DSL.SceneManager#run()
	 * @generated
	 */
	EOperation getSceneManager__Run();

	/**
	 * Returns the meta object for the '{@link openGL_DSL.SceneManager#close() <em>Close</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Close</em>' operation.
	 * @see openGL_DSL.SceneManager#close()
	 * @generated
	 */
	EOperation getSceneManager__Close();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.ViewPort <em>View Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Port</em>'.
	 * @see openGL_DSL.ViewPort
	 * @generated
	 */
	EClass getViewPort();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.ViewPort#getXLeft <em>XLeft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XLeft</em>'.
	 * @see openGL_DSL.ViewPort#getXLeft()
	 * @see #getViewPort()
	 * @generated
	 */
	EAttribute getViewPort_XLeft();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.ViewPort#getYBolt <em>YBolt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YBolt</em>'.
	 * @see openGL_DSL.ViewPort#getYBolt()
	 * @see #getViewPort()
	 * @generated
	 */
	EAttribute getViewPort_YBolt();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.ViewPort#getXWidth <em>XWidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XWidth</em>'.
	 * @see openGL_DSL.ViewPort#getXWidth()
	 * @see #getViewPort()
	 * @generated
	 */
	EAttribute getViewPort_XWidth();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.ViewPort#getYHeight <em>YHeight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YHeight</em>'.
	 * @see openGL_DSL.ViewPort#getYHeight()
	 * @see #getViewPort()
	 * @generated
	 */
	EAttribute getViewPort_YHeight();

	/**
	 * Returns the meta object for the '{@link openGL_DSL.ViewPort#upload() <em>Upload</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Upload</em>' operation.
	 * @see openGL_DSL.ViewPort#upload()
	 * @generated
	 */
	EOperation getViewPort__Upload();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.Camera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera</em>'.
	 * @see openGL_DSL.Camera
	 * @generated
	 */
	EClass getCamera();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Camera#getMEye <em>MEye</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MEye</em>'.
	 * @see openGL_DSL.Camera#getMEye()
	 * @see #getCamera()
	 * @generated
	 */
	EAttribute getCamera_MEye();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Camera#getMLook <em>MLook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MLook</em>'.
	 * @see openGL_DSL.Camera#getMLook()
	 * @see #getCamera()
	 * @generated
	 */
	EAttribute getCamera_MLook();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Camera#getMUp <em>MUp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MUp</em>'.
	 * @see openGL_DSL.Camera#getMUp()
	 * @see #getCamera()
	 * @generated
	 */
	EAttribute getCamera_MUp();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Camera#getModelViewMat <em>Model View Mat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model View Mat</em>'.
	 * @see openGL_DSL.Camera#getModelViewMat()
	 * @see #getCamera()
	 * @generated
	 */
	EAttribute getCamera_ModelViewMat();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Camera#getMProjMat <em>MProj Mat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MProj Mat</em>'.
	 * @see openGL_DSL.Camera#getMProjMat()
	 * @see #getCamera()
	 * @generated
	 */
	EAttribute getCamera_MProjMat();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Camera#getMNearVal <em>MNear Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MNear Val</em>'.
	 * @see openGL_DSL.Camera#getMNearVal()
	 * @see #getCamera()
	 * @generated
	 */
	EAttribute getCamera_MNearVal();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Camera#getMFarVal <em>MFar Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MFar Val</em>'.
	 * @see openGL_DSL.Camera#getMFarVal()
	 * @see #getCamera()
	 * @generated
	 */
	EAttribute getCamera_MFarVal();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.Scene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene</em>'.
	 * @see openGL_DSL.Scene
	 * @generated
	 */
	EClass getScene();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Scene#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see openGL_DSL.Scene#getName()
	 * @see #getScene()
	 * @generated
	 */
	EAttribute getScene_Name();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Scene#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see openGL_DSL.Scene#isVisible()
	 * @see #getScene()
	 * @generated
	 */
	EAttribute getScene_Visible();

	/**
	 * Returns the meta object for the containment reference list '{@link openGL_DSL.Scene#getNodo <em>Nodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodo</em>'.
	 * @see openGL_DSL.Scene#getNodo()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_Nodo();

	/**
	 * Returns the meta object for the '{@link openGL_DSL.Scene#addNode() <em>Add Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Node</em>' operation.
	 * @see openGL_DSL.Scene#addNode()
	 * @generated
	 */
	EOperation getScene__AddNode();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.Light <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light</em>'.
	 * @see openGL_DSL.Light
	 * @generated
	 */
	EClass getLight();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Light#getCont <em>Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cont</em>'.
	 * @see openGL_DSL.Light#getCont()
	 * @see #getLight()
	 * @generated
	 */
	EAttribute getLight_Cont();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Light#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see openGL_DSL.Light#getId()
	 * @see #getLight()
	 * @generated
	 */
	EAttribute getLight_Id();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Light#getPosDIr <em>Pos DIr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos DIr</em>'.
	 * @see openGL_DSL.Light#getPosDIr()
	 * @see #getLight()
	 * @generated
	 */
	EAttribute getLight_PosDIr();

	/**
	 * Returns the meta object for the containment reference '{@link openGL_DSL.Light#getAmbient <em>Ambient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ambient</em>'.
	 * @see openGL_DSL.Light#getAmbient()
	 * @see #getLight()
	 * @generated
	 */
	EReference getLight_Ambient();

	/**
	 * Returns the meta object for the containment reference '{@link openGL_DSL.Light#getDifusse <em>Difusse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Difusse</em>'.
	 * @see openGL_DSL.Light#getDifusse()
	 * @see #getLight()
	 * @generated
	 */
	EReference getLight_Difusse();

	/**
	 * Returns the meta object for the containment reference '{@link openGL_DSL.Light#getSpecular <em>Specular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specular</em>'.
	 * @see openGL_DSL.Light#getSpecular()
	 * @see #getLight()
	 * @generated
	 */
	EReference getLight_Specular();

	/**
	 * Returns the meta object for the containment reference '{@link openGL_DSL.Light#getDireccion <em>Direccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Direccion</em>'.
	 * @see openGL_DSL.Light#getDireccion()
	 * @see #getLight()
	 * @generated
	 */
	EReference getLight_Direccion();

	/**
	 * Returns the meta object for the '{@link openGL_DSL.Light#uploadL(java.lang.Object) <em>Upload L</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Upload L</em>' operation.
	 * @see openGL_DSL.Light#uploadL(java.lang.Object)
	 * @generated
	 */
	EOperation getLight__UploadL__Object();

	/**
	 * Returns the meta object for the '{@link openGL_DSL.Light#disable() <em>Disable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disable</em>' operation.
	 * @see openGL_DSL.Light#disable()
	 * @generated
	 */
	EOperation getLight__Disable();

	/**
	 * Returns the meta object for the '{@link openGL_DSL.Light#enable() <em>Enable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enable</em>' operation.
	 * @see openGL_DSL.Light#enable()
	 * @generated
	 */
	EOperation getLight__Enable();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.DirLight <em>Dir Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dir Light</em>'.
	 * @see openGL_DSL.DirLight
	 * @generated
	 */
	EClass getDirLight();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.PosLight <em>Pos Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pos Light</em>'.
	 * @see openGL_DSL.PosLight
	 * @generated
	 */
	EClass getPosLight();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.PosLight#getKc <em>Kc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kc</em>'.
	 * @see openGL_DSL.PosLight#getKc()
	 * @see #getPosLight()
	 * @generated
	 */
	EAttribute getPosLight_Kc();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.PosLight#getKl <em>Kl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kl</em>'.
	 * @see openGL_DSL.PosLight#getKl()
	 * @see #getPosLight()
	 * @generated
	 */
	EAttribute getPosLight_Kl();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.PosLight#getKq <em>Kq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kq</em>'.
	 * @see openGL_DSL.PosLight#getKq()
	 * @see #getPosLight()
	 * @generated
	 */
	EAttribute getPosLight_Kq();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.SpotLight <em>Spot Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spot Light</em>'.
	 * @see openGL_DSL.SpotLight
	 * @generated
	 */
	EClass getSpotLight();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.SpotLight#getCutoff <em>Cutoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cutoff</em>'.
	 * @see openGL_DSL.SpotLight#getCutoff()
	 * @see #getSpotLight()
	 * @generated
	 */
	EAttribute getSpotLight_Cutoff();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.SpotLight#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exp</em>'.
	 * @see openGL_DSL.SpotLight#getExp()
	 * @see #getSpotLight()
	 * @generated
	 */
	EAttribute getSpotLight_Exp();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see openGL_DSL.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see openGL_DSL.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link openGL_DSL.Node#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Light</em>'.
	 * @see openGL_DSL.Node#getLight()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Light();

	/**
	 * Returns the meta object for the containment reference list '{@link openGL_DSL.Node#getNodo <em>Nodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodo</em>'.
	 * @see openGL_DSL.Node#getNodo()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Nodo();

	/**
	 * Returns the meta object for the containment reference list '{@link openGL_DSL.Node#getAbs_entity <em>Abs entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abs entity</em>'.
	 * @see openGL_DSL.Node#getAbs_entity()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Abs_entity();

	/**
	 * Returns the meta object for the containment reference '{@link openGL_DSL.Node#getPosicion <em>Posicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Posicion</em>'.
	 * @see openGL_DSL.Node#getPosicion()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Posicion();

	/**
	 * Returns the meta object for the containment reference '{@link openGL_DSL.Node#getRotacion <em>Rotacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotacion</em>'.
	 * @see openGL_DSL.Node#getRotacion()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Rotacion();

	/**
	 * Returns the meta object for the containment reference '{@link openGL_DSL.Node#getEscala <em>Escala</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Escala</em>'.
	 * @see openGL_DSL.Node#getEscala()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Escala();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.Abs_Entity <em>Abs Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abs Entity</em>'.
	 * @see openGL_DSL.Abs_Entity
	 * @generated
	 */
	EClass getAbs_Entity();

	/**
	 * Returns the meta object for the containment reference '{@link openGL_DSL.Abs_Entity#getMaterial <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Material</em>'.
	 * @see openGL_DSL.Abs_Entity#getMaterial()
	 * @see #getAbs_Entity()
	 * @generated
	 */
	EReference getAbs_Entity_Material();

	/**
	 * Returns the meta object for the containment reference '{@link openGL_DSL.Abs_Entity#getMesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mesh</em>'.
	 * @see openGL_DSL.Abs_Entity#getMesh()
	 * @see #getAbs_Entity()
	 * @generated
	 */
	EReference getAbs_Entity_Mesh();

	/**
	 * Returns the meta object for the containment reference '{@link openGL_DSL.Abs_Entity#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color</em>'.
	 * @see openGL_DSL.Abs_Entity#getColor()
	 * @see #getAbs_Entity()
	 * @generated
	 */
	EReference getAbs_Entity_Color();

	/**
	 * Returns the meta object for the containment reference '{@link openGL_DSL.Abs_Entity#getFrontTexture <em>Front Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Front Texture</em>'.
	 * @see openGL_DSL.Abs_Entity#getFrontTexture()
	 * @see #getAbs_Entity()
	 * @generated
	 */
	EReference getAbs_Entity_FrontTexture();

	/**
	 * Returns the meta object for the containment reference '{@link openGL_DSL.Abs_Entity#getBackTexture <em>Back Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Back Texture</em>'.
	 * @see openGL_DSL.Abs_Entity#getBackTexture()
	 * @see #getAbs_Entity()
	 * @generated
	 */
	EReference getAbs_Entity_BackTexture();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Abs_Entity#getTexturaRepeticionAncho <em>Textura Repeticion Ancho</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Textura Repeticion Ancho</em>'.
	 * @see openGL_DSL.Abs_Entity#getTexturaRepeticionAncho()
	 * @see #getAbs_Entity()
	 * @generated
	 */
	EAttribute getAbs_Entity_TexturaRepeticionAncho();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Abs_Entity#getTexturaRepeticionAlto <em>Textura Repeticion Alto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Textura Repeticion Alto</em>'.
	 * @see openGL_DSL.Abs_Entity#getTexturaRepeticionAlto()
	 * @see #getAbs_Entity()
	 * @generated
	 */
	EAttribute getAbs_Entity_TexturaRepeticionAlto();

	/**
	 * Returns the meta object for the '{@link openGL_DSL.Abs_Entity#render(java.lang.Object) <em>Render</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Render</em>' operation.
	 * @see openGL_DSL.Abs_Entity#render(java.lang.Object)
	 * @generated
	 */
	EOperation getAbs_Entity__Render__Object();

	/**
	 * Returns the meta object for the '{@link openGL_DSL.Abs_Entity#upload() <em>Upload</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Upload</em>' operation.
	 * @see openGL_DSL.Abs_Entity#upload()
	 * @generated
	 */
	EOperation getAbs_Entity__Upload();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.QuadricEntity <em>Quadric Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quadric Entity</em>'.
	 * @see openGL_DSL.QuadricEntity
	 * @generated
	 */
	EClass getQuadricEntity();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.QuadricEntity#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Q</em>'.
	 * @see openGL_DSL.QuadricEntity#getQ()
	 * @see #getQuadricEntity()
	 * @generated
	 */
	EAttribute getQuadricEntity_Q();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material</em>'.
	 * @see openGL_DSL.Material
	 * @generated
	 */
	EClass getMaterial();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Material#getAmbient <em>Ambient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ambient</em>'.
	 * @see openGL_DSL.Material#getAmbient()
	 * @see #getMaterial()
	 * @generated
	 */
	EAttribute getMaterial_Ambient();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Material#getDifusse <em>Difusse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difusse</em>'.
	 * @see openGL_DSL.Material#getDifusse()
	 * @see #getMaterial()
	 * @generated
	 */
	EAttribute getMaterial_Difusse();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Material#getSpecular <em>Specular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specular</em>'.
	 * @see openGL_DSL.Material#getSpecular()
	 * @see #getMaterial()
	 * @generated
	 */
	EAttribute getMaterial_Specular();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Material#getExpF <em>Exp F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exp F</em>'.
	 * @see openGL_DSL.Material#getExpF()
	 * @see #getMaterial()
	 * @generated
	 */
	EAttribute getMaterial_ExpF();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Material#getFace <em>Face</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Face</em>'.
	 * @see openGL_DSL.Material#getFace()
	 * @see #getMaterial()
	 * @generated
	 */
	EAttribute getMaterial_Face();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Material#getSh <em>Sh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sh</em>'.
	 * @see openGL_DSL.Material#getSh()
	 * @see #getMaterial()
	 * @generated
	 */
	EAttribute getMaterial_Sh();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.Mesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mesh</em>'.
	 * @see openGL_DSL.Mesh
	 * @generated
	 */
	EClass getMesh();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Mesh#getMPrimitive <em>MPrimitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MPrimitive</em>'.
	 * @see openGL_DSL.Mesh#getMPrimitive()
	 * @see #getMesh()
	 * @generated
	 */
	EAttribute getMesh_MPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Mesh#getNNumVertices <em>NNum Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NNum Vertices</em>'.
	 * @see openGL_DSL.Mesh#getNNumVertices()
	 * @see #getMesh()
	 * @generated
	 */
	EAttribute getMesh_NNumVertices();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Mesh#getVColors <em>VColors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VColors</em>'.
	 * @see openGL_DSL.Mesh#getVColors()
	 * @see #getMesh()
	 * @generated
	 */
	EAttribute getMesh_VColors();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Mesh#getVVertices <em>VVertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VVertices</em>'.
	 * @see openGL_DSL.Mesh#getVVertices()
	 * @see #getMesh()
	 * @generated
	 */
	EAttribute getMesh_VVertices();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Mesh#getVTexCoords <em>VTex Coords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VTex Coords</em>'.
	 * @see openGL_DSL.Mesh#getVTexCoords()
	 * @see #getMesh()
	 * @generated
	 */
	EAttribute getMesh_VTexCoords();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Mesh#getVNormals <em>VNormals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VNormals</em>'.
	 * @see openGL_DSL.Mesh#getVNormals()
	 * @see #getMesh()
	 * @generated
	 */
	EAttribute getMesh_VNormals();

	/**
	 * Returns the meta object for the '{@link openGL_DSL.Mesh#mNumVertices() <em>MNum Vertices</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>MNum Vertices</em>' operation.
	 * @see openGL_DSL.Mesh#mNumVertices()
	 * @generated
	 */
	EOperation getMesh__MNumVertices();

	/**
	 * Returns the meta object for the '{@link openGL_DSL.Mesh#render() <em>Render</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Render</em>' operation.
	 * @see openGL_DSL.Mesh#render()
	 * @generated
	 */
	EOperation getMesh__Render();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.MbR <em>Mb R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mb R</em>'.
	 * @see openGL_DSL.MbR
	 * @generated
	 */
	EClass getMbR();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.MbR#getN <em>N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>N</em>'.
	 * @see openGL_DSL.MbR#getN()
	 * @see #getMbR()
	 * @generated
	 */
	EAttribute getMbR_N();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.MbR#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M</em>'.
	 * @see openGL_DSL.MbR#getM()
	 * @see #getMbR()
	 * @generated
	 */
	EAttribute getMbR_M();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.MbR#getPerfil <em>Perfil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perfil</em>'.
	 * @see openGL_DSL.MbR#getPerfil()
	 * @see #getMbR()
	 * @generated
	 */
	EAttribute getMbR_Perfil();

	/**
	 * Returns the meta object for the '{@link openGL_DSL.MbR#generateIndexMbR(int, int, java.lang.Object) <em>Generate Index Mb R</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Index Mb R</em>' operation.
	 * @see openGL_DSL.MbR#generateIndexMbR(int, int, java.lang.Object)
	 * @generated
	 */
	EOperation getMbR__GenerateIndexMbR__int_int_Object();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.Texture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Texture</em>'.
	 * @see openGL_DSL.Texture
	 * @generated
	 */
	EClass getTexture();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Texture#getTextura <em>Textura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Textura</em>'.
	 * @see openGL_DSL.Texture#getTextura()
	 * @see #getTexture()
	 * @generated
	 */
	EAttribute getTexture_Textura();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Texture#getAlfa <em>Alfa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alfa</em>'.
	 * @see openGL_DSL.Texture#getAlfa()
	 * @see #getTexture()
	 * @generated
	 */
	EAttribute getTexture_Alfa();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.IndexMesh <em>Index Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Mesh</em>'.
	 * @see openGL_DSL.IndexMesh
	 * @generated
	 */
	EClass getIndexMesh();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.IndexMesh#getVIndices <em>VIndices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VIndices</em>'.
	 * @see openGL_DSL.IndexMesh#getVIndices()
	 * @see #getIndexMesh()
	 * @generated
	 */
	EAttribute getIndexMesh_VIndices();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.IndexMesh#getNNumIndices <em>NNum Indices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NNum Indices</em>'.
	 * @see openGL_DSL.IndexMesh#getNNumIndices()
	 * @see #getIndexMesh()
	 * @generated
	 */
	EAttribute getIndexMesh_NNumIndices();

	/**
	 * Returns the meta object for the '{@link openGL_DSL.IndexMesh#buildNormalVectors() <em>Build Normal Vectors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Normal Vectors</em>' operation.
	 * @see openGL_DSL.IndexMesh#buildNormalVectors()
	 * @generated
	 */
	EOperation getIndexMesh__BuildNormalVectors();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.EjesRGB <em>Ejes RGB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejes RGB</em>'.
	 * @see openGL_DSL.EjesRGB
	 * @generated
	 */
	EClass getEjesRGB();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.EjesRGB#getLenght <em>Lenght</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lenght</em>'.
	 * @see openGL_DSL.EjesRGB#getLenght()
	 * @see #getEjesRGB()
	 * @generated
	 */
	EAttribute getEjesRGB_Lenght();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.Vector3 <em>Vector3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector3</em>'.
	 * @see openGL_DSL.Vector3
	 * @generated
	 */
	EClass getVector3();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Vector3#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see openGL_DSL.Vector3#getX()
	 * @see #getVector3()
	 * @generated
	 */
	EAttribute getVector3_X();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Vector3#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see openGL_DSL.Vector3#getY()
	 * @see #getVector3()
	 * @generated
	 */
	EAttribute getVector3_Y();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Vector3#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see openGL_DSL.Vector3#getZ()
	 * @see #getVector3()
	 * @generated
	 */
	EAttribute getVector3_Z();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.PoligonoRegular <em>Poligono Regular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poligono Regular</em>'.
	 * @see openGL_DSL.PoligonoRegular
	 * @generated
	 */
	EClass getPoligonoRegular();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.PoligonoRegular#getNumVertices <em>Num Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Vertices</em>'.
	 * @see openGL_DSL.PoligonoRegular#getNumVertices()
	 * @see #getPoligonoRegular()
	 * @generated
	 */
	EAttribute getPoligonoRegular_NumVertices();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.PoligonoRegular#getRadio <em>Radio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radio</em>'.
	 * @see openGL_DSL.PoligonoRegular#getRadio()
	 * @see #getPoligonoRegular()
	 * @generated
	 */
	EAttribute getPoligonoRegular_Radio();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.PoligonoRegular#isRellenar <em>Rellenar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rellenar</em>'.
	 * @see openGL_DSL.PoligonoRegular#isRellenar()
	 * @see #getPoligonoRegular()
	 * @generated
	 */
	EAttribute getPoligonoRegular_Rellenar();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.Vector4 <em>Vector4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector4</em>'.
	 * @see openGL_DSL.Vector4
	 * @generated
	 */
	EClass getVector4();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Vector4#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see openGL_DSL.Vector4#getR()
	 * @see #getVector4()
	 * @generated
	 */
	EAttribute getVector4_R();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Vector4#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see openGL_DSL.Vector4#getG()
	 * @see #getVector4()
	 * @generated
	 */
	EAttribute getVector4_G();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Vector4#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see openGL_DSL.Vector4#getB()
	 * @see #getVector4()
	 * @generated
	 */
	EAttribute getVector4_B();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Vector4#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see openGL_DSL.Vector4#getA()
	 * @see #getVector4()
	 * @generated
	 */
	EAttribute getVector4_A();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.Rectangulo <em>Rectangulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangulo</em>'.
	 * @see openGL_DSL.Rectangulo
	 * @generated
	 */
	EClass getRectangulo();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Rectangulo#getAncho <em>Ancho</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ancho</em>'.
	 * @see openGL_DSL.Rectangulo#getAncho()
	 * @see #getRectangulo()
	 * @generated
	 */
	EAttribute getRectangulo_Ancho();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Rectangulo#getAlto <em>Alto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alto</em>'.
	 * @see openGL_DSL.Rectangulo#getAlto()
	 * @see #getRectangulo()
	 * @generated
	 */
	EAttribute getRectangulo_Alto();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Rectangulo#isRellenar <em>Rellenar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rellenar</em>'.
	 * @see openGL_DSL.Rectangulo#isRellenar()
	 * @see #getRectangulo()
	 * @generated
	 */
	EAttribute getRectangulo_Rellenar();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.Circulo <em>Circulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circulo</em>'.
	 * @see openGL_DSL.Circulo
	 * @generated
	 */
	EClass getCirculo();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Circulo#getRadio <em>Radio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radio</em>'.
	 * @see openGL_DSL.Circulo#getRadio()
	 * @see #getCirculo()
	 * @generated
	 */
	EAttribute getCirculo_Radio();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Circulo#isRellenar <em>Rellenar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rellenar</em>'.
	 * @see openGL_DSL.Circulo#isRellenar()
	 * @see #getCirculo()
	 * @generated
	 */
	EAttribute getCirculo_Rellenar();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.Esfera <em>Esfera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Esfera</em>'.
	 * @see openGL_DSL.Esfera
	 * @generated
	 */
	EClass getEsfera();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Esfera#getRadio <em>Radio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radio</em>'.
	 * @see openGL_DSL.Esfera#getRadio()
	 * @see #getEsfera()
	 * @generated
	 */
	EAttribute getEsfera_Radio();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.Cilindro <em>Cilindro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cilindro</em>'.
	 * @see openGL_DSL.Cilindro
	 * @generated
	 */
	EClass getCilindro();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Cilindro#getRadioBase <em>Radio Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radio Base</em>'.
	 * @see openGL_DSL.Cilindro#getRadioBase()
	 * @see #getCilindro()
	 * @generated
	 */
	EAttribute getCilindro_RadioBase();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Cilindro#getRadioTope <em>Radio Tope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radio Tope</em>'.
	 * @see openGL_DSL.Cilindro#getRadioTope()
	 * @see #getCilindro()
	 * @generated
	 */
	EAttribute getCilindro_RadioTope();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Cilindro#getAltura <em>Altura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altura</em>'.
	 * @see openGL_DSL.Cilindro#getAltura()
	 * @see #getCilindro()
	 * @generated
	 */
	EAttribute getCilindro_Altura();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.Disco <em>Disco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disco</em>'.
	 * @see openGL_DSL.Disco
	 * @generated
	 */
	EClass getDisco();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Disco#getRadioInterno <em>Radio Interno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radio Interno</em>'.
	 * @see openGL_DSL.Disco#getRadioInterno()
	 * @see #getDisco()
	 * @generated
	 */
	EAttribute getDisco_RadioInterno();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Disco#getRadioExterno <em>Radio Externo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radio Externo</em>'.
	 * @see openGL_DSL.Disco#getRadioExterno()
	 * @see #getDisco()
	 * @generated
	 */
	EAttribute getDisco_RadioExterno();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.DiscoParcial <em>Disco Parcial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disco Parcial</em>'.
	 * @see openGL_DSL.DiscoParcial
	 * @generated
	 */
	EClass getDiscoParcial();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.DiscoParcial#getRadioInterno <em>Radio Interno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radio Interno</em>'.
	 * @see openGL_DSL.DiscoParcial#getRadioInterno()
	 * @see #getDiscoParcial()
	 * @generated
	 */
	EAttribute getDiscoParcial_RadioInterno();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.DiscoParcial#getRadioExterno <em>Radio Externo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radio Externo</em>'.
	 * @see openGL_DSL.DiscoParcial#getRadioExterno()
	 * @see #getDiscoParcial()
	 * @generated
	 */
	EAttribute getDiscoParcial_RadioExterno();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.DiscoParcial#getAnguloInicio <em>Angulo Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angulo Inicio</em>'.
	 * @see openGL_DSL.DiscoParcial#getAnguloInicio()
	 * @see #getDiscoParcial()
	 * @generated
	 */
	EAttribute getDiscoParcial_AnguloInicio();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.DiscoParcial#getAmplitudAngulo <em>Amplitud Angulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amplitud Angulo</em>'.
	 * @see openGL_DSL.DiscoParcial#getAmplitudAngulo()
	 * @see #getDiscoParcial()
	 * @generated
	 */
	EAttribute getDiscoParcial_AmplitudAngulo();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.Cubo <em>Cubo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cubo</em>'.
	 * @see openGL_DSL.Cubo
	 * @generated
	 */
	EClass getCubo();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Cubo#getLenght <em>Lenght</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lenght</em>'.
	 * @see openGL_DSL.Cubo#getLenght()
	 * @see #getCubo()
	 * @generated
	 */
	EAttribute getCubo_Lenght();

	/**
	 * Returns the meta object for class '{@link openGL_DSL.Toroide <em>Toroide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toroide</em>'.
	 * @see openGL_DSL.Toroide
	 * @generated
	 */
	EClass getToroide();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Toroide#getRadioCentro <em>Radio Centro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radio Centro</em>'.
	 * @see openGL_DSL.Toroide#getRadioCentro()
	 * @see #getToroide()
	 * @generated
	 */
	EAttribute getToroide_RadioCentro();

	/**
	 * Returns the meta object for the attribute '{@link openGL_DSL.Toroide#getRadioAnillo <em>Radio Anillo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radio Anillo</em>'.
	 * @see openGL_DSL.Toroide#getRadioAnillo()
	 * @see #getToroide()
	 * @generated
	 */
	EAttribute getToroide_RadioAnillo();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>GLsizei</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GLsizei</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getGLsizei();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>GLuint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GLuint</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getGLuint();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>vec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>vec2</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getvec2();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>vec3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>vec3</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getvec3();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>vec4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>vec4</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getvec4();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>mat4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>mat4</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getmat4();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>GLquadric Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GLquadric Obj</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getGLquadricObj();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OpenGL_DSLFactory getOpenGL_DSLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.SceneManagerImpl <em>Scene Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.SceneManagerImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getSceneManager()
		 * @generated
		 */
		EClass SCENE_MANAGER = eINSTANCE.getSceneManager();

		/**
		 * The meta object literal for the '<em><b>Win Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_MANAGER__WIN_ID = eINSTANCE.getSceneManager_WinId();

		/**
		 * The meta object literal for the '<em><b>Win W</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_MANAGER__WIN_W = eINSTANCE.getSceneManager_WinW();

		/**
		 * The meta object literal for the '<em><b>Win H</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_MANAGER__WIN_H = eINSTANCE.getSceneManager_WinH();

		/**
		 * The meta object literal for the '<em><b>Viewport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE_MANAGER__VIEWPORT = eINSTANCE.getSceneManager_Viewport();

		/**
		 * The meta object literal for the '<em><b>Camera</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE_MANAGER__CAMERA = eINSTANCE.getSceneManager_Camera();

		/**
		 * The meta object literal for the '<em><b>Scenes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE_MANAGER__SCENES = eINSTANCE.getSceneManager_Scenes();

		/**
		 * The meta object literal for the '<em><b>MStop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE_MANAGER__MSTOP = eINSTANCE.getSceneManager_MStop();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCENE_MANAGER___RUN = eINSTANCE.getSceneManager__Run();

		/**
		 * The meta object literal for the '<em><b>Close</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCENE_MANAGER___CLOSE = eINSTANCE.getSceneManager__Close();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.ViewPortImpl <em>View Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.ViewPortImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getViewPort()
		 * @generated
		 */
		EClass VIEW_PORT = eINSTANCE.getViewPort();

		/**
		 * The meta object literal for the '<em><b>XLeft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_PORT__XLEFT = eINSTANCE.getViewPort_XLeft();

		/**
		 * The meta object literal for the '<em><b>YBolt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_PORT__YBOLT = eINSTANCE.getViewPort_YBolt();

		/**
		 * The meta object literal for the '<em><b>XWidth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_PORT__XWIDTH = eINSTANCE.getViewPort_XWidth();

		/**
		 * The meta object literal for the '<em><b>YHeight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_PORT__YHEIGHT = eINSTANCE.getViewPort_YHeight();

		/**
		 * The meta object literal for the '<em><b>Upload</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIEW_PORT___UPLOAD = eINSTANCE.getViewPort__Upload();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.CameraImpl <em>Camera</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.CameraImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getCamera()
		 * @generated
		 */
		EClass CAMERA = eINSTANCE.getCamera();

		/**
		 * The meta object literal for the '<em><b>MEye</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA__MEYE = eINSTANCE.getCamera_MEye();

		/**
		 * The meta object literal for the '<em><b>MLook</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA__MLOOK = eINSTANCE.getCamera_MLook();

		/**
		 * The meta object literal for the '<em><b>MUp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA__MUP = eINSTANCE.getCamera_MUp();

		/**
		 * The meta object literal for the '<em><b>Model View Mat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA__MODEL_VIEW_MAT = eINSTANCE.getCamera_ModelViewMat();

		/**
		 * The meta object literal for the '<em><b>MProj Mat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA__MPROJ_MAT = eINSTANCE.getCamera_MProjMat();

		/**
		 * The meta object literal for the '<em><b>MNear Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA__MNEAR_VAL = eINSTANCE.getCamera_MNearVal();

		/**
		 * The meta object literal for the '<em><b>MFar Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA__MFAR_VAL = eINSTANCE.getCamera_MFarVal();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.SceneImpl <em>Scene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.SceneImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getScene()
		 * @generated
		 */
		EClass SCENE = eINSTANCE.getScene();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE__NAME = eINSTANCE.getScene_Name();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE__VISIBLE = eINSTANCE.getScene_Visible();

		/**
		 * The meta object literal for the '<em><b>Nodo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__NODO = eINSTANCE.getScene_Nodo();

		/**
		 * The meta object literal for the '<em><b>Add Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCENE___ADD_NODE = eINSTANCE.getScene__AddNode();

		/**
		 * The meta object literal for the '{@link openGL_DSL.Light <em>Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.Light
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getLight()
		 * @generated
		 */
		EClass LIGHT = eINSTANCE.getLight();

		/**
		 * The meta object literal for the '<em><b>Cont</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT__CONT = eINSTANCE.getLight_Cont();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT__ID = eINSTANCE.getLight_Id();

		/**
		 * The meta object literal for the '<em><b>Pos DIr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT__POS_DIR = eINSTANCE.getLight_PosDIr();

		/**
		 * The meta object literal for the '<em><b>Ambient</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIGHT__AMBIENT = eINSTANCE.getLight_Ambient();

		/**
		 * The meta object literal for the '<em><b>Difusse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIGHT__DIFUSSE = eINSTANCE.getLight_Difusse();

		/**
		 * The meta object literal for the '<em><b>Specular</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIGHT__SPECULAR = eINSTANCE.getLight_Specular();

		/**
		 * The meta object literal for the '<em><b>Direccion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIGHT__DIRECCION = eINSTANCE.getLight_Direccion();

		/**
		 * The meta object literal for the '<em><b>Upload L</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIGHT___UPLOAD_L__OBJECT = eINSTANCE.getLight__UploadL__Object();

		/**
		 * The meta object literal for the '<em><b>Disable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIGHT___DISABLE = eINSTANCE.getLight__Disable();

		/**
		 * The meta object literal for the '<em><b>Enable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIGHT___ENABLE = eINSTANCE.getLight__Enable();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.DirLightImpl <em>Dir Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.DirLightImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getDirLight()
		 * @generated
		 */
		EClass DIR_LIGHT = eINSTANCE.getDirLight();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.PosLightImpl <em>Pos Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.PosLightImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getPosLight()
		 * @generated
		 */
		EClass POS_LIGHT = eINSTANCE.getPosLight();

		/**
		 * The meta object literal for the '<em><b>Kc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POS_LIGHT__KC = eINSTANCE.getPosLight_Kc();

		/**
		 * The meta object literal for the '<em><b>Kl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POS_LIGHT__KL = eINSTANCE.getPosLight_Kl();

		/**
		 * The meta object literal for the '<em><b>Kq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POS_LIGHT__KQ = eINSTANCE.getPosLight_Kq();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.SpotLightImpl <em>Spot Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.SpotLightImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getSpotLight()
		 * @generated
		 */
		EClass SPOT_LIGHT = eINSTANCE.getSpotLight();

		/**
		 * The meta object literal for the '<em><b>Cutoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPOT_LIGHT__CUTOFF = eINSTANCE.getSpotLight_Cutoff();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPOT_LIGHT__EXP = eINSTANCE.getSpotLight_Exp();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.NodeImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__LIGHT = eINSTANCE.getNode_Light();

		/**
		 * The meta object literal for the '<em><b>Nodo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__NODO = eINSTANCE.getNode_Nodo();

		/**
		 * The meta object literal for the '<em><b>Abs entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ABS_ENTITY = eINSTANCE.getNode_Abs_entity();

		/**
		 * The meta object literal for the '<em><b>Posicion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__POSICION = eINSTANCE.getNode_Posicion();

		/**
		 * The meta object literal for the '<em><b>Rotacion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ROTACION = eINSTANCE.getNode_Rotacion();

		/**
		 * The meta object literal for the '<em><b>Escala</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ESCALA = eINSTANCE.getNode_Escala();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.Abs_EntityImpl <em>Abs Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.Abs_EntityImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getAbs_Entity()
		 * @generated
		 */
		EClass ABS_ENTITY = eINSTANCE.getAbs_Entity();

		/**
		 * The meta object literal for the '<em><b>Material</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABS_ENTITY__MATERIAL = eINSTANCE.getAbs_Entity_Material();

		/**
		 * The meta object literal for the '<em><b>Mesh</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABS_ENTITY__MESH = eINSTANCE.getAbs_Entity_Mesh();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABS_ENTITY__COLOR = eINSTANCE.getAbs_Entity_Color();

		/**
		 * The meta object literal for the '<em><b>Front Texture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABS_ENTITY__FRONT_TEXTURE = eINSTANCE.getAbs_Entity_FrontTexture();

		/**
		 * The meta object literal for the '<em><b>Back Texture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABS_ENTITY__BACK_TEXTURE = eINSTANCE.getAbs_Entity_BackTexture();

		/**
		 * The meta object literal for the '<em><b>Textura Repeticion Ancho</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABS_ENTITY__TEXTURA_REPETICION_ANCHO = eINSTANCE.getAbs_Entity_TexturaRepeticionAncho();

		/**
		 * The meta object literal for the '<em><b>Textura Repeticion Alto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABS_ENTITY__TEXTURA_REPETICION_ALTO = eINSTANCE.getAbs_Entity_TexturaRepeticionAlto();

		/**
		 * The meta object literal for the '<em><b>Render</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABS_ENTITY___RENDER__OBJECT = eINSTANCE.getAbs_Entity__Render__Object();

		/**
		 * The meta object literal for the '<em><b>Upload</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABS_ENTITY___UPLOAD = eINSTANCE.getAbs_Entity__Upload();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.QuadricEntityImpl <em>Quadric Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.QuadricEntityImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getQuadricEntity()
		 * @generated
		 */
		EClass QUADRIC_ENTITY = eINSTANCE.getQuadricEntity();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUADRIC_ENTITY__Q = eINSTANCE.getQuadricEntity_Q();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.MaterialImpl <em>Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.MaterialImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getMaterial()
		 * @generated
		 */
		EClass MATERIAL = eINSTANCE.getMaterial();

		/**
		 * The meta object literal for the '<em><b>Ambient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL__AMBIENT = eINSTANCE.getMaterial_Ambient();

		/**
		 * The meta object literal for the '<em><b>Difusse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL__DIFUSSE = eINSTANCE.getMaterial_Difusse();

		/**
		 * The meta object literal for the '<em><b>Specular</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL__SPECULAR = eINSTANCE.getMaterial_Specular();

		/**
		 * The meta object literal for the '<em><b>Exp F</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL__EXP_F = eINSTANCE.getMaterial_ExpF();

		/**
		 * The meta object literal for the '<em><b>Face</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL__FACE = eINSTANCE.getMaterial_Face();

		/**
		 * The meta object literal for the '<em><b>Sh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL__SH = eINSTANCE.getMaterial_Sh();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.MeshImpl <em>Mesh</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.MeshImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getMesh()
		 * @generated
		 */
		EClass MESH = eINSTANCE.getMesh();

		/**
		 * The meta object literal for the '<em><b>MPrimitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH__MPRIMITIVE = eINSTANCE.getMesh_MPrimitive();

		/**
		 * The meta object literal for the '<em><b>NNum Vertices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH__NNUM_VERTICES = eINSTANCE.getMesh_NNumVertices();

		/**
		 * The meta object literal for the '<em><b>VColors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH__VCOLORS = eINSTANCE.getMesh_VColors();

		/**
		 * The meta object literal for the '<em><b>VVertices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH__VVERTICES = eINSTANCE.getMesh_VVertices();

		/**
		 * The meta object literal for the '<em><b>VTex Coords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH__VTEX_COORDS = eINSTANCE.getMesh_VTexCoords();

		/**
		 * The meta object literal for the '<em><b>VNormals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH__VNORMALS = eINSTANCE.getMesh_VNormals();

		/**
		 * The meta object literal for the '<em><b>MNum Vertices</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESH___MNUM_VERTICES = eINSTANCE.getMesh__MNumVertices();

		/**
		 * The meta object literal for the '<em><b>Render</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESH___RENDER = eINSTANCE.getMesh__Render();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.MbRImpl <em>Mb R</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.MbRImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getMbR()
		 * @generated
		 */
		EClass MB_R = eINSTANCE.getMbR();

		/**
		 * The meta object literal for the '<em><b>N</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MB_R__N = eINSTANCE.getMbR_N();

		/**
		 * The meta object literal for the '<em><b>M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MB_R__M = eINSTANCE.getMbR_M();

		/**
		 * The meta object literal for the '<em><b>Perfil</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MB_R__PERFIL = eINSTANCE.getMbR_Perfil();

		/**
		 * The meta object literal for the '<em><b>Generate Index Mb R</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MB_R___GENERATE_INDEX_MB_R__INT_INT_OBJECT = eINSTANCE.getMbR__GenerateIndexMbR__int_int_Object();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.TextureImpl <em>Texture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.TextureImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getTexture()
		 * @generated
		 */
		EClass TEXTURE = eINSTANCE.getTexture();

		/**
		 * The meta object literal for the '<em><b>Textura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE__TEXTURA = eINSTANCE.getTexture_Textura();

		/**
		 * The meta object literal for the '<em><b>Alfa</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE__ALFA = eINSTANCE.getTexture_Alfa();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.IndexMeshImpl <em>Index Mesh</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.IndexMeshImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getIndexMesh()
		 * @generated
		 */
		EClass INDEX_MESH = eINSTANCE.getIndexMesh();

		/**
		 * The meta object literal for the '<em><b>VIndices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_MESH__VINDICES = eINSTANCE.getIndexMesh_VIndices();

		/**
		 * The meta object literal for the '<em><b>NNum Indices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_MESH__NNUM_INDICES = eINSTANCE.getIndexMesh_NNumIndices();

		/**
		 * The meta object literal for the '<em><b>Build Normal Vectors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INDEX_MESH___BUILD_NORMAL_VECTORS = eINSTANCE.getIndexMesh__BuildNormalVectors();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.EjesRGBImpl <em>Ejes RGB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.EjesRGBImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getEjesRGB()
		 * @generated
		 */
		EClass EJES_RGB = eINSTANCE.getEjesRGB();

		/**
		 * The meta object literal for the '<em><b>Lenght</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJES_RGB__LENGHT = eINSTANCE.getEjesRGB_Lenght();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.Vector3Impl <em>Vector3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.Vector3Impl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getVector3()
		 * @generated
		 */
		EClass VECTOR3 = eINSTANCE.getVector3();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3__X = eINSTANCE.getVector3_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3__Y = eINSTANCE.getVector3_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3__Z = eINSTANCE.getVector3_Z();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.PoligonoRegularImpl <em>Poligono Regular</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.PoligonoRegularImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getPoligonoRegular()
		 * @generated
		 */
		EClass POLIGONO_REGULAR = eINSTANCE.getPoligonoRegular();

		/**
		 * The meta object literal for the '<em><b>Num Vertices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIGONO_REGULAR__NUM_VERTICES = eINSTANCE.getPoligonoRegular_NumVertices();

		/**
		 * The meta object literal for the '<em><b>Radio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIGONO_REGULAR__RADIO = eINSTANCE.getPoligonoRegular_Radio();

		/**
		 * The meta object literal for the '<em><b>Rellenar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLIGONO_REGULAR__RELLENAR = eINSTANCE.getPoligonoRegular_Rellenar();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.Vector4Impl <em>Vector4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.Vector4Impl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getVector4()
		 * @generated
		 */
		EClass VECTOR4 = eINSTANCE.getVector4();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR4__R = eINSTANCE.getVector4_R();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR4__G = eINSTANCE.getVector4_G();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR4__B = eINSTANCE.getVector4_B();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR4__A = eINSTANCE.getVector4_A();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.RectanguloImpl <em>Rectangulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.RectanguloImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getRectangulo()
		 * @generated
		 */
		EClass RECTANGULO = eINSTANCE.getRectangulo();

		/**
		 * The meta object literal for the '<em><b>Ancho</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULO__ANCHO = eINSTANCE.getRectangulo_Ancho();

		/**
		 * The meta object literal for the '<em><b>Alto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULO__ALTO = eINSTANCE.getRectangulo_Alto();

		/**
		 * The meta object literal for the '<em><b>Rellenar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULO__RELLENAR = eINSTANCE.getRectangulo_Rellenar();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.CirculoImpl <em>Circulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.CirculoImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getCirculo()
		 * @generated
		 */
		EClass CIRCULO = eINSTANCE.getCirculo();

		/**
		 * The meta object literal for the '<em><b>Radio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCULO__RADIO = eINSTANCE.getCirculo_Radio();

		/**
		 * The meta object literal for the '<em><b>Rellenar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCULO__RELLENAR = eINSTANCE.getCirculo_Rellenar();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.EsferaImpl <em>Esfera</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.EsferaImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getEsfera()
		 * @generated
		 */
		EClass ESFERA = eINSTANCE.getEsfera();

		/**
		 * The meta object literal for the '<em><b>Radio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESFERA__RADIO = eINSTANCE.getEsfera_Radio();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.CilindroImpl <em>Cilindro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.CilindroImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getCilindro()
		 * @generated
		 */
		EClass CILINDRO = eINSTANCE.getCilindro();

		/**
		 * The meta object literal for the '<em><b>Radio Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CILINDRO__RADIO_BASE = eINSTANCE.getCilindro_RadioBase();

		/**
		 * The meta object literal for the '<em><b>Radio Tope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CILINDRO__RADIO_TOPE = eINSTANCE.getCilindro_RadioTope();

		/**
		 * The meta object literal for the '<em><b>Altura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CILINDRO__ALTURA = eINSTANCE.getCilindro_Altura();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.DiscoImpl <em>Disco</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.DiscoImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getDisco()
		 * @generated
		 */
		EClass DISCO = eINSTANCE.getDisco();

		/**
		 * The meta object literal for the '<em><b>Radio Interno</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCO__RADIO_INTERNO = eINSTANCE.getDisco_RadioInterno();

		/**
		 * The meta object literal for the '<em><b>Radio Externo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCO__RADIO_EXTERNO = eINSTANCE.getDisco_RadioExterno();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.DiscoParcialImpl <em>Disco Parcial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.DiscoParcialImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getDiscoParcial()
		 * @generated
		 */
		EClass DISCO_PARCIAL = eINSTANCE.getDiscoParcial();

		/**
		 * The meta object literal for the '<em><b>Radio Interno</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCO_PARCIAL__RADIO_INTERNO = eINSTANCE.getDiscoParcial_RadioInterno();

		/**
		 * The meta object literal for the '<em><b>Radio Externo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCO_PARCIAL__RADIO_EXTERNO = eINSTANCE.getDiscoParcial_RadioExterno();

		/**
		 * The meta object literal for the '<em><b>Angulo Inicio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCO_PARCIAL__ANGULO_INICIO = eINSTANCE.getDiscoParcial_AnguloInicio();

		/**
		 * The meta object literal for the '<em><b>Amplitud Angulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCO_PARCIAL__AMPLITUD_ANGULO = eINSTANCE.getDiscoParcial_AmplitudAngulo();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.CuboImpl <em>Cubo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.CuboImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getCubo()
		 * @generated
		 */
		EClass CUBO = eINSTANCE.getCubo();

		/**
		 * The meta object literal for the '<em><b>Lenght</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUBO__LENGHT = eINSTANCE.getCubo_Lenght();

		/**
		 * The meta object literal for the '{@link openGL_DSL.impl.ToroideImpl <em>Toroide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openGL_DSL.impl.ToroideImpl
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getToroide()
		 * @generated
		 */
		EClass TOROIDE = eINSTANCE.getToroide();

		/**
		 * The meta object literal for the '<em><b>Radio Centro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOROIDE__RADIO_CENTRO = eINSTANCE.getToroide_RadioCentro();

		/**
		 * The meta object literal for the '<em><b>Radio Anillo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOROIDE__RADIO_ANILLO = eINSTANCE.getToroide_RadioAnillo();

		/**
		 * The meta object literal for the '<em>GLsizei</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getGLsizei()
		 * @generated
		 */
		EDataType GLSIZEI = eINSTANCE.getGLsizei();

		/**
		 * The meta object literal for the '<em>GLuint</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getGLuint()
		 * @generated
		 */
		EDataType GLUINT = eINSTANCE.getGLuint();

		/**
		 * The meta object literal for the '<em>vec2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getvec2()
		 * @generated
		 */
		EDataType VEC2 = eINSTANCE.getvec2();

		/**
		 * The meta object literal for the '<em>vec3</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getvec3()
		 * @generated
		 */
		EDataType VEC3 = eINSTANCE.getvec3();

		/**
		 * The meta object literal for the '<em>vec4</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getvec4()
		 * @generated
		 */
		EDataType VEC4 = eINSTANCE.getvec4();

		/**
		 * The meta object literal for the '<em>mat4</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getmat4()
		 * @generated
		 */
		EDataType MAT4 = eINSTANCE.getmat4();

		/**
		 * The meta object literal for the '<em>GLquadric Obj</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see openGL_DSL.impl.OpenGL_DSLPackageImpl#getGLquadricObj()
		 * @generated
		 */
		EDataType GLQUADRIC_OBJ = eINSTANCE.getGLquadricObj();

	}

} //OpenGL_DSLPackage

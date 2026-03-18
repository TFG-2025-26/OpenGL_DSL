/**
 */
package openGL_DSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scene Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openGL_DSL.SceneManager#getWinId <em>Win Id</em>}</li>
 *   <li>{@link openGL_DSL.SceneManager#getWinW <em>Win W</em>}</li>
 *   <li>{@link openGL_DSL.SceneManager#getWinH <em>Win H</em>}</li>
 *   <li>{@link openGL_DSL.SceneManager#getViewport <em>Viewport</em>}</li>
 *   <li>{@link openGL_DSL.SceneManager#getCamera <em>Camera</em>}</li>
 *   <li>{@link openGL_DSL.SceneManager#getScenes <em>Scenes</em>}</li>
 *   <li>{@link openGL_DSL.SceneManager#isMStop <em>MStop</em>}</li>
 * </ul>
 *
 * @see openGL_DSL.OpenGL_DSLPackage#getSceneManager()
 * @model
 * @generated
 */
public interface SceneManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Win Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Win Id</em>' attribute.
	 * @see #setWinId(int)
	 * @see openGL_DSL.OpenGL_DSLPackage#getSceneManager_WinId()
	 * @model
	 * @generated
	 */
	int getWinId();

	/**
	 * Sets the value of the '{@link openGL_DSL.SceneManager#getWinId <em>Win Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Win Id</em>' attribute.
	 * @see #getWinId()
	 * @generated
	 */
	void setWinId(int value);

	/**
	 * Returns the value of the '<em><b>Win W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Win W</em>' attribute.
	 * @see #setWinW(int)
	 * @see openGL_DSL.OpenGL_DSLPackage#getSceneManager_WinW()
	 * @model
	 * @generated
	 */
	int getWinW();

	/**
	 * Sets the value of the '{@link openGL_DSL.SceneManager#getWinW <em>Win W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Win W</em>' attribute.
	 * @see #getWinW()
	 * @generated
	 */
	void setWinW(int value);

	/**
	 * Returns the value of the '<em><b>Win H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Win H</em>' attribute.
	 * @see #setWinH(int)
	 * @see openGL_DSL.OpenGL_DSLPackage#getSceneManager_WinH()
	 * @model
	 * @generated
	 */
	int getWinH();

	/**
	 * Sets the value of the '{@link openGL_DSL.SceneManager#getWinH <em>Win H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Win H</em>' attribute.
	 * @see #getWinH()
	 * @generated
	 */
	void setWinH(int value);

	/**
	 * Returns the value of the '<em><b>Viewport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewport</em>' containment reference.
	 * @see #setViewport(ViewPort)
	 * @see openGL_DSL.OpenGL_DSLPackage#getSceneManager_Viewport()
	 * @model containment="true"
	 * @generated
	 */
	ViewPort getViewport();

	/**
	 * Sets the value of the '{@link openGL_DSL.SceneManager#getViewport <em>Viewport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewport</em>' containment reference.
	 * @see #getViewport()
	 * @generated
	 */
	void setViewport(ViewPort value);

	/**
	 * Returns the value of the '<em><b>Camera</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Camera</em>' containment reference.
	 * @see #setCamera(Camera)
	 * @see openGL_DSL.OpenGL_DSLPackage#getSceneManager_Camera()
	 * @model containment="true"
	 * @generated
	 */
	Camera getCamera();

	/**
	 * Sets the value of the '{@link openGL_DSL.SceneManager#getCamera <em>Camera</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camera</em>' containment reference.
	 * @see #getCamera()
	 * @generated
	 */
	void setCamera(Camera value);

	/**
	 * Returns the value of the '<em><b>Scenes</b></em>' containment reference list.
	 * The list contents are of type {@link openGL_DSL.Scene}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenes</em>' containment reference list.
	 * @see openGL_DSL.OpenGL_DSLPackage#getSceneManager_Scenes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scene> getScenes();

	/**
	 * Returns the value of the '<em><b>MStop</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MStop</em>' attribute.
	 * @see #setMStop(boolean)
	 * @see openGL_DSL.OpenGL_DSLPackage#getSceneManager_MStop()
	 * @model default="False"
	 * @generated
	 */
	boolean isMStop();

	/**
	 * Sets the value of the '{@link openGL_DSL.SceneManager#isMStop <em>MStop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MStop</em>' attribute.
	 * @see #isMStop()
	 * @generated
	 */
	void setMStop(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close();

} // SceneManager

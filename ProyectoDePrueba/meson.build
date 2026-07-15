#
# OpenGL projects skeleton for non-Visual Studio environments (namely Linux or macOS)
#
# This is a Meson (https://mesonbuild.com/Quick-guide.html) build script
#
# It uses the OpenGL, freeglut and glm libraries installed in the system (for example,
# in Ubuntu/Debian, they can be installed with "sudo apt install freeglut3-dev libglm-dev").
#
# Execute "meson configure -Db_sanitize=address" in the build directory to enable
# memory leak detection.
#

project('ProyectoDePrueba', 'cpp', version: '1.0', default_options : ['cpp_std=c++20'])

# Program dependencies
dependencies = [
	dependency('gl'),
	dependency('freeglut'),
	dependency('glm'),
]

# Source code files that will be compiled
sourceFiles = [
	'src/Camera.cpp',
    'src/Entity.cpp',
    'src/Light.cpp',
    'src/main.cpp',
    'src/Material.cpp',
    'src/Mesh.cpp',
    'src/Node.cpp',
    'src/Pixmap32RGBA.cpp',
    'src/Scene.cpp',
    'src/Texture.cpp',
    'src/Viewport.cpp',
]

# Build a binary whose name is ig1app
executable('ProyectoDePrueba', sourceFiles, dependencies: dependencies)

# OpenGL projects skeleton

This skeleton uses the following libraries:

* [freeglut](https://freeglut.sourceforge.net/) for managing OpenGL windows
* [glm](https://glm.g-truc.net/) for the CPU mathematical operations that follow the specifications of the GPU mathematical operations in OpenGL

When creating a new project, remember to add the property sheet `HojaDePropiedades.props` to it.
Menu Ver -> Otras ventanas -> Administrador de propiedades -> Agregar hoja de propiedades existente -> HojaDePropiedades.props -> Guardar

In order to add a new library, copy its directory into the solution root and update the elements `IncludePath`, `LibraryPath`, `AdditionalDependencies`, and `LocalDebuggerEnvironment` in `HojaDePropiedades.props`.

You can also create new property sheets.

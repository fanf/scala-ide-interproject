Scala IDE, m2e-scala and multi-modules
================

This project is a basic multi-project, multi-module installation that may be used to 
demonstrate how Scala IDE compilation behave in such a workspace.

More information may be found in https://www.assembla.com/spaces/scala-ide/wiki/Multi-modules_use_cases_with_Maven

### Basic installation

1. install Eclipse 3.7
2. install install [m2eclipse-scala](https://www.assembla.com/spaces/scala-ide/wiki/With_M2Eclipse)
3. somewhere, clone that repos: git clone git@github.com:fanf/scala-ide-interproject.git
4. in eclipse, "import... Maven > Existing Maven Projects", and choose the "somewhere" folder.

You should see five projects in your Eclipse workspace. 

Now, modify code and see how error are reported in dependant modules. Try to clean some modules, all modules, etc.  


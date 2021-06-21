public class Menu{
	int opcion;
	int opcion2;
	int opcion3;
	int opcion4;
	ObtenerTexto oT=new ObtenerTexto();
	MenuPersona mP=new MenuPersona();
	MenuVehiculos mVehiculos=new MenuVehiculos();
	MenuUsuarios mUsuario=new MenuUsuarios();

	public void menuAdministrador(){
		System.out.println("--- Menu Administrador ---");
		System.out.println("1. Clientes");
		System.out.println("2. Vehiculos");
		System.out.println("3. Usuarios");
		System.out.println("4. Cerrar Sesion");
		System.out.println("5. Salir");
		System.out.println("");
		System.out.println("Elija su opcion");
		opcion=oT.textoEntero();

		switch(opcion){
			case 1:
				System.out.println("--- Opciones para Clientes ---");
				System.out.println("1. Ingresar");
				System.out.println("2. Modificar");
				System.out.println("3. Eliminar");
				System.out.println("4. Reporte");
				System.out.println("5. Regresar");
				System.out.println("");
				System.out.println("Elija su opcion");
				opcion2=oT.textoEntero();
				
				switch(opcion2){
					case 1:
						mP.menuIngreso();
						break;
				}	

			case 2:
				System.out.println("--- Opciones para Vehiculos ---");
				System.out.println("1. Ingresar");
				System.out.println("2. Modificar");
				System.out.println("3. Eliminar");
				System.out.println("4. Reporte");
				System.out.println("5. Regresar");
				System.out.println("");
				System.out.println("Elija su opcion");
				opcion3=oT.textoEntero();

				switch(opcion3){
					case 1:
					mVehiculos.menuIngresoVehiculo();
				}

			case 3:
			System.out.println("--- Opciones para Usuarios ---");
				System.out.println("1. Ingresar");
				System.out.println("2. Modificar");
				System.out.println("3. Eliminar");
				System.out.println("4. Reporte");
				System.out.println("5. Regresar");
				System.out.println("");
				System.out.println("Elija su opcion");
				opcion4=oT.textoEntero();

				switch(opcion4){
					case 1:
					mUsuario.menuIngresoUser();
				}
		}
	}
}
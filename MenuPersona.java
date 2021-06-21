public class MenuPersona{
	String nombre;
	String apellido;
	int telefono;
	String vehiculo;
	String decision;
	ManejadorPersona mPersona=new ManejadorPersona();
	ObtenerTexto oT=new ObtenerTexto();

	public void menuIngreso(){
		do{
		System.out.println("------------------------------");
		System.out.println("Ingrese el nombre");
		nombre=oT.texto();
		System.out.println("Ingrese el apellido");
		apellido=oT.texto();
		System.out.println("Ingrese el telefono");
		telefono=oT.textoEntero();
		System.out.println("Ingrese el vehiculo");
		vehiculo=oT.texto();		
		mPersona.ingresoPersona(nombre,apellido,vehiculo,telefono);
		System.out.println("Desea ingresar otro cliente?");
		decision=oT.texto();
		}while(decision.equals("si"));
	}
}
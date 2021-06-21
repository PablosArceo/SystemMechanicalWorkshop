public class MenuVehiculos{
	int id;
    String marca;
	String modelo;
	String placa;
	String color;
	String decision;
	ManejadorVehiculos mVehiculo=new ManejadorVehiculos();
	ObtenerTexto oT=new ObtenerTexto();

	public void menuIngresoVehiculo(){
		do{
		System.out.println("------------------------------");
		System.out.println("Ingrese la id del dueño");
		id=oT.textoEntero();
		System.out.println("Ingrese la marca");
		marca=oT.texto();
		System.out.println("Ingrese el modelo");
		modelo=oT.texto();
		System.out.println("Ingrese la placa");
		placa=oT.texto();
		System.out.println("Ingrese el color");
		color=oT.texto();		
		mVehiculo.ingresoVehiculo(marca,modelo,placa,color);
		System.out.println("Desea ingresar otro vehiculo?");
		decision=oT.texto();
		}while(decision.equals("si"));
	}	
}

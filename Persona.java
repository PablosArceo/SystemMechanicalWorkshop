public class Persona{
	int id;
	String nombre;
	String apellido;
	String vehiculo;
	int telefono;
	
	public Persona(int id,String nombre,String apellido,String vehiculo,int telefono){
		this.id=id;
		this.nombre=nombre;
		this.apellido=apellido;
		this.vehiculo=vehiculo;
		this.telefono=telefono;
	}
	public void setId(int id){
			this.id=id;
	}
	public int getId(){
			return this.id;
	}
	
	public void setNombre(String nombre){
			this.nombre=nombre;
	}
	public String getNombre(){
			return this.nombre;
	}
	
	public void setApellido(String apellido){
			this.apellido=apellido;
	}
	public String getApellido(){
			return this.apellido;
	}
	public void setVehiculo(String vehiculo){
			this.vehiculo=vehiculo;
	}
	public String getVehiculo(){
			return this.vehiculo;
	}
	public void setTelefono(int telefono){
			this.telefono=telefono;
	}
	public int getTelefono(){
			return this.telefono;
	}	
}
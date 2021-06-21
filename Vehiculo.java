public class Vehiculo{
    int id;
	String marca;
	String modelo;
	String placa;
	String color;
	
	public Vehiculo(int id,String marca,String modelo,String placa,String color){
		this.id=id;
		this.marca=marca;
		this.modelo=modelo;
		this.placa=placa;
		this.color=color;
	}
	public void setId(int id){
			this.id=id;
	}
	public int getId(){
			return this.id;
	}
	
	public void setMarca(String marca){
			this.marca=marca;
	}
	public String getMarca(){
			return this.marca;
	}
	
	public void setModelo(String modelo){
			this.modelo=modelo;
	}
	public String getModelo(){
			return this.modelo;
	}
	public void setPlaca(String placa){
			this.placa=placa;
	}
	public String getPlaca(){
			return this.placa;
	}
	public void setColor(String color){
			this.color=color;
	}
	public String getColor(){
			return this.color;
	}	
}
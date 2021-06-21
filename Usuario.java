public class Usuario{
	int id;
	String user;
	String password;
	String rol;

	/*public Usuario(){
		nombreUsuario="Pablo";
		clave="admin";
		rol="ad";
	}*/

	public Usuario(){
		
	}

	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return this.id;
	}

	public void setNombreUsuario(String user){
		this.user=user;
	}

	public String getNombreUsuario(){
		return this.user;
	}

	public void setClave(String password){
		this.password=password;
	}

	public String getClave(){
		return this.password;
	}

	public void setRol(String rol){
		this.rol = rol;
	}

	public String getRol(){
		return this.rol;
	}
}
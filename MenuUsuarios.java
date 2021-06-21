public class MenuUsuarios{
    String user;
	String password;
	String rol;
	String decision;
	ControladorUsuarios cUsuario=new ControladorUsuarios();
	ObtenerTexto oT=new ObtenerTexto();

	public void menuIngresoUser(){
		do{
		System.out.println("------------------------------");
		System.out.println("Ingrese el nombre de usuario");
		user=oT.texto();
		System.out.println("Ingrese la contraseña");
		password=oT.texto();
		System.out.println("Ingrese el rol");
		rol=oT.texto();
		cUsuario.ingresoUsuario(user,password,rol);
		System.out.println("Desea ingresar otro usuario?");
		decision=oT.texto();
		}while(decision.equals("si"));
	}	
}
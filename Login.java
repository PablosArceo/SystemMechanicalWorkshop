public class Login{
	String usuario;
	String clave;
	ObtenerTexto oT=new ObtenerTexto();
	ManejadorUsuario mUsuario=new ManejadorUsuario();

	public void pantallaPrincipal(){
		System.out.println("Ingrese su usuario");
		usuario=oT.texto();
		System.out.println("Ingrese la clave");
		clave=oT.texto();
		
		mUsuario.autentificador(usuario,clave);
	}
}
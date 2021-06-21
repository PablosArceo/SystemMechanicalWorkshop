public class ManejadorUsuario{
	Menu menu=new Menu();
	MenuPersona mP=new MenuPersona();
	LeerArchivo reader = new LeerArchivo();

	public void autentificador(String user,String password){
		Usuario usuario = reader.autenticarUsuario(user, password);

		if(usuario != null){
			if(usuario.getRol().equals("admin")){
				menu.menuAdministrador();
			}else{
				
			}
		}else{
			System.out.println("Credenciales incorrectas");
		}
	}

}
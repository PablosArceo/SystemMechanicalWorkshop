import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class LeerArchivo{
    /*
        Devuelve el usuario que se loguea
    */
    public Usuario autenticarUsuario(String usr, String pass){
        Usuario usuario = null;
        
        try{
            FileReader reader = new FileReader("Usuarios.txt");
            Scanner scan = new Scanner(reader);

            while (scan.hasNextLine())
            {
                String linea = scan.nextLine();
                
                if(linea!=null){
                    String[] campos = linea.split(",");
                    String user = campos[1];
                    String password = campos[2];
                    String rol = campos[3];
                    
                    if(user.equals(usr) && password.equals(pass)){
                        usuario = new Usuario();
                        usuario.setNombreUsuario(user);
                        usuario.setClave(password);
                        usuario.setRol(rol);
                        break;
                    }
                }
            }
        }catch(Exception ex){
            System.out.println("Error al leer archivo de usuarios");
        }

        return usuario;
    }

    /*
        Devuelve el id de un nuevo cliente
    */ 
    public int getIdCliente(){
        int contador = 0;

        try{
            FileReader reader = new FileReader("Clientes.txt");
            Scanner scan = new Scanner(reader);

            while (scan.hasNextLine())
            {
                String linea = scan.nextLine();

                if(linea!=null){
                    contador++;
                }else{
                    break;
                }
            }
        }catch(Exception ex){
            System.out.println("Error al leer archivo de clientes");
            System.out.println(ex.getMessage());
        }

        return (contador+1);
    }

     /*
        Devuelve el id de un nuevo vehiculo
    */ 
    public int getIdVehiculo(){
        int contador = 0;

        try{
            FileReader reader = new FileReader("Vehiculos.txt");
            Scanner scan = new Scanner(reader);

            while (scan.hasNextLine())
            {
                String linea = scan.nextLine();

                if(linea!=null){
                    contador++;
                }else{
                    break;
                }
            }
        }catch(Exception ex){
            System.out.println("Error al leer archivo de vehiculos");
            System.out.println(ex.getMessage());
        }

        return (contador+1);
    }
     /*
        Devuelve el id de un nuevo usuario
    */ 
    public int getIdUsuario(){
        int contador = 0;

        try{
            FileReader reader = new FileReader("Usuarios.txt");
            Scanner scan = new Scanner(reader);

            while (scan.hasNextLine())
            {
                String linea = scan.nextLine();

                if(linea!=null){
                    contador++;
                }else{
                    break;
                }
            }
        }catch(Exception ex){
            System.out.println("Error al leer archivo de usuarios");
            System.out.println(ex.getMessage());
        }

        return (contador+1);
    }
}
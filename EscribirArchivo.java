import java.io.FileWriter;
import java.io.File;

public class EscribirArchivo{
    /*
        Clientes
    */ 
    public void guardarCliente(String nombre,String apellido,String vehiculo, int telefono){
        LeerArchivo reader = new LeerArchivo();
        int idCliente = reader.getIdCliente();

        try{
            File archivo = new File("Clientes.txt");
            FileWriter writer = new FileWriter(archivo, true);
            writer.write("\n" +idCliente + "," + nombre + "," + apellido + "," + telefono + "," + vehiculo);
            writer.close();
            System.out.println("Cliente guardado exitosamente");
            System.out.println("");
        }catch(Exception ex){
            System.out.println("Error al guardar cliente");
        }
/*
        Vehiculos
*/
    }
    public void guardarVehiculo(String marca,String modelo,String placa, String color){
            LeerArchivo reader = new LeerArchivo();
            int idVehiculo = reader.getIdVehiculo();

            try{
                File archivo = new File("Vehiculos.txt");
                FileWriter writer = new FileWriter(archivo, true);
                writer.write("\n" + idVehiculo + "," + marca + "," + modelo + "," + placa + "," + color);
                writer.close();
                System.out.println("Vehiculo guardado exitosamente");
                System.out.println("");
            }catch(Exception ex){
                System.out.println("Error al guardar Vehiculo");
            }
    }
/*
        Usuario
*/
    public void guardarUsuario(String user,String password,String rol){
        LeerArchivo reader = new LeerArchivo();
        int idUsuario = reader.getIdUsuario();

        try{
            File archivo = new File("Usuarios.txt");
            FileWriter writer = new FileWriter(archivo, true);
            writer.write("\n" +idUsuario + "," + user + "," + password + "," + rol);
            writer.close();
            System.out.println("Usuario guardado exitosamente");
            System.out.println("");
        }catch(Exception ex){
            System.out.println("Error al guardar Usuario");}
    }     
}
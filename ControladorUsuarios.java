import java.util.ArrayList;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class ControladorUsuarios{
	EscribirArchivo writer = new EscribirArchivo();

	public void ingresoUsuario(String nombreUsuario,String clave,String rol){
		writer.guardarUsuario(nombreUsuario, clave, rol);	
	}

	public void reporteUsuario() throws IOException{

    }
}
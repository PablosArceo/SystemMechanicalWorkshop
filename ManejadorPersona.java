import java.util.ArrayList;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class ManejadorPersona{
	EscribirArchivo writer = new EscribirArchivo();

	public void ingresoPersona(String nombre,String apellido,String vehiculo, int telefono){
		writer.guardarCliente(nombre, apellido, vehiculo, telefono);	
	}

	public void reportePersona() throws IOException{
		/*String ruta = "c:/cabrera/3 bimestre/java/proyectofinal/reporte.txt";//ruta donde se creara el archivo
        File archivo = new File(ruta);//Crear fisicamente el documento reporte.txt
        BufferedWriter bw;//Crear un espacio en memoria para la escritura. 
        bw = new BufferedWriter(new FileWriter(archivo));//Prepara el documento para la escritutra
        
		for(Persona variable: arregloPersona){
			bw.write("--------");
			bw.write(variable.getId());
			bw.write(variable.getNombre());
			bw.write(variable.getApellido());
		}
		bw.close();//Cierra la escritura
		*/
	}
}
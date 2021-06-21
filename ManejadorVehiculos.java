import java.util.ArrayList;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class ManejadorVehiculos{
    EscribirArchivo writer = new EscribirArchivo();

	public void ingresoVehiculo(String marca,String modelo,String color, String placa){
		writer.guardarVehiculo(marca, modelo, color, placa);	
	}


    public void reporteVehiculo() throws IOException{
    }
}
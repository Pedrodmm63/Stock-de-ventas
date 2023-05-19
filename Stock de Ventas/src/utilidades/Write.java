package utilidades;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import programa.Producto;

public class Write {

	public static void Escribir(Iterator<Producto> producto) {
		try {
			FileWriter file = new FileWriter("C:\\Users\\Mañana\\Documents\\ST3.txt");
			while (producto.hasNext()) {
				Producto productos = producto.next();
				file.write(productos.toString() + "\n");
			}
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

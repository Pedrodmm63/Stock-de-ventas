package utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

import programa.Producto;

public class Read {

	public static final String FICHERO1 = "C:\\Users\\Mañana\\Documents\\ST1.txt";
	public static final String FICHERO2 = "C:\\Users\\Mañana\\Documents\\ST2.txt";


	public TreeMap<String, Producto> getDatos(String fichero) {
		TreeMap<String, Producto> listaproducto = new TreeMap<String, Producto>();
		
		try {
			// enlaza con un fichero
			BufferedReader ficheroEntrada = new BufferedReader(new FileReader(fichero));
			

			// leo una linea del fichero
							
				String id = ficheroEntrada.readLine();

				// mientras que las lineas existan
				while (id != null) {
					String nombreProducto = ficheroEntrada.readLine();
					String cantidad = ficheroEntrada.readLine();
					String precio = ficheroEntrada.readLine();
					Producto productos = ProductoCreator.getProducto(id, cantidad, nombreProducto, precio);
					
					listaproducto.put(productos.getId(), productos);
					
					id = ficheroEntrada.readLine();
					
				}
		
			ficheroEntrada.close();
		} catch (IOException e) {
			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaproducto;

	}

}

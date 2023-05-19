package go;

import java.util.Iterator;
import java.util.TreeMap;

import programa.Producto;
import utilidades.CompararId;
import utilidades.Read;

public class Start {

	public static void main(String[] args) {

		Read programa = new Read();
		TreeMap<String, Producto> lista = programa.getDatos(Read.FICHERO1);
		TreeMap<String, Producto> lista2 = programa.getDatos(Read.FICHERO2); 
//		
//		System.out.println(lista);
//		System.out.println(lista2);

		Iterator<Producto> productos = CompararId.compararId(lista, lista2);
		
	}

}

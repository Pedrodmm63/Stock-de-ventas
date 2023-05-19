package programa;

import java.util.Collection;
import java.util.TreeMap;

import utilidades.Read;
import utilidades.Write;

public class Stock {

	private TreeMap<String, Producto> productos;
	
	public Stock() {
		
		productos = new TreeMap<String, Producto>();
	}
	
	public void addproducto() {
		
		Read programa = new Read();
		TreeMap<String, Producto> lista = programa.getDatos(Read.FICHERO1);
		productos.putAll(lista);
	}
	public void escribir() {
		Collection c = productos.values();
		Write wr= new Write();
		wr.Escribir(c.iterator());
	}

	@Override
	public String toString() {
		return "Stock [productos=" + productos + "]";
	}
	
}

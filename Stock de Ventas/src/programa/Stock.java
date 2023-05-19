package programa;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

import utilidades.Read;
import utilidades.Write;

public class Stock {

	private TreeMap<String, Producto> productos;
	
	public Stock() {
		
		productos = new TreeMap<, Producto>();
	}
	
	public void addproducto() {String
		
		Read programa = new Read();
		TreeMap<String, Producto> lista = programa.getDatos(Read.FICHERO1);
		productos.putAll(lista);
	}
	public void escribir() {
		Collection c = productos.values();
		Write wr= new Write();
		wr.Escribir(c.iterator());
	}
	
	public void setProductos(Iterator<Producto> p) {
		
		while(p.hasNext()) {
			productos.put(p.next().getId(), p.next());
		}
	}

	@Override
	public String toString() {
		return "Stock [productos=" + productos + "]";
	}
	
}

package utilidades;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import programa.Producto;

public class CompararId  {

	public static Iterator<Producto> compararId(TreeMap<String, Producto> a, TreeMap<String, Producto> b) {
		
		for (Map.Entry<String, Producto> entry : a.entrySet()) {
			
			if(b.containsKey(entry.getKey())) {
				if(entry.getValue().getPrecio() != b.get(entry.getKey()).getPrecio()) {
				 
					//LANZAR EXCEPCION QUE TENGO QUE CREAR EN UNA CLASE APARTE
					
				}
				else {
					b.get(entry.getKey()).setCantidad(b.get(entry.getKey()).getCantidad() + entry.getValue().getCantidad());
				}
				
			}
			else {
				b.put(entry.getKey(), entry.getValue());
			}
			
		}
		Collection<Producto> c =  b.values();
		Iterator<Producto> iteratorProducto = c.iterator();
		return iteratorProducto;
	}
}
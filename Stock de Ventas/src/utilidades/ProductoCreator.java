package utilidades;

import programa.Producto;

public class ProductoCreator {

	public static Producto getProducto(String id, String cantidad, String nombre, String precio) {
		Producto producto = new Producto();
		
		try {
			producto.setNombre(nombre);
			producto.setId(id);
			producto.setPrecio(Double.parseDouble(precio));
			producto.setCantidad(Integer.parseInt(cantidad));
		} catch(Exception e) {
			producto = null;
		}
		return producto;
	}
}

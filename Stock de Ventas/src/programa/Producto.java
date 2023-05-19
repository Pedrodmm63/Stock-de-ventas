package programa;

import java.util.Objects;

public class Producto {

	private String id;
	private String nombre;
	private int cantidad;
	private double precio;
	
	
	
	
	public String getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCantidad(int cantidad) {
		//Integer.parseInt(cantidad);
		this.cantidad = cantidad;
	}
	public void setPrecio(Double precio) {
		//Double.parseDouble(precio);
		this.precio = precio;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	
	
}

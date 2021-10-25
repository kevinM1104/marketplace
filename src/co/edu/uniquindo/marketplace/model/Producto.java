package co.edu.uniquindo.marketplace.model;

public class Producto {
	
	private String nombre;  
	private String categoria;
	private double precio;
	private String usuario;
	private String contrase�a;
	private String estado;
	
	
	public Producto(String nombre, String categoria, double precio, String usuario, String contrase�a, String estado) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.usuario = usuario;
		this.contrase�a = contrase�a;
		this.estado = estado;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	
	
}

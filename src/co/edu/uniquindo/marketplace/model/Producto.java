package co.edu.uniquindo.marketplace.model;

public class Producto {
	
	private String nombre;  
	private String categoria;
	private double precio;
	private String usuario;
	private String contraseña;
	private String estado;
	
	
	public Producto(String nombre, String categoria, double precio, String usuario, String contraseña, String estado) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.usuario = usuario;
		this.contraseña = contraseña;
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
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	
	
}

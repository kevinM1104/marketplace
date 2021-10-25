package co.edu.uniquindio.marketplace.services;

import java.util.ArrayList;

import co.edu.uniquindo.marketplace.model.Vendedor;

public interface IModelFactoryServices {
	
	public Vendedor crearVendedor(String nombre,String apellido,String cedula, String direccion );
	public boolean actualizarVendedor(String cedulaActual,String nombre,String apellido,String cedula, String direccion );
	public Boolean eliminarVendedor(String cedula);
	public Vendedor obtenerVendedor();
	public ArrayList<Vendedor> obtnerVendedores();

}

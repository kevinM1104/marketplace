package co.edu.uniquindio.marketplace.services;

import java.util.ArrayList;

import co.edu.uniquindio.marketplace.exception.VendedorException;
import co.edu.uniquindo.marketplace.model.Vendedor;

public interface IMarketplaceServices {
	
	public Vendedor crearVendedor(String nombre,String apellido,String cedula, String direccion ) throws VendedorException;
	public boolean actualizarVendedor(String cedulaActual,String nombre,String apellido,String cedula, String direccion );
	public Boolean eliminarVendedor(String cedula) throws VendedorException;
	public Boolean verificarVendedorExiste(String cedula);
	public ArrayList<Vendedor> obtnerVendedores();

}

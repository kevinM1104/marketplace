package co.edu.uniquindo.marketplace.model;

import java.util.ArrayList;

import co.edu.uniquindio.marketplace.exception.VendedorException;
import co.edu.uniquindio.marketplace.services.IMarketplaceServices;


public class Marketplace implements IMarketplaceServices{
	
	ArrayList<Vendedor> listaVendedores = new ArrayList<>();

	public Marketplace() {
		
	}

	public ArrayList<Vendedor> getListaVendedores() {
		return listaVendedores;
	}

	public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
		this.listaVendedores = listaVendedores;
	}

	@Override
	public Vendedor crearVendedor(String nombre, String apellido, String cedula, String direccion) throws VendedorException {
		
		Vendedor nuevoVendedor = null;
		Boolean flagVendedorExiste = false;
		
		flagVendedorExiste = verificarVendedorExiste(cedula);
		
		if(flagVendedorExiste == true){
			
			throw new VendedorException("El Vendedor con cedula "+cedula+" no se puede crear, ya existe");
			
			
		}else{
			
			nuevoVendedor = new Vendedor();
			nuevoVendedor.setNombre(nombre);
			nuevoVendedor.setApellido(apellido);
			nuevoVendedor.setCedula(cedula);
			nuevoVendedor.setDireccion(direccion);
			
			getListaVendedores().add(nuevoVendedor);
			
		}
		
		
		
		return nuevoVendedor;
	}

	@Override
	public boolean actualizarVendedor(String cedulaActual,String nombre, String apellido, String cedula, String direccion) {
		
		Vendedor vendedor = null;
		
		boolean vendedorActualizado = false;

		vendedor = obtenerVendedor(cedulaActual);
		
		if(vendedor != null){
			vendedor.setNombre(nombre);
			vendedor.setApellido(apellido);
			vendedor.setCedula(cedula);
			vendedor.setDireccion(direccion);
			vendedorActualizado = true;
			
		}
	

		return vendedorActualizado;
		
	}
	
	@Override
	public Boolean eliminarVendedor(String cedula) throws VendedorException {
		
		boolean  flagEliminado = false;
		Vendedor vendedor = null;
		
		vendedor = obtenerVendedor(cedula);
		
		if(vendedor != null){
			
			getListaVendedores().remove(vendedor);
			flagEliminado = true;
		}else{
			
			throw new VendedorException("El Vendedor con cedula "+cedula+" no se puede eliminar, no existe");
		}
		return flagEliminado;
	}

	

	@Override
	public Boolean verificarVendedorExiste(String cedula) {
		
		boolean flagVendedor = false;
		
		for (Vendedor vendedor : listaVendedores) {
			
			if(vendedor.getCedula().equals(cedula)){
				flagVendedor = true;
				break;
			}
			
		}
		
		return flagVendedor;
	}
	
	private Vendedor obtenerVendedor(String cedula) {
		
		Vendedor vendedorAux = null;
		
		for (Vendedor vendedor : listaVendedores) {

			if(vendedor.getCedula().equals(cedula)){
				vendedorAux = vendedor; 
				break;
			}

		}

		return vendedorAux;
	}

	@Override
	public ArrayList<Vendedor> obtnerVendedores() {
		// TODO Auto-generated method stub
		return null;
	}

	


	

}

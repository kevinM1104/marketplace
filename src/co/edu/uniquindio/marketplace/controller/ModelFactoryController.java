package co.edu.uniquindio.marketplace.controller;

import java.util.ArrayList;

import co.edu.uniquindio.marketplace.exception.VendedorException;
import co.edu.uniquindio.marketplace.services.IModelFactoryServices;
import co.edu.uniquindo.marketplace.model.Marketplace;
import co.edu.uniquindo.marketplace.model.Vendedor;
import javafx.collections.ObservableList;

public class ModelFactoryController implements IModelFactoryServices {
	
	Marketplace marketplace;


	//------------------------------  Singleton ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder { 
		// El constructor de Singleton puede ser llamado desde aquí al ser protected
		private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
	}

	// Método para obtener la instancia de nuestra clase
	public static ModelFactoryController getInstance() {
		return SingletonHolder.eINSTANCE;
	}
	
	public ModelFactoryController() {
		System.out.println("invocación clase singleton");
		inicializarDatos();
	}

	private void inicializarDatos() {
		
	   marketplace = new Marketplace();
	   
	   
	   Vendedor vendedor = new Vendedor();
	   
	   vendedor.setNombre("Angel");
	   vendedor.setApellido("Marin");
	   vendedor.setCedula("123654");
	   vendedor.setDireccion("cll 12-15");
	   
	   marketplace.getListaVendedores().add(vendedor);
	   
	   vendedor = new Vendedor();
	   vendedor.setNombre("Maria");
	   vendedor.setApellido("Garcia");
	   vendedor.setCedula("12569");
	   vendedor.setDireccion("cll 17-15");
	   
	   marketplace.getListaVendedores().add(vendedor);
	   
	   vendedor = new Vendedor();
	   vendedor.setNombre("Carlos");
	   vendedor.setApellido("Cordoba");
	   vendedor.setCedula("56652");
	   vendedor.setDireccion("cll 25-12");
	   
	   marketplace.getListaVendedores().add(vendedor);	
	   
	   vendedor = new Vendedor();
	   vendedor.setNombre("Luis");
	   vendedor.setApellido("Zapata");
	   vendedor.setCedula("895214");
	   vendedor.setDireccion("cll 18-77");
	   
	   marketplace.getListaVendedores().add(vendedor);	
	   
	   vendedor = new Vendedor();
	   vendedor.setNombre("Valentina");
	   vendedor.setApellido("Trejos");
	   vendedor.setCedula("895215");
	   vendedor.setDireccion("cll 7-21");
	   
	   marketplace.getListaVendedores().add(vendedor);	
		
	}

	public Marketplace getMarketplace() {
		return marketplace;
	}

	public void setMarketplace(Marketplace marketplace) {
		this.marketplace = marketplace;
	}
	
	@Override

	public Vendedor crearVendedor(String nombre, String apellido, String cedula, String direccion) {
		
		Vendedor vendedor = null;
		
		try {
			vendedor = getMarketplace().crearVendedor(nombre, apellido, cedula, direccion);
		} catch (VendedorException e) {
			e.printStackTrace();
		}
		
		return vendedor;
	}

	@Override
	public boolean actualizarVendedor(String cedulaActual,String nombre, String apellido, String cedula, String direccion) {
		
		return getMarketplace().actualizarVendedor(cedulaActual, nombre, apellido, cedula, direccion);
	}

	@Override
	public Boolean eliminarVendedor(String cedula) {
		
		boolean flagVendedorExiste = false;
		
		try {
			flagVendedorExiste = getMarketplace().eliminarVendedor(cedula);
		} catch (VendedorException e) {
			
			e.printStackTrace();
		}
		
		return flagVendedorExiste;
	}

	@Override
	public Vendedor obtenerVendedor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Vendedor> obtnerVendedores() {
		
		return marketplace.getListaVendedores();
	}
	
	

}

package co.edu.uniquindio.marketplace.controller;

import java.util.ArrayList;

import co.edu.uniquindo.marketplace.model.Marketplace;
import co.edu.uniquindo.marketplace.model.Vendedor;
import javafx.collections.ObservableList;

public class CrudVendedorViewController {
	
	ModelFactoryController modelFactoryController;
	Marketplace marketplace;
	

	public CrudVendedorViewController (ModelFactoryController modelFactoryController){
		
		this.modelFactoryController = modelFactoryController;
		marketplace = modelFactoryController.getMarketplace();

	}


	public Marketplace getMarketplace() {
		return marketplace;
	}


	public void setMarketplace(Marketplace marketplace) {
		this.marketplace = marketplace;
	}


	public ArrayList<Vendedor> obtenerVendedores() {
		return modelFactoryController.obtnerVendedores();
	}


	public Vendedor crearVendedor(String nombre, String apellido, String cedula, String direccion) {
		
		return modelFactoryController.crearVendedor(nombre,apellido,cedula,direccion);
	}


	public boolean eliminarVendedor(String cedula) {
		
		return modelFactoryController.eliminarVendedor(cedula);
	}


	public boolean actualizarVendedor(String cedulaActual, String nombre, String apellido, String cedula, String direccion) {
		// TODO Auto-generated method stub
		return modelFactoryController.actualizarVendedor(cedulaActual,nombre, apellido, cedula, direccion);
		
	}
	
	
}

package co.edu.uniquindio.marketplace.controller;

import java.util.ArrayList;
import java.util.Optional;

import javax.swing.JOptionPane;

import co.edu.uniquindio.marketplace.Aplicacion;
import co.edu.uniquindo.marketplace.model.Vendedor;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

public class MarketplaceViewController {

	private Aplicacion aplicacion;
	private ModelFactoryController modelFactoryController;
	private CrudVendedorViewController crudVendedorViewController;
	Vendedor vendedorSeleccionado;

	ObservableList<Vendedor> listaVendedoresData = FXCollections.observableArrayList();



	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}


	@FXML
	private TextField txtNombreVendedor10;

	@FXML
	private TextField txtDireccionVendedor9;

	@FXML
	private TableColumn<?, ?> columNombreProductoVendedor10;

	@FXML
	private TextField txtDireccionVendedor8;

	@FXML
	private TextField txtDireccionVendedor7;

	@FXML
	private TextField txtDireccionVendedor2;

	@FXML
	private TextField txtDireccionVendedor1;

	@FXML
	private TableView<?> tableObjetosVendedor18;

	@FXML
	private TextField txtDireccionVendedor6;

	@FXML
	private TextField txtDireccionVendedor5;

	@FXML
	private TextField txtDireccionVendedor4;

	@FXML
	private TextField txtDireccionVendedor3;

	@FXML
	private TableView<?> tableObjetosVendedor10;

	@FXML
	private TableColumn<?, ?> tableListSugerenciasVendedor1;

	@FXML
	private TableColumn<?, ?> tableListSugerenciasVendedor2;

	@FXML
	private TableColumn<?, ?> tableListSugerenciasVendedor3;

	@FXML
	private TableColumn<?, ?> tableListSugerenciasVendedor4;

	@FXML
	private TableColumn<?, ?> tableListSugerenciasVendedor5;

	@FXML
	private TableColumn<?, ?> tableListSugerenciasVendedor6;

	@FXML
	private TableColumn<?, ?> tableListSugerenciasVendedor7;

	@FXML
	private TableColumn<?, ?> tableListSugerenciasVendedor8;

	@FXML
	private TableColumn<?, ?> tableListSugerenciasVendedor9;

	@FXML
	private TextField txtNombreVendedor8;

	@FXML
	private TextField txtNombreVendedor9;

	@FXML
	private TableColumn<?, ?> columPrecioProductoVendedor2;

	@FXML
	private TableColumn<?, ?> columPrecioProductoVendedor1;

	@FXML
	private TableColumn<?, ?> columPrecioProductoVendedor4;

	@FXML
	private TableColumn<?, ?> columPrecioProductoVendedor3;

	@FXML
	private TableColumn<?, ?> columEstadoProductoVendedor10;

	@FXML
	private TextField txtNombreVendedor1;

	@FXML
	private TextField txtNombreVendedor2;

	@FXML
	private TableView<?> tableObjetosVendedor7;

	@FXML
	private TextField txtNombreVendedor3;

	@FXML
	private TableView<?> tableObjetosVendedor8;

	@FXML
	private TextField txtNombreVendedor4;

	@FXML
	private TableView<?> tableObjetosVendedor5;

	@FXML
	private TableColumn<?, ?> columPrecioProductoVendedor10;

	@FXML
	private TextField txtNombreVendedor5;

	@FXML
	private TableView<?> tableObjetosVendedor6;

	@FXML
	private TableView<?> tableObjetosVendedor3;

	@FXML
	private TextField txtNombreVendedor6;

	@FXML
	private TableView<?> tableObjetosVendedor4;

	@FXML
	private TextField txtNombreVendedor7;

	@FXML
	private TableView<?> tableObjetosVendedor1;

	@FXML
	private TableView<?> tableObjetosVendedor2;

	@FXML
	private TableColumn<?, ?> columPrecioProductoVendedor6;

	@FXML
	private TableColumn<?, ?> columPrecioProductoVendedor5;

	@FXML
	private TableColumn<?, ?> columPrecioProductoVendedor8;

	@FXML
	private TableColumn<?, ?> columPrecioProductoVendedor7;

	@FXML
	private TableColumn<?, ?> columPrecioProductoVendedor9;

	@FXML
	private TextField txtApellidoVendedor10;

	@FXML
	private TextField txtApellidoVendedor4;

	@FXML
	private TextField txtApellidoVendedor3;

	@FXML
	private TextField txtApellidoVendedor2;

	@FXML
	private TextField txtApellidoVendedor1;

	@FXML
	private TableColumn<?, ?> tableListSugerenciasVendedor10;

	@FXML
	private TableColumn<?, ?> tableListContactosVendedor10;

	@FXML
	private TableColumn<?, ?> tableListContactosVendedor2;

	@FXML
	private TableColumn<?, ?> tableListContactosVendedor1;

	@FXML
	private TableColumn<?, ?> tableListContactosVendedor4;

	@FXML
	private TableColumn<?, ?> tableListContactosVendedor3;

	@FXML
	private TableColumn<?, ?> tableListContactosVendedor6;

	@FXML
	private TableColumn<?, ?> tableListContactosVendedor5;

	@FXML
	private TableColumn<?, ?> columNombreProductoVendedor5;

	@FXML
	private TableColumn<?, ?> tableListContactosVendedor8;

	@FXML
	private TableColumn<?, ?> columNombreProductoVendedor4;

	@FXML
	private TableColumn<?, ?> tableListContactosVendedor7;

	@FXML
	private TableColumn<?, ?> columNombreProductoVendedor7;

	@FXML
	private TableColumn<?, ?> columNombreProductoVendedor6;

	@FXML
	private TableColumn<?, ?> tableListContactosVendedor9;

	@FXML
	private TableColumn<?, ?> columNombreProductoVendedor1;

	@FXML
	private TableColumn<?, ?> columNombreProductoVendedor3;

	@FXML
	private TableColumn<?, ?> columNombreProductoVendedor2;

	@FXML
	private TextField txtApellidoVendedor9;

	@FXML
	private TextField txtApellidoVendedor8;

	@FXML
	private TableColumn<?, ?> columNombreProductoVendedor9;

	@FXML
	private TextField txtApellidoVendedor7;

	@FXML
	private TableColumn<?, ?> columNombreProductoVendedor8;

	@FXML
	private TextField txtApellidoVendedor6;

	@FXML
	private TextField txtApellidoVendedor5;

	@FXML
	private TextField txtCedulaVendedor2;

	@FXML
	private TextField txtCedulaVendedor1;


	@FXML
	private TextField txtCedulaVendedor6;

	@FXML
	private TextField txtCedulaVendedor5;

	@FXML
	private TextField txtCedulaVendedor4;

	@FXML
	private TextField txtCedulaVendedor3;

	@FXML
	private TextField txtCedulaVendedor10;

	@FXML
	private TextField txtCedulaVendedor9;

	@FXML
	private TextField txtCedulaVendedor8;

	@FXML
	private TextField txtCedulaVendedor7;

	@FXML
	private ImageView ivImagenVendedor10;

	@FXML
	private TableColumn<?, ?> columEstadoProductoVendedor1;

	@FXML
	private TableColumn<?, ?> columEstadoProductoVendedor2;

	@FXML
	private TableColumn<?, ?> columEstadoProductoVendedor3;

	@FXML
	private TableColumn<?, ?> columEstadoProductoVendedor4;

	@FXML
	private ImageView ivImagenVendedor8;

	@FXML
	private ImageView ivImagenVendedor7;

	@FXML
	private ImageView ivImagenVendedor9;

	@FXML
	private ImageView ivImagenVendedor4;

	@FXML
	private TableColumn<?, ?> columEstadoProductoVendedor9;

	@FXML
	private ImageView ivImagenVendedor3;

	@FXML
	private ImageView ivImagenVendedor6;

	@FXML
	private ImageView ivImagenVendedor5;

	@FXML
	private TextField txtDireccionVendedor10;

	@FXML
	private TableColumn<?, ?> columEstadoProductoVendedor5;

	@FXML
	private TableColumn<?, ?> columEstadoProductoVendedor6;

	@FXML
	private ImageView ivImagenVendedor2;

	@FXML
	private TableColumn<?, ?> columEstadoProductoVendedor7;

	@FXML
	private ImageView ivImagenVendedor1;

	@FXML
	private TableColumn<?, ?> columEstadoProductoVendedor8;

	@FXML
	private TextField textUsuario;

	@FXML
	private TextField textContrasenia;

	@FXML
	private Button btnIngresar;

	@FXML
	private TextField txtCedulaVendedor;

	@FXML
	private Button btnAgregarVendedor;

	@FXML
	private TextField txtNombreVendedor;

	@FXML
	private TextField txtApellidoVendedor;

	@FXML
	private TextField txtDireccionVndedor;

	@FXML
	private Button btnNuevoVendedor;

	@FXML
	private Button btnActualizarVendedor;
	
	 @FXML
	 private Button btnEliminarVendedor;

	@FXML
	void nuevoVendedorAction(ActionEvent event) {
		
		nuevoVendedor();

        
	}

	

	@FXML
	void agregarVendedorAction(ActionEvent event) {
		
		crearVendedor();

	}

	
	@FXML
	void actualizarVendedorAction(ActionEvent event) {
		
		actualizarVendedor();

	}

	@FXML
	void ingresarAction(ActionEvent event) {


	}
	
	@FXML
    void eliminarVendedorAction(ActionEvent event) {
		
		eliminarVendedor();

    }
	


	@FXML
    private TableColumn<Vendedor,String > columIdVendedor;

    @FXML
    private TableView<Vendedor> tableVendedor;

    @FXML
    private TableColumn<Vendedor,String> columNombreVendedores;


	@FXML
	void initialize() {
		
		modelFactoryController = ModelFactoryController.getInstance();
		crudVendedorViewController = new CrudVendedorViewController(modelFactoryController);
		inicializarVendedorView();
		

	}
	
	

	private void inicializarVendedorView() {
		
		mostrarDatosInicializadosVendedor("");
		this.columNombreVendedores.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		this.columIdVendedor.setCellValueFactory(new PropertyValueFactory<>("cedula"));
		
		tableVendedor.getItems().clear();
		tableVendedor.setItems(getListaVendedoresData());
		
		tableVendedor.getSelectionModel().selectedItemProperty().addListener((obs,oldSelection,newSelection) -> {
			
			vendedorSeleccionado = newSelection;
			
			mostraInformacionVendedor(vendedorSeleccionado);
			
			
		});
		
	}

	private ObservableList<Vendedor> getListaVendedoresData() {
		listaVendedoresData.addAll(crudVendedorViewController.obtenerVendedores());
		return listaVendedoresData;
	}
	
	private void crearVendedor() {
		
		String nombre = txtNombreVendedor.getText();
		String apellido = txtApellidoVendedor.getText();
		String cedula = txtCedulaVendedor.getText();
		String direccion = txtDireccionVndedor.getText();
		
		if(verificarNumeroVendedor() == true){
		
		if(datosValidosVendedor(nombre, apellido, cedula, direccion) == true){
			
			Vendedor vendedor = null;
			
			vendedor = crudVendedorViewController.crearVendedor(nombre,apellido,cedula,direccion);
			
			if(vendedor != null){
				listaVendedoresData.add(vendedor);
				mostrarDatosInicializadosVendedor(cedula);
				mostrarMensaje("Notificacion Vendedor", "Vendedor Creado", "El Vendedor se ha creado con exito", AlertType.INFORMATION);
				limpiarCamposVendedor();
			}else{
			mostrarMensaje("Notificacion Vendedor", "Vendedor no Creado", "El Vendedor no se ha creado con exito", AlertType.WARNING);
			}
		}
		}else{
			mostrarMensaje("Notificacion Vendedor", "Vendedor no Creado", "Numero maximo de vendedores alcanzado", AlertType.WARNING);
		}


	}
	
	private void eliminarVendedor() {
		
		boolean vendedorEliminado = false;
		
		if(vendedorSeleccionado != null){
			
			if(mostrarMensajeConfirmacion("¿Esta seguro de eliminar al vendedor?") == true){
				limpiarDatosVendedor(vendedorSeleccionado.getCedula());
				vendedorEliminado = crudVendedorViewController.eliminarVendedor(vendedorSeleccionado.getCedula());
				
				if(vendedorEliminado ==true){
					listaVendedoresData.remove(vendedorSeleccionado);
					vendedorSeleccionado = null;
					
					
					tableVendedor.getSelectionModel().clearSelection();
					limpiarCamposVendedor();
					mostrarMensaje("Notificacion Vendedor", "Vendedor eliminado", "El Vendedor se ha eliminado con exito", AlertType.INFORMATION);
				}else{
					mostrarMensaje("Notificacion Vendedor", "Vendedor no eliminado", "El Vendedor no se puede eliminar", AlertType.ERROR);
					
				}
				
			}
			
		}else{
			
			mostrarMensaje("Notificacion Vendedor", "Vendedor no seleccionado", "Seleccione un vendedor de la lista", AlertType.WARNING);
		}
		
	}
	
	private void actualizarVendedor() {
		
		String nombre = txtNombreVendedor.getText();
		String apellido = txtApellidoVendedor.getText();
		String cedula = txtCedulaVendedor.getText();
		String direccion = txtDireccionVndedor.getText();
		boolean vendedorActualizado = false;
		
		if(vendedorSeleccionado != null){
			
			if(datosValidosVendedor(nombre, apellido, cedula, direccion) == true){
				
				vendedorActualizado = crudVendedorViewController.actualizarVendedor(vendedorSeleccionado.getCedula(),nombre,apellido,cedula,direccion);
				
				if(vendedorActualizado == true){
					mostrarDatosInicializadosVendedor(cedula);
					tableVendedor.refresh();
					mostrarMensaje("Notificacion Vendedor", "Vendedor actualizado", "El Vendedor se ha actualizado con exito", AlertType.INFORMATION);
					limpiarCamposVendedor();
				}else{
				mostrarMensaje("Notificacion Vendedor", "Vendedor no actualizado", "El Vendedor no se ha actualizado con exito", AlertType.WARNING);
			}
		}
    }
			
}

	
	
	private void mostrarDatosInicializadosVendedor(String cedula){

		ArrayList<Vendedor> listaVendedores = new ArrayList<>();

		listaVendedores = crudVendedorViewController.obtenerVendedores();

		for (Vendedor vendedor : listaVendedores) {

			if(txtCedulaVendedor1.getText().equals("") || vendedor.getCedula().equals(cedula) ){

				txtNombreVendedor1.setText(vendedor.getNombre());
				txtApellidoVendedor1.setText(vendedor.getApellido());
				txtCedulaVendedor1.setText(vendedor.getCedula());
				txtDireccionVendedor1.setText(vendedor.getDireccion());
			
				

			}else{

				if(txtCedulaVendedor2.getText().equals("") || vendedor.getCedula().equals(cedula)){

					txtNombreVendedor2.setText(vendedor.getNombre());
					txtApellidoVendedor2.setText(vendedor.getApellido());
					txtCedulaVendedor2.setText(vendedor.getCedula());
					txtDireccionVendedor2.setText(vendedor.getDireccion());
			

				}else{

					if(txtCedulaVendedor3.getText().equals("") || vendedor.getCedula().equals(cedula)){

						txtNombreVendedor3.setText(vendedor.getNombre());
						txtApellidoVendedor3.setText(vendedor.getApellido());
						txtCedulaVendedor3.setText(vendedor.getCedula());
						txtDireccionVendedor3.setText(vendedor.getDireccion());
				
					}else{

						if(txtCedulaVendedor4.getText().equals("") || vendedor.getCedula().equals(cedula)){

							txtNombreVendedor4.setText(vendedor.getNombre());
							txtApellidoVendedor4.setText(vendedor.getApellido());
							txtCedulaVendedor4.setText(vendedor.getCedula());
							txtDireccionVendedor4.setText(vendedor.getDireccion());
					

						}else{

							if(txtCedulaVendedor5.getText().equals("") || vendedor.getCedula().equals(cedula)){

								txtNombreVendedor5.setText(vendedor.getNombre());
								txtApellidoVendedor5.setText(vendedor.getApellido());
								txtCedulaVendedor5.setText(vendedor.getCedula());
								txtDireccionVendedor5.setText(vendedor.getDireccion());
							
							}else{

								if(txtCedulaVendedor6.getText().equals("") || vendedor.getCedula().equals(cedula)){

									txtNombreVendedor6.setText(vendedor.getNombre());
									txtApellidoVendedor6.setText(vendedor.getApellido());
									txtCedulaVendedor6.setText(vendedor.getCedula());
									txtDireccionVendedor6.setText(vendedor.getDireccion());
							

								}else{

									if(txtCedulaVendedor7.getText().equals("") || vendedor.getCedula().equals(cedula)){

										txtNombreVendedor7.setText(vendedor.getNombre());
										txtApellidoVendedor7.setText(vendedor.getApellido());
										txtCedulaVendedor7.setText(vendedor.getCedula());
								

									}else{

										if(txtCedulaVendedor8.getText().equals("") || vendedor.getCedula().equals(cedula)){

											txtNombreVendedor8.setText(vendedor.getNombre());
											txtApellidoVendedor8.setText(vendedor.getApellido());
											txtCedulaVendedor8.setText(vendedor.getCedula());
											txtDireccionVendedor8.setText(vendedor.getDireccion());
									
										}else{

											if(txtCedulaVendedor9.getText().equals("") || vendedor.getCedula().equals(cedula)){

												txtNombreVendedor9.setText(vendedor.getNombre());
												txtApellidoVendedor9.setText(vendedor.getApellido());
												txtCedulaVendedor9.setText(vendedor.getCedula());
												txtDireccionVendedor9.setText(vendedor.getDireccion());
											
											}else{

												if(txtCedulaVendedor10.getText().equals("") || vendedor.getCedula().equals(cedula)){

													txtNombreVendedor10.setText(vendedor.getNombre());
													txtApellidoVendedor10.setText(vendedor.getApellido());
													txtCedulaVendedor10.setText(vendedor.getCedula());
													txtDireccionVendedor10.setText(vendedor.getDireccion());
												

												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	private void limpiarDatosVendedor(String cedula){

		ArrayList<Vendedor> listaVendedores = new ArrayList<>();

		listaVendedores = crudVendedorViewController.obtenerVendedores();

		for (Vendedor vendedor : listaVendedores) {

			if(txtCedulaVendedor1.getText().equals(cedula) ){

				txtNombreVendedor1.setText("");
				txtApellidoVendedor1.setText("");
				txtCedulaVendedor1.setText("");
				txtDireccionVendedor1.setText("");

			}else{

				if(txtCedulaVendedor2.getText().equals(cedula) ){

					txtNombreVendedor2.setText("");
					txtApellidoVendedor2.setText("");
					txtCedulaVendedor2.setText("");
					txtDireccionVendedor2.setText("");

				}else{

					if(txtCedulaVendedor3.getText().equals(cedula)){

						txtNombreVendedor3.setText("");
						txtApellidoVendedor3.setText("");
						txtCedulaVendedor3.setText("");
						txtDireccionVendedor3.setText("");

					}else{

						if(txtCedulaVendedor4.getText().equals(cedula) ){

							txtNombreVendedor4.setText("");
							txtApellidoVendedor4.setText("");
							txtCedulaVendedor4.setText("");
							txtDireccionVendedor4.setText("");

						}else{

							if(txtCedulaVendedor5.getText().equals(cedula)){

								txtNombreVendedor5.setText("");
								txtApellidoVendedor5.setText("");
								txtCedulaVendedor5.setText("");
								txtDireccionVendedor5.setText("");

							}else{

								if(txtCedulaVendedor6.getText().equals(cedula)){

									txtNombreVendedor6.setText("");
									txtApellidoVendedor6.setText("");
									txtCedulaVendedor6.setText("");
									txtDireccionVendedor6.setText("");

								}else{

									if(txtCedulaVendedor7.getText().equals(cedula) ){

										txtNombreVendedor7.setText("");
										txtApellidoVendedor7.setText("");
										txtCedulaVendedor7.setText("");
										txtDireccionVendedor7.setText("");

									}else{

										if(txtCedulaVendedor8.getText().equals(cedula)){

											txtNombreVendedor8.setText("");
											txtApellidoVendedor8.setText("");
											txtCedulaVendedor8.setText("");
											txtDireccionVendedor8.setText("");

										}else{

											if(txtCedulaVendedor9.getText().equals(cedula) ){

												txtNombreVendedor9.setText("");
												txtApellidoVendedor9.setText("");
												txtCedulaVendedor9.setText("");
												txtDireccionVendedor9.setText("");

											}else{

												if(txtCedulaVendedor10.getText().equals(cedula)){

													txtNombreVendedor10.setText("");
													txtApellidoVendedor10.setText("");
													txtCedulaVendedor10.setText("");
													txtDireccionVendedor10.setText("");

												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

		
	
	
	private boolean verificarNumeroVendedor(){
		
        ArrayList<Vendedor> listaVendedores = new ArrayList<>();
        
        int contador = 0;
        
        boolean centinela = false;
		
		listaVendedores = crudVendedorViewController.obtenerVendedores();
		
		for (int i = 0; i < listaVendedores.size(); i++) {
			
			contador = contador +1;
		}
		
		if(contador<10){
			centinela = true;
		}
		
		return centinela;
		
	}

		
		
	

	private void nuevoVendedor() {
		
		txtNombreVendedor.setText("Ingrese nombre del vendedor");
		txtApellidoVendedor.setText("Ingrese apellido del vendedor");
		txtCedulaVendedor.setText("Ingrese cedula del vendedor");
		txtDireccionVndedor.setText("Ingrese direccion del vendedor");
		
	}
	
	private void limpiarCamposVendedor() {

		txtNombreVendedor.setText("");
		txtApellidoVendedor.setText("");
		txtCedulaVendedor.setText("");
		txtDireccionVndedor.setText("");

	}
	
	private void mostraInformacionVendedor(Vendedor vendedorSeleccionado) {
		
		if(vendedorSeleccionado != null){
			
			txtNombreVendedor.setText(vendedorSeleccionado.getNombre());
			txtApellidoVendedor.setText(vendedorSeleccionado.getApellido());
			txtCedulaVendedor.setText(vendedorSeleccionado.getCedula());
			txtDireccionVndedor.setText(vendedorSeleccionado.getDireccion());
			
			
		}
		
	}
	
	private void mostrarMensaje(String titulo, String header, String contenido, AlertType alertType) {

		Alert aler = new Alert(alertType);
		aler.setTitle(titulo);
		aler.setHeaderText(header);
		aler.setContentText(contenido);
		aler.showAndWait();
	}

	private boolean mostrarMensajeConfirmacion(String mensaje) {

		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setHeaderText(null);
		alert.setTitle("Confirmación");
		alert.setContentText(mensaje);
		Optional<ButtonType> action = alert.showAndWait();

		if (action.get() == ButtonType.OK) {
			return true;
		} else {
			return false;
		}
	}
	
	
	private boolean datosValidosVendedor(String nombre, String apellido, String documento,  String direccion) {

		String mensaje = "";


		if(nombre == null || nombre.equals("") ||nombre.equals("Ingrese nombre del vendedor"))
			mensaje += "El nombre es invalido \n" ;

		if(apellido == null || apellido.equals("")|| apellido.equals("Ingrese apellido del vendedor"))
			mensaje += "El apellido es invalido \n" ;

		if(documento == null || documento.equals("") || documento.equals("Ingrese cedula del vendedor"))
			mensaje += "LA cedula es invalido \n" ;

		if(direccion == null || direccion.equals("")|| direccion.equals("Ingrese direccion del vendedor"))
			mensaje += "La direccion es invalida \n" ;



		if(mensaje.equals("")){
			return true;
		}else{
			mostrarMensaje("Notificación vendedor","Datos invalidos",mensaje, AlertType.WARNING);
			return false;
		}
	}
    
	
	



}

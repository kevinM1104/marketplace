package co.edu.uniquindio.marketplace.exception;

public class NoExisteProductoException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NoExisteProductoException(String mensaje){
		super(mensaje);
	}

}

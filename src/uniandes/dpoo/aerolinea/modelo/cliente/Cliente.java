package uniandes.dpoo.aerolinea.modelo.cliente;


/**
 * clase abstracta de cliente puede ser corporativo o natural
 */
public abstract class Cliente {
	
	/**
	 * metodo abstracto, todos los objetos de las subclases tienen un tipo
	 * @return
	 */
	public abstract String getTipoCliente();
	
	/**
	 * metodo abstracto, todos los objetos de las subclases tienen un identificador
	 * @return
	 */
	public abstract String getIdentificador();
}

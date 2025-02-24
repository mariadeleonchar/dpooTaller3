package uniandes.dpoo.aerolinea.modelo.cliente;


/**
 * clase de cliente natural extiende de la super clase cliente
 */
public class ClienteNatural extends Cliente{
	
	/**
	 * constante natural
	 */
	public final String NATURAL = "Natural";
	
	/**
	 * instancia nombre
	 */
	private String nombre;
	
	
	/**
	 * constructor de cliente natural
	 * @param nombre
	 */
	public ClienteNatural(String nombre)
	{
		this.nombre = nombre;
	}
	
	/**
	 * metodo de la superclase cliente retorna el tipo de cliente: string
	 */
	@Override
	public String getTipoCliente() {
		return NATURAL;
	}
	
	/** 
	 * metodo de la superclase cliente retorna el identificador 
	 */
	@Override
	public String getIdentificador() {
		return this.nombre;
	}

}

package uniandes.dpoo.aerolinea.tiquetes;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

/**
 * clase de informacion de tiquetes
 */
public class Tiquete {
	
	/**
	 * instancia codigo: string
	 */
	private String codigo;
	
	/**
	 * instancia tarifa: int
	 */
	private int tarifa;
	
	/**
	 * instancia usado: boolean
	 */
	private boolean usado;
	
	/** 
	 * instancia clienteComprador. cliente
	 */
	private Cliente clienteComprador;
	
	/** 
	 * instancia vuelo: vuelo
	 */
	private Vuelo vuelo;
	
	
	/**
	 * constructor de tiquete
	 * @param codigo
	 * @param vuelo
	 * @param clienteComprador
	 * @param tarifa
	 */
	public Tiquete(String codigo,Vuelo vuelo, Cliente clienteComprador, int tarifa )
	{
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.clienteComprador = clienteComprador;
		this.vuelo = vuelo;
	}
	
	/**
	 * metodo que retorna el cliente del tiquete
	 * @return
	 */
	public Cliente getCliente()
	{
		return this.clienteComprador;
	}
	
	/**
	 * metodo que retorna el vuelo del tiquete
	 * @return
	 */
	public Vuelo getVuelo()
	{
		return this.vuelo;
		
	}
	
	/**
	 * metodo que retorna el codigo del cliente
	 * @return
	 */
	public String getCodigo()
	{
		return this.codigo;
	}
	
	/**
	 * metodo que retorna la tarifa del tiquete
	 * @return
	 */
	public int getTarifa()
	{
		return this.tarifa;
	}
	
	/**
	 * metodo que marca el tiquete como usado
	 */
	public void marcarComoUsado()
	{
		usado = true;
	}
	
	/**
	 * metodo que retorna si el tiquete es usado
	 * @return
	 */
	public boolean esUsado()
	{
		return this.usado;
	}
	
}

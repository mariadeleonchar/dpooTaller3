package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta
{

	/**
	 * instancia string hora salida
	 */
	private String horaSalida;
	/**
	 * instancia string hora llegada
	 */
	private String horaLlegada;
	/**
	 * instancia string codigo ruta
	 */
	private String codigoRuta;
	
	/**
	 * instancia aeropuerto origen
	 */
	private Aeropuerto origen;
	
	/**
	 * instancia aeropuerto destino
	 */
	private Aeropuerto destino;
	
	/**
	 * constructor de ruta
	 * @param origen
	 * @param destino
	 * @param horaSalida
	 * @param horaLLegada
	 * @param codigoRuta
	 */
	public Ruta(Aeropuerto origen, Aeropuerto destino, String horaSalida, String horaLLegada, String codigoRuta)
	{
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLLegada;
		this.codigoRuta = codigoRuta;
		this.origen = origen;
		this.destino = destino;
	}
	/**
	 * metodo get codigo ruta
	 */
	public String getCodigoRuta()
	{
		return this.codigoRuta;
	}
	
	/**
	 * metodo get origen
	 */
	public Aeropuerto getOrigen()
	{
		return this.origen;
	}
	
	
	/**
	 * metodo get destino
	 */
	public Aeropuerto getDestino()
	{
		return this.destino;
	}
	
	/**
	 * metodo get hora salida
	 */
	public String getHoraSalida()
	{
		return this.horaSalida;
	}
	
	/**
	 * metodo get hora llegada
	 */
	public String getHoraLLegada()
	{
		return this.horaLlegada;
	}
	/**
	 * metodo que retorna los minutos de duracion de una ruta 
	 * @return
	 */
	public int getDuracion()
	{
		return getMinutos(horaLlegada) - getMinutos(horaSalida) ;
	}
    /**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
    public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }

    
}

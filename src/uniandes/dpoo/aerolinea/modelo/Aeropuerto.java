package uniandes.dpoo.aerolinea.modelo;

import java.util.HashSet;
import java.util.Set;

import uniandes.dpoo.aerolinea.exceptions.AeropuertoDuplicadoException;

/**
 * Esta clase encapsula la información sobre los aeropuertos e implementa algunas operaciones relacionadas con la ubicación geográfica de los aeropuertos.
 * 
 * No puede haber dos aeropuertos con el mismo código.
 */
public class Aeropuerto
{

	/**
	 * atributo string con el nombre
	 */
	private String nombre;
	/**
	 * atributo string con el codigo
	 */
	private String codigo;
	/**
	 * atributo string con el nombreCiudad
	 */
	private String nombreCiudad;
	/**
	 * atributo double con la latitud
	 */
	private double latitud;
	/**
	 * atributo double con la longitud
	 */
	private double longitud;
	/**
	 * constante del radio terrestre
	 */
	private final static int RADIO_TERRESTRE = 6371;
    
	
	
	/**
	 * 
	 * @param nombre
	 * @param codigo
	 * @param nombreCiudad
	 * @param latitud
	 * @param longitud
	 */
	public Aeropuerto(String nombre, String codigo, String nombreCiudad, double latitud, double longitud)
	{
		this.nombre = nombre;
		this.codigo = codigo;
		this.nombreCiudad = nombreCiudad;
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	/**
	 * metodo que retorna el nombre: string
	 * @return
	 */
	public String getNombre()
	{
		return this.nombre;
	}
	
	/**
	 * metodo que retorna el codigo: string
	 * @return
	 */
	public String getCodigo() 
	{
		return this.codigo;
	}
	
	/**
	 * metodo que retorna el nombre de la ciudad: string
	 * @return
	 */
	public String getNombreCiudad()
	{
		return this.nombreCiudad;
	}
	
	/**
	 * metodo que retorna la latitud: double
	 * @return
	 */
	public double getLatitud()
	{
		return this.latitud;
	}
	
	
	public double getLongitud()
	{
		return this.longitud;
	}
	
    /**
     * Este método calcula la distancia *aproximada* entre dos aeropuertos. Hay fórmulas más precisas pero esta es suficientemente buena para el caso de la aerolínea.
     * 
     * Este método asume que las coordenadas (latitud y longitud) de los aeropuertos están expresadas en la forma que las hace más cercanas. Si no es así, la distancia entre
     * los dos aeropuertos podría ser la más larga posible.
     * 
     * Por ejemplo, dependiendo de cómo estén expresadas las longitudes, la distancia calculada entre Narita (Tokyo) y El Dorado (Bogotá) podría ser atravesando el Pacífico, o
     * atravesando el Atlántico y Asia (el camino largo)
     * 
     * @param aeropuerto1
     * @param aeropuerto2
     * @return La distancia en kilómetros entre los puntos
     */
    public static int calcularDistancia( Aeropuerto aeropuerto1, Aeropuerto aeropuerto2 )
    {
        // Convertir los ángulos a radianes para facilitar las operaciones trigonométricas
        double latAeropuerto1 = Math.toRadians( aeropuerto1.getLatitud( ) );
        double lonAeropuerto1 = Math.toRadians( aeropuerto1.getLongitud( ) );
        double latAeropuerto2 = Math.toRadians( aeropuerto2.getLatitud( ) );
        double lonAeropuerto2 = Math.toRadians( aeropuerto2.getLongitud( ) );

        // Calcular la distancia debido a la diferencia de latitud y de longitud
        double deltaX = ( lonAeropuerto2 - lonAeropuerto1 ) * Math.cos( ( latAeropuerto1 + latAeropuerto2 ) / 2 );
        double deltaY = ( latAeropuerto2 - latAeropuerto1 );

        // Calcular la distancia real en kilómetros
        double distancia = Math.sqrt( deltaX * deltaX + deltaY * deltaY ) * RADIO_TERRESTRE;

        return ( int )Math.round( distancia );
    }

}

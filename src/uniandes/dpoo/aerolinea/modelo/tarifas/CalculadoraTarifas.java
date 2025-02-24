package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import java.util.*;

/**
 * clase abstracta que tiene informacion de la calculadora de tarifas 
 */
public abstract class CalculadoraTarifas {
	
	/**
	 * constante static de la clase impuesto
	 */
	public final static double IMPUESTO = 0.28;
	
	/**
	 * metodo abstracto que retorna el costo total del tiquete
	 * @param vuelo
	 * @param cliente
	 * @return
	 */
	public abstract int calcularTarifa(Vuelo vuelo, Cliente cliente);
	
	
	/**
	 * metodo abstracto que retorna el costo base del tiquete 
	 * @param vuelo
	 * @param cliente
	 * @return
	 */
	protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);
	
	/**
	 * metodo abstracto que retorna double el porcentaje de descuento
	 * @param cliente
	 * @return
	 */
	protected abstract double calcularPorcentajeDescuento(Cliente cliente);
	
	/**
	 * metodo static de la clase que retorna la distancia de un vuelo
	 * @param ruta
	 * @return
	 */
	protected static int calcularDistanciaVuelo(Ruta ruta)
	{
		return Aeropuerto.calcularDistancia(ruta.getDestino(), ruta.getOrigen());
	}
	
	/**
	 * metodo static que retorna el valor de impuestos
	 * @param costoBase
	 * @return
	 */
	protected static int calcularValorImpuestos(int costoBase)
	{
		return (int) (costoBase*IMPUESTO);
	}
}

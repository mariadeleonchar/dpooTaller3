package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

/**
 * subclase de CalculadoraTarifas que tiene informacion de las tarifas de temporada alta
 */
public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas{
	
	/**
	 * constante de costo por km
	 */
	protected final int COSTO_POR_KM =1000;
	
	
	/**
	 * metodo que retorna la tarifa en temporada alta
	 */
	@Override
	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		return calcularCostoBase(vuelo, cliente);
	}

	
	/**
	 * metodo que retorna el costo base en temporada alta
	 */
	@Override
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		
		return super.calcularDistanciaVuelo(vuelo.getRuta());
	}

	
	/**
	 * metodo que retorna el porcentaje de descuento en temporada alta
	 */
	@Override
	protected double calcularPorcentajeDescuento(Cliente cliente) {
	
		return 0.0;
	}

}

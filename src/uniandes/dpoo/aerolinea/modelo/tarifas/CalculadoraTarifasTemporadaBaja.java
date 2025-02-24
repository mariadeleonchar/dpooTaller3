package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;

/**
 * subclase de CalculadoraTarifas que tiene informacion de las tarifas de temporada baja
 */
public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas{
	
	/**
	 * constante coorporativo
	 */
	private static final String CORPORATIVO = "Corporativo";
	
	/**
	 * constante de costo por km para cliente natural
	 */
	protected final int COSTO_POR_KM_NATURAL = 600;
	
	/**
	 * costante de costo por km para cliente corporativo
	 */
	protected final int COSTO_POR_KM_CORPORATIVO = 900;
	
	/**
	 * constante de descuento para empresas pequeñas 
	 */
	protected final double DESCUENTO_PEQ = 0.02;
	
	/**
	 * constante de descuento para empresas medianas
	 */
	protected final double DESCUENTO_MEDIANAS = 0.01;
	
	/**
	 * constante de descuento para empresas grandes 
	 */
	protected final double DESCUENTO_GRACNDES = 0.02;
	
	
	/**
	 * metodo que retorna el costo base en temporada baja
	 */
	@Override
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		
		if (cliente.getTipoCliente().equals(CORPORATIVO))
		{	
			return super.calcularDistanciaVuelo(vuelo.getRuta()) *COSTO_POR_KM_CORPORATIVO;
		}
		else
		{
			return super.calcularDistanciaVuelo(vuelo.getRuta())*COSTO_POR_KM_NATURAL;
		}
	}
	
	
	/** 
	 * metodo que retorna el porcentaje de descuento en temporada baja
	 */
	@Override
	protected double calcularPorcentajeDescuento(Cliente cliente) {
		
		if (cliente.getTipoCliente().equals(CORPORATIVO))
		{
			ClienteCorporativo corp = (ClienteCorporativo) cliente;
			if (corp.getTamanoEmpresa()== 1)
			{
				return DESCUENTO_PEQ;
			}
			if (corp.getTamanoEmpresa()== 2)
			{
				return DESCUENTO_MEDIANAS;
			}
			if (corp.getTamanoEmpresa()== 3)
			{
				return DESCUENTO_GRACNDES;
			}
		}
		return 0.0;
	}
	
	
	/**
	 * metodo que retorna el costo total en temporada baja
	 */
	@Override
	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		if (cliente.getTipoCliente().equals(CORPORATIVO))
		{
			double tax = calcularValorImpuestos(calcularCostoBase(vuelo, cliente));
			return (int) (calcularCostoBase(vuelo, cliente)-(1-tax));
		}
		return calcularCostoBase(vuelo, cliente);
	}
	
}
	

package uniandes.dpoo.aerolinea.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

/**
 * la clase tiene informacion vuelos con fecha, ruta, y avion
 */
public class Vuelo {
	
	/**
	 * string de la fecha del vuelo
	 */
	private String fecha;
	/**
	 * atributo ruta de clase ruta
	 */
	private Ruta ruta;
	/**
	 * atributo avion de clase avion
	 */
	private Avion avion;
	
	private Collection<Tiquete> tiquetes;
	
	
	/**
	 * constructor de vuelo
	 * @param ruta
	 * @param fecha
	 * @param avion
	 */
	public Vuelo(Ruta ruta, String fecha, Avion avion)
	{
		this.ruta = ruta;
		this.avion = avion;
		this.fecha = fecha;
		this.tiquetes = new ArrayList<Tiquete>();
	}
	
	
	/**
	 * metodo que retorna la ruta del avion
	 * @return
	 */
	public Ruta getRuta()
	{
		return this.ruta;
	}
	
	/**
	 * metodo que retorna la fecha del vuelo
	 * @return
	 */
	public String getFecha()
	{
		return this.fecha;
	}
	
	/**
	 * metodo que retorna el avion del vuelo
	 * @return
	 */
	public Avion getAvion()
	{
		return this.avion;
	}
	
	/**
	 * metodo que retorna los tiquetes de un vuelo
	 * @return
	 */
	public Collection<Tiquete> getTiquetes()
	{
		return tiquetes;
	}
	
	/**
	 * metodo que vende tiquetes retorna el valor de los tiquetes 
	 * @param cliente
	 * @param calculadora
	 * @param cantidad
	 * @return
	 */
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad)
	{	
		return calculadora.calcularTarifa(this, cliente)*cantidad;
	
	}
}

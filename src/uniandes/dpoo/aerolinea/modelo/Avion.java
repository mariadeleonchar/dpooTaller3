package uniandes.dpoo.aerolinea.modelo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Esta clase tiene la información de aviones.
 */
public class Avion {
	
	/**
	 * un string con el nombre del avion
	 */
	private String nombre;
	/**
	 * un entero con la capacidad del avion
	 */
	private int capacidad;
	
	/**
	 * contructor del avion
	 * @param nombre
	 * @param capacidad
	 */
	public Avion(String nombre, int capacidad) 
	{
		this.nombre = nombre;
		this.capacidad = capacidad; 
	}
	
	/**
	 * el nombre del avion
	 * @return str
	 */
	public String getNombre() 
	{
		return this.nombre;
	}
	/**
	 * la capacidad del avion
	 * @return int
	 */
	public int getCapacidad()
	{
		return this.capacidad;
	}
}

package uniandes.dpoo.aerolinea.persistencia;

import uniandes.dpoo.aerolinea.modelo.Aerolinea;

public interface IPersistenciaAerolinea {

	
	public abstract void cargarAerolinea(String archivo, Aerolinea aerolinea)
	{
		
	}
	
	public abstract void salvaraerolinea(String archivo, Aerolinea aerolinea)
	{
		
	}
}

package uniandes.dpoo.aerolinea.modelo.cliente;

import org.json.JSONObject;

/**
 * Esta clase se usa para representar a los clientes de la aerolínea que son empresas
 */
public class ClienteCorporativo extends Cliente
{	
	
	/**
	 * constante corporativo
	 */
    public final String CORPORATIVO = "Corporativo";
    
    /** 
     * constante de tamaño grande
     */
    public final int GRANDE = 1;
    
    /**
     * constante de tamaño mediana
     */
    public final int MEDIANA = 2;
    
    /**
     * constante de tamaño pequeña
     */
    public final int PEQUENA = 3;
    
    /**
     * instancia nombre de la empresa: string
     */
    private String nombreEmpresa;
    
    /** 
     * instancia tamaño empresa: int 
     */
    private int tamanoEmpresa;
    

    /**
     * constructor de cliente coorporativo
     * @param nombreEmpresa
     * @param tamano
     */
    public ClienteCorporativo(String nombreEmpresa, int tamano)
    {
    	this.nombreEmpresa = nombreEmpresa;
    	this.tamanoEmpresa = tamano;
    }
    
    /**
     * metodo que retorna el nombre de la empresa: string
     * @return
     */
    public String getNombreEmpresa()
    {
    	return this.nombreEmpresa;
    }
    
    /**
     * metodo que retorna el tamaño de la empresa: int
     * @return
     */
    public int getTamanoEmpresa()
    {
    	return this.tamanoEmpresa;
    }
    
    /**
     * metodo de la superclase cliente retorna el tipo
     */
    @Override
    public String getTipoCliente()
    {
    	return CORPORATIVO;
    }
    
    /**
     * metodo de la superclase cliente retorna el identificador 
     */
    @Override
    public String getIdentificador()
    {	return this.nombreEmpresa;
    
    }
    
    /**
     * Crea un nuevo objeto de tipo a partir de un objeto JSON.
     * 
     * El objeto JSON debe tener dos atributos: nombreEmpresa (una cadena) y tamanoEmpresa (un número).
     * @param cliente El objeto JSON que contiene la información
     * @return El nuevo objeto inicializado con la información
     */
    public static ClienteCorporativo cargarDesdeJSON( JSONObject cliente )
    {
        String nombreEmpresa = cliente.getString( "nombreEmpresa" );
        int tam = cliente.getInt( "tamanoEmpresa" );
        return new ClienteCorporativo( nombreEmpresa, tam );
    }

    /**
     * Salva este objeto de tipo ClienteCorporativo dentro de un objeto JSONObject para que ese objeto se almacene en un archivo
     * @return El objeto JSON con toda la información del cliente corporativo
     */
    public JSONObject salvarEnJSON( )
    {
        JSONObject jobject = new JSONObject( );
        jobject.put( "nombreEmpresa", this.nombreEmpresa );
        jobject.put( "tamanoEmpresa", this.tamanoEmpresa );
        jobject.put( "tipo", CORPORATIVO );
        return jobject;
    }
}

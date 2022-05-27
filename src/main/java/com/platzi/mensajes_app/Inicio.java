package com.platzi.mensajes_app;

import java.sql.Connection;

/**
 * Hello world!
 *
 */
public class Inicio 
{
    public static void main( String[] args )
    {
    	Conexion conexion = new Conexion();
    	
    	try(Connection cnxConnection = conexion.getConnection()){
			
		} catch (Exception e) {
			System.out.println(e);
		}
    }
}

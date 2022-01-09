/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ROGER
 */
public class Conexion {
    private String controlador = "org.postgresql.Driver";
    private String cadenaConexion = "jdbc:postgresql://localhost:5432/bd_LabPiz0";
    private String usuario = "postgres";
    private String clave = "12345";
    
    private Connection conexion; //Sirve para almacenar la conexión abierta a la BD
    
    public Connection abrirConexion() throws Exception{
        Class.forName(this.controlador);
        conexion = DriverManager.getConnection(cadenaConexion, usuario, clave);
        return conexion;
    }
    
    public void cerrarConexion(Connection con) throws Exception{
        con.close();
        con = null;
    }
    
    public ResultSet ejecutarSQL(String sql) throws Exception{
        Statement sentencia = null;
        ResultSet resultado = null;
        sentencia = this.abrirConexion().createStatement();
        resultado = sentencia.executeQuery(sql);
        this.cerrarConexion(conexion);
        return resultado;
    }
    
    public ResultSet ejecutarSQL(PreparedStatement sp) throws Exception{
        ResultSet resultado = null;
        resultado = sp.executeQuery();
        this.cerrarConexion(conexion);
        return resultado;
    }
   
    public int ejecutarSQLActualizable(PreparedStatement sp) throws Exception{        
        int valor = sp.executeUpdate();
        this.cerrarConexion(conexion);
        return valor;
    }
}

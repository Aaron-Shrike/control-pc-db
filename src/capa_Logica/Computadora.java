/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_Logica;

import capa_datos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author roger alarcon
 */
public class Computadora{
    private String  numserie;
    private String  marca;
    private String  color;
    private int     año;
    private String  estado; 
    private String num_lab; 
    public static String[] t_estado = {"Operativo","Mantenimiento","Inoperativo","En Reparacion"};
    
    public static String getT_estado(int indice) {
        return t_estado[indice];
    }
    
    public Computadora()
    {
        this.numserie = "";
        this.marca = "";
        this.color = "";
        this.año = 1990;
        this.estado = "OPERATIVO";
        this.num_lab = "";
    }

    /**
     * @return the numserie
     */
    public String getNumserie() {
        return numserie;
    }

    /**
     * @param numserie the numserie to set
     */
    public void setNumserie(String numserie) {
        this.numserie = numserie;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }    

    /**
     * @return the num_lab
     */
    public String getNum_lab() {
        return num_lab;
    }

    /**
     * @param num_lab the num_lab to set
     */
    public void setNum_lab(String num_lab) {
        this.num_lab = num_lab;
    }
    
    public ResultSet listar() throws Exception{
        String sql = "select" +
                "	c.serie," +
                "	c.marca," +
                "	c.color," +
                "	c.año," +
                "	c.estado," +
                "	c.num_lab" +
                " from" +
                "	computadora c";
        Conexion objConectarse = new Conexion();
        PreparedStatement sp = objConectarse.abrirConexion().prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultado = objConectarse.ejecutarSQL(sp);
        return resultado;
    }
    
    public ResultSet listarxMarca(String marca) throws Exception{
        String sql = "select * from computadora where marca = ?";
        Conexion objConectarse = new Conexion();
        
        PreparedStatement spListar = objConectarse.abrirConexion().prepareStatement(sql);
        spListar.setString(1, marca);              
        ResultSet resultado = objConectarse.ejecutarSQL(spListar);
        
        return resultado;
    }
    
    public ResultSet buscarxSerie(String serie) throws Exception{
        String sql = "select * from computadora where serie = ?";
        Conexion objConectarse = new Conexion();
        
        PreparedStatement spListar = objConectarse.abrirConexion().prepareStatement(sql);
        spListar.setString(1, serie);              
        ResultSet resultado = objConectarse.ejecutarSQL(spListar);
        
        return resultado;
    }
    
    public ResultSet listarCantidadxEstado() throws Exception{
        String sql = "select estado, count(*) as cantidad" +                
                " from computadora " +
                " group by estado";       
        
        Conexion objConectarse = new Conexion();
        PreparedStatement sp = objConectarse.abrirConexion().prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultado = objConectarse.ejecutarSQL(sp);
        return resultado;
    }
    
    public void ModificarEstado(String serie, String estado) throws Exception{
        String sql = "update computadora set estado = ? where serie = ?";
        Conexion objConectarse = new Conexion();
        
        PreparedStatement spModificar = objConectarse.abrirConexion().prepareStatement(sql);
        spModificar.setString(1, estado);
        spModificar.setString(2, serie);
        int valor = objConectarse.ejecutarSQLActualizable(spModificar);        
    }
    
    public boolean agregar() throws Exception{
        
            String sql;
            Conexion transaccion = new Conexion();
            sql = "INSERT INTO computadora" +
                    "(" +
                    "	serie," +
                    "	marca, " +
                    "	color, " +
                    "	año, " +
                    "	estado, " +
                    "	num_lab " +
                    ")" +
                    "VALUES " +
                    "(" +
                    "	?, " +
                    "	?, " +
                    "	?, " +
                    "	?, " +
                    "	?, " +
                    "	?" +
                    ");";

            PreparedStatement spInsertar = transaccion.abrirConexion().prepareStatement(sql);
            
            spInsertar.setString(1, this.getNumserie());
            spInsertar.setString(2, this.getMarca());
            spInsertar.setString(3, this.getColor());
            spInsertar.setInt(4, this.getAño());
            spInsertar.setString(5, this.getEstado());
            spInsertar.setString(6, this.getNum_lab());
            int valor = transaccion.ejecutarSQLActualizable(spInsertar);
                        
            /*Confirmar y terminar la transacción*/
            //transaccion.cerrarConexion(transaccion);
            return true;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Milton
 */
public class EmpleadoDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int respuesta;

    // Dao se relaciona con Empleado directamente con la base de datos
    public Empleado validar(String user, String dni) {

        Empleado em = new Empleado();
        String sql = "select * from empleado where User=? and Dni=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, dni);
            rs = ps.executeQuery();

            //traemos los datos de bd , los nombres deben ser = a la tabla de consulta
            while (rs.next()) {
                em.setId(rs.getInt("IdEmpleado"));
                em.setUser(rs.getString("User"));
                em.setDni(rs.getString("Dni"));
                em.setNom(rs.getString("Nombres"));
            }

        } catch (Exception e) {
        }

        return em;
    }

    public List listar() {
        String sql = "select * from empleado";
        List<Empleado> lista = new ArrayList<>();
       
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                 Empleado em = new Empleado();
                em.setId(rs.getInt(1));
                em.setDni(rs.getString(2));
                em.setNom(rs.getString(3));
                em.setTel(rs.getString(4));
                em.setEstado(rs.getString(5));
                em.setUser(rs.getString(6));
                lista.add(em);

            }
        } catch (Exception e) {
        }

        return lista;
    }

    public int agregar(Empleado empleado) {
        String sql = "insert into empleado(Dni,Nombres,Telefono,Estado,User) values (?,?,?,?,?) ";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, empleado.getDni());
            ps.setString(2, empleado.getNom());
            ps.setString(3, empleado.getTel());
            ps.setString(4, empleado.getEstado());
            ps.setString(5, empleado.getUser());
            ps.executeUpdate();

        } catch (Exception e) {
        }

        return respuesta;
    }
    
        public Empleado listarId(int id) {
        Empleado empleado = new Empleado();
        String sql = "select * from empleado where IdEmpleado="+id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
               
                empleado.setDni(rs.getString(2));
                empleado.setNom(rs.getString(3));
                empleado.setTel(rs.getString(4));
                empleado.setEstado(rs.getString(5));
                empleado.setUser(rs.getString(6));
            }
        } catch (Exception e) {
        }
        
        return empleado;
    }


    public int actualizar(Empleado em) {
         String sql = "update empleado set Dni=?, Nombres=?, Telefono=?,Estado=?,User=? where IdEmpleado=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, em.getDni());
            ps.setString(2, em.getNom());
            ps.setString(3, em.getTel());
            ps.setString(4, em.getEstado());
            ps.setString(5, em.getUser());
            ps.setInt(6, em.getId());
            ps.executeUpdate();
            ps.close();
            con.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e);
        }
        
       
        return respuesta;
    }

    public void delete(int id) {
        String sql = "delete from empleado where IdEmpleado=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}

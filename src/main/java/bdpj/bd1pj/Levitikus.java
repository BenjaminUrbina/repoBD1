/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bdpj.bd1pj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Levitikus {
    public static void main(String[] args) {
    
        Connection conn = null;
        try {
            conn = ConexionBd.getConnection();
            
            String sql = "SELECT * FROM cliente";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            // Iterar sobre los resultados
            while (rs.next()) {
                // Suponiendo que la tabla "clientes" tiene columnas "id", "nombre" y "correo"
                String rut = rs.getString("rut");
                String correo = rs.getString("correo");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellidop");
                int telefono = rs.getInt("numero_telefono");

                System.out.println("RUT: " + rut + ", Correo: " + correo + 
                                   ", Nombre: " + nombre + ", Apellido: " + apellido + 
                                   ", Telefono: " + telefono);
            } 
        
        }catch (SQLException e) {
            System.err.println("Error durante la operación con la base de datos: " + e.getMessage());
        } finally {
            ConexionBd.closeConnection(conn);
        }
        }
 }
    


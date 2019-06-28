package modelo;

import getset.gsPrestamo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EVA Tester
 */
public class modPrestamo {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL1 = "";
    private String sSQL2 = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"Cliente", "Libro Prest. 1", "Cantidad", "Libro Prest. 2", "Cantidad", "Libro Prest. 3", "Cantidad", "Fecha Prest.", "Fecha Devol."};
        String[] registro = new String[9];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL1 = "select cliente, libroPrest1, cantidadL1, libroPrest2, cantidadL2, libroPrest3, cantidadL3, fechaPrestamo, FechaDevolucion from prestamos";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL1);

            while (rs.next()) {
                registro[0] = rs.getString("cliente");
                registro[1] = rs.getString("libroPrest1");
                registro[2] = rs.getString("cantidadL1");
                registro[3] = rs.getString("libroPrest2");
                registro[4] = rs.getString("cantidadL2");
                registro[5] = rs.getString("libroPrest3");
                registro[6] = rs.getString("cantidadL3");
                registro[7] = rs.getString("fechaPrestamo");
                registro[8] = rs.getString("FechaDevolucion");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public boolean insertarPrest(gsPrestamo dts) {
        sSQL1 = "insert into prestamos (cliente, libroPrest1, cantidadL1, libroPrest2, cantidadL2, libroPrest3, cantidadL3, fechaPrestamo, FechaDevolucion) values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL1);
            pst.setString(1, dts.getNombreCliente());
            pst.setString(2, dts.getLibro1());
            pst.setInt(3, dts.getCant1());
            pst.setString(4, dts.getLibro2());
            pst.setInt(5, dts.getCant2());
            pst.setString(6, dts.getLibro3());
            pst.setInt(7, dts.getCant3());
            pst.setString(8, dts.getFechaPrest());
            pst.setString(9, dts.getFechaDevol());

            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean insertarCli(gsPrestamo dts) {
        sSQL2 = "insert into cliente (ciCliente, nombreCliente) values (?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL2);
            pst.setInt(1, dts.getIdCliente());
            pst.setString(2, dts.getNombreCliente());

            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    /*public boolean actualizarStock(gsPrestamo dts){
    sSQL1 = "update libros set stock=?";
    }*/
    
    public boolean editar(gsPrestamo dts) {
        sSQL1 = "update prestamos set libroPrest1=?, cantidadL1=?, libroPrest2=?, cantidadL2=?, libroPrest3=?, cantidadL3=?, fechaPrestamo=?, FechaDevolucion=? where cliente=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL1);
            pst.setString(1, dts.getNombreCliente());
            pst.setString(2, dts.getLibro1());
            pst.setInt(3, dts.getCant1());
            pst.setString(4, dts.getLibro2());
            pst.setInt(5, dts.getCant2());
            pst.setString(6, dts.getLibro3());
            pst.setInt(7, dts.getCant3());
            pst.setString(8, dts.getFechaPrest());
            pst.setString(9, dts.getFechaDevol());

            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(gsPrestamo dts) {
        sSQL1 = "delete from prestamos where cliente=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL1);
            pst.setString(1, dts.getNombreCliente());

            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
}

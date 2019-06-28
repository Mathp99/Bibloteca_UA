package modelo;

import getset.gsEditorial;
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
public class modEditorial {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ID Editorial", "Nombre", "Dirección", "Nro. de Teléfono"};
        String[] registro = new String[4];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select * from editorial";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idEditorial");
                registro[1] = rs.getString("nombreEditorial");
                registro[2] = rs.getString("direccEditorial");
                registro[3] = rs.getString("telefEditorial");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public boolean insertar(gsEditorial dts) {
        sSQL = "insert into editorial (idEditorial, nombreEditorial, direccEditorial, telefEditorial) values (?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdEditorial());
            pst.setString(2, dts.getNombreEditorial());
            pst.setString(3, dts.getDireccEditorial());
            pst.setInt(4, dts.getTelefEditorial());

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

    public boolean editar(gsEditorial dts) {
        sSQL = "update editorial set nombreEditorial=?, direccEditorial=?, telefEditorial=? where idEditorial=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdEditorial());
            pst.setString(2, dts.getNombreEditorial());
            pst.setString(3, dts.getDireccEditorial());
            pst.setInt(4, dts.getTelefEditorial());

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

    public boolean eliminar(gsEditorial dts) {
        sSQL = "delete from editorial where idEditorial=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdEditorial());

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

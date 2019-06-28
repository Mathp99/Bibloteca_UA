package modelo;

import getset.gsLibro;
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
public class modLibro {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ISBN", "Título", "Autor", "Género", "Editorial", "Año Public.", "Stock"};
        String[] registro = new String[7];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select * from libros";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idLibro");
                registro[1] = rs.getString("tituloLibro");
                registro[2] = rs.getString("autor");
                registro[3] = rs.getString("genero");
                registro[4] = rs.getString("editorial");
                registro[5] = rs.getString("anhoPublic");
                registro[6] = rs.getString("stock");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public boolean insertar(gsLibro dts) {
        sSQL = "insert into libros (idLibro, tituloLibro, autor, genero, editorial, anhoPublic, stock)"
                + "values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getIsbn());
            pst.setString(2, dts.getTitulo());
            pst.setString(3, dts.getAutor());
            pst.setString(4, dts.getGenero());
            pst.setString(5, dts.getEditorial());
            pst.setString(6, dts.getFechaPublic());
            pst.setString(7, dts.getStock());

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

    public boolean editar(gsLibro dts) {
        sSQL = "update libros set tituloLibro=?, autor=?, genero=?, editorial=?, anhoPublic=?, stock=? where idLibro=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getTitulo());
            pst.setString(2, dts.getAutor());
            pst.setString(3, dts.getGenero());
            pst.setString(4, dts.getEditorial());
            pst.setString(5, dts.getFechaPublic());
            pst.setString(6, dts.getStock());
            pst.setString(7, dts.getIsbn());

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

    public boolean eliminar(gsLibro dts) {
        sSQL = "delete from libros where idLibro=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getIsbn());

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

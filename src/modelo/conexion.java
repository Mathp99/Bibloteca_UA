package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author EVA Tester
 */
public class conexion {

    public String db = "db_biblioteca";
    public String url = "jdbc:mysql://127.0.0.1/" + db + "?useTimezone=true&serverTimezone=UTC";
    public String user = "root";
    public String pass = "xxzz104578";

    public conexion() {
    }

    public Connection conectar() {
        Connection link = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.pass);

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);

        }
        return link;
    }
}

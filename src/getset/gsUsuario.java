package getset;

/**
 *
 * @author EVA Tester
 */
public class gsUsuario {

    int idUsuario;
    String usuario;
    String contrasenha;

    public gsUsuario() {
    }

    public gsUsuario(int idUsuario, String usuario, String contrasenha) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.contrasenha = contrasenha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

}

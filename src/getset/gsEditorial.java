package getset;

/**
 *
 * @author EVA Tester
 */
public class gsEditorial {

    int idEditorial;
    String nombreEditorial;
    String direccEditorial;
    int telefEditorial;

    public gsEditorial(int idEditorial, String nombreEditorial, String direccEditorial, int telefEditorial) {
        this.idEditorial = idEditorial;
        this.nombreEditorial = nombreEditorial;
        this.direccEditorial = direccEditorial;
        this.telefEditorial = telefEditorial;
    }

    public gsEditorial() {
    }

    public int getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public String getDireccEditorial() {
        return direccEditorial;
    }

    public void setDireccEditorial(String direccEditorial) {
        this.direccEditorial = direccEditorial;
    }

    public int getTelefEditorial() {
        return telefEditorial;
    }

    public void setTelefEditorial(int telefEditorial) {
        this.telefEditorial = telefEditorial;
    }
}

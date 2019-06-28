package getset;

/**
 *
 * @author EVA Tester
 */
public class gsPrestamo {

    int idCliente;
    String nombreCliente;

    String libro1, libro2, libro3;
    int cant1, cant2, cant3;
    String fechaPrest;
    String fechaDevol;

    public gsPrestamo() {
    }

    public gsPrestamo(int idCliente, String nombreCliente, String libro1, String libro2, String libro3, int cant1, int cant2, int cant3, String fechaPrest, String fechaDevol) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.libro1 = libro1;
        this.libro2 = libro2;
        this.libro3 = libro3;
        this.cant1 = cant1;
        this.cant2 = cant2;
        this.cant3 = cant3;
        this.fechaPrest = fechaPrest;
        this.fechaDevol = fechaDevol;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getLibro1() {
        return libro1;
    }

    public void setLibro1(String libro1) {
        this.libro1 = libro1;
    }

    public String getLibro2() {
        return libro2;
    }

    public void setLibro2(String libro2) {
        this.libro2 = libro2;
    }

    public String getLibro3() {
        return libro3;
    }

    public void setLibro3(String libro3) {
        this.libro3 = libro3;
    }

    public int getCant1() {
        return cant1;
    }

    public void setCant1(int cant1) {
        this.cant1 = cant1;
    }

    public int getCant2() {
        return cant2;
    }

    public void setCant2(int cant2) {
        this.cant2 = cant2;
    }

    public int getCant3() {
        return cant3;
    }

    public void setCant3(int cant3) {
        this.cant3 = cant3;
    }

    public String getFechaPrest() {
        return fechaPrest;
    }

    public void setFechaPrest(String fechaPrest) {
        this.fechaPrest = fechaPrest;
    }

    public String getFechaDevol() {
        return fechaDevol;
    }

    public void setFechaDevol(String fechaDevol) {
        this.fechaDevol = fechaDevol;
    }

    public void setFechaPrest(java.util.Date fecha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

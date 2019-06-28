package getset;

/**
 *
 * @author EVA Tester
 */
public class gsGenero {

    int idgenero;
    String descGenero;

    public gsGenero(int idgenero, String descGenero) {
        this.idgenero = idgenero;
        this.descGenero = descGenero;
    }

    public gsGenero() {
    }

    public int getIdgenero() {
        return idgenero;
    }

    public void setIdgenero(int idgenero) {
        this.idgenero = idgenero;
    }

    public String getDescGenero() {
        return descGenero;
    }

    public void setDescGenero(String descGenero) {
        this.descGenero = descGenero;
    }

}

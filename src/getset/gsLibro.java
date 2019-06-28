package getset;

/**
 *
 * @author EVA Tester
 */
public class gsLibro {

    String isbn;
    String titulo;
    String autor;
    String fechaPublic;
    String genero;
    String editorial;
    String stock;

    public gsLibro(String isbn, String titulo, String autor, String fechaPublic, String genero, String editorial, String stock) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublic = fechaPublic;
        this.genero = genero;
        this.editorial = editorial;
        this.stock = stock;
    }

    public gsLibro() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaPublic() {
        return fechaPublic;
    }

    public void setFechaPublic(String fechaPublic) {
        this.fechaPublic = fechaPublic;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public Object getDateEditor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

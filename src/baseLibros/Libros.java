package baseLibros;

public class Libros {
    String titulo;
    String autor;
    int numPag;
    int anopub;

    public Libros(String titulo, String autor, int numPag, int anopub){
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
        this.anopub = anopub;
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

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public int getAnopub() {
        return anopub;
    }

    public void setAnopub(int anopub) {
        this.anopub = anopub;
    }

    public void mostrarDatosLibros(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Num. Paginas: " + numPag);
        System.out.println("Año Publicacion: " + anopub);
    }




}

import java.util.Objects;
public class Libro {
    //attributi
private String id;
private static int counter;
private String titolo;
private String sinossi;
private Autore autore;

//costruttore
    public Libro( String titolo, String sinossi, Autore autore) {
        id = "L"+counter++;
        this.titolo = titolo;
        this.sinossi = sinossi;
        this.autore = autore;
    }
//metodi
    public String getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public Autore getAutore() {
        return autore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return titolo.equals(libro.titolo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titolo);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id='" + id + '\'' +
                ", titolo='" + titolo + '\'' +
                ", sinossi='" + sinossi + '\'' +
                ", autore=" + autore +
                '}';
    }

}

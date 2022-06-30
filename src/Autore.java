import java.util.ArrayList;
import java.util.List;
//attributi
public class Autore {
    private String id;
    private static int counter;
    private String nome;
    private String cognome;
    private List<Libro> listaDiLibri;
//costruttore
    public Autore( String nome, String cognome) {
        this.id = "A"+counter++;
        this.nome = nome;
        this.cognome = cognome;
        this.listaDiLibri =new ArrayList<>();
    }
    //metodi
    public void aggiungiLibro(Libro libro){
        if (!listaDiLibri.contains(libro)){
            listaDiLibri.add(libro);
        }
    }

    public String getCognome() {
        return cognome;
    }

    public List<Libro> getListaDiLibri() {
        return listaDiLibri;
    }

    @Override
    public String toString() {
        return "Autore{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }
}



import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    //attributi
    private List<Libro> archivioLibri;

    //costruttore
    public Biblioteca(/*List<Libro> archivioLibri*/) {
        this.archivioLibri = new ArrayList<>();
    }

    //metodi
    public void inserimentoLibroInArchivio(Libro libro) {
        archivioLibri.add(libro);
        libro.getAutore().aggiungiLibro(libro);
    }

    public void CancellaDaArchivio(Libro libro) {
        System.out.println(archivioLibri);
        archivioLibri.remove(libro);
        System.out.println(archivioLibri);
    }

    public void ricercaPerId(String id) {
        for (Libro libro : archivioLibri) {
            if (libro.getId().equalsIgnoreCase(id)) {
                System.out.println("il libro e` stato trovato\t" + libro);
                return;
            }
        }
        System.out.println("il libro con id:" + id + " non trovato");
    }

    public void ricercaPerTitolo(String titolo) {
        for (Libro libro : archivioLibri) {
            if (libro.getTitolo().toUpperCase().contains(titolo.toUpperCase())) {//metto l'ingresso tutto maiuscolo e i titoli tutti maiuscoli cosi non fa differenza se l'utente cambia tra maiuscolo e minuscolo
                System.out.println("il libro e` stato trovato\t" + libro);
                return;
            }
        }
        System.out.println("il libro con titolo:" + titolo + " non trovato");
    }

    public void ricercaPerCognomeAutore(String autore) {
        int counterLibriTrovati = 0;
        for (Libro libro : archivioLibri) {
            if (libro.getAutore().getCognome().toUpperCase().contains(autore.toUpperCase())) {
                System.out.println(libro);
                counterLibriTrovati++;
                //appena trova tutti i libri dell'autore esce dal ciclo senza dover scorrere tutto l'archivio
                if (counterLibriTrovati == libro.getAutore().getListaDiLibri().size() - 1) {
                    System.out.println("i libri di "+autore.toUpperCase()+ " sono:\n"+libro.getAutore().getListaDiLibri());
                    break;
                }
            } else System.out.println("non ci sono libri di " +autore+ " nell'archivio");
        }
    }

   /* public void ricercaPerAutore(Autore autore){
        for(Libro libro: archivioLibri){
            if (libro.getAutore().equals(autore){
            }
        }
        }
        */
    }

//+inserimentoLibro
//+cancellaLibro
//+ricercaLibro
//+StampaListaLibriDiAutore


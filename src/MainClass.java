public class MainClass {

    public static void main(String[] args) {

        Autore autore1 = new Autore("kamel", "amier");
        Autore autore2 = new Autore("Luca", "Pavone");
        Libro libro1 = new Libro("Titolo1", "bla ", autore1);
        Libro libro4=new Libro("AAAA","bla",autore1 );
        Libro libro2=new Libro("Titolo2","bla",autore1 );
        Libro libro3=new Libro("ATitolo3","bla",autore1 );


        autore1.aggiungiLibro(libro2);
        autore1.aggiungiLibro(libro1);
        autore1.aggiungiLibro(libro3);
        autore1.aggiungiLibro(libro4);
        Biblioteca biblioteca = new Biblioteca();
      //  System.out.println(autore1.getListaDiLibri());
        System.out.println("\n");
     //   System.out.println(autore2.getListaDiLibri());
        biblioteca.inserimentoLibroInArchivio(libro2);
        biblioteca.inserimentoLibroInArchivio(libro1);
        biblioteca.inserimentoLibroInArchivio(libro3);
        biblioteca.inserimentoLibroInArchivio(libro4);
        biblioteca.ricercaPerId("L2");
        biblioteca.ricercaPerCognomeAutore("aMieR");
        biblioteca.ricercaPerTitolo("Titolo4");
        System.out.println();
        biblioteca.CancellaDaArchivio(libro3);
        System.out.println();
        biblioteca.ricercaPerId("L2");
        System.out.println();
        System.out.println(autore1.getListaDiLibri());
    }
}

// Autore autore2 = new Autore("Luca", "Pavone");
//Libro libro6 = new Libro("a7a3", "bla", autore2);
// Libro libro3=new Libro("a7a4","bla bla bla bla",autore1 );
// Libro libro4=new Libro("a7a5","bla bla bla bla",autore2 );
// Libro libro5=new Libro("a7a6","bla bla bla bla",autore2 );
// autore2.aggiungiLibro(libro6);
// autore1.aggiungiLibro(libro5);
//   autore1.aggiungiLibro(libro3);
// System.out.println(autore2.getListaDiLibri());
//  System.out.println("\n");
// biblioteca.ricercaPerCognomeAutore("pavone");
// System.out.println("\n");
//  biblioteca.ricercaPerCognomeAutore("amieR");
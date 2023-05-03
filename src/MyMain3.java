import java.util.Date;

public class MyMain3 {

    public static void main(String[] args) {
        // Creazione di alcuni articoli
        Articolo a1 = new Articolo("A1", "Lucidalabbrador", 29.99, 10);
        Articolo a2 = new Articolo("A2", "Sorriso falso", 59.99, 5);
        Articolo a3 = new Articolo("A3", "Spremiacume", 19.99, 20);
        
        // Stampa dettagli articoli
        System.out.println("\nDettagli degli articoli:");
        System.out.println("- Codice articolo: " + a1.getCodice());
        System.out.println("- Descrizione: " + a1.getDescrizione());
        System.out.println("- Prezzo: " + a1.getPrezzo() + " euro");
        System.out.println("- Numero pezzi disponibili in magazzino: " + a1.getQuantitaDisponibile());

        System.out.println("\n- Codice articolo: " + a2.getCodice());
        System.out.println("- Descrizione: " + a2.getDescrizione());
        System.out.println("- Prezzo: " + a2.getPrezzo() + " euro");
        System.out.println("- Numero pezzi disponibili in magazzino: " + a2.getQuantitaDisponibile());

        System.out.println("\n- Codice articolo: " + a3.getCodice());
        System.out.println("- Descrizione: " + a3.getDescrizione());
        System.out.println("- Prezzo: " + a3.getPrezzo() + " euro");
        System.out.println("- Numero pezzi disponibili in magazzino: " + a3.getQuantitaDisponibile());

        // Creazione di un cliente
        Cliente c1 = new Cliente("C1", "Mario Rossi", "mario.rossi@email.com",
                new Date(System.currentTimeMillis()));

        // Stampa dei dettagli del cliente
        System.out.println("\nDettagli del cliente:");
        System.out.println("- Codice cliente: " + c1.getCodice());
        System.out.println("- Nome e cognome: " + c1.getNomeCognome());
        System.out.println("- Email: " + c1.getEmail());
        System.out.println("- Data iscrizione: " + c1.getDataIscrizione());

        // Creazione carrello cliente
        Carrello carrello = new Carrello(c1);

        // Aggiunta articoli al carrello
        carrello.aggiungiArticolo(a1);
        carrello.aggiungiArticolo(a2);
        carrello.aggiungiArticolo(a3);

        // Stampa riepilogo carrello
        System.out.println("\nCarrello di " + c1.getNomeCognome() + ":");
        for (Articolo articolo : carrello.getArticoli()) {
            if (articolo != null) {
                System.out.println("- " + articolo.getDescrizione() + ": " + articolo.getPrezzo() + " euro");
            }
        }
        System.out.println("Totale: " + carrello.getTotaleCosto() + " euro");
    }
}

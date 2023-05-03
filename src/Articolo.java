public class Articolo {
    private String codice;
    private String descrizione;
    private double prezzo;
    private int quantitaDisponibile;

    public Articolo(String codice, String descrizione, double prezzo, int quantitaDisponibile) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.quantitaDisponibile = quantitaDisponibile;
    }

    public String getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getQuantitaDisponibile() {
        return quantitaDisponibile;
    }

    public void setQuantitaDisponibile(int quantitaDisponibile) {
        this.quantitaDisponibile = quantitaDisponibile;
    }
}

public class Carrello {
    private Cliente cliente;
    private Articolo[] articoli;
    private int numArticoli;

    public Carrello(Cliente cliente) {
        this.cliente = cliente;
        this.articoli = new Articolo[10];
        this.numArticoli = 0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Articolo[] getArticoli() {
        return articoli;
    }

    public double getTotaleCosto() {
        double totale = 0;
        for (int i = 0; i < numArticoli; i++) {
            totale += articoli[i].getPrezzo();
        }
        return totale;
    }

    public void aggiungiArticolo(Articolo articolo) {
        if (numArticoli == articoli.length) {
            // Se l'array è pieno, ne creiamo uno nuovo con doppia capacità
            Articolo[] nuovoArray = new Articolo[articoli.length * 2];
            for (int i = 0; i < articoli.length; i++) {
                nuovoArray[i] = articoli[i];
            }
            articoli = nuovoArray;
        }
        articoli[numArticoli] = articolo;
        numArticoli++;
    }
}

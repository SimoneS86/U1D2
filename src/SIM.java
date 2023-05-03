public class SIM {
    private String numeroTelefono;
    private double credito;
    private String[] numeriChiamati;
    private int[] durateChiamate;

    public SIM(String numeroTelefono) {
        this(numeroTelefono, 0.0, new String[5], new int[5]);
    }

    public SIM(String numeroTelefono, double credito, String[] numeriChiamati, int[] durateChiamate) {
        this.numeroTelefono = numeroTelefono;
        this.credito = credito;
        this.numeriChiamati = numeriChiamati;
        this.durateChiamate = durateChiamate;
    }

    public void stampaDati() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + " euro");
        System.out.println("Ultime chiamate:");
        for (int i = 0; i < numeriChiamati.length; i++) {
            if (numeriChiamati[i] != null) {
                System.out.println((i+1) + ". Numero chiamato: " + numeriChiamati[i] + ", durata: " + durateChiamate[i] + " minuti");
            }
        }
    }
}

public class Rettangolo {
    private double altezza;
    private double larghezza;
    
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }
    
    public double calcolaArea() {
        return altezza * larghezza;
    }
    
    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }
    public void stampaRettangolo() {
        double area = this.calcolaArea();
        double perimetro = this.calcolaPerimetro();
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        System.out.println("Rettangolo 1:");
        rettangolo1.stampaRettangolo();
        double area1 = rettangolo1.calcolaArea();
        double perimetro1 = rettangolo1.calcolaPerimetro();

        System.out.println("Rettangolo 2:");
        rettangolo2.stampaRettangolo();
        double area2 = rettangolo2.calcolaArea();
        double perimetro2 = rettangolo2.calcolaPerimetro();

        double areaTotale = area1 + area2;
        double perimetroTotale = perimetro1 + perimetro2;
        System.out.println("Somma delle aree: " + areaTotale);
        System.out.println("Somma dei perimetri: " + perimetroTotale);
    }


    
}

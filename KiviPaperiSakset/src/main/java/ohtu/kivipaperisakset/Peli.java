package ohtu.kivipaperisakset;

public abstract class Peli {

    private String ekanSiirto;
    private String tokanSiirto;

    public void pelaa() {

        Tuomari tuomari = new Tuomari();
        System.out.println("Peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s.");
        peliKierros();

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();
            peliKierros();
        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);

    }

    protected abstract String tokanSiirto(String ekanSiirto);

    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

    private void peliKierros() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        ekanSiirto = IO.lueRivi();
        System.out.print("Toisen pelaajan siirto: ");
        tokanSiirto = tokanSiirto(ekanSiirto);
    }

}

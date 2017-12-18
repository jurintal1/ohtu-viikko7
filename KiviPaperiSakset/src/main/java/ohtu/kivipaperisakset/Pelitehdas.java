package ohtu.kivipaperisakset;

public class Pelitehdas {

    public Pelitehdas() {
    }

    public static Peli luoKaksinpeli() {
        return new KPSPelaajaVsPelaaja();
    }

    public static Peli luoTekoaly() {
        return new KPSTekoaly();
    }

    public static Peli luoParempiTekoaly() {
        return new KPSParempiTekoaly();
    }

}

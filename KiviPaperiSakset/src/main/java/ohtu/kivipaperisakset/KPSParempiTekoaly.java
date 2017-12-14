package ohtu.kivipaperisakset;

public class KPSParempiTekoaly extends Peli {

    private static final TekoalyParannettu tekoaly = new TekoalyParannettu(20);

    @Override
    public String tokanSiirto(String ekanSiirto) {
        String tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        tekoaly.asetaSiirto(ekanSiirto);
        return tokanSiirto;
    }

}

package ohtu.kivipaperisakset;

public class Paaohjelma {


    public static void main(String[] args) {        


        OUTER:
        while (true) {
            System.out.print("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetetaan");
            String valinta = Skanneri.lueRivi().trim();            
            
            switch (valinta) {
                case "a":
                    Pelitehdas.luoKaksinpeli().pelaa();
                    break;
                case "b":
                    Pelitehdas.luoTekoaly().pelaa();
                    break;
                case "c":
                    Pelitehdas.luoParempiTekoaly().pelaa();
                    break;
                default:
                    break OUTER;
            }
        }

    }
}

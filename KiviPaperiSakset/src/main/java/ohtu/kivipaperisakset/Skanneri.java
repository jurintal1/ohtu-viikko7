
package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Skanneri {
    private static final Scanner SCANNER = new Scanner(System.in);
    
    public static String lueRivi() {
        return SCANNER.nextLine();
    }
    
}

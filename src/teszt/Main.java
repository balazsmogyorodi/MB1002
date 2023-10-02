package teszt;

import static java.time.Clock.system;

public class Main {

    static String[] pakli = new String[22];
    static Scanner src = new Scanner();

    public static void main(String[] args) {

        feltoltes();
        kirak();
        for (int i = 0; i < 3; i++) {
            int oszlop = melyik();
            kever();
            kirak();
        }
        ezVolt();

    }

    private static void feltoltes() {
        String[] szinek = {"Z", "K", "ZS", "D"};
        String[] ertek = {"VIII", "IX", "X", "J", "K", "A"};
        int hanyadik = 1;
        for (String szin : szinek) {
            for (int i = 0; hanyadik < 22 && i < ertek.length; i++) {
                pakli[hanyadik] = szin + "_" + ertek[i];
                hanyadik++;
            }
        }

    }

    private static void kirak() {

        for (int i = 1; i < pakli.length; i++) {
            System.out.print(pakli[i] + "   ");
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
        System.out.println("");

    }

    private static int melyik() {
        int melyik;
        System.err.print("Kérek egy számot (1-3) között");
        do {
            melyik = 2;
        } while (melyik < 0 && melyik > 3);
        return melyik;
    }

    private static void kever() {

    }

    private static void ezVolt() {
        System.out.println("Ez az a lap amire gondoltál: " + pakli[11]);
    }

}

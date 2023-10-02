package teszt;

public class Main {
    
    static String [] pakli = new String[22];
    static  Scanner src = new Scannner();

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
        String [] szinek = {"Z", "K", "ZS", "D"};
        String [] ertek = { "VIII", "IX", "X", "J", "K", "A"};
        
        for (String szin : szinek) {
             int hanyadik = 0;
            for (int i = 1; i < 22 && hanyadik < ertek.length; i++) {
                pakli[i] = szin + "_" + ertek[hanyadik];   
                hanyadik ++;
            }      
        }
        
        
        
    }

    private static void kirak() {
      
        for (int i = 1; i < pakli.length; i++) {
            System.out.print(pakli[i]);
            if (i%3 == 0) {
                System.out.println("");
            }
        }
   
        
        
    }

    private static int melyik() {
        int melyik;
        do{
            src.nextI
            
        
        }while (melyik < 0 && melyik > 3)           
            
       
        
        
        
        return melyik;
    }

    private static void kever() {

    }

    private static void ezVolt() {
    }

}

package Soru_Gezegeni;

public class Q05_foorLoopp {
    public static void main(String[] args) {
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
        //  public static void main(String[] args) {

         System.out.println("******************** for ilr******************");
        for (int i = 0; i <= 255; i++) {

            char karakter = (char) i;
            System.out.println(i + "-> " + karakter);

        }
        System.out.println("******************** for ilr******************");

        int i=0;
        while(i<=255){
            char c= (char) i;
            System.out.println(i + " - " + c);
            i++;
        }




    }
}

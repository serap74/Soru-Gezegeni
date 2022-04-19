package Soru_Gezegeni;

import java.util.Scanner;

public class Z01_asalCarpan {
    public static void main(String[] args) {

        /* TASK :
         * Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir
         * METHOD create ediniz.
         *
         * Ör: Input : 50
         *     Bolenler : 2,5,10,20,50
         *     Asal Bolenler: 2,5
         *     En buyuk asal carpan: 5
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi girin");
        int sayi = scan.nextInt(); //50

        asalCarpan(sayi);


    }

    private static void asalCarpan(int sayi) {

        int asalBolen = 0;
        for (int i = 2; i <= sayi; i++) {


        }
    }

}
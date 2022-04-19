package Soru_Gezegeni;

import java.util.Scanner;

public class C01_kiloBagis {
    public static void main(String[] args, Scanner scan) {
        
        /*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scanner = new Scanner(System.in);//kullanicidan input almak

        // icin scaner objesi create ettik

        System.out.println("yasinizi giriniz");
        int yas=scan.nextInt();

        System.out.println("kilonuzu giriniz");
        int kilo = scan.nextInt();

        if (yas > 0 & yas < 18) {//yas kontrol sart
            System.out.println("kan bagisi yapamazsin");
        } else if (yas >= 18) {
            if (kilo > 0 & kilo < 50) {//kilo sart kontrol
                System.out.println("kilonuz kan bagisi icin yetersiz");
            } else if (kilo >= 50) {
                System.out.println("sartlariniz uygun kan bagisi yapabilirsiniz");
            } else System.out.println("kilonuzu hatali veri girdiniz");//hatali kilo kontrol
        } else System.out.println("hatali veri girdiniz");//hatali yas giris kontrol


    }
}
    


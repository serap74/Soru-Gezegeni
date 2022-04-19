package Soru_Gezegeni;

import java.util.Scanner;

public class Q06_forLpp {
    public static void main(String[] args) {

        /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        char kelime = scan.next().charAt(0);


        String sesliHarfler = "aeıioöuüAEIİOÖUÜ";

        for (int i = 0; i < sesliHarfler.length(); i++) {
            if (kelime == sesliHarfler.charAt(i)) {
                System.out.println("sesli harf");
                break;


            } else {
                System.out.println("sessiz harf");
                break;
            }
        }
    }}

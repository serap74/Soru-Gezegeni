package Soru_Gezegeni;

import java.util.Scanner;

public class Z03_kiloBoy {
    public static void main(String[] args) {

        /* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

		 */
        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen boyunuzu cm girin");
        double boy=scan.nextDouble();

        System.out.println("lutfen kilo kg girin");
        double kilo=scan.nextDouble();

        double BMI=kilo/((boy/100)*(boy/100));

        if(BMI<=20){
            System.out.println("oldukca zayıfsınız");
        }else if(BMI>20 & BMI<=25){
            System.out.println("normal sinirlardasiniz");

        }else if(BMI>25 & BMI<=30){
            System.out.println("sisman kategorisindesiniz");
        }else if (BMI>30){
            System.out.println("obez grubundasiniz");
        }else System.out.println("lutfen gecerli bir sınır girin");



    }
}

package Soru_Gezegeni;

import java.util.Scanner;

public class C04_Array {
    public static void main(String[] args) {
         /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)

         */


        int arr[]=new int[8];
        int sayac=0;

        Scanner scan= new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+". index elemani giriniz : ");
            arr[i] = scan.nextInt();
            if(arr[i]%3==0){
                sayac++;
            }
        }
        System.out.println("3 e tam bolunebilen eleman sayi adedi : ");

    }
}

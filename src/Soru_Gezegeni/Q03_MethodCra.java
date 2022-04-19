package Soru_Gezegeni;

import java.util.Scanner;

public class Q03_MethodCra {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen 47' de kucuk pozitif bir sayi giriniz");
        int sayi = scanner.nextInt();
        fibonacci(sayi);


    }

    public static void fibonacci(int num){
        int sayi1=0;
        int sayi2=1;
        int sayi3 ;
        System.out.print(sayi1 + "-" );

        System.out.print(sayi2  + "-");


        if(num<47){
            for (int i = 2; i <num; i++){
                sayi3= sayi1+sayi2;
                System.out.print("-" +sayi3  );
                sayi1=sayi2;
                sayi2=sayi3;


            }
        } else System.out.println("47 den kucuk bir sayi giriniz...");





    }
}

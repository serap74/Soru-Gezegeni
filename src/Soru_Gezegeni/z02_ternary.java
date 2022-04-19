package Soru_Gezegeni;

import java.util.Scanner;

public class z02_ternary {
    public static void main(String[] args) {

        //kullanıcıdan alacagınız iki sayiyi yine kullanıcıya sectir
        //dort isllemden biri ile isleme koyup sonucu yazdirin

        Scanner scan=new Scanner(System.in);//kullanicidan input almak icin scaner objesi creat ettik
        System.out.println(" toplama ici1 \n cıkarma icin 2\n bolme icin 3\n carpma icin 4");
        //kullaniciya secim icin islem menusu yazdirdik

        //kullaniya bildirimde bulunuldu
        int islem=scan.nextInt();
        System.out.println("lutfen iki tam sayi girin");
        double num1=scan.nextDouble();//// 1. sayi assinge edildi
        double num2=scan.nextDouble();//2. sayi assinge edildi

        if (islem==1){
            System.out.println("toplama islemi sonucu : "+num1+" + "+num2+" = "+(num1+num2));

        }else if (islem==2){
            System.out.println("cıkarma islemi sonucu : " + num1 + " - " + num2 + " = " + (num1 - num2));
        }else if (islem==3){
            System.out.println("bolme islemi sonucu : "+num1+" / "+num2+" = "+(num1/num2));
        }else if (islem==4){
            System.out.println("carpma islemi sonucu : "+num1+" * "+num2+" = "+(num1*num2));
        }else System.out.println("hatali secim yaptiniz tekrar deneyin");





    }
}

package Soru_Gezegeni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class C06_list {
    public static void main(String[] args) {

        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("olusturmak istediginiz listin uzunlugunu girin");
        int listuzunluk = scan.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("girdiginiz list uzunlugu kadar eleman ekleyiniz");

        for (int i = 0; i < listuzunluk; i++) {
            list.add(scan.nextInt());

        }
        tekrarliEleman(list);

    }
private static void tekrarliEleman(List<Integer>ls) {
        List<Integer>tekrarliList=new ArrayList<>();
    for (int i = 0; i <ls.size() ; i++) {//ilk listem
        for (int j = i+1; j < ls.size(); j++) {//diger indeksleri karsılastırma
            if(ls.get(i)==ls.get(j) && tekrarliList.contains(ls.get(i)));
            tekrarliList.add(ls.get(i));



        }
    }

    System.out.println("tekrarli listenin elemanlari : " + tekrarliList);

}

}

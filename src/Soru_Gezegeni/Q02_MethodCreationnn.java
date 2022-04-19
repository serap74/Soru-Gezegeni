package Soru_Gezegeni;

public class Q02_MethodCreationnn {
    public static void main(String[] args) {

        /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

      birKereYazdir("aaaabbbbccccddddaaa");

    }

    private static void birKereYazdir(String str) {

        String sonuc="";

        for (int i = 0; i < str.length(); i++) {   //int i=0;i<str.length();i++  bu sekilde de oluyor
            if(!sonuc.contains(str.substring(i,i+1))){
            sonuc+= str.substring(i,i+1);


        }}

        System.out.println(sonuc);
    }
}
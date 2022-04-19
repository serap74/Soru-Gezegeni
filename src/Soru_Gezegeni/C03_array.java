package Soru_Gezegeni;

import java.util.Arrays;

public class C03_array {
    public static void main(String[] args) {

        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */

        String str="Hey Siri";


        str= str.replace("Hey", "Bye");



        String [] arr = new String[1];

        arr[0] = str;
        System.out.println(Arrays.toString(arr));


        //2. yol
        String str1="Hey Siri";
        String yeniStr [] =str1.split("y");
        yeniStr [0] = "Bye";
        str1=yeniStr[0] + yeniStr [1];
        System.out.println("str1 = " + str1);

        String str1Arr[] = new String [1];
        str1Arr[0]=str1;
        System.out.println("Arrays.toString(str1Arr) = "+ Arrays.toString(str1Arr));

    }
}

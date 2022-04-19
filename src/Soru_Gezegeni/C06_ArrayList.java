package Soru_Gezegeni;

import java.util.Arrays;

public class C06_ArrayList {
    public static void main(String[] args) {

    //verilen bir int dizisi icin elemanlarin karesini bulun


        int arr[]={2,6,4,5,8,9};
        for (int i = 0; i < arr.length; i++) {
            arr[i]*=arr[i];

        }

        System.out.println("elemanlarin karesi :" + Arrays.toString(arr));//elemanlarin karesi :[4, 36, 16, 25, 64, 81]





















    }
}

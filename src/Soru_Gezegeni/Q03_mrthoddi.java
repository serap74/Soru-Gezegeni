package Soru_Gezegeni;

public class Q03_mrthoddi {
    public static void main(String[] args) {

        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;
        toplamMethode(arr,istenenToplam);
    }

    private static void toplamMethode(int[] arr, int istenenToplam) {

        for (int i = 0; i < arr.length; i++) {//arrayi kontrol ediyoruz
            for (int j = i+1; j <arr.length ; j++) {//2. sayiyi alıyoruz

                if(arr[i] + arr[j]==istenenToplam){

                    System.out.println(arr[i] + " ve " + arr[j] + "toplami :" + istenenToplam + "dur");
                }



            }

        }














    }



}

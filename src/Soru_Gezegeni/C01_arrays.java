package Soru_Gezegeni;

public class C01_arrays {
    public static void main(String[] args) {

        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         * istenenToplam=9;
         */
        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;


        for (int i = 0; i < arr.length; i++) {//arrayi kontrol ediyoruz
            for (int j = i+1; j <arr.length ; j++) {//2. sayiyi alıyoruz

                if(arr[i] + arr[j]==istenenToplam){

                    System.out.println(arr[i] + " ve " + arr[j] + "toplami :" + istenenToplam + "dur");
                }



            }

        }


















    }
























}

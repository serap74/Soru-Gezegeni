package Soru_Gezegeni;

public class C04_arrraayys {
    public static void main(String[] args) {

        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz


         * * int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;

         * */


        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;
        tpMethod(arr, istenenToplam);




}

    public static void tpMethod(int[] arr, int istenenToplam) {

        for (int i = 0; i < arr.length; i++) { //arr kontrol
            for (int j = i+1; j <arr.length ; j++) {// toplama icin 2. sayiyi aliyoruz
                if(arr[i] + arr[j]== istenenToplam){
                    System.out.println(arr[i] + " ve " + arr[j] + "toplami :"+ istenenToplam );
                }

            }

        }
    }
}

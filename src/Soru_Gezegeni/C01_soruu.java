package Soru_Gezegeni;

public class C01_soruu {
    public static void main(String[] args) {

        /* TASK :
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,-3},{41,55},{-61,-17,80}}

         * Output : 80
         */

        int arr[][] = {{1, 2, -3}, {41, 55}, {61, -17, 8}};
        System.out.println("girdiginiz arr in max eleman : "+ maxDegerBul(arr));

    }

    public static int maxDegerBul(int arr[][]){

        int max = arr[0][0];
        for (int kat = 0; kat < arr.length; kat++) {
            for (int daire = 0; daire < arr[kat].length; daire++) {

                if (arr[kat][daire] > max) {
                    max = arr[kat][daire];
                }

            }

        }
            return max;

    }


}

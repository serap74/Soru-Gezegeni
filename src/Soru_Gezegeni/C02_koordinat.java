package Soru_Gezegeni;

import java.util.Scanner;

public class C02_koordinat {
    public static void main(String[] args) {

        //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi
        // bölgede olduğunu yazdıran bir kod yazınız.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("x ve y degerlerini yazdirin");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if(x>0 & y>0){
            System.out.println("girdiginiz degerler 1. bolgeye ait ");
        }else if(x<0 & y>0){
            System.out.println("girdiginiz degerler 2. bolgeye ait ");
        }else if(x<0 & y<0){
            System.out.println("girdiginiz degerler 3. bolgeye ait ");
        }else if(x>0 & y<0){
            System.out.println("girdiginiz degerler 4. bolgeye ait ");
        }else if(x!=0 & y==0){
            System.out.println("girdiginiz degerler x ekseni uzerinde ");
        }else if(x==0 & y!=0){
            System.out.println("girdiginiz degerler y ekseni uzerinde ");
        }

        

        
        
        
    }
}

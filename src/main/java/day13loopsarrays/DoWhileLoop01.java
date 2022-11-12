package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //Example 1:Kullanicidan bir sayi aliniz. sayi<100 ise ekrana "Kazandin!" yazdiriniz.
        //          Aksi halde ekrana "Kaybettin!" yazdiriniz.
        //          Kullanici kazandikca oyun devam etmeli.
        Scanner input = new Scanner(System.in);
        int sayi = 0;
        do {
            System.out.println("Bir sayi giriniz..");
            sayi = input.nextInt();

            if (sayi < 100) {
                System.out.println("Kazandiniz!");

            }
            } while (sayi < 100) ;
            System.out.println("Kaybetiniz!");

            //Example 2:Kullanicidan isimler aliniz ilk harfinin buyuk harf olup olmadigini kontrol ediniz.

            do {
                System.out.println("isminizi giriniz");
                char ilkHarf = input.next().charAt(0);
                if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
                    System.out.println("Ismi basariyla girdiniz.");

                } else {
                    System.out.println("Ismi yanlis girdiginiz icin isleminiz iptal edilmistir.");
                    break;
                }
            } while (true);


            //Infinite Loop : Sonsuz Döngü

            //Artirma azaltma kisminda hata yaparsaniz "infinite loop sorunsalı" olusur.

////        for(int i=1; i<4; i--){
////            System.out.println("Hi!");
//        }


            //Artirma azaltma kismini yazmassaniz "infinite loop sorunsali olusur"

//        for(int i =1 ; i<4 ;){
//            System.out.println("Hi!");
//        }

//        int i =12;
//
//        while (i<15){
//            System.out.println("Hi!");
//        }


        }
    }

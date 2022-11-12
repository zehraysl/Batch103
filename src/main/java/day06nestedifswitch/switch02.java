package day06nestedifswitch;

import java.util.Scanner;

public class switch02 {
    public static void main(String[] args) {
    /*
    Kullaniciya ay ismi sorunuz ve kullanicinin verdigi ay isminden
     son aya kadar   ekrana yazdiriniz.
     */
        //not:toLowerCase() methodu bir String'deki tum karakterleri kucuk harfe ceviri.
        //      toUpperCase() methodu bir String'deki tum karakterleri buyuk harfe ceviri.
        Scanner input= new Scanner(System.in);
        System.out.println("ay ismi giriniz...");
        String ayIsmi=input.next().toLowerCase();
         switch(ayIsmi){
             case "ocak":
                 System.out.println("Ocak");
             case "şubat":
                 System.out.println("Şubat");
             case "mart":
                 System.out.println("Mart");
             case "nisan":
                 System.out.println("Nisan");
             case "mayıs":
                 System.out.println("Mayıs");
             case "haziran":
                 System.out.println("Haziran");
             case "temmuz":
                 System.out.println("Temmuz");
             case "ağustos":
                 System.out.println("Ağustos");
             case "eylül":
                 System.out.println("Eylül");
             case "ekim":
                 System.out.println("Ekim");
             case "kasım":
                 System.out.println("Kasım");
             case "aralık":
                 System.out.println("Aralık");
                 break;
             default:
                 System.out.println("Gecerli ay ismi giriniz.");
         }
         }//main





    }//class


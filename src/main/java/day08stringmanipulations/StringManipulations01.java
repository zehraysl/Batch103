package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Example 1: Kullanicidan aldiginiz ismin ilk ve son harfini
        //ekrana yazdiriniz.
        Scanner input = new Scanner(System.in);
//      System.out.println("Lutfen isminizi giriniz..");
//      String isim = input.next();
//
//       //1.yol:
//       char ilkHarf = isim.charAt(0);
//       char sonHarf = isim.charAt(isim.length() - 1);
//       //Yazdigimiz kod sadece bazi durumlar icin calisiyorsa o coda "Hard Coding"denir./        //Yazdigimiz kod her durum icin calisiyorsa o coda "Dinamic Coding"denir.
//
//    System.out.println(" " + ilkHarf + sonHarf);
//
//       //2.yol:
//       /*substring()
//        * Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
//         */
//        String ilk= isim.substring(0,1);
//     String son= isim.substring(isim.length()-1);
//      System.out.println(ilk+son);
//
//        //Example 2) Verilen  String' deki sadece hayvan isimlerini ekrana yazdiriniz.
//      //"Ben kedi, esim tavuk, oglum sever inek."
//
//        String str="Ben kedi, esim tavuk, oglum sever inek.";
//        //substring'in iki kullanimi vardir.
//        //1)substring (baslangic indeksi , bitis indeksi) String'in ortasindan bir parca almaya yarar.
//        //2)substring(baslangic indeksi) String'in verilen index'ten sonuna kadar almaya yarar.
//        String kedi=str.substring(4,8);
//        String tavuk=str.substring(15,20);
//        String inek=str.substring(34);
//
//        System.out.println(kedi+tavuk+inek);

        //Example 3:Ilk isim ve soy ismi iceren isimlerden ilk ve soyisimlerin basharflerini ekrana yazdirin.
        //           Ali Can==>AC     Tahsin Yurdakul==>TY
        System.out.println("Ilk ve soy isminizi giriniz..");
      String tamIsim=input.nextLine();
      String a=tamIsim.substring(0,1);
      String b=tamIsim.split(" ")[1].substring(0,1);
        System.out.println(a+b);


    }
}

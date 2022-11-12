package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {

    /*
        İki tane String'in birbirine eşit olup olmadığını anlamak için "==" değil "equals()" kullanınız.
        İki tane String'in birbirine eşit olup olmadığını kontrol etmek için iki tane method kullanılabilir.
            i)equals() ==> Büyük harf ve küçük harfi önemser. "A" ile "a" farklıdır.
            ii)equalsIgnoreCase() ==> Büyük harf küçük harfi önemsemez. "A" ile "a" aynıdır.
     */

    public static void main(String[] args) {

        //Example 1: Kullanıcıdan gün isimlerini alınız, o günün hafta sonu mu hafta içi mi olduğunu kullanıcıya söyleyiniz.
        //           Pazartesi==>Hafta içi          Pazar==>Hafta sonu
        Scanner input = new Scanner(System.in);
        System.out.println("Bir gün ismi giriniz...");
        String gun = input.next();

        if (gun.equalsIgnoreCase("Pazar")) {
            System.out.println("Hafta sonu...");
        } else if (gun.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Hafta içi...");
        } else if (gun.equalsIgnoreCase("Salı")) {
            System.out.println("Hafta içi...");
        } else if (gun.equalsIgnoreCase("Çarşamba")) {
            System.out.println("Hafta içi...");
        } else if (gun.equalsIgnoreCase("Perşembe")) {
            System.out.println("Hafta içi...");
        } else if (gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta içi...");
        } else if (gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu...");
        } else {
            System.out.println("Geçerli bir gün ismi giriniz...");
        }
        //2.Yol:
        if (gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu...");
        } else if (gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici...");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz...");
        }
        //3.Yol
        boolean haftaSonu = gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi");

        boolean haftaIci = gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma");

        if (haftaSonu) {
            System.out.println("Hafta sonu...");
        } else if (haftaIci) {
            System.out.println("Hafta ici...");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz...");
        }


    }

}


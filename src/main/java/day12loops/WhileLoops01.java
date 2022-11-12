package day12loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {
        //Example:3'ten 10'a kadar olan sayilari yazdiriniz.
        //1.yol
        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        //2.yol:
        int i = 3;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        //Example 2: 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz

        int k = 17;
        while (k > 3) {
            if (k % 2 == 0) {System.out.print(k + " ");}
            k--;
        }
        System.out.println();
        //Example 3: 12 den 67 ye kadar sayıların toplamını veren kodu yazınız.
        int sum = 0;
        int m = 12;
        while (m < 68) {
            sum = sum + m;
            m++;

        }
        System.out.println(sum);


        // /Example-4: Size verilen bir tam sayının rakamlarının toplamını ekrana yazdıran kodu yazınız

        int top = 0;
        int s = 123;
        while (s > 0) {
            top = top + s % 10;
            s = s / 10;
        }
        System.out.println(top);

//Example 5: Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz
//           3 ==> 3x1=3   3x2=6  3x3=9  ...  3x10=30
Scanner input=new Scanner(System.in);
        System.out.println("carpim tablosunu gormek icin bir sayi giriniz");
      int sayi = input.nextInt();
        int n=1;
        while(n<11){
            System.out.println(sayi +"*"+n+"="+sayi*n);
            n++;
        }









    }
}

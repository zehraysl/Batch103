package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("dikdortgenin kisa kenarini giriniz:");
        int en = input.nextInt();

        System.out.println("Dikdortgenin uzun kenarini giriniz:");
        int boy= input.nextInt();

        System.out.println("alan"+ en*boy);
        System.out.println("cevre"+ 2*(en+boy));

    }
}

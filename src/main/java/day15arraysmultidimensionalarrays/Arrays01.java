package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //binarySearch() Method:Bu methodu kullanarak bir elemanin Array'da olup olmadigini anlariz.
        //binarySearch() Method'unu kullanmadan once mutlaka "Arrays.sort()"kullaniriz.
        //binarySearch() Method'u aradiginiz eleman Array'de varsa o elemanin indexini verir.
        //binarySearch() Method'u aradiginiz eleman Array'de yoksa "-a" seklinde bir negatif sayi alirsiniz.
        //               bu sayidaki "-" isaretinin anlami bu eleman Array'de yok demektir.
        //                "a"nin anlami olsaydi kacinci sirada olurdu demektir.
        //
        //not:binarySearch() methodu tekrarlayan elemanlar icin kullanilmaz.


        int arr[]={12,31,43,14};
        int sayi=43;

        Arrays.sort(arr);//[12,14,31,43]
        Arrays.binarySearch(arr,sayi);

        int idx1=Arrays.binarySearch(arr,sayi);
        System.out.println(idx1);//3

        int sayi2=58;
        int sonuc=Arrays.binarySearch(arr,sayi2);
        System.out.println(sonuc);//-5













    }
}

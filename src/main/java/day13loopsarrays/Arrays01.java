package day13loopsarrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays01 {

    /*
        1)Ayni data tipinde, coklu data'i depolmaka icin Java'nin olusturdugu yapilar vardir.
          Bu yapilardan birisi de "Array" lerdir.
     */

    public static void main(String[] args) {

        //Array nasil olusturulur?
        int stdAges[] = new int[7];// [ 0, 0, 0, 0, 0, 0, 0 ]

        //Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdAges));

        //Array'lere elemanlar nasil eklenir?
        stdAges[1] = 11;
        stdAges[0] = 12;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;
        System.out.println(Arrays.toString(stdAges));// [12, 11, 13, 14, 10, 12, 12]

        //Array'deki herhangi bir elemani nasil yazdirabiliriz?
        System.out.println(stdAges[4]);//10

        //Example 1: Array'deki en kucuk ve en buyuk elemanin toplamini ekrana yazdiriniz
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));//[10, 11, 12, 12, 12, 13, 14]

        int ilk = stdAges[0];

        //Note: "length()" String'lerde kullanilir, "length" Array'lerde kullanilir
        int son = stdAges[stdAges.length-1];

        System.out.println(ilk + son);//24

        //Example 2: stdAges Array'i icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz.
        int sum = 0;

        for(int i=0; i<stdAges.length; i++){
            sum = sum + stdAges[i];
        }
        System.out.println(sum);

//2. yol :while -loop
        //2.yol while loop
        int top = 0;
        int k=0;
        while (k<stdAges.length){
            top= top + stdAges[k];
            k++;
        }
        System.out.println(top);

//3.yol:do-while-loop
        int s=0;
        int tp=0;
        do {

            tp=tp+stdAges[s];

            s++;
        }while(s<stdAges.length);
        System.out.println(tp);

      //4.yol:for each loop Array'lerde ve Collections'larda kullanilir.
        int t=0;
      for(int w: stdAges){
            t=t+w;
        }
        System.out.println(t);


        //Example 3: String bir array olusturunuz
//           Bu Array'e 5 tane isim yerlestiriniz
//           Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz

        String stdNames[]=new String[5];
        stdNames[0]="Ali";
        stdNames[1]="Tom";
        stdNames[2]="Veli";
        stdNames[3]="Kemal";
        stdNames[4]="Cem";

        int karakterSayilariToplami=0;
        for (String w: stdNames) {
            karakterSayilariToplami=karakterSayilariToplami+w.length();
        }
        System.out.println(karakterSayilariToplami);//18

     //Example 4:Char bir Array olusturunuz.Bu Array'a 5 eleman ekleyiniz.
        //bu array'daki sadece buyuk harfleri ekrana yazdirin.

        char ch[]={ 'A','c','D','k','m'};
for(char w:ch){
    if(w>='A'&&w<='Z'){
        System.out.println(w);
    }
}



}}
package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    //Arrays'lerin icine sadece primitive data tipleri yerlestirilebilir.
    public static void main(String[] args) {
      String str[]=new String[3];
      str[0]="Java";
      str[1]="did";
      str[2]="surprised you";
        System.out.println(Arrays.toString(str));

        //Ex 1:String bir array olusturunuz. Tom ve Tom'dan onceki tum elemanlari ekrana yazdiriniz.
        String arr[]={"Jane","Mark","Chistopher","Tom","Ali","Rojda"};
        for(String w:arr){
            System.out.print(w+" ");
            if(w.equals("Tom")){
                break;
            }
        }

        System.out.println();
        //Example 2: String bir Array olusturunuz "Tom" ve
        // "Jane" haric tum elemanlari ekrana yazdiriniz
        String brr[]={"Jane","Mark","Chistopher","Tom","Ali","Rojda"};
        for (String w: arr){
            if (w.equals("Tom") || w.equals("Jane")){
                continue;
            }
            System.out.print(w+ " ");

        }
        System.out.println();
        //Example 3: Bir ogretmenin sinfindaki ogrencilerin isimlerini application'a yuklemesini saglayan kodu yaziniz.
        //           ( Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz )


        Scanner input= new Scanner(System.in);
        System.out.println("kac ogrenci ismini gireceksiniz");
        int numOfStd= input.nextInt();


        String names[]=new String[numOfStd];
        System.out.println("girisi sonlandirmak icin Q harfine basiniz");

        for (int i=1; i<=numOfStd; i++ ){

            System.out.println("lutfen "+ i +". ogrencinin ilk ismini giriniz");
            String stdNAme= input.next();
            if (stdNAme.equalsIgnoreCase("Q")){
                break;
            }
            names[i-1]= stdNAme;
        }
        System.out.println(Arrays.toString(names));
    }
}

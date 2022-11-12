package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        int i=1;
        while(i<1) {
            System.out.println("While loop");
            i++;
        }
     /*while loop bazi durumlarda hic calismayabilir
        yani while loop icin zero execution mumkundur

        do while loop kullandigimizda loop body si icindeki kod en az bir kere calisir
        yani do-while loop icin zero execution mumkun degildir */

        int k=1;do{
            System.out.println("do-while loop");
          k++;
        }while(k<1);

    //Example 1:Bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz.
    //        24.5673==>5+6+7+3=23
        double num=24.5673;
        System.out.println(num);

        //String.valueOf() methodu parantezin icine konulan datanin tipini String yapar
      String str=  String.valueOf(num);
        System.out.println(num);

      //Regex icin nokta kullandiginizda onune "\\" koyunuz.Yani nokta "\\."seklinde kullaniriz.
        String decimalPart=str.split("\\.")[1];
        System.out.println(decimalPart);//5673
        int decimalInt=Integer.valueOf(decimalPart);
        System.out.println(decimalInt);//5673

        int sum=0;
        do{
            sum=sum+decimalInt%10;

            decimalInt=decimalInt/10;
        }while (decimalInt>0);
        System.out.println(sum);









    }
}

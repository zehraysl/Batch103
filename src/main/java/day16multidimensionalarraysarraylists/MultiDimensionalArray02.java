

package day16multidimensionalarraysarraylists;

        public class MultiDimensionalArray02 {

            public static void main(String[] args) {

                //Bir multidimensional array deki en buyuk ve en kucuk elemanin toplamini veren kodu yaziniz
                int arr[][] = { {2, 5, 1}, {83, 75} };
                int maxElement = arr[0][0];
                int minElement = arr[0][0];
                //Array veya collection varsa for each loop kullanmak ilk tercih olmali.
                //Array veya Collection var ama index kullanmak zorundasiniz ,o zaman for each loop calismaz.
                //for loop veya while loop veya do while loop kullanmak iyi olur.

                //Bir multidimensional array'i normal array'e ceviren kodu yaziniz
                //{ {2, 5, 1}, {32, 75} } ==> { 2, 5, 1, 32, 75}

//        1) Multidimensional Array deki eleman sayisini bulmaliyiz
//        Cunku yeni bir array olusturmaliyiz ve bu yeni array in uzunlugu orijinal array in eleman sayisina esit olmalidir
                for(int[] w : arr){

                    for(int k : w){
                        maxElement = Math.max(maxElement, k);
                        minElement = Math.min(minElement, k);
                    }

                }
                System.out.println(maxElement);//83
                System.out.println(minElement);//1

                System.out.println(maxElement + minElement);//84
            }
        }
















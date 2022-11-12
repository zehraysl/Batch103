package day02methodcreation;

public class Car {
    public String marka= "Honda";
    public int fiyat = 20000;
    // Note: Class ==> Variable==> Object==>kullanacagiz
    //                  Method

    public static void main(String[] args) {

        //Object nasil olusturulur?
        //1) Class ismini yaziniz.2)Objeye bir isim veriniz 3)=  4)new  5) Class ismi parantezle beraber (Constructor)
          Car                        myHonda                 =    new Car();
        System.out.println(myHonda.fiyat);//20000
        System.out.println(myHonda.marka);//Honda

        myHonda.dur();
        myHonda.hareketEt();


  //MethodCreation claasinda obje olusturduk.
        MethodCreation obj=new MethodCreation();
        System.out.println(obj.toplamaYap(3,5));//8


    }

    public void hareketEt() {
        System.out.println("Honda guzel hareket eder..");
    }

        public void dur() {
            System.out.println("Honda guvenli durur..");
        }
    }


package day26exceptions;

public class Exceptions02 {
    public static void main(String[] args) {

        char ch1=getcharfromString ("Java",2);
        System.out.println(ch1);//v

        char ch2=getcharfromString ("Selenium",8);
        System.out.println(ch2);//StringIndexOutOfBoundsException:Eger bir String'deb bir karakter veya karakterler alirken olmayan bir index kullanilirsa
                                //StringIndexOutOfBoundsException alinir.
    }

    public static char getcharfromString(String str,int idx) {
        char c=' ';
        try {
            c=  str.charAt(idx);

        }catch(StringIndexOutOfBoundsException e) {

            System.out.println("index ile ilgili bir problem olustu  "+e.getMessage());
           e.printStackTrace();//detayli log icin.
        }
        return c;
    }



}

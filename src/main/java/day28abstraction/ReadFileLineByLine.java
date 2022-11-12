package day28abstraction;

import java.io.*;

// Bir dosyayı satır satır okumak için "readLine() " kullanılır. readLine() methodu nu kullanabilmek için BufferedReader
//objesine ihtiyaç duyarız.
/*
    "throw" ile "throws" arasindaki farklar nelerdir?
    1)"throw" method'un body'si icinde kullanilir. "throws" ise method'un isminden sonra kullanilir
    2)"throw" dan sonra onject olusturulur."throws" dan sonra ise sadece Exception Class'ın ismi yazilir.
    3)"throw" method'un icinde istedigimiz yerde Exception uretmek kullanilir.
      "throws" ise var olan checked Exception'ı atmak icin kullanilir.
      "throw" Exception uretir, "throws" varolan Exception'ı atar.
    4)"throw" dan sonra sadece bir tane Exception olabilir.
      "throws" dan sonra 1 den fazla Exception olabilir.



 */
public class ReadFileLineByLine {
    public static void main(String[] args) {
        readFileLineByLine();
    }
    public static void readFileLineByLine(){
        try {
            BufferedReader br=new BufferedReader(new FileReader("src/main/java/day27exceptions/File1.txt"));
             String line= br.readLine();

             while(line!=null){
                 System.out.println(line);
                line= br.readLine();
             }



        } catch (FileNotFoundException e) {
            System.out.println("Ya path yanlis yada dosya silinmis- " + e.getMessage());
        } catch (IOException e) {
            System.out.println("okunamayacak karakter veya karakterler var- " + e.getMessage());
        }
    }
}

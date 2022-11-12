package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {

    public static void main(String[] args) {

        //Example 1: "Anlik tarihi"(Current Date) ekrana yazdiran kodu yaziniz
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);// 2022-10-21

        //Example 2: "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);// 13:42:32.032258

        //Example 3: "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);// 2022-10-21T13:46:19.435213

        //Example 4: Japonya'daki "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);// 2022-10-22T02:51:53.899959

        //Example 5: Istanbul'daki "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);// 2022-10-21T20:53:17.682534

        //Example 6: Bugunden 789 gun sonra emekli olacaginiza gore, emeklilik tarihini hesaplayan kodu yaziniz.
        LocalDate countDate = LocalDate.of(2022, 10, 21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);// 2024-12-18

       //Example 7: Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz
        LocalDate dobAli=LocalDate.of(2005,5,17);
        LocalDate dobVeli=LocalDate.of(2013,2,8);

        //
        Long diff=ChronoUnit.DAYS.between(dobAli, dobVeli);
        System.out.println(diff);

//Example 8: Istanbul'un fethi ile, Cumhuriyetin kurulması arasında kaç ay olduğunu gösteren kodu yazınız.
//           29 Mayıs 1453 ==> İstanbul'un fethi           29 Ekim 1923 ==> Cumhuriyetin kuruluşu


        LocalDate republicDay = LocalDate.of(1923, 10, 29);
        LocalDate conquestOfIstanbul = LocalDate.of(1453, 5, 29);
        Long monthDifference = ChronoUnit.MONTHS.between(conquestOfIstanbul, republicDay);
        System.out.println(monthDifference);

        //Example 9:Verilen tarihin hangi burcta oldugunu gosteren kodu yaziniz.
        LocalDate myDate= LocalDate.of(1982,4,29);
       int day=myDate.getDayOfMonth();
       int month=myDate.getMonthValue();


        if (day > 21 && month == 3 || month == 4 && day < 20) {
            System.out.println("Koç");
        }
        if (day > 21 && month == 4 || month == 5 && day < 20) {
            System.out.println("Boğa");
        }
        if (day > 21 && month == 5 || month == 6 && day < 21) {
            System.out.println("İkizler");
        }
        if (day > 22 && month == 6 || month == 7 && day < 22) {
            System.out.println("Yengeç");
        }
        if (day > 23 && month == 7 || month == 8 && day < 23) {
            System.out.println("Aslan");
        }
        if (day > 24 && month == 8 || month == 9 && day < 23) {
            System.out.println("Başak");
        }
        if (day > 24 && month == 9 || month == 10 && day < 23) {
            System.out.println("Terazi");
        }
        if (day > 24 && month == 10 || month == 11 && day < 22) {
            System.out.println("Akrep");
        }
        if (day > 23 && month == 11 || month == 12 && day < 21) {
            System.out.println("Yay");
        }
        if (day > 22 && month == 12 || month == 1 && day < 20) {
            System.out.println("Oğlak");
        }
        if (day > 21 && month == 1 || month == 2 && day < 19) {
            System.out.println("Kova");
        }
    }

}

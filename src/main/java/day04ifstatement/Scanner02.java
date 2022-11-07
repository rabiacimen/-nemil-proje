package day04ifstatement;


import java.util.Scanner;

public class Scanner02 {


    public static void main(String[] args) {

        //Example 1: Kullanıcıdan ilk ve soy ismini alınız, ilk ve soy isminin ilk harflerini ekrana yazdırınız.
        //           Ali Can ==>AC

        Scanner input = new Scanner(System.in);

        //1.YOL
        System.out.println("Ilk isminizi giriniz...");
        char ilk = input.next().charAt(0); //A

        System.out.println("Soy isminizi giriniz...");
        char son = input.next().charAt(0); //C

        System.out.println("" + ilk + son);



        //2.YOL
        System.out.println("Tam isminizi giriniz...");

        String tamIsim = input.nextLine(); //Ali Can

        char ilkHarf = tamIsim.charAt(0);
        System.out.print(ilkHarf);

        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);







    }



}

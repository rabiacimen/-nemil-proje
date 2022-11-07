package day04ifstatement;

public class IfStatement01 {

    public static void main(String[] args) {



        //If it rains I willl cancel picnic

        //Example 1: Sayi pozitif ise ekrana pozitif yazdıırn.

        int s = 12;

        if(s>0){
            System.out.println("positive");
        }

        //Example 2: Verilen karakter büyük harf ise ekrana "Buyuk Harf" yazdırın.

        char ch = 'A';

        if(ch>='A' && ch<='Z'){

            System.out.println("Buyuk Harf");
        }

        //&& işlemi sadece boolean ile kullanılır.
        //true && true = true

        //Example 3: Verilen bir sayı üç basamaklı ise ekrana "uc basamaklı" yazdırınız.

        int n = 123;

       n = Math.abs(n);

        if(n>99 && n<1000){ // n>=100 && n<=999 veya n>99 && n<1000
            System.out.println("Uc basamakli");
        }

        //Example 4: Verilen bir sayı çift sayı ise ekrana çift sayı yazdırınız.

        //"=" isareti atama operatörüdür, matematikteki eşittir anlamına gelemz.
        //matematikteki eşittit sembolü javada "==" şeklindedir.
        //2+3 == 5

        int p = -18;

        Math.abs(p); // bunu yazmak zorunda değiliz. java matematik bilir.

        if(p%2==0){
            System.out.println("Cift Sayi");
        }


        //Example 5: verilen bir sayı 300 den küçük veya 1200 den büyük ise ekrana harika sayı yazdırın.

        int r = 250;
        if(r<300 || r>1200){

            System.out.println("Harika sayi");
        }


    }}
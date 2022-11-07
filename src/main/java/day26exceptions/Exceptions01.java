package day26exceptions;

public class Exceptions01 {
    public static void main(String[] args) {


        String str = "123";
        int result = convertStringToInteger(str);
        System.out.println(result + 5); //1235 mi görcez 128 mi?? 128 gördük yani int'e çevirmiş methodumuz.

        String st = "1a2b";
        int r = convertStringToInteger(st);//NumberFormatException : Eğer içinde rakamdan farklı karakter barındıran bir string'i
        // valueOf() methodu kullanarak Integer'a çevirmek isterseniz bu hatayı alırsınız.
        System.out.println(r + 10);


    }

    public static int convertStringToInteger(String str) {
        int i = 0; // çevirdikten sonra koyacağı yeri ayarladık

        try {
            //Herhangi bir satırda exceptin atılırsa, java direkt catch bölümüne geçer. Try içindeki sonraki kodları çalıştırmaz.
            i = Integer.valueOf(str); //bu satırdaa exception atılırsa bi alttaki kod çalışmaz. java catch e geçer.//return 'ü sildik i koyduk. return'ü alta yazdık.
            System.out.println("Burası try bölümü");

        } catch (NumberFormatException e) {
            System.out.println("rakam olmayan karakter içerem String'ler Integer'a çevrilemez.");
        }

        return i;


    }
}
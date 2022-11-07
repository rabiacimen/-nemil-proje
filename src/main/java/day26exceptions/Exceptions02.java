package day26exceptions;

public class Exceptions02 {


    public static void main(String[] args) {

        char ch1 = getCharFromString("Java", 2);//v
        System.out.println(ch1);

        char ch2 = getCharFromString("Selenium", 8);
        System.out.println(ch2);//StringIndexOutOfBoundsException :Eğer bir String'ten bir karakter veya karakterler alırken
        // olmayan bir index kullanırlırsa bu hata alınır.


    }

    public static char getCharFromString(String str, int idx) { //method oluşttururken bana ne lazım olcaksa burda parantez içine koyarım.

        char c = ' ';

        try {
            c = str.charAt(idx);

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("index ile ilgili bir problem oluştu===>" + e.getMessage());
            System.out.println(e.getMessage()); // java'nın teorik mesajı. biz genellikle bunu kullanırız. bunu üste de ekleyebiliriz.
            e.printStackTrace();//sout kullanmadık çünkü kendisi print ediyor. bu method daha detaylı rapor verir. Detalı "log" (akış) için.
        }

        return c;// return methodun en son satırı olur. bundan sonra herhangi bir code yazarsanız hata verir.
    }
}
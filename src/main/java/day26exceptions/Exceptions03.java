package day26exceptions;

public class Exceptions03 {

    public static void main(String[] args) {


     double d=   divideStringByTheNumOfTheChar("124"); //41.0
        System.out.println(d);


        divideStringByTheNumOfTheChar(null); //NullPointerException




    }

    //String'deki karakter sayısını bulunuz, String'i Integer'a çeviriniz. Sonra da Integer'ı character sayısına bölünüz.


   //1.yol
    public static double divideStringByTheNumOfTheChar(String str){


        int length=0;
        int i=0;
        double sonuc=0;

        try {

            length = str.length(); //NullPointerException: "null" string ile length() method kullanıldığında alınır.

             i = Integer.valueOf(str); //NumberFormatException: İçinde rakamdan farklı karakter olan Stringler valueOf() ile kullanıldığında alınır.
            sonuc= i / length; //ArithmeticException: Bölen sayı sıfır olduğunda alınır.

        }catch(NullPointerException e){
            System.out.println("==>" + e.getMessage());

        }catch(NumberFormatException e){
            System.out.println(e.getMessage());

        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return sonuc;

    }



//2.Yol:
    public static double divideStringByTheNumOfTheCharacter(String str){

        int length=0;
        int i=0;
        double sonuc=0;

        try {

            length = str.length(); //NullPointerException: "null" string ile length() method kullanıldığında alınır.

            i = Integer.valueOf(str); //NumberFormatException: İçinde rakamdan farklı karakter olan Stringler valueOf() ile kullanıldığında alınır.
            sonuc= i / length; //ArithmeticException: Bölen sayı sıfır olduğunda alınır.

        }catch(Exception e){
            System.out.println(e.getMessage());

        }
        return sonuc;

    }



//3.yol:
    public static double divideStringByTheNumOfTheCharacters(String str){

        int length=0;
        int i=0;
        double sonuc=0;

        try {

            length = str.length(); //NullPointerException: "null" string ile length() method kullanıldığında alınır.

            i = Integer.valueOf(str); //NumberFormatException: İçinde rakamdan farklı karakter olan Stringler valueOf() ile kullanıldığında alınır.
            sonuc= i / length; //ArithmeticException: Bölen sayı sıfır olduğunda alınır.

        }catch(NullPointerException e){ //child
            System.out.println("NullPointer'a özel");

        }catch(Exception e){ //parent  // eğer parent'ı yukarı child'ı alta yazarsak ulaşılamayan code olur ve hatalı code olur.
            System.out.println("diğer tüm Exception'lar için...");
        }
        return sonuc;

    }



    /*
    Note: 1) Aralarında parent-child relationship olan Exception Class'ları multiple catch'lerde kullanmak isterseniz "child" olan önce kullanılmalıdır,
          aksi takdirde hata verir.
          2) Aralarında parent-child relationship olmayan Exception Class'ları multiple catch'lerde kullanmak isterseniz sıralamanın bir önemi yoktur.

     */
}

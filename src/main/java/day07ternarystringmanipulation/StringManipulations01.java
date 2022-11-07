package day07ternarystringmanipulation;

public class StringManipulations01 {

    public static void main(String[] args) {


        /*

                           Stirng Class Methodları


        1) equals(): i)iki tane string'in aynı olup olmadığını anlamamıza yarar.
                     ii) equals methodeu boolean return eder.

        2) equalsIgnoreCase(): i) iki tane string'in aynı olup olmadığını büyük harf küçük harfe dikkat etmeden anlamaıza yarar.
                                ii) equalsIgnoreCase nethodeu boolean return eder.

        3)toLowerCase(): i) Bir string'teki tüm harfleri küçük harfe çevirmek için kullanılır.
                         ii) tolLowerCase() methodu strig return eder.

        4)toUpperCase(): i) Bir string'teki tüm harfleri büyük harfe çevirmek için kullanılır.
                         ii) toUpperCase() methodeu string return eder.

        5)charAt():   i) bir string'teki belli bir index'deki karakteri almak için kullanılır.
                      ii) charAt() methodu "char" return eder.

        6)Length():   i)Bir string'de kaç tane karakter kullanıldığını öğrenmek için kullanılrı.
                      ii) Length() methodu "int" return eder.

        7)Contains():  i)  bir string'de belli bir karakterin veya karakterlerin var olup olmadığını anlamak için kullanılır.
                       ii) Contains() methodu boolean return eder.

        8) split():  i) bir string'i istediğimiz karaketerden parçalamaya yarar.
                     ii)split methodu "Array" return eder.


         */

            /* Bir password'un geçerli olup olmadığını aşağıdaki kurallara göre kontrol eden kodu yazınız.
                i)En az 8 kararketer içermeli
                ii)Space karakteri içermemeli
                iii)ilk harfi "M" veya "m"  olmalı
                iv)son karakteri "?" omalı
             */

            String pwd = "Manisa12?";



        //i)En az 8 character icermeli
        boolean first = pwd.length()>7;

        //ii)Space characteri icermemeli
        boolean second = !pwd.contains(" ");

        //iii)Ilk harfi "M" veya "m" olmali
        boolean third = pwd.charAt(0)=='M' || pwd.charAt(0)=='m';

        //iv)Son characteri "?" olmali
        boolean fourth = pwd.charAt(pwd.length()-1)=='?';

        System.out.println(first && second && third && fourth);




    }


}

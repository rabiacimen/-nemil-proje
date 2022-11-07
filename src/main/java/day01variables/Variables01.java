package day01variables;

public class Variables01 {

    //Variable nasıl oluşturulur?

    //1)Access Modifier 2)Data Type 3)Variable İsmi 4)=   5)Değer   6) ;
    // Java'da ";" İngilizce'deki "." gibidir.
    // İngilizce'de cümle deriz, Java'da "statement" deriz.

    // "=" sembolü "Assignment(Atama) Operator" olarak adlandırılır.
    // " Assignmnet Operator" sağdaki değeri alır soldaki variable'nin içine koyar.

    public int age = 13;

    public int height = 183;

    // Java'da Data Type'ları


    /*
            Primitive Data Types

    1)Int: Integer'ın kısaltmasdı. Integer tam sayı demektir. 32 bit (4 byte) kullanır.
           Matematik'de tam sayıların başı ve sonu yoktur fakat Java'da tam sayıların başı ve sonu vardır.
           En küçük int = -2,147,483,648
           En büyük int = 2,147,483,647
    2)byte: Tamsayılar için kullanılır. 8 bit kullanır.
            En küçük byte = -128
            En büyük byte = 127
    3)short: Tamsayılar için. 16 bit kullanır.
             En küçük short = -32768
             En büyük short = 32767
    4)long: Tamsayılar içindir. 64 bit kullanır.
            En küçük long = -9,..........
            En büyül long = 9,223,...............

     5)float: ondalıklı sayılar içindir. virgülden sonra 7 basamak içerebilir. Memory'de 32 bir kullanır/yer kaplar.
             "float" değerlerinde soan "f" veya "F" koymanız gerekir.

     6)double: Ondalıklı sayılar içindir. Virgülden sonra 16 basamak içerir. 64 bit kullanır.

     7)boolean: "true" veya "false" değerleri için kullanılır. 1 bit kullanır.

     8)char: Tek karakterler için kullanılır. 16 bit kullanır.
     A, c, 2, ?,_,...
     Note: "char"lara değer verirken, değeri tek tırnak arasına koyunuz. Yoksa hata verir.

     Note: Java büyük ve küçük harflere duyarlıdır.
            Java için "true" ile "True" farklıdır.

     Note:Numeric Data Types:  byte < short < int < long < float < double
          Numeric Olmayan Data Types: boolean - char

             Non-Primitive Data Types

      1)String: İsim, adres, kimlik numrası gibi bir veya birden fazla karakter içeren değerlerde kullanılır.
                String değerleri mutlaka çift tırnak arasına konulmalıdır.
                String non-primitive'dir. Yani bir String oluşturduğunuzda Java size bir sürü method verir.

                Primitive ile Non-Primitive'lerin Farkı Nedir?


     */
    public byte price = 12;

    public short populationOfVillage = 23000;

            public float priceOfShirt = 13.99F;
    public double weightOfCell = 0.000000012345;

    // Siz "long" demenize rağmen java verilen sayıyı "int" kabul eder.
    public long populationOfWorld = 7000000000L;

    // Burada "L" koymadığımız halde problem yok çünkü "1234" int aralığına uyar.
    public long x = 1234;

    public boolean isOld = true;
    public boolean isRich = false;

    public char initial = 'S';


    public String name = "Tom Hanks";

    // Note: "main method" arabanın motoru gibidir.
    // o olmadan program olmaz. hiçbir şey çalışmaz.




}

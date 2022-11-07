package day10stringmanipulations.odev;

public class wrapperclasses {

    public static void main(String[] args) {

        //soru1)
        byte min = Byte.MIN_VALUE;
        short max = Short.MAX_VALUE;
        System.out.println(min + max);

        //soru2)Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve
        //yine data tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki
        //değişken arasındaki farkı yazdırınız.

        byte değer=Byte.valueOf("113");
        short sayı=Short.valueOf("3641");
        System.out.println(sayı-değer);


        //soru3)   valueOf(String s) ile parseByte(String s) methodları arasındaki farklar nelerdir?



//????????????????????????????????????????????????????
    }
}

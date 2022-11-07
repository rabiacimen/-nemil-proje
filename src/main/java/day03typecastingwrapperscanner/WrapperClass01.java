package day03typecastingwrapperscanner;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*
            Java primitive'lere method'lar ekleyerek yeni bir yapı oluşturdu.  bu yapıya "Wrapper Class" denir.


            Primitive       Wrapper
            byte       ==>   Byte
            short      ==>   Short
            **int        ==>   Integer
            long       ==>   Long
            float      ==>   Float
            double     ==>   Double
            boolean    ==>   Boolean
            **char       ==>   Character

         */

        byte primitiveByte = 12;

        Byte wrapperByte = 12;



                // Example 1: byte data type'nın en kucuk ve en buyuk değerlerını ekrana yazdrısınız

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println( Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);





        System.out.println();


                float f1 = 13.99F;

                Float wrapperF1 = f1;




    }


}

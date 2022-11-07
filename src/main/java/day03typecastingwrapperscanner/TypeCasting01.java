package day03typecastingwrapperscanner;

public class TypeCasting01 {

    public static void main(String[] args) {

        byte age = 23;
        int newAge = age;

        long population = 1234;
        int newPopulation = (int)population;

        short numOfStudents = 235;
        double newNumOfStudents = numOfStudents; //Auto Widening

        float price = 12.99F;
        byte newPrice = (byte)price; //Explicit Narrowing

        System.out.println(newPrice); //Java ondalık sayıyı tam sayıya çeviriken yuvarlama işlemi yapmaz.
                                    // Ondalık kısmını siler.

        int number = 515;
        byte newNumber = (byte) number;

        System.out.println(newNumber); //3


        int num = 510;
        byte newNum = (byte) num;

        System.out.println(newNum);









    }
}

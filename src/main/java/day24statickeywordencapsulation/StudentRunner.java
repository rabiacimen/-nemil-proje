package day24statickeywordencapsulation;

public class StudentRunner {
    public static void main(String[] args) {

        Student std1= new Student(); // obje


        //std1. yaptığımızda private olanlara değil get methodlu olanlara ulaştık ve gizli olanı okuduk.
        System.out.println(std1.getStdId()); //TH202201 //stdId private olmasına rağmen bu methodla başka class'dan okuyabildim.
        System.out.println(std1.getGpa()); //3.8
        System.out.println(std1.isRetired()); //false

       std1.setStdId("AB");
       System.out.println(std1.getStdId()); //AB

        std1.setGpa(4.0);
        System.out.println(std1.getGpa());

        std1.setRetired(true); //değişiklik class üzerinde değil, obje üzerinde gerçekleşir. class'da değişiklik olmaz. static olmadıkları için değişklikler obje üzerinde olur.
        System.out.println(std1.isRetired());


        Student std2 = new Student();
        System.out.println(std2.getStdId());// TH202201


        //fazla obje oluşturmak tehlikelidir.memory'i doldurur.
        // önce kullan sonra set methodu ile değiştir. sonra set methodu ile yine değiştir




    }
}

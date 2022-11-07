package day18arraylistspassbyvalue;

public class PassByValue01 {

    /**
     * Java variablelarin original degerlerini korumak ister
     * Variable methodlar icinde kullanildiginda Java methodun icine orijinal degeri koymaz,
     * o degerin kopyasini uretir ve methoda o kopyayi yollar.Method kopya ustunde degisiklik yapar
     * dolayisiyla variablein orijinal degeri korunmus olur
     * Bu sisteme "Pass By Value" denir.
     * Note:Java pass by value kullanir,"Pass By Referance" kullanmaz
     *      Bazi programlama dilleri orijinal degeri koruma altina almamistir.Bu isi developerlara birakmistir.
     *      Bu tarz diller "Pass By Referance" kullanir
     */
    public static void main(String[] args) {



        int x=5;//gomlek
        System.out.println(x);//5

        //static method olan main methodun icindeki hersey static olmalidir
        change(x);//ogrenci gomlegi//15
        System.out.println(x);//5 //gomlek

        int ucret=100;

        int kopya= indirim(ucret); //ucret = indirim(ucret) seklinde yazarsak ucreti degistirir 90 olur
        System.out.println(kopya);//90

        System.out.println(ucret);//100
    }






    public static void change(int a){ //data vermiyor demek void
        System.out.println(a*3);
    }

    //void disindaki return type larda method badisi icinde return keyword kullanilmalidir
    public static int indirim(int gomlekUcreti){
        return gomlekUcreti-10;
    }
}
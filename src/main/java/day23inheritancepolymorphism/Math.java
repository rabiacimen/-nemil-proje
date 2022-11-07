package day23inheritancepolymorphism;

public class Math extends Courses{

    public void practice() {

        System.out.println("Solve questions");
    }

        public Math(){ //constructor oluştururken acces modifier ve class ismi kullanıyoruz
       super("x"); // parenttaki constructora ulaşmak için yaptık. yazılı olan parametreyi seçsin diye içine x koyduk.
            System.out.println("Constructor 1");
        }

        public Math(int a){
        this();///aynı class daki constructor 1 e gitmek istiyorum. parametresiz olana. o zaman "this()" kullanıcam. parantezin içine bişey yazmadığım için parametresiz constructor ı kullanacak yani.
           //this() koymazsak jVA BURDAN sonra görünmez super() ile parent'a gider ve parametresiz constructor ı kullanır.
            System.out.println("Constructor 2");
        }

    }


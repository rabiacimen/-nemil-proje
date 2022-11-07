package day24statickeywordencapsulation;

//Encapsulation:  "Data Hiding(Gizlemek)" demektir.

// Niçin gizlersiniz? Data'yı dış etkenlerden korumak için.

//Data'yı nasıl gizlersin? Access modifier'ini "private" yaparak gizlerim. variable sadece class'ın içindeyken görünür.

//Data'yı gizledikten sonra başka class'lardan okumak istersen ne yaparsın?
// "get1 method'lar (getter) oluşturarak gizlediğimiz dataları okunur hale getirebiliriz. get methodlara kısaca getter derler.

////Data'yı gizledikten sonra başka class'lardan değiştirmek istersen ne yaparsın?
// "set method"lar (setter) oluşturarak gizlediğimiz dataları değiştirebiliriz.

// variable'nin data type'ı ile "get" methodun return type'ı aynı olmalıdır.


//get method'ları isimlendirirken "get + <variable name> " ancak variable'nin data tipi "boolean" ise "is + variable name" yaparız.



public class Student {

    public String stdName = "Tom Hanks";  //her data gizlenmez. bu nedenle public yaptık.
    private String stdId = "TH202201";
    private double gpa = 3.8; // variable'nin data type'ı ile "get" methodun return type'ı aynı olmalıdır.
    private boolean retired = false;


    public String getStdId() { //otomatik olarak public yaptı. her taraftan ulaşıp okuyabilmemiz için.
        return stdId;
    }

    public double getGpa() { // variable'nin data type'ı ile "get" methodun return type'ı aynı olmalıdır.
        return gpa;
    }

    public boolean isRetired() { //isimlendirilirken başına get/set gelir. sadece boolean'da "is" gelir. mı/mi ekinden dolayı.
        return retired;  // hey java, ben bu methodu kullandığımda bana retired'i ver.
    }


    public void setStdId(String stdId) { //TH yerine AB koyalım. //parametre ile çalışır. parametre variable data tipinde ve data tipinde olur.
        this.stdId = stdId;
    }

    public void setGpa(double gpa) { // "set" methodlarının return type'ları void'tir. data vermez çünkü. değiştirir ve bırakır.
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) { // boolean olmasına rağmen set +variable olarak isimlendirilir.
        this.retired = retired; //
    }






}

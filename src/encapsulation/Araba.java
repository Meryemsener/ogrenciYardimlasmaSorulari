package encapsulation;

public class Araba {//pojo class =planning old java object=>model class

    private String model;
    private String renk;
    private int motor;
    private int yil;

    //enc butun acces modifierleri private yapmalisin
    //not: normalde gorunmeyen bir parametresiz constructor default olarak vardir ama mevcut gorunen
    //parametreli constructorlar parametresizi ezer bu yuzden
    //buraya bir parametresiz constructor eklemeliyiz

    public Araba() {//p'siz const

    }

    public Araba(String model, String renk, int motor, int yil) {//p'li const
        this.model = model;
        this.renk = renk;
        this.motor = motor;
        this.yil = yil;
        //yukaridaki verilerin encapsule edilmesi icin getter setter yapilmasi lazim
        //bunun icin de  class in icine girip sag tus ile generate i tiklayip getter ve setter diyoruz
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    @Override
    public String toString() {//bu method bu alanda create edilen obj filed larini stringe cevirir
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}




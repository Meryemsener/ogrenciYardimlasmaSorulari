package encapsulation;

public class ArabaMain {
    public static void main(String[] args) {
        Araba honda=new Araba();        //parametresiz obj create edildi,parametresiz oldugu icin data turlerinin defaultu doner
        honda.setModel("accord ");    //paramtresiz const tan uretildigi icin altta amele gibi bilgileri tek tek giriyoruz
        honda.setYil(2018);
        honda.setMotor(1600);
        honda.setRenk("kirmizi");

        Araba toyota=new Araba("avensis","beyaz",2000,2020);
        Araba volvo=new Araba("s80","beyaz",2400,2010);

        System.out.println(honda);  //encapsulation.Araba@35bbe5e8=>bunu bu sekilde yazinca heap lerdeki referans degerleri gelir
                                    //bunun onune gecip direkt bilgilere ulasmak icin getter Araba classina gidip classin icinden
                                     // sag tus yapip generate ile tum bilgilerin toStringini cagiriyoruz
        System.out.println(volvo);  //encapsulation.Araba@2c8d66b2=>
        System.out.println("sectiginiz arac toyota -> " + "model : "+ toyota.getModel()+"renk : "
                +toyota.getRenk()+"motor gucu : "+toyota.getMotor()+"yili : "+toyota.getYil());


    }
}

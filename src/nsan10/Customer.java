package nsan10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Customer {
    static Scanner scan=new Scanner(System.in);
    static ArrayList <String> arr=new ArrayList<>();
    static ArrayList <String> arr1=new ArrayList<>();
    static ArrayList <String> arr2=new ArrayList<>();
    static String name;
    static  String lName;
    static int age;
    int roomNum;
    static int price=1000;
    private static String kkno;
    private static String creditCard;
    public Customer(String name2, String lName2, int age2) {
        this.name=scan.next();
        this.lName=lName2;
        this.age=age2;
    }
    public Customer() {
    }
    public static ArrayList<String> saveCustom(int nextInt,String name2 , String lName2, int age2) {
        String cust="";
        for(int i=0;i<nextInt;i++) {
            System.out.println(i+1 + ". kisinin giriniz");
            name2=scan.next().toUpperCase();
            lName2=scan.next().toUpperCase();
            age2=scan.nextInt();
            //girilen yaslar array' kaydedilip daha sonra yas uzerinden yapilacak indirim metodunda kullanidli
            arr1.add(Integer.toString(age2));
            cust="Ad: "+name2 +" \nSoyad:"+lName2+"\nYas:"+ Integer.toString(age2);
            arr.add(i, cust);
        }
        return arr;
    }

    private static int agePrice(ArrayList<String> arr1) {
        int sum=0;
        int sum1=0;
        int count=0;
        int count1=0;
        for(int i=0;i<arr1.size();i++) {
            if(Integer.valueOf(arr1.get(i))<7) {
                ++count;
                sum=price-(price/10);
            }else {
                ++count1;
            }
        }
        return sum*(count) +price*(count1);
    }
    public static void addCustomer(int nextInt, ArrayList<String> arr ) {
        for(int i=0;i<nextInt;i++) {
            System.out.println("\n"+ arr.get(i));

        }
    }
    private static void ThreeDSecurity(String kkno2) throws InterruptedException {
        String kkInfo="";
        String kk="************";
        System.out.println("\n//Ad \n//Soyad \n//16 Haneli Kredi Karti Numaranizi giriniz");
        name=scan.next().toUpperCase(null);
        lName=scan.next().toUpperCase(null);
        creditCard=scan.next();
        kk+=creditCard.substring(12, 16);
        kkInfo="\nAd-SoyAd: " +name+"-"+lName+"\nKK-No" +kk;
        arr2.add(kkInfo);
        System.out.println("Odemeniz aliniyor...");
        Thread.sleep(2900);
        System.out.println("Bilgileriniz\n" +arr2.get(0));
        System.out.println("Odemeniz basariyla alindi");



    }

    public static void saveRoom(int nextInt) throws InterruptedException {
        int totalPrice=0;
        int indirimTutari=0;
        while (true) {
            if(nextInt>4) {
                System.out.println(nextInt +" kisilik odamiz bulunmamaktadir. lutfen tekrar deneyiniz");
                continue;
            }else {
                System.out.println("lutfen yetiskin ve cocuk bilgilerini giriniz");
                saveCustom(nextInt, name, lName, nextInt);
                System.out.println("konaklama suresini giriniz (10 gun uzeri %10 indirimlidir)");
                int days=scan.nextInt();
                if(days<10) {
                    totalPrice=agePrice(arr1)*days;
                }else {
                    totalPrice=(int)(agePrice(arr1)*days*0.9);
                }
                System.out.println("\\n========\\nBilgileriniz yukleniyor.");
                Thread.sleep(2500);
                System.out.println("Bilgileriniz: \n");
                addCustomer(nextInt, arr);
                System.out.println("Odeme icin 1'e sayfadan ayrilmak icin 2'ye basiniz");
                switch(scan.nextInt()) {
                    case 1:
                        System.out.println("tutariniz: " + (totalPrice) +" Tl'dir");
                        indirimTutari=days*price*nextInt-(totalPrice);
                        // System.out.println("indirimsiz: " + days*price*nextInt);
                        System.out.println("Cocuk ve 10+ gun idnirimi tutariniz:" + Math.abs(indirimTutari) +" Tl'dir.");
                        System.out.println("Odemeniz Kredi karti / Nakit Havale \n***(Kredi-Karti 1/Nakit Havale 2)***");
                        switch(scan.nextInt()) {
                            case 1:
                                System.out.println("Sizi guvenliginiz 3D security sayfasian yonlendiriyorum ");
                                ThreeDSecurity(kkno);
                                break;
                            case 2:
                                System.out.println("Mail adresine gonderecegimiz banka hesabina mesai saatleri ve 2 is gunu icersinde odeme yapmanizi rica ederiz.\nAksi taktirde rezervasyonunuz iptal olacaktir");
                                addMail(creditCard);
                                System.out.println("Mail hesabinizi kontrol ediniz. Herhangi bir sorun cikarsa \n 444-5-444 ya da \nTatilCi@gmail.com'a mail atabilirsiniz");
                        }
                        break;
                    case 2:
                        System.out.println("Bizi tercih etiiginiz icin tesekkurler");
                        break;
                    default:
                        System.out.println("gecersiz tuslama yaptiniz");
                        break;
                }
            }
            System.out.println("Cikmak icin 9'u tuslayiniz");
            switch(scan.nextInt()) {
                case 9:
                    System.out.println("Kampanyalardan haberdar olmak icin 2'ye basip  mail adresinizi ekleyebilirsiniz");
                    addMail(scan.next());
                    Thread.sleep(1900);
                    System.out.println("Iyi gunler");

            }

            break;
        }

    }
    private static void addMail(String next) {
        System.out.println("lutfen mail adresinizi giriniz");
        String mail= "@gmail.com";
        String mailAdd=scan.next()+mail;
        System.out.println("Mail adresiniz: " +mailAdd+ "\nbasariyla kaydedilmistir");
    }

}

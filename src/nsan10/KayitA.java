package nsan10;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KayitA {
   static List<KullaniciA> kisiler = new ArrayList<>();//bos list create edildi

    public List<KullaniciA> kayitAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String isim = scan.next();
        KullaniciA k1 = new KullaniciA(isim, LocalDateTime.now());//kullanici class tan parametreli cons ile obj create edildi
        kisiler.add(k1);//kullanici claas indan p'li cons create edilen onj kisiler listesine eklendi


        return kisiler;
    }

    public void sansliKullanici(List<KullaniciA> kll) {
        for (KullaniciA k : kll) {//kayitAl() metodunda create edilen her bi rkullanici donguye sokuldu
            if (k.kayitZamani.getSecond() < 10) {//her bir kullanicinin kayitZamanindaki saniye if sartina sokuldu
                System.out.println("Sansli kisisiniz + " + k.name + "kazandiniz");
            } else System.out.println("maalesef sansli kisi degiliniz +" + k.name);

        }

    }
    public void listele(List<KullaniciA> kullanicilar){
        for (KullaniciA k:kullanicilar) {//kayitAl() methodundn gelen kisiler listini dongye sokuyor
            System.out.println("adi : "+k.name+ "kayit zamani : "+ k.kayitZamani);//kisiler listteki her bir kullanicinin ad ve kayit zamanini veriyor

        }


    }
}

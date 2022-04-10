package nsan10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GirisPaneliA {
    public static void panel() {
        Scanner scan = new Scanner(System.in);
        int islem;
        KayitA yeniKayit = new KayitA();//obj ile method call yapilacak

        List<KullaniciA> kisi = new ArrayList<KullaniciA>();
        boolean cikilsinMi = false;
        while (!cikilsinMi) {

            System.out.println("Lutfen \n1 : kayit al \n2 : sansli kisi bul \n3 : kisileri listele \n4 : cikis");
            System.out.println("isleminizi secin : ");

            islem = scan.nextInt();
            switch (islem) {
                case 1:
                    kisi = yeniKayit.kayitAl();//kisi listi degerini yenikayit obj ile kayitAl() method call dan alacak
                    break;
                case 2:
                    yeniKayit.sansliKullanici(kisi);
                    break;
                case 3:
                    yeniKayit.listele(kisi);
                    break;
                case 4:
                    cikilsinMi = true;
                    break;
                default:
                    System.out.println("Hataki veri girdiniz");
                    break;
            }
        }
    }
}

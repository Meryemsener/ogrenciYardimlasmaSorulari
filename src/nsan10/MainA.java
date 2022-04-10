package nsan10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainA {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("isleminizi secin : ");
        int islem = scan.nextInt();
        KayitA yeniKayit = new KayitA();//obj ile method call yapilacak

        List<KullaniciA> kisi = new ArrayList<KullaniciA>();
        boolean cikilsinMi = false;
        while (!cikilsinMi) {
            System.out.println("lutfen \n1 : kayit al \n2 : sansli kisi bul \n3 : kisileri listele \n4 : cikis");

            switch (islem) {
                case 1:
                    kisi = yeniKayit.kayitAl();//kisi listi degerini yenikayit obj ile kayitAl() method call dan alacak
            }


        }
    }
}
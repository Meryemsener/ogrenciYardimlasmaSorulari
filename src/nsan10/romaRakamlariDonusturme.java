package nsan10;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
public class romaRakamlariDonusturme {
    public static void main(String[] args) {
        //		 	Create a method to convert Roman numerals to numbers
        //		 	Romen rakamlarını sayılara dönüştürmek için bir method create ediniz
        //
        //		   	    Output: DCCCV   805
        //		   		M + [C M] + [X L] + V   ---->   1945
        //		   		The chars in the brackets are in ascending order. (C-100, M-1000) ---> [C M]=900
        //	            1	I
        //              5	V
        //              10	X
        //              50	L
        //              100	C
        //              500	D
        //              1000 M
        //
        //		*/
        //}

        String romaStr = "MMMMDCLXIIII";
        List<String> romaList = new ArrayList<String>();

        for (int i = 0; i < romaStr.length(); i++) {
            romaList.add(romaStr.substring(i, i + 1));
        }
        sayiyaCevir(romaList);
        long sayi = 4664;
        romaKaraktereCevir(sayi);
    }

    public static void romaKaraktereCevir(long sayi) {
        String romaStr = "";
        while (sayi > 0) {
            if (sayi / 1000 >= 1) {
                for (int i = 0; i < sayi / 1000; i++) {
                    romaStr += "M";
                }
                sayi = sayi % 1000;
            } else if (sayi / 500 >= 1) {
                for (int i = 0; i < sayi / 500; i++) {
                    romaStr += "D";
                }
                sayi = sayi % 500;
            } else if (sayi / 100 >= 1) {
                for (int i = 0; i < sayi / 100; i++) {
                    romaStr += "C";
                }
                sayi = sayi % 100;
            } else if (sayi / 50 >= 1) {
                for (int i = 0; i < sayi / 50; i++) {
                    romaStr += "L";
                }
                sayi = sayi % 50;
            } else if (sayi / 10 >= 1) {
                for (int i = 0; i < sayi / 10; i++) {
                    romaStr += "X";
                }
                sayi = sayi % 10;
            } else if (sayi / 5 >= 1) {
                for (int i = 0; i < sayi / 5; i++) {
                    romaStr += "V";
                }
                sayi = sayi % 5;
            } else if (sayi / 1 >= 1) {
                for (int i = 0; i < sayi / 1; i++) {
                    romaStr += "I";
                }
                sayi = sayi % 1;
            }
        }
        System.out.println(romaStr);
    }

    public static void sayiyaCevir(List<String> romaList) {
        int i = 0;
        int sayi = 0;
        while (true) {
            if (i == romaList.size()) break;
            else {
                if (romaList.get(i).equals("M")) sayi += 1000;
                else if (romaList.get(i).equals("D")) sayi += 500;
                else if (romaList.get(i).equals("C")) sayi += 100;
                else if (romaList.get(i).equals("L")) sayi += 50;
                else if (romaList.get(i).equals("X")) sayi += 10;
                else if (romaList.get(i).equals("V")) sayi += 5;
                else if (romaList.get(i).equals("I")) sayi += 1;
                else {
                    System.out.println("Gecersiz bir karakter girdiniz, <" + romaList.get(i) + "> kabul edilmedi.");
                    sayi = 0;
                    break;
                }
            }
            i++;
        }
        System.out.println(sayi);
    }
}


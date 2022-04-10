package restorantProjesi;

public class yeni {
    public static void encokharfbul(String kelime)
    {
        int sayi=0;
        int encokkactane=0;
        int index = 0;
        for (int i = 0; i < kelime.length(); i++) {
            sayi=0;
            for (int j = 0; j < kelime.length(); j++) {
                if(kelime.charAt(i)==kelime.charAt(j)) sayi++;
            }
            if(sayi>encokkactane) {
                encokkactane = sayi;
                index = i;
            }
        } System.out.println("En çok kullanılan harf:"+kelime.charAt(index));

    }
    public static void main(String[] args) {
        encokharfbul("javaissoeasy");   }   }



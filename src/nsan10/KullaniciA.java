package nsan10;

import java.time.LocalDateTime;

public class KullaniciA {

    String name;
    LocalDateTime kayitZamani;
    public KullaniciA(){//parametresin contructor

    }

    public KullaniciA(String name, LocalDateTime kayitZamani) {//parametreli constructor
        this.name = name;
        this.kayitZamani = kayitZamani;
    }
}

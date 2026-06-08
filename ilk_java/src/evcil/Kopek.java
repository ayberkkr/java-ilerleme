package evcil;
import canlilar.Canli;

public class Kopek {
    
    public String cinsi;

    public void kopekErisimTesti() {
        System.out.println("--- Köpek Sınıfı İçi Erişim Testi (Farklı Paket ve Kalıtım YOK) ---");
        
        Canli kopekCanli = new Canli();

        // DEĞİŞKENLER
        kopekCanli.isim = "Karabaş"; // ERİŞİLİR: public
        // kopekCanli.tur = "Canis lupus"; // ERİŞİLEMEZ: protected kalıtım yok ve farklı pakette.
        // kopekCanli.kilo = 20.5; // ERİŞİLEMEZ: default farklı paket.
        // kopekCanli.yas = 4; // ERİŞİLEMEZ: private.

        // METOTLAR
        kopekCanli.nefesAl(); // ERİŞİLİR: public
        // kopekCanli.hareketEt(); // ERİŞİLEMEZ: protected kalıtım yok ve farklı paket.
        // kopekCanli.uyu(); // ERİŞİLEMEZ: default farklı paket.
        // kopekCanli.kalpAtisi(); // ERİŞİLEMEZ: private.
    }

    public void havla() {
        System.out.println("Köpek havlıyor..");
    }
}
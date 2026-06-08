package evcil;
import canlilar.Canli;

public class Kedi extends Canli {
    
    public String tuyRengi;

    public Kedi() {
        super();
    }

    public Kedi(String isim, String tur, double kilo, int yas, String tuyRengi) {
        super(isim, tur, kilo, yas);
        this.tuyRengi = tuyRengi;
    }

    public void kediErisimTesti() {
        System.out.println("--- Kedi Sınıfı İçi Erişim Testi (Farklı Paket ama Kalıtım Var) ---");
        
        // DEĞİŞKENLER
        isim = "Tekir"; // ERİŞİLİR: public her yerden erişilebilir.
        tur = "Felis catus"; // ERİŞİLİR: protected farklı paket ama kalıtım aldığı için erişilebilir.
        // kilo = 4.0; // ERİŞİLEMEZ: default farklı paket olduğu için erişilemez.
        // yas = 2; // ERİŞİLEMEZ: private.

        // METOTLAR
        nefesAl(); // ERİŞİLİR: public
        hareketEt(); // ERİŞİLİR: protected kalıtım var.
        // uyu(); // ERİŞİLEMEZ: default farklı paket.
        // kalpAtisi(); // ERİŞİLEMEZ: p    rivate.
    }

    public void miyavla() {
        System.out.println(isim + " miyavlıyor.");
    }
}
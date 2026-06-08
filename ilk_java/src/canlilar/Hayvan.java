package canlilar;

public class Hayvan extends Canli {
    
    public boolean evcilMi;

    public Hayvan() {
        super();
    }

    public Hayvan(String isim, String tur, double kilo, int yas, boolean evcilMi) {
        super(isim, tur, kilo, yas);
        this.evcilMi = evcilMi;
    }

    public void erisimTesti() {
        System.out.println("Hayvan Sınıfı İçi Erişim Testi");
        
        // DEĞİŞKENLER
        isim = "Genel Hayvan"; // ERİŞİLİR: public her yerden erişilebilir.
        tur = "Memeli";        // ERİŞİLİR: protected aynı paket ve alt sınıf olduğu için erişilir.
        kilo = 15.5;           // ERİŞİLİR: default aynı pakette olduğumuz için erişilebilir.
        // yas = 5;            // ERİŞİLEMEZ: private sadece kendi sınıfından erişilebilir.
        
        setYas(5); // setter metodu ile erişebildik

        // METOTLAR
        nefesAl();    // ERİŞİLİR: public
        hareketEt();  // ERİŞİLİR: protected
        uyu();        // ERİŞİLİR: default (aynı paketteyiz)
        // kalpAtisi();  // ERİŞİLEMEZ: private
    }
    
    public void avlan() {
        System.out.println(isim + " avlanmaya çıktı.");
    }
}
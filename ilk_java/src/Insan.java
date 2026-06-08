public class Insan{

    String adSoyad;
    String sacRengi;
    String gozRengi;
    int yas;
    int kilo;
    int boy;
    
    public Insan() {
        this.adSoyad = "Bilinmiyor";
    }

    public Insan(String adSoyad, int yas) {
        this.adSoyad = adSoyad;
        this.yas = yas;
    }

    public Insan(String adSoyad, String sacRengi, String gozRengi, int yas, int kilo, int boy) {
        this.adSoyad = adSoyad;
        this.sacRengi = sacRengi;
        this.gozRengi = gozRengi;
        this.yas = yas;
        this.kilo = kilo;
        this.boy = boy;
    }

    public void adSoyadYaz() {
        System.out.println("Ad Soyad: " + this.adSoyad);
    }
    public void gozRengiYaz() {
        System.out.println("Göz Rengi: " + this.gozRengi);
    }
    public void sacRengiYaz() {
        System.out.println("Saç Rengi: " + this.sacRengi);
    }
    public void yasYaz() {
        System.out.println("Yaş: " + this.yas);
    }
    public void kiloYaz() {
        System.out.println("Kilo: " + this.kilo);
    }
    public void boyYaz() {
        System.out.println("Boy: " + this.boy);
    }
}
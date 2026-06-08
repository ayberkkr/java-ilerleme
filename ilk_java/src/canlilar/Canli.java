package canlilar;

public class Canli {
    public String isim;
    protected String tur;
    double kilo;
    private int yas;

    public Canli() {
        System.out.println("Canli nesnesi (parametresiz) oluşturuldu.");
    }

    public Canli(String isim, String tur, double kilo, int yas) {
        this.isim = isim;
        this.tur = tur;
        this.kilo = kilo;
        setYas(yas);
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas < 0) {
            System.out.println("Geçersiz yaş!");
        } else {
            this.yas = yas;
        }
    }

    public void nefesAl() {
        System.out.println("Nefes alıyor.");
    }

    protected void hareketEt() {
        System.out.println("Hareket ediyor.");
    }

    void uyu() {
        System.out.println("Uyuyor.");
    }

    private void kalpAtisi() {
        System.out.println("Kalp atıyor.");
    }
}
public class Bisiklet {

    private String marka;
    private int yas;
    private int vitesSayisi;
    private String renk;

    public Bisiklet() {  // boş constructor
    }

    public void ozellikGoster() {

        System.out.println("Bisikletin markası: " + marka);
        System.out.println("Bisikletin yasi: " + yas);
        System.out.println("Bisikletin vites sayisi: " + vitesSayisi);
        System.out.println("Bisikletin rengi: " + renk);
        System.out.println("-------------------------");
    }

    
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getVitesSayisi() {
        return vitesSayisi;
    }

    public void setVitesSayisi(int vitesSayisi) {
        this.vitesSayisi = vitesSayisi;
    }

    public String getRenk(){
        return renk;
    }

    public void setRenk(String renk){
        this.renk = renk;
    }
}
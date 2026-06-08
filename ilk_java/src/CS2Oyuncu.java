public class CS2Oyuncu {
    
    private String nickname;
    private int[] sonMacSkorlari;

    public CS2Oyuncu()
    {
    }

    public String getNickname(){
        return nickname;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public int[] getSonMacSkorlari(){
        return sonMacSkorlari;
    }

    public void setSonMacSkorlari(int[] sonMacSkorlari){

        if (sonMacSkorlari.length != 3)
        {
            System.out.println("Hata! Sadece son 3 maçın skorları girilebilir.");
        }

        else
        {
            this.sonMacSkorlari = sonMacSkorlari;
        }

    }

    public void toplamKilliHesapla(){
        int toplamKill = 0;
        
        for(int i = 0; i < this.sonMacSkorlari.length; i++){
            toplamKill += this.sonMacSkorlari[i];
        }

        System.out.println("Toplam kill sayisi: " + toplamKill);
    }

    // Senin mantığınla yazılmış, en doğru tasarım:
//     public int toplamKilliHesapla() {
//     int toplamKill = 0;
    
//     // Yine kendi dizisini kullanıyor (parametre yok)
//     for(int i = 0; i < this.sonMacSkorlari.length; i++){
//         toplamKill += this.sonMacSkorlari[i];
//     }
    
//     // sout yerine direkt değeri döndürüyor
//     return toplamKill; 
// }

}

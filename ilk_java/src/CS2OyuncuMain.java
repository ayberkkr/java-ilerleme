public class CS2OyuncuMain {
    public static void main(String[] args){

        CS2Oyuncu oyuncu1 = new CS2Oyuncu();
        oyuncu1.setNickname("Quaresma");
        
        // Önce hatalı durumu test edelim (2 eleman yolluyoruz)
        System.out.println("--- Hatalı Atama Testi ---");
        oyuncu1.setSonMacSkorlari(new int[]{12, 5}); 

        System.out.println("");

        int[] buMacinSkorlari = {18, 24, 15}; // Kısayol burada çalışır
        oyuncu1.setSonMacSkorlari(buMacinSkorlari); // Değişkeni metoda yollarsın
        oyuncu1.toplamKilliHesapla();

        // üstte yazılan biraz daha basit halidir.
        
        // Şimdi doğru durumu test edelim (3 eleman yolluyoruz)
        System.out.println("\n--- Doğru Atama Testi ---");
        oyuncu1.setSonMacSkorlari(new int[]{18, 24, 15});
        
        // Metodu çağırıp toplamı yazdıralım
        oyuncu1.toplamKilliHesapla();
    }
}

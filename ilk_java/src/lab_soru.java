import java.util.Scanner;

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sınıf mevcudunu giriniz: ");
        int ogrenciSayisi = scanner.nextInt();

        if (ogrenciSayisi < 0 && ogrenciSayisi == 0){
            System.out.println("Geçerli bir sayı giriniz.");
        }
        
        String[] ogrenci_isimleri = new String[ogrenciSayisi];
        String[] ogrenci_soyadlari = new String[ogrenciSayisi];
        int[] ogrenci_numaralari = new int[ogrenciSayisi];
        int[] vize1_puanlari = new int[ogrenciSayisi];
        int[] vize2_puanlari = new int[ogrenciSayisi];
        int[] final_sonuclari = new int[ogrenciSayisi];
        int vize1_sinif = 0;
        int vize2_sinif = 0;
        int final_sinif = 0;

        for(int i = 0; i < ogrenciSayisi; i++){

            System.out.print("Öğrenci İsmi: ");
            String isim = scanner.next();
            ogrenci_isimleri[i] = isim;

            System.out.print("Öğrenci Soyadı: ");
            String soyad = scanner.next();
            ogrenci_soyadlari[i] = soyad;

            System.out.print("Öğrenci Numarası: ");
            int numara = scanner.nextInt();
            ogrenci_numaralari[i] = numara;

            System.out.print("Öğrenci Vize 1 Sonucu: ");
            int vize1 = scanner.nextInt();
            vize1_puanlari[i] = vize1;

            System.out.print("Öğrenci Vize 2 Sonucu: ");
            int vize2 = scanner.nextInt();
            vize2_puanlari[i] = vize2;

            System.out.print("Öğrenci Final Sonucu: ");
            int final_sinavi = scanner.nextInt();
            final_sonuclari[i] = final_sinavi;

            System.out.println("\n\n");
        }

        System.out.println("\n    ÖĞRENCİ LİSTESİ VE NOTLAR   ");
        for(int j = 0; j < ogrenciSayisi; j++){
            int ortalama = ((vize1_puanlari[j] *  30) + (vize2_puanlari[j] * 30) + (final_sonuclari[j] * 40)) / 100;
            System.out.println("Öğrenci adı: " + ogrenci_isimleri[j] + ogrenci_soyadlari[j] + " | Ogrenci numarası: " + ogrenci_numaralari[j]);
            System.out.println("Sınav notları (V1, V2, Final): " + vize1_puanlari[j] + ", " + vize2_puanlari[j] + ", " + final_sonuclari[j]);
            System.out.println("Ogrencinin Ortalaması: " + ortalama);
            System.out.println("-----------------------------------");

        
            vize1_sinif += vize1_puanlari[j];
            vize2_sinif += vize2_puanlari[j];
            final_sinif += final_sonuclari[j];
        }

        System.out.println("Sınıfın 1. Vize ortalaması: " + vize1_sinif/ogrenciSayisi);
        System.out.println("Sınıfın 2. Vize ortalaması: " + vize2_sinif/ogrenciSayisi);
        System.out.println("Sınıfın Final sonuçları ortalaması: " + final_sinif/ogrenciSayisi);

        int en_yuksek_vize1 = 0;
        int en_yuksek_vize2 = 0;
        int en_yuksek_final = 0;

        for(int x = 0; x<ogrenciSayisi; x++){
            en_yuksek_vize1 = vize1_puanlari[x];
                if (en_yuksek_vize1 < vize1_puanlari[x+1]){
                    en_yuksek_vize1 = vize1_puanlari[x+1];
                }
            en_yuksek_vize2 = vize2_puanlari[x];
                if (en_yuksek_vize2 < vize2_puanlari[x+1]){
                    en_yuksek_vize2 = vize2_puanlari[x+1];
                }
            en_yuksek_final = final_sonuclari[x];
                if (en_yuksek_final < final_sonuclari[x+1]){
                    en_yuksek_final = final_sonuclari[x+1];
                }
        }
        System.out.println("En yüksek Vize 1 notu: " + en_yuksek_vize1);
        System.out.println("En yüksek Vize 2 notu: " + en_yuksek_vize2);
        System.out.println("En yüksek Final notu: " + en_yuksek_final);

}
import java.util.Scanner;

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sınıf mevcudunu giriniz: ");
        int ogrenciSayisi = scanner.nextInt();

        if (ogrenciSayisi <= 0){
            System.out.println("Geçerli bir sayı giriniz.");
            return;
        }
        
        String[] ogrenci_isimleri = new String[ogrenciSayisi];
        String[] ogrenci_soyadlari = new String[ogrenciSayisi];
        int[] ogrenci_numaralari = new int[ogrenciSayisi];
        int[] vize1_puanlari = new int[ogrenciSayisi];
        int[] vize2_puanlari = new int[ogrenciSayisi];
        int[] final_sonuclari = new int[ogrenciSayisi];
        
        double vize1_sinif_toplam = 0;
        double vize2_sinif_toplam = 0;
        double final_sinif_toplam = 0;

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

            System.out.println("\n");
        }

        System.out.println("\n    ÖĞRENCİ LİSTESİ VE NOTLAR   ");
        for(int j = 0; j < ogrenciSayisi; j++){
            double ortalama = ((vize1_puanlari[j] * 30.0) + (vize2_puanlari[j] * 30.0) + (final_sonuclari[j] * 40.0)) / 100.0;
            System.out.println("Öğrenci adı: " + ogrenci_isimleri[j] + " " + ogrenci_soyadlari[j] + " | Ogrenci numarası: " + ogrenci_numaralari[j]);
            System.out.println("Sınav notları (V1, V2, Final): " + vize1_puanlari[j] + ", " + vize2_puanlari[j] + ", " + final_sonuclari[j]);
            System.out.println("Ogrencinin Ortalaması: " + ortalama);
            System.out.println("-----------------------------------");

            vize1_sinif_toplam += vize1_puanlari[j];
            vize2_sinif_toplam += vize2_puanlari[j];
            final_sinif_toplam += final_sonuclari[j];
        }

        System.out.println("Sınıfın 1. Vize ortalaması: " + (vize1_sinif_toplam / ogrenciSayisi));
        System.out.println("Sınıfın 2. Vize ortalaması: " + (vize2_sinif_toplam / ogrenciSayisi));
        System.out.println("Sınıfın Final sonuçları ortalaması: " + (final_sinif_toplam / ogrenciSayisi));
        System.out.println("\n\n");

        int en_yuksek_vize1 = vize1_puanlari[0];
        int en_dusuk_vize1 = vize1_puanlari[0];
        
        int en_yuksek_vize2 = vize2_puanlari[0];
        int en_dusuk_vize2 = vize2_puanlari[0];
        
        int en_yuksek_final = final_sonuclari[0];
        int en_dusuk_final = final_sonuclari[0];

        for(int x = 1; x < ogrenciSayisi; x++){
            if (vize1_puanlari[x] > en_yuksek_vize1) {
                en_yuksek_vize1 = vize1_puanlari[x];
            }
            if (vize1_puanlari[x] < en_dusuk_vize1) {
                en_dusuk_vize1 = vize1_puanlari[x];
            }

            if (vize2_puanlari[x] > en_yuksek_vize2) {
                en_yuksek_vize2 = vize2_puanlari[x];
            }
            if (vize2_puanlari[x] < en_dusuk_vize2) {
                en_dusuk_vize2 = vize2_puanlari[x];
            }

            if (final_sonuclari[x] > en_yuksek_final) {
                en_yuksek_final = final_sonuclari[x];
            }
            if (final_sonuclari[x] < en_dusuk_final) {
                en_dusuk_final = final_sonuclari[x];
            }
        }

        System.out.println("En yüksek Vize 1 notu: " + en_yuksek_vize1);
        System.out.println("En düşük Vize 1 notu: " + en_dusuk_vize1);
        System.out.println("-----------------------------------");
        
        System.out.println("En yüksek Vize 2 notu: " + en_yuksek_vize2);
        System.out.println("En düşük Vize 2 notu: " + en_dusuk_vize2);
        System.out.println("-----------------------------------");
        
        System.out.println("En yüksek Final notu: " + en_yuksek_final);
        System.out.println("En düşük Final notu: " + en_dusuk_final);

        scanner.close();
    }
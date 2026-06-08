import java.util.Scanner;

public class video {
    public static void main(String[] args){

        // MESAJ YAZDIRMA KISIMLARI:

        System.out.println("Videodan ilk deneme yapıyorum syso");   // sysout ile yazıldı
        System.out.println("Videodan ilk deneme yapıyorum sout");   // sout ile yazıldı
        
        // SAYISAL İŞLEM KISIMLARI:

        double Yaricap;
        double alan;

        Yaricap = 30;
        alan = Yaricap * Yaricap * 3.14159;

        System.out.println("Yaricapi "  + Yaricap + " olan cemberin alani " + alan);

        byte sayi = 127;   // ddaha yüksek bir sayı yazamazsın
        System.out.println(sayi);

        int sayi2 = 15;
        System.out.println(sayi2);

        char harf = 'a';
        System.out.println(harf);

        String kelime = "Ayberk";
        System.out.println(kelime);

        short sayi3 = 32767;  // daha yüksek bir sayı yazamazsın
        System.out.println(sayi3);

        long sayi4 = Long.MAX_VALUE;
        System.out.println(sayi4);
        
        long toplam = Long.sum(sayi4, sayi4);
        System.out.println(toplam);

        float sayi5 = 2.235F;   // Floatta yanına f-F koyman gerekir
        System.out.println(sayi5);

        double sayi6 = 23.52626;  // Doubleda öyle bir zorunluluk yok
        System.out.println(sayi6);

        boolean sonuc = 1 < 2;
        boolean sonuc2 = 7 > 2;

        if (sonuc == true){
        System.out.println("Dogru");
        }

        System.out.println(sonuc);
        System.out.println(sonuc2);

        String cumle = "Ayberk Kar"
                + " Bursa Teknik Universitesi"
                + " Yapay Zeka ve Makine Öğrenmesi";

        System.out.println(cumle);

        boolean sonuc3 = 6>3 && 6<4;
        System.out.println(sonuc3);

        boolean sonuc4 = 6>3 || 6<5;
        System.out.println(sonuc4);

        boolean sonuc5 = 5 > 6 ? true : false;
        System.out.println(sonuc5);

        String sonuc6 = 5>4 ? "EVET BUYUKTUR" : "HAYIR KUCUKTUR";
        System.out.println(sonuc6);


        // KULLANICIDAN DEĞER ALMA KISIMLARI:

        Scanner scanner_str = new Scanner(System.in);
        Scanner scanner_int = new Scanner(System.in);

        System.out.println("Lutfen sirasiyla isminizi ve yasinizi giriniz.");   

        String isim = scanner_str.nextLine();
        int yas = scanner_int.nextInt();

        System.out.println("İsminiz: " + isim + " Yasiniz: " + yas);

        // System.out.print yazarsan aşağı satıra değil aynı satıra yazı yazarsın

        // TÜR DÖNÜŞÜMÜ KISIMLARI:

        String x = "5";

        int o = Integer.valueOf(x);  // stringi integera dönüştürür
        int l = Integer.parseInt(x); // stringi integera dönüştürür

        String y = "10";
        int p = Integer.valueOf(y);

        System.out.println(l+p);

        int i = 22;
        String h = String.valueOf(i);

        System.out.println(h+110);


        double t = 5.50;
        int g = (int)t;

        System.out.println(g);

        int j = 5;
        double k = (double)j;
        
        System.out.println(k);


        // koşul : 5>3
        System.out.println("");
        if (2>3) {
            System.out.println("5 , 3'ten büyüktür...");
        }
        else {
            System.out.println("5 3 'ten küçüktür...");
        }



        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int gun = input.nextInt();

        switch (gun) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz.");
        }


        for(int say = 1;say<11;say++){
            System.out.println(say);
        }
        int buney = 1;

        while (buney < 10){
            System.out.println(buney);
            buney++;
        }

        // break ---> döngüyü bitiri
        // continue ---> verilen değeri atlar döngü devam eder

        String[] isimDizisi = {"Ali","Veli","Enes","Yakup","Bilal","Oğuz"};
        System.out.println("DİZİNİN ELAMANLARI");
        System.out.println("----------------------------------");

        // for(int u=0 ; u<=6; u++)
        // {
        //     System.out.println(isimDizisi[u]);
        // }

        // int[] sayilar = new int[1];
        // sayilar[0] = 11;

        // for(int don = 0; don<sayilar.length;don++){
        //     System.out.println(sayilar[i]);
        // }

        // BUNLARI CHAR VE DOUBLE İLEDE YAPABİLİRSİN.

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Dizinin kaç elamanlı olsun :");
        // int diziUzunluk = scanner.nextInt();
        // scanner.nextLine();

        // String[] isimler = new String[diziUzunluk];

        // for(int i = 0 ; i<isimler.length ; i++)
        // {
        //     System.out.print("Dizinin "+ (i)+". index değerini giriniz :");
        //     isimler[i] = scanner.nextLine();
        // }

        // System.out.println("***************DİZİNİN ELEMANLARI***************");
        // for(int i=0 ; i<isimler.length ; i++)
        // {
        //     System.out.println(isimler[i]);
        // }


        // FOREACH:

        // 1. GİRİLEN ---> TİPİ    2. GİRİLEN ---> VERİLEN İSİM    3. GİRİLEN ---> HANGİ DİZİDEN ALINACAK

        for (String isimler : isimDizisi) {
            System.out.println(isimler);
        }

        int[] rakamlar = {1,2,3,4,5,6,7};
        for (int m : rakamlar) {
            System.out.println(m);
        }

        // DİZİLERDE .length KULLANILIRKEN STRİNGLERDE .length() KULLANILIR


    }


}
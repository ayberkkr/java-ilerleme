import java.util.Scanner;

class Insan {
    String adSoyad;
    String sacRengi;
    String gozRengi;
    int yas;
    int kilo;
    int boy;

    public Insan() {
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

public class Test {
    public static void main(String[] args) {
        
        
        Insan insan1 = new Insan("Ayberk Kar", "Siyah", "Siyah", 19, 55, 184);
        
        Insan insan2 = new Insan("Emre Türkbay", 21);
        insan2.boy = 165; 
        insan2.kilo = 55;

        Insan insan3 = new Insan();
        insan3.adSoyad = "Ali Andaç Erdaş";
        insan3.yas = 20;
        
        Insan insan4 = new Insan("Yıldız Kar", "Kumral", "Kahverengi", 55, 65, 173);
        Insan insan5 = new Insan("Ali Kar", "Siyah", "Ela", 65, 90, 190);

        System.out.println("\n1. İnsan Bilgileri:");
        insan1.adSoyadYaz();
        insan1.yasYaz();
        insan1.gozRengiYaz();
        insan1.sacRengiYaz();
        insan1.boyYaz();
        insan1.kiloYaz();

        System.out.println("\n4. İnsan Bilgileri:");
        insan4.adSoyadYaz();
        insan4.sacRengiYaz();
        insan4.gozRengiYaz();
        insan4.yasYaz();
        insan4.kiloYaz();
        insan4.boyYaz();

        System.out.println("\n==========================================");
        
        Scanner scanner = new Scanner(System.in);
        Insan[] insanlar = new Insan[5];

        for (int i = 0; i < insanlar.length; i++) {
            System.out.println((i + 1) + ". Kişinin Bilgilerini Giriniz:");
            
            System.out.print("Ad Soyad: ");
            String adSoyad = scanner.nextLine();
            
            System.out.print("Saç Rengi: ");
            String sacRengi = scanner.nextLine();
            
            System.out.print("Göz Rengi: ");
            String gozRengi = scanner.nextLine();
            
            System.out.print("Yaş: ");
            int yas = scanner.nextInt();
            
            System.out.print("Kilo: ");
            int kilo = scanner.nextInt();
            
            System.out.print("Boy: ");
            int boy = scanner.nextInt();
            
            scanner.nextLine(); 

            insanlar[i] = new Insan(adSoyad, sacRengi, gozRengi, yas, kilo, boy);
            System.out.println("===-----===-----===");
        }

        System.out.println("\n -=-=- TÜM İNSANLAR -=-=- ");
        for (int i = 0; i < insanlar.length; i++) {
            System.out.println("\n--- " + (i + 1) + ". Kişi ---");
            insanlar[i].adSoyadYaz();
            insanlar[i].gozRengiYaz();
            insanlar[i].sacRengiYaz();
            insanlar[i].yasYaz();
            insanlar[i].boyYaz();
            insanlar[i].kiloYaz();
        }
        
        scanner.close();
    }
}
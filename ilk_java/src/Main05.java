public class Main05 {
    public static void main(String[] args) {
        
        Car araba = new Mercedes("EQC", 2022, "Black", "Elektrikli", 0);

        System.out.println("ARAÇ BİLGİLERİ");
        System.out.println("Marka: " + araba.getBrand());
        System.out.println("Model: " + araba.getModel());
        System.out.println("Yıl: " + araba.getYear());
        System.out.println("Kilometre: " + araba.getKilometer());
        System.out.println("Yakıt Tipi: " + araba.getFuelType());
        System.out.println("Renk: " + araba.getColor());
        System.out.println("----------------------\n");

        // Tipi Car olsa da nesne tipi Mercedes olduğu için Mercedesin hiziArttir metodu çalışır.
        araba.hiziArttir(60); 
        
        // frenYap metodu Mercedes için üst sınıf yani Car sınıfı üzerinden çalışır.
        araba.frenYap(20);     
    }
}
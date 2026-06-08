public class Mercedes extends Car {

    public Mercedes(String model, int year, String color, String fuelType, int kilometer) {
        // Üst sınıfın kurucusuna marka kısmı sabit olarak Mercedes gönderiliyor
        super("Mercedes", model, year, color, fuelType, kilometer);
    }

    @Override
    public void hiziArttir(int deger) {
        System.out.println("Mercedes hızlanıyor...");
        
        // Gelen değerin 1.25 katı hesaplanıp int bir değere dönüştürülüyor
        int artisMiktari = (int) (deger * 1.25);
        this.speed += artisMiktari;
        
        System.out.println("Mevcut Hız: " + this.speed + " km/h");
    }
}
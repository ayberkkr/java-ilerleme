public class Car implements AracKontrol {
    
    private String brand;
    private String model;
    private int year;
    private String color;
    private String fuelType;
    private int kilometer;
    
    // Alt sınıfların doğrudan erişebilmesi için protected tanımlandı
    protected int speed = 0;

    public Car(String brand, String model, int year, String color, String fuelType, int kilometer) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.fuelType = fuelType;
        this.kilometer = kilometer;
    }

    public Car() {
    }

    @Override
    public void hiziArttir(int deger) {
        this.speed += deger;
        System.out.println("Hızlanıyorsunuz. Mevcut Hız: " + this.speed + " km/h");
    }

    @Override
    public void frenYap(int deger) {
        this.speed -= deger;
        
        // Araç hızı hiçbir zaman 0'ın altına düşmemeli
        if (this.speed < 0) {
            this.speed = 0;
        }
        System.out.println("Frene bastınız. Mevcut Hız: " + this.speed + " km/h");
    }

    public String getBrand() {
        return brand; 
    }
    public String getModel() { 
        return model; 
    }
    public int getYear() { 
        return year; 
    }
    public String getColor() { 
        return color; 
    }
    public String getFuelType() { 
        return fuelType; 
    }
    public int getKilometer() { 
        return kilometer; 
    }
    public int getSpeed() { 
        return speed; 
    }

    // set metotları istenmediği için yazılmadı
}
class Hardware {

    private String brand;
    private double powerSupply;
    private static int deviceCount = 0;

    public Hardware(String brand, double powerSupply) {
        this.brand = brand;
        this.powerSupply = powerSupply;
        deviceCount++;
    }

    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(double powerSupply) {
        this.powerSupply = powerSupply;
    }

    public static int getDeviceCount() {
        return deviceCount;
    }

    public void powerOn() {
        System.out.println(brand + " cihazı " + powerSupply + " Watt ile çalışıyor.");
    }

    @Override
    public String toString() {
        return "Marka: " + brand + ", Güç Kaynağı: " + powerSupply + "W";
    }
}

class Computer extends Hardware {
    private int ram;
    private String cpuType;

    public Computer(String brand, double powerSupply, int ram, String cpuType) {
        super(brand, powerSupply);
        this.ram = ram;
        this.cpuType = cpuType;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public void configure(int addedRam) {
        this.ram += addedRam;
    }

    public void configure(int addedRam, String newCpu) {
        this.ram += addedRam;
        this.cpuType = newCpu;
    }

    @Override
    public String toString() {
        return super.toString() + ", RAM: " + ram + "GB, İşlemci: " + cpuType;
    }
}

class Laptop extends Computer {
    private int batteryHealth;
    private boolean isBacklitKeyboard;

    public Laptop(String brand, double powerSupply, int ram, String cpuType, int batteryHealth, boolean isBacklitKeyboard) {
        super(brand, powerSupply, ram, cpuType);
        this.batteryHealth = batteryHealth;
        this.isBacklitKeyboard = isBacklitKeyboard;
    }

    public int getBatteryHealth() {
        return batteryHealth;
    }

    public void setBatteryHealth(int batteryHealth) {
        this.batteryHealth = batteryHealth;
    }

    public boolean isBacklitKeyboard() {
        return isBacklitKeyboard;
    }

    public void setBacklitKeyboard(boolean backlitKeyboard) {
        this.isBacklitKeyboard = backlitKeyboard;
    }

    public void checkBattery() {
        System.out.println("Pil sağlığı: %" + batteryHealth);
        if (batteryHealth < 20) {
            System.out.println("Uyarı: Pil sağlığı kritik seviyede!");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Pil Sağlığı: %" + batteryHealth + ", Işıklı Klavye: " + (isBacklitKeyboard ? "Var" : "Yok");
    }
}

class GamingLaptop extends Laptop {
    private String gpuModel;
    private int rgbMode;

    public GamingLaptop(String brand, double powerSupply, int ram, String cpuType, int batteryHealth, boolean isBacklitKeyboard, String gpuModel) {
        super(brand, powerSupply, ram, cpuType, batteryHealth, isBacklitKeyboard);
        this.gpuModel = gpuModel;
        this.rgbMode = 0;
    }

    public String getGpuModel() {
        return gpuModel;
    }

    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }

    public int getRgbMode() {
        return rgbMode;
    }

    public void setRgbMode(int rgbMode) {
        this.rgbMode = rgbMode;
    }

    public void changeRGB(int mode) {
        this.rgbMode = mode;
        System.out.println("RGB Modu " + mode + " olarak güncellendi.");
    }

    @Override
    public String toString() {
        return ">>> OYUNCU EKİPMANI <<<\n" + super.toString() + ", GPU: " + gpuModel + ", RGB Modu: " + rgbMode;
    }
}

public class MainLab06 {
    public static void main(String[] args) {
        GamingLaptop myLaptop = new GamingLaptop("MSI Thin A15", 200.0, 16, "Intel Core i7", 18, true, "RTX 4060");

        myLaptop.powerOn();
        myLaptop.checkBattery();
        myLaptop.changeRGB(3);

        myLaptop.configure(16, "Intel Core i9");

        System.out.println("\nCihazın Son Hali:");
        System.out.println(myLaptop.toString());

        System.out.println("\nSistemde Üretilen Toplam Cihaz Sayısı: " + Hardware.getDeviceCount());
    }
}
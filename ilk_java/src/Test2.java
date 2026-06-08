public class Test2 {
    public static void main(String[] args) {
        
        Bisiklet bisiklet1 = new Bisiklet();
        
        bisiklet1.setMarka("BMX");
        bisiklet1.setYas(2);
        bisiklet1.setVitesSayisi(5);
        bisiklet1.setRenk("Kırmızı");
        
        Bisiklet bisiklet2 = new Bisiklet();
        bisiklet2.setMarka("Salcano");
        bisiklet2.setYas(1);
        bisiklet2.setVitesSayisi(21);
        bisiklet2.setRenk("Sarı");
        
        Bisiklet bisiklet3 = new Bisiklet();
        bisiklet3.setMarka("Carraro");
        bisiklet3.setYas(3);
        bisiklet3.setVitesSayisi(5);
        bisiklet3.setRenk("Mavi");

        System.out.println("Mağazada Bulunan Bisikletler: ");
        System.out.println("-------------------------");

        System.out.println("1. Bisiklet Bilgileri:");
        bisiklet1.ozellikGoster();
        
        System.out.println("2. Bisiklet Bilgileri:");
        bisiklet2.ozellikGoster();

        System.out.println("2.Bisiklet Bigileri:");
        bisiklet3.ozellikGoster();
    }
}
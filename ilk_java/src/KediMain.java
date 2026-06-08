public class KediMain {

    public static void main(String[] args){    
        Kedi kedi1 = new Kedi();

        kedi1.setName("Fabio");
        kedi1.setYas(3);
        kedi1.setKilo(7.0);

        System.out.println("Kedinin özellikleri sirasiyla: " + kedi1.getName() + " " + kedi1.getYas() + " " + kedi1.getKilo());
    }
}

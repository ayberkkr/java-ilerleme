public class Kedi {
    
    private String name;
    private int yas;
    private double kilo;

    public Kedi()
    {
    }

    public String getName(){
        return name;
    }
    public int getYas(){
        return yas;
    }
    public double getKilo(){
        return kilo;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setYas(int yas){
        this.yas = yas;
        if (yas <= 0){
            System.out.println("Hatali bir yas");
        }
    }
    public void setKilo(double kilo){
        this.kilo = kilo;
        if (kilo <= 0){
            System.out.println("Hatali bir kilo");
        }
    }
}

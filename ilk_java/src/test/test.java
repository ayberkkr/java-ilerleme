package test;

import canlilar.Canli;
import canlilar.Hayvan;
import evcil.Kedi;
import evcil.Kopek;

public class test {
    public static void main(String[] args) {
        
        System.out.println("CANLI NESNESİ");
        Canli c1 = new Canli("Organizma", "Bakteri", 0.1, 1);
        System.out.println("Verilen canli ismi: " + c1.isim);
        
        c1.setYas(-5);
        System.out.println("Canlı Güncel Yaş: " + c1.getYas()); 
        
        c1.setYas(5);
        System.out.println("Canlı Yeni Yaş: " + c1.getYas());
        
        System.out.println("\n");

        System.out.println("HAYVAN NESNESİ");
        Hayvan h1 = new Hayvan("Aslan", "Kedigiller", 190.5, 8, false);
        h1.erisimTesti();
        h1.avlan();
        
        System.out.println("\n");

        System.out.println("KEDİ NESNESİ");
        Kedi kedi1 = new Kedi("Fabio", "Tekir", 7.0, 3, "Beyaz");
        kedi1.kediErisimTesti();
        kedi1.miyavla();
        
        System.out.println("\n");

        System.out.println("KÖPEK NESNESİ");
        Kopek kopek1 = new Kopek();
        kopek1.cinsi = "Golden Retriever";
        kopek1.kopekErisimTesti();
        kopek1.havla();
    }
}
import java.util.Scanner;

public class Ikinci_Ders {
    public static void main(String[] args){
        System.out.println("sirasiyla istenecek 3 sayiyi girin.");
        
        Scanner keyboard = new Scanner(System.in);
        
        int sayi1 = keyboard.nextInt();
        int sayi2 = keyboard.nextInt();
        int sayi3 = keyboard.nextInt();
        
        int toplam = sayi1 + sayi2 + sayi3;
        
        System.out.println("girdiginiz sayilarin toplami: " + toplam);
        
        Scanner isim = new Scanner(System.in);
        System.out.println("isminizi girin: ");
        String isim_degeri = isim.nextLine();
        System.out.println("girdiginiz isim: " + isim_degeri);
    }
}
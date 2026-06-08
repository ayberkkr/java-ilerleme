public class FaktoriyelOdev {

    int varsayilanSayi = 5;






    public void voidFaktoriyel(int sayi) {
        int sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc = sonuc * i;
        }
        System.out.println("Void sonuc: " + sonuc);
    }






    public int returnFaktoriyel(int sayi) {
        int sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc = sonuc * i;
        }
        return sonuc;
    }






    public int recursiveFaktoriyel(int sayi) {
        if (sayi == 1 || sayi == 0) {
            return 1;
        }
        return sayi * recursiveFaktoriyel(sayi - 1);
    }






    public int iteratifFaktoriyel(int sayi) {
        int sonuc = 1;
        while (sayi > 0) {
            sonuc = sonuc * sayi;
            sayi--;
        }
        return sonuc;
    }






    public void parametreliFaktoriyel(int n) {
        int sonuc = 1;
        for (int i = 1; i <= n; i++) {
            sonuc = sonuc * i;
        }
        System.out.println("Parametreli sonuc: " + sonuc);
    }






    public void parametresizFaktoriyel() {
        int sonuc = 1;
        for (int i = 1; i <= varsayilanSayi; i++) {
            sonuc = sonuc * i;
        }
        System.out.println("Parametresiz sonuc: " + sonuc);
    }






    public static void staticFaktoriyel(int sayi) {
        int sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc = sonuc * i;
        }
        System.out.println("Static sonuc: " + sonuc);
    }








    public void nonStaticFaktoriyel(int sayi) {
        int sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc = sonuc * i;
        }
        System.out.println("Non-static sonuc: " + sonuc);
    }











    public static void main(String[] args) {
        
        staticFaktoriyel(4);




        FaktoriyelOdev odev = new FaktoriyelOdev();




        odev.voidFaktoriyel(5);




        int gelenSonuc = odev.returnFaktoriyel(5);
        System.out.println("Return sonuc: " + gelenSonuc);





        System.out.println("Recursive sonuc: " + odev.recursiveFaktoriyel(5));



        
        System.out.println("Iteratif sonuc: " + odev.iteratifFaktoriyel(5));





        odev.parametreliFaktoriyel(5);




        odev.parametresizFaktoriyel();




        odev.nonStaticFaktoriyel(5);



        
    }
}
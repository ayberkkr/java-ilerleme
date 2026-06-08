import ogrenci.ogrenci;

public class test_metot {

    public static void main(String[] args) {
        
        ogrenci ogrenci1 = new ogrenci(123,"Ayberk","Kar");
        
        ogrenci1.id = 122;
        ogrenci1.isim = "Ayberk"; // UZUN VE GEREKSİZ
        ogrenci1.soyisim = "Kar";

        System.out.println("ID" + ogrenci1.id);
    }
}


// private ---> sadece bulunduğu classdan erişilebilir başka bir classtan ulaşılamaz kapalıdır
public class fonksiyonlar {

    // VOID BİR ŞEY GERİ DÖNDÜRMEZ DEMEKTİR YANİ MESAJ ATMAK İÇİN KULLANILMASI DAHA İYİ OLUR

    static void yaz(){
        System.out.println("Merhaba Dünya!");
    }
    static int f(int x){
        return 5 * x + 10;
    }
    static int g(int a,int b){
        return f(b+a*2);    // BU SAYEDE G FONKSİYONUNUN RETURNU F FONKSİYONUNA GİRİYOR VE O SONUCU YAZDIRIYOR
    }

    public static void main(String[] args) {
        System.out.println(f(10));
        System.out.println(g(5,6));
        yaz();
    }
    
}

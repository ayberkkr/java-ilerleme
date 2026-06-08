public class BossMain {
    public static void main(String[] args){

        Boss boss1 = new Boss();

        boss1.setBossname("Yharon");
        boss1.setHealth(500);

        // Metot 'void' olduğu için direkt çağırıyoruz, sout içine almıyoruz.
        System.out.println("--- İlk Saldırı Dalgası ---");
        boss1.saldiriAl(50, 6); // 50 * 6 = 300 hasar. 200 canı kalacak.

        System.out.println("\n--- İkinci Saldırı Dalgası ---");
        boss1.saldiriAl(100, 5); // 100 * 5 = 500 hasar. 2. vuruşta ölecek ve döngü kırılacak!
    }
}
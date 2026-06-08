public class Boss {
    
    private String bossname;
    private int health;

    public Boss() {
    }

    public String getBossname(){
        return bossname;
    }

    public void setBossname(String bossname){
        this.bossname = bossname;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        if(health < 0){
            // Eksi girilirse canı sıfıra sabitliyoruz
            this.health = 0; 
        } else {
            this.health = health;
        }
    }

    // Geriye değer döndürmeyip ekrana basacağı için 'void' yaptık
    public void saldiriAl(int vurusGucu, int vurusSayisi){

        for(int i = 1; i <= vurusSayisi; i++){
            
            // Her döngüde candan vuruş gücü kadar düşüyoruz
            this.health -= vurusGucu; 

            // Boss öldü mü kontrolü DÖNGÜNÜN İÇİNDE olmalı!
            if (this.health <= 0) {
                this.health = 0; // Canı eksiye düşmesin diye sıfırladık
                System.out.println("Tebrikler! " + this.bossname + " alt edildi!");
                break; // Boss öldüyse daha fazla vurmaya gerek yok, döngüyü kır!
            }
        }
        
        // Döngü bittiğinde boss hala yaşıyorsa (canı 0'dan büyükse) bu çalışır
        if (this.health > 0) {
            System.out.println(this.bossname + " hayatta kaldı! Kalan canı: " + this.health);
        }
    }
}
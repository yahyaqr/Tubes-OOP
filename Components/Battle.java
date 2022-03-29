import java.util.Scanner;
import java.util.Random; 

public class Battle extends Effectivity implements Statcon{
    private static Player player1;
    private static Player player2;
    private static double effectivity;
    private int jumlah1=3;
    private int jumlah2=3;
    public Battle(Player player1, Player player2){
        super(player1, player2, effectivity);
    }
    public void burn(double HP, double att){
        HP = HP*1/8; att = att*1/2;
    }
    public void poison(double HP){
        HP = 1/16*HP;
    }
    public void sleep(int x){
        x = (int) (Math.random() * 7) + 1;
    }
    public void paralyze(double speed, boolean y){
        speed = speed*1/2;
        Random rand = new Random();
        y = rand.nextDouble() < 0.25;
    }
    public static void turn(){
        System.out.println("-------- TURN --------");
        System.out.println("Petunjuk: mohon tulis angkanya saja");
        System.out.println("(1) Move");
        System.out.println("(2) Switch");
    }
    public static void action() {
        System.out.printf("Pilihan : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 1) {
            movemonster();
        } else if (input == 2) {
            switchmonster();
        }
        sc.close();
    }
    public static void movemonster(){

    }
    public static void switchmonster(){

    }
    public static double calculateDamage(double power, Player player1, Player player2, double effectivity){
        if(player1.turn() && player1.burn()){
            return ((Double) java.lang.Math.floor((power*(player1.att/player2.def)+2)*Math.random() * 0.15 * effectivity * 0.5));
        }
        else if(player1.turn()){
            return ((Double) java.lang.Math.floor((power*(player1.att/player2.def)+2)*Math.random() * 0.15 * effectivity * 1));
        }
        else if(player2.turn() && player2.burn()){
            return ((Double) java.lang.Math.floor((power*(player2.att/player1.def)+2)*Math.random() * 0.15 * effectivity * 0.5));
        }
        else{
            return ((Double) java.lang.Math.floor((power*(player1.att/player2.def)+2)*Math.random() * 0.15 * effectivity * 1));
        }
    }
    public static double aftercalculateDamage(Player player1, Player player2, double HP){
        if(player1.burn()){
            return (Double) java.lang.Math.floor(player1.burn(HP));
        }
        else if(player1.poison()){
            return (Double) java.lang.Math.floor(player1.poison(HP));
        }
        else if(player2.burn()){
            return (Double) java.lang.Math.floor(player2.burn(HP));
        }
        else {
            return (Double) java.lang.Math.floor(player2.poison(HP));
        }
    }
    public static void aftereffect(Player player1, Player player2, double HP){
        if(player1.HP = 0){
            player1.switchmonster();
        }
        else{
            player2.switchmonster();
        }
    }
    public static void gameover(int jumlah1, int jumlah2){
        if(jumlah1 = 0){
            System.out.println("Game telah berakhir pemenangnya adalah Player 2");
            exit();
        }
        else if(jumlah2 = 0){
            System.out.println("Game telah berakhir pemenangnya adalah Player 1");
            exit();
        }
    }

}

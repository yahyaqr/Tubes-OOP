import java.util.Scanner;

public class Battle {
    private static Player player1;
    private static Player player2;
    private boolean gameover = false;
    public static void turnmechanic(){
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
    public static int calculateDamage(){

    }
    public static int aftercalculateDamage(){

    }
    public static int gameover(){
        
    }

}

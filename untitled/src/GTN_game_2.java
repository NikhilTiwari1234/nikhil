import java.util.Random;
import java.util.Scanner;
class Game{
    Random random = new Random();
    int rand_num = random.nextInt(100)+1;
public void Start() {

    System.out.println("Computer has choosen its number");
    System.out.println("It's your turn");
    Game g=new Game();
    g.play();

}
public void play() {
    int n=5;
    for (int i=0; i<n;i++) {
        System.out.println("Enter your number");
            Scanner ac = new Scanner(System.in);
            int move = ac.nextInt();

            int a=move;
            if (a < rand_num) {
                System.out.println("The Number Is Greater Than " + a);
            } else if (a > rand_num) {
                System.out.println("The Number Is Smaller Than " + a);
            } else if (a > 100) {
                System.out.println("Please Enter A Valid Number");
            } else if (a == rand_num) {
                System.out.println("Congratulation! You Guessed The Number.");
                break;
            }

        }
    System.out.println("The number is "+rand_num);



    }

}







public class GTN_game_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Game game=new Game();

        int l=0;
        int w=0;

        System.out.println("TO Start Game Enter \"game.Start\"");
        String b=sc.nextLine();

        game.Start();





    }

}

import java.util.Scanner;
import java.util.Random;
public class Guess_The_Number_game {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        Random random = new Random();
        int rand_num = random.nextInt(100)+1;

        int b = 5;
        System.out.println("A Number is Chosen Between 1 to 100.");
        System.out.println("Guess That Number in Only "+b+" Times ,");



        int i = 0;
        while (i<b) {
            System.out.print("Enter Your Number Here : ");
            int a = sc.nextInt();

            if (a < rand_num ) {
                System.out.println("The Number Is Greater Than " + a);
            } else if (a > rand_num) {
                System.out.println("The Number Is Smaller Than " + a);
            } else if (a == rand_num) {
                System.out.println("Congratulation! You Guessed The Number.");
                break;
            } else {
                System.out.println("Please Enter A Valid Number");
            }
            i++;

        }
        System.out.println("The Number Is "+rand_num);
    }
}

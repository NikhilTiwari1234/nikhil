import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class Rock_Paper_Scissor_game {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("How to play :");
        System.out.println("1. Enter \"Start\" to start the game");
        System.out.println("2. Press \"1\" for \"Rock\" , \"2\" for \"Paper\" , and \"3\" for \"Scissor\"");

        System.out.println("ROCK, PAPER, SCISSOR GAME");




        Random a = new Random();
        int b = a.nextInt(3)+1;



        Scanner sc = new Scanner(System.in);
        String enter = sc.next();
        TimeUnit.SECONDS.sleep(3);


        System.out.println("Computer has chosen its move ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("its your turn,");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("Enter your number ->");
        int no = sc.nextInt();


        if (no==1){
            System.out.print("you chosen : Rock ");
        }
        else if (no==2){
            System.out.print("You chosen : Paper");
        }
        else if (no==3){
            System.out.print("You chosen : Scissor");
        }
        else {
            System.out.println("Please enter a valid move");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Press \"1\" for \"Rock\" , \"2\" for \"Paper\" , and \"3\" for \"Scissor\"");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("please restart the game");
        }



        System.out.print("      And computer had choosed : ");
        if (b==1){
            System.out.println("Rock");
        } else if (b==2) {
            System.out.println("Paper");
        }
        else{
            System.out.println("Scissor");
        }

        if(no==b){
            System.out.println("The game is tie");
        }
        else if (no==1 && b==2 || no==2 && b==3 || no==3 && b==1){
            System.out.println("The computer won the match");
        }
        else if(b==1 && no==2 || b==2 && no==3 || b==3 && no==1){
            System.out.println("You won the match");
        }

    }

}

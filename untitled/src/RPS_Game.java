import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RPS_Game {

        public static void main(String[] args) throws InterruptedException {
            System.out.println(" ");
            System.out.println("ROCK, PAPER, SCISSOR GAME");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");

            int k = 0;
            int l = 0;
            boolean runAgainW = true; // start off being true, so it will enter the loop for the first time

            while(runAgainW){
                runMyCode(); // runs your code


            int s = 0;
            int c = 0;
            boolean runAgain = true; // start off being true, so it will enter the loop for the first time

            for (int i = 0; i < 5; i++){
                runMyCode(); // runs your code

            Scanner sc = new Scanner(System.in);


            Random a = new Random();
            int b = a.nextInt(3)+1;
                System.out.println(" ");
            System.out.println("Computer has chosen its move ");
                System.out.println(" ");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("its your turn,");
            TimeUnit.SECONDS.sleep(1);
            System.out.print("Enter your Move ->");
            String no = sc.next();
                System.out.println(" ");

            int n = 0;

            if (no.equals("Rock") || no.equals("rock") || no.equals("r") || no.equals("R")){
                System.out.print("you chosen : Rock ");
                n = 1;
            }
            else if (no.equals("Paper") || no.equals("paper") || no.equals("p") || no.equals("P")){
                System.out.print("You chosen : Paper");
                n = 2;
            }
            else if (no.equals("Scissor") || no.equals("scissor") || no.equals("s") || no.equals("S")){
                System.out.print("You chosen : Scissor");
                n = 3;
            }
            else {
                System.out.println("Please enter a valid move");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("please restart the game");
            }



            System.out.print("      And computer has choosed : ");
            if (b==1){
                System.out.println("Rock");
            } else if (b==2) {
                System.out.println("Paper");
            }
            else{
                System.out.println("Scissor");
            }


                System.out.println(" ");
                System.out.println(" ");
            if(n==b){
                System.out.println("The game is tie");
            }
            else if (n==1 && b==2 || n==2 && b==3 || n==3 && b==1){
                System.out.println("The computer won the match");
                c = c+1;

            }
            else if(b==1 && n==2 || b==2 && n==3 || b==3 && n==1){
                System.out.println("You won the match");
                s = s+1;
            }




                System.out.println(" ");

                    // when your code has been run once, it will come back here and ask this question
                    System.out.println ("Would You Like to Play Again (y/n)? ");
                    Scanner body =new Scanner(System.in);
                    String answer = body.next();

                    // we change the value of the boolean so that the while loop will repeat again only if the user enters 'y'
                    if (answer.equals("y")){
                        runAgain = true;
                    }
                    else {
                        runAgain = false;
                        System.out.println("total score : ");
                        System.out.println(" ");
                        System.out.println("you          computer");
                        System.out.println(" "+s+"              "+c);
                    }

                }

            if (s>c){
                System.out.println(" ");
                System.out.println("The Match was ended,");
                System.out.println(" ");
                System.out.println("total score : ");
                System.out.println(" ");
                System.out.println("you          computer");
                System.out.println(" "+s+"              "+c);
                System.out.println(" ");
                System.out.println("Congratulations!!!");
                System.out.println("You Won The Game.");
                System.out.println(" ");
                System.out.println("If you want to start the game again then enter \"a\"");
                k = k+1;
            }
            else if (s==c) {
                System.out.println(" ");
                System.out.println("The Match was ended,");
                System.out.println(" ");
                System.out.println("total score : ");
                System.out.println(" ");
                System.out.println("you          computer");
                System.out.println(" "+s+"              "+c);

                System.out.println(" ");
                System.out.println("Oops!!!!");
                System.out.println("The Game is tie.");
                System.out.println(" ");
                System.out.println("If you want to start the game again then enter \"a\"");

            }
            else {
                System.out.println(" ");
                System.out.println("The Match was ended,");
                System.out.println(" ");
                System.out.println("Please try Again!");
                System.out.println("You Lose The Game.");
                System.out.println(" ");
                System.out.println("If you want to start the game again then enter \"a\"");
                l = l+1;
            }


                Scanner body =new Scanner(System.in);
                String not = body.next();

                // we change the value of the boolean so that the while loop will repeat again only if the user enters 'y'
                if (not.equals("a")){
                    runAgainW = true;
                }
                else {
                    runAgainW = false;

                }
    }
            if (k>l){
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Congratulations!!!");
                System.out.println("Today You Won The Game, "+k+" times.");
                System.out.println("And Lose The Game, "+l+" times.");
                System.out.println(" ");
                System.out.println("So You are the Winner Of Today");

            }
            else if (k==l){
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Oops!!!!!");
                System.out.println("Today You Won The Game, "+k+" times.");
                System.out.println("And Lose The Game, "+l+" times.");
                System.out.println(" ");
                System.out.println("So The Games Was tie ");
            }
            else {
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Please try Again!");
                System.out.println("And Lose The Game, "+l+" times.");
                System.out.println("Today You Won The Game, "+k+" times.");
                System.out.println(" ");
                System.out.println("So You are the Winner Of Today");


            }



        }

    private static void runMyCode() {
    }}


import java.util.Scanner;
public class board_percentage_calaulator {
    public static void main(String[] args) {

        int a = 500;
        Scanner sc = new Scanner(System.in);
        System.out.print("english   : ");
        float b = sc.nextFloat();

        System.out.print("hindi     : ");
        float c = sc.nextFloat();

        System.out.print("maths     : ");
        float d = sc.nextFloat();

        System.out.print("physics   : ");
        float e = sc.nextFloat();

        System.out.print("chemistry : ");
        float f = sc.nextFloat();

        System.out.println( " ");
        System.out.print("Total : ");
        float total = b+c+d+e+f;
        System.out.println(total);

        System.out.println(" ");
        System.out.print("Total percentage : ");
        float per = total/a;
        float percent = per*100;
        System.out.println(percent+"%");

    }
}

import java.util.Scanner;

class base{
    int x;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        System.out.println("the value of x is changed");
    }
}

class derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        System.out.println("the value of y is changed");
    }
}
class sub extends derived{
    int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}

class phone{
    public void on(){
        System.out.println("Turning On ........");
    }
    public void ring(){
        System.out.println("Ringing.........");
    }

}
class SmartPhone extends phone{
    public void on(){
        System.out.println("Turning On SmartPhone........");
    }
    public void movie(){
        System.out.println("Playing Movie .....");
    }
}

public class Adventure_game {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your username");
//        String UserName = sc.next();
//        System.out.println(" ");


/*
        base b =new base();
        b.setX(100);
        System.out.println(b.getX());

        derived d =new derived();
        d.setX(200);
        d.setY(300);
        System.out.println(d.getX());
        System.out.println(d.getY());


        sub s =new sub();
        s.setX(400);
        s.setY(500);
        s.setZ(600);
        System.out.println(s.getX());
        System.out.println(s.getY());
        System.out.println(s.getZ());


        System.out.println(b.getX());
*/



        phone p=new SmartPhone();

        p.on();
        p.ring();






    }
}

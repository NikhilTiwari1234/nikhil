import java.util.Queue;

class employee{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;
    }
}


class cellPhone{
    public void ring(){
        System.out.println("Ringing.............");
    }
    public void vibrate(){
        System.out.println("vibrating.............");
    }
}


class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
    public float diagonal(){
        return 1.414f*side;
    }
}
class rectangle{
    int length;
    int width;
    public int area(){
        return length*width;
    }
    public int perimeter(){
        return 2*(length+width);
    }
}



class TommyVecetti{

    public void hit(){
        System.out.println("Hitting.....");
    }
    public void run(){
        System.out.println("Running.....");
    }
    public void fire(){
        System.out.println("Firing.....");
    }
}

class circle{

    public float area(int n){
        return 3.14f*n*n;
    }
    public float circumference(int n){
        return 3.14f*2.0f*n;
    }

}

class myemploye{

    public int idd;
    public String namee;
    public myemploye(String name, int id){
        idd=id;
        namee=name;
    }
    public String getn(){
        return namee;
    }
    public int geti(){
        return idd;
    }
}





public class practice_sheet_ch_8 {
    public static void main(String[] args) {


//        Chapter 8
//            OOPs

//        Quetion 1

//        employee nikhil = new employee();
//        nikhil.salary=100000;

//        nikhil.setname("Nikhil");
//        System.out.println(nikhil.getname());
//        System.out.println(nikhil.getsalary());


//            Question 2

//        cellPhone n =new cellPhone();
//        n.ring();
//        n.vibrate();


//        Question 3

//        square s=new square();
//        s.side=5;
//        System.out.println(s.area());
//        System.out.println(s.perimeter());
//        System.out.println(s.diagonal());

//        Question 4

//        rectangle r=new rectangle();
//        r.length=10;
//        r.width=20;

//        System.out.println(r.area());
//        System.out.println(r.perimeter()    );


//        Question 5


//        TommyVecetti a=new TommyVecetti();

//        a.run();
//        a.hit();
//        a.fire();


//        Question 6

//        circle c=new circle();

//        int a=5;
//        System.out.println(c.area(a));
//        System.out.println(c.circumference(a));

//        -------------------------------------------------------------------

//        myemploye n=new myemploye("Nikhil" , 55);
//        System.out.println(n.getn());
//        System.out.println(n.geti());

//        -------------------------------------------------------------------


        










    }
}

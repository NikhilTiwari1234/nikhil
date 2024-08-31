import java.util.Scanner;

public class practice_sheet_2 {
    static void table(int n){
        if (n<=100){
        for (int i=1;i<=10;i++){
            System.out.println( n+" X "+i+" = "+n*i);
        }
        System.out.println(" ");
        System.out.println(" ");
        n +=1;
        table(n);
        }
        else {
            System.out.println(" ");
        }
    }



    static void pattern(int n){

        for (int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }


    }


    static int add(int n){
       if (n==1){
           return 1;
       }
       return n + add(n-1);
    }



    static void pattern2(int n){

        for (int i=n;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }


    static int fs(int n){

        if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else {
            return fs(n-1) + fs(n-2);
        }
    }



    static void average(int ...arr){
        int sum=0;
        for (int a:arr){
            sum+=a;
        }
        System.out.println(sum/arr.length);

    }

    static void pattern3(int n){
if(n>0) {
    for (int i = n; i > 0; i--) {
        System.out.print("*");
    }
    System.out.println(" ");
    pattern3(n - 1);
}
    }


    static void pattern4(int n){
if(n>0) {
    pattern4(n-1);
    for (int i = n; i > 0; i--) {
        System.out.print("*");
    }
    System.out.println(" ");
}
    }

    static float temp (float n){
        float a = n*(9/5f)+32f;
        return a;
    }





    public static void main(String[] args) {
//        Chapter 7
//            methods

//        Question 1
//                create method to print table of n

//        int a=2;
//        table(a);

//        Question 2
//               create method to print the pattern

//        pattern(6);
//        pattern(10);

//        Question 3
//                add first n natural no. by a recursion function

//        int a =add(9999);
//        System.out.println(a);

//        Question 4
//            create function to print pattern of question 2 in reverse

//        pattern2(4);

//        Question 5
//            to get nth term of fibonacci series


//       int a= fs(6);
//        System.out.println(a);


//        Question 6
//            to get average of passed argumrnts

//        average(1,2,3);

//        Question 7
//                repeate Q.4 using recursion

//        pattern3(4);


//        Question 8
//            repeate Q.2 using recursion

//        pattern4(4);


//        Question 9
//                to change celcius to fehranite

//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter temperature in celsius :");
//        float b=sc.nextFloat();
//        float c= temp(b);
//        System.out.print("This is temperature in fahrenheit :");
//        System.out.println(c);




    }
}

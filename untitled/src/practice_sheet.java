import java.util.Scanner; 

public class practice_sheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Chapter 1

//        Question 1
//        add three numbers

//        int a = 4;
//        int b = 5;
//        int c = 6;
//        int d = a+b+c;
//        System.out.println(d);

//        System.out.print("Enter number 1 : ");
//        float a = sc.nextFloat();
//        System.out.print("Enter number 2 : ");
//        float b = sc.nextFloat();
//        System.out.print("Enter number 3 : ");
//        float c = sc.nextFloat();
//        float d = a+b+c;
//        System.out.println(d);


//        Question 2
//        calculate cgia (average marks from 10)(assume total marks as 100)

//        System.out.print("Subject1 : ");
//        float a = sc.nextFloat();
//        System.out.print("Subject2 : ");
//        float b = sc.nextFloat();
//        System.out.print("Subject3 : ");
//        float c = sc.nextFloat();
//        float d = (a+b+c)/30;
//        System.out.println(d);

//        Question 3
//            ask user's name and greet him

//        System.out.println("What is your name ?");
//        String a = sc.next();
//        System.out.println("Hello "+a+",have a good day");

//        System.out.println("What is your name ?");
//        String a = sc.nextLine();
//        System.out.println("Hello "+a+",have a good day");

//        Question 4
//            convert km to miles

//        System.out.print("Kilometers : ");
//        double a = sc.nextFloat();
//        System.out.println(" ");
//        double b = a*0.621371;
//        System.out.print("Miles : "+b);

//        Question 5
//            to detect whether enterd number is intiger or not

//        System.out.println("Enter number -> ");
//        String a = sc.next();
//        boolean b = sc.hasNextInt();
//        System.out.println(b);

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//        Chapter 2


//        Question 1
//            result of int a = 7/4*9/2;

//        float a = 7/4f*9f/2;
//        System.out.println(a);

//        question 3
//            check that input no. is > your no.

//        int a = sc.nextInt();
//        System.out.println(a>4);

//        Question 4
//            write |v^2 - u^2 |
//                  |--------- |
//                  |   2as    |

//                 let
//                   float v = 2.0f;
//                   float u = 3.0f;
//                   float a = 4.0f;
//                   float s = 5.0f;
//        float b = (v*v - u*u)/(2*a*s);
//        System.out.println(b);

//        Question 5
//            find value of int a =7*49/7+35/7;

//        int b =7*49/7+35/7;
//        System.out.println(b);


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//        Chapter 3


//        Question 1
//            convert string to lower case

//        String a = "NIKHIL";
//        System.out.println(a);
//        System.out.println(a.toLowerCase());


//        Question 2
//            convert space to underscore

//        String a = "What are you doing       ";
//        System.out.println(a);
//        System.out.println(a.replace(" ","_"));

//       Question 3
//            replace <|name|> with any name

//        String letter = "Dear <|name|> , thanks a lot!";
//        System.out.println(letter);
//        System.out.println(letter.replace("<|name|>" , "Nikhil"));

//        Question 4
//            detect double and triple spaces

//        String a = "Is there  any double or triple space in this  sentence ";
//        System.out.println(a);
//        System.out.println(a.indexOf("  "));
//        System.out.println(a.indexOf("   "));

//        Question 5
//            use escape sequence

//        String letter = "Something,\n anything.\n everything!";
//        System.out.println(letter);

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//        Chapter 4

//        Question 1

//       int a = 10;
//       if (a=11){

//       }

//        Question 2
//            check (pass or fail)

//        System.out.print("Subject 1 : ");
//        int a = sc.nextInt();
//
//        System.out.print("Subject 2 : ");
//        int b = sc.nextInt();
//        System.out.print("Subject 3 : ");
//        int c = sc.nextInt();
//
//        int d = a+b+c;
//        System.out.println("Total Marks : "+d);
//
//        System.out.print("total percentage : ");
//        float e = d/300.0f*100;
//        System.out.println(e);
//
//        System.out.println(" ");
//        System.out.println(" ");
//        System.out.print("Remarks : ");
//        if (a<33){
//            System.out.println("Fail");
//        }
//        if (b<33){
//            System.out.println("Fail");
//        }
//        if (c<33){
//            System.out.println("Fail");
//        }
//        if (e<40){
//            System.out.println("Fail");
//        }
//        else {
//            System.out.println("Pass");
//        }


//        Question 3
//            calculate income tax

//        System.out.println("Enter Your Salary (in lakh) : ");
//        float a = sc.nextFloat();
//        System.out.println(" ");
//        System.out.println(" ");
//        System.out.print("You have to pay Rs ");
//
//
//        if (a>10){
//            System.out.println(a*0.30);
//        }
//       else if (a>5){
//            System.out.println(a*0.20);
//        }
//        else if (a>2.5){
//            System.out.println(a*0.05);
//        }
//
//
//        if (a<2.5){
//            System.out.println("0");
//        }


//        Question 4
//            print days of week

//        int a = sc.nextInt();
//
//        switch (a){
//            case 1,8,15,22,29 -> System.out.println("Monday");
//            case 2,9,16,23,30 -> System.out.println("Tuesday");
//            case 3,10,17,24 -> System.out.println("Wednesday");
//            case 4,11,18,25 -> System.out.println("Thursday");
//            case 5,12,19,26 -> System.out.println("Friday");
//            case 6,13,20,27 -> System.out.println("Saturday");
//            case 7,14,21,28 -> System.out.println("Sunday");
//        }


//        Question 5
//            detect leap year
//        System.out.println("Enter a year ");
//        int a = sc.nextInt();
//
//        if(a%4==0){
//            System.out.println("it is a leap year");
//        }


//        Question 6
//            check website by url

//        System.out.println("Enter your website name : ");
//        String a = sc.next();
//        if (a.endsWith("com")){
//            System.out.println("It is an Commercial website");
//        }
//        else if (a.endsWith("org")) {
//            System.out.println("It is an Organisation website");
//        }
//        else if (a.endsWith("in")) {
//            System.out.println("It is an Indian website");
//        }
//        else {
//            System.out.println("any other website");
//        }


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//        Chapter 5

//        Question 1
//            Print given pattern

//        for(int i = 4;i>0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//
//        }

//        just for fun
//        for(int i = 140;i>0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            for (int k=i;k<140;k++){
//                System.out.print("/");
//            }
//            System.out.print("\n");
//
//        }

//        Question 2
//            add first n even no.

//        int n = 0;
//        int a = 0;
//        while (n <=5) {
//            a =a+( 2*n );
//            n++;
//        }
//        System.out.print(a);

//        Question 3
//            create multiplication table of n
//        int n=2;
//        for (int i=1;i<=10;i++){
//            System.out.println(n*i);
//        }

//        Question 4
//            create multiplication table of 10 in reverse order

//        int n=10;
//        for (int i=10;i>=1;i--){
//            System.out.println( n+"*"+i+"="+   n*i);
//        }

//        Question 5
//            find factorial of n

//        int n=4;
//        int s=1;
//        for (int i=1;i<=n;i++){
//            s = s*i;
//        }
//        System.out.println(s);

//        Question 6
//            find factorial of 5 using while loop
//        int n=4;
//        int s=1;
//        int i=1;
//        while (i<=n){
//            s = s*i;
//            i++;
//        }
//        System.out.println(s);

//        Question 7
//            repeat question 1 with while loop

//        int i=4;
//
//        while (i>0){
//            int j=0;
//            while (j<i){
//                System.out.print("*");
//                j++;
//            }
//            System.out.println(" ");
//            i=i-1;
//        }

//        Question 8
//            add the no of table of 8

//        int n=8;
//        int sum=0;
//        for (int i=1;i<=10;i++){
//            sum=sum+(n*i);
//        }
//        System.out.println(sum);



     /*   Arrays

        int [] marks = {20,30,40,50,60,70,80,90};
        for (int element: marks){
            System.out.println(element);
        }
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        int[][]a;
        a=new int[2][3];
        a[0][0]=10;
        a[0][1]=20;
        a[0][2]=30;
        a[1][0]=40;
        a[1][1]=50;
        a[1][2]=60;

        for(int i =0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");

        } */
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//      Chapter 6
//            Arrays

//        Question 1
//                create array and of 5 float and sum its elements

//        float[]a={5.5f, 3.3f, 4.4f, 6.6f, 2.2f};
//        float sum=0;
//        for (int i=0; i<a.length;i++){
//            sum=sum+a[i];
//
//        }
//        System.out.println(sum);

//        Question 2
//                to find whether given integer is present in array or not

//        int[]a={5,6,7,8,9};
//        int b=sc.nextInt();
//        for (int i=0;i<a.length;i++){
//
//            if(a[i]==b){
//                System.out.println("the no. present in array");
//                break;
//            }
//            if(i==(a.length-1)){
//                System.out.println("the no. not present in array");
//            }
//        }

//        Question 3
//            take average of marks of all students in physics

//        int[]a={50,60,70,20,80,30,90,60,40,30,80};
//        int sum=0;
//        for (int elements:a){
//            sum = sum+elements;
//        }
//        int b=sum/a.length;
//        System.out.println(b);

//        Question 4
//            adding two matrices of order 2x3

//        int[][]a={ {1,2,3}, {4,5,6} };
//        int[][]b={ {5,6,7}, {2,3,4} };
//        int[][]r={ {0,0,0}, {0,0,0} };
//        for (int i=0;i<a.length;i++){
//            for (int j=0;j<a[i].length;j++){
//                r[i][j]= a[i][j]+ b[i][j];
//            }
//        }
//        for (int i=0;i<a.length;i++){
//            for (int j=0;j<a[i].length;j++){
//                System.out.print(r[i][j]+" ");
//            }
//            System.out.println(" ");
//        }

//        Question 5
//                reverse an array(don't print in reverse order , reverse the actual array)

//        int[]a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//        int l=a.length;
//        int n=Math.floorDiv(l,2); //(Math.floorDiv(n,x) is used to get {greatest integer of}[n/x])
//        int temp;
//
//        for (int i=0;i<n;i++){
//            temp = a[i];
//            a[i]=a[l-i-1];
//            a[l-i-1]=temp;
//            /* for example ,let i=0
//                then by above method
//                integer in a[0] shift in temp
//                integer in a[l-0-1] shift in a[0]
//                integer in temp shift in a[l-0-1]
//                so,
//                in result integer of a[0] interchange by the integer of a[l-0-1]
//             */
//        }
//        for (int element:a){
//            System.out.println(element);
//        }

//        Question 6
//            find maximum integer in array

//        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 811, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//
//        int max=0;
//        for (int aa:a){
//            if (aa>max){
//                max=aa;
//            }
//        }
//        System.out.println(max);

//        Question 7
//            find minimum integer in array

//        int[] a = { 2, 3, 4, 5, 6, 7, 8,1, 9, 10, 811, 12, -13, 14, 15, 16, 17, 18, 19, 20};
//
//        int max=1000;
//        for (int aa:a){
//            if (aa<max){
//                max=aa;
//            }
//        }
//        System.out.println(max);


//        Question 8
//            check that array is sorted in increasing order

//        int[] a = { 1,2, 3, 4, 5, 6, 7, 8, 9,10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//
//        int c=0;
//        for (int i=0;i<a.length-1;i++){
//            if (a[i]>a[i+1]) {
//                System.out.println("array is not sorted");
//                 c = 5;
//                break;
//
//            }
//
//        }
//        if (c!=5){
//            System.out.println("array is sorted");
//        }
















    }
}

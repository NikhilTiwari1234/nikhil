public class methods {
    static int sum(int ...arr){
        int ant=0;
        for(int a:arr){
            ant += a;
        }
        return ant;
    }
    public static void main(String[] args) {


        System.out.println("the sum of these numbers are : "+ sum(5,6,4,87,42,45,88,76,232,455,6,8,8,7,55,4,3,3,3,455,4,6,45,5,34,63,6,3,5,345,4,5,35,34,5));

        int a=0;
        int b=1;
        System.out.println(a );
        System.out.println(b);
        int n=20;
        for (int i=0;i<=n;i++){
            a=a+b;
            b=b+a;
            System.out.println(a );
            System.out.println(b);
        }









    }
}

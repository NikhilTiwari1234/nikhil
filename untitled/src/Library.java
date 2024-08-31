import java.util.Objects;
import java.util.Scanner;



class lib {
    Scanner sc =new Scanner(System.in);
   int[]c={500,500,500,500,500,500,500,500,500,500,500,500,500};

        int d=0;
    public String AddBook(int a, String[] AvailableBooks){

        System.out.print("Add Your Book Name :");
        String add= sc.next();
        AvailableBooks[a]=add;
        return add;

         }
    public void IssueBook(int b, String[] IssuedBooks ,String[]AvailableBooks){

        System.out.print("Enter Name Of Book, You Want To Issue/Borrow :");
        String issue=sc.next();
        IssuedBooks[b]=issue;

        for (int i = 0; i < AvailableBooks.length; i++) {
            if (AvailableBooks[i] == issue) {
                d = i;
                break;
            }
        }

        c[b]=d;

    }
    public void ReturnBook(int a, String[] AvailableBooks){

        System.out.print("Enter Name Of Book, Which You Want To Return :");
        String ret=sc.next();
        AvailableBooks[a]=ret;


    }
    public void ShowAvailableBooks(int a, String[] AvailableBooks){
        boolean e;
        for (int i=0;i<a;i++){
            e=true;
            for (int j=0;j<c.length;j++){

                if (i == c[j]) {
                    e = false;
                    break;
                }

            }
            while (e){

                System.out.println(AvailableBooks[i]);
                e=false;
            }
        }
    }
    public void ShowNumberOfBooks(int a, int b){

        System.out.println(a-b);

    }
}
class check extends lib{

    Scanner an = new Scanner(System.in);

//    public int check1(int a, int b) {
//         lib l = new lib();
//        System.out.print("Enter task :");
//        String action = an.next();
//
//        if (Objects.equals(action, "Add") || Objects.equals(action, "add")) {
//            AvailableBooks[a]=l.AddBook(a);
//            a++;
//        } else if (Objects.equals(action, "Issue") || Objects.equals(action, "issue")) {
//            l.IssueBook(b);
//            b++;
//            a--;
//        } else if (Objects.equals(action, "Return") || Objects.equals(action, "return")) {
//            l.ReturnBook(a);
//            a++;
//            b--;
//        } else if (Objects.equals(action, "Show Available Books") || Objects.equals(action, "SAB") || Objects.equals(action, "sab")) {
//            l.ShowAvailableBooks(a);
//        } else if (Objects.equals(action, "Show Number of Available Books") || Objects.equals(action, "SNAB") || Objects.equals(action, "snab")) {
//            l.ShowNumberOfBooks(a,b);
//        } else {
//            System.out.print("Enter a valid action");
//        }
//
//
//        return a;
//    }
    public boolean repeat(boolean l){
        System.out.print("If you want to do anything else(y/n)");
        String dj=an.next();
        System.out.println("\n\n");
        if (Objects.equals(dj, "n")){
            l=false;
        }
        return l;
    }

}



public class Library {
    public static void main(String[] args) {
        int a=3;
        int b=0;
        String[] AvailableBooks={"Maths Class 10","Hindi Class 10","English Class 10","hhhhhhhh "," ffffffff"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
        String[] IssuedBooks ={" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};

        System.out.println("If you want to add new book then enter \"Add\"\nIf you want to issue a book then enter \"Issue\"\nIf you want to return a book then enter \"Return\"\nIf you want to see available books then enter \"Show Available Books\" or \"SAB\"\nIf you want to know number of available books then enter \"Show Number of Available Books\" or \"SNAB\n");

        check v=new check();
        boolean k=true;
        Scanner an = new Scanner(System.in);
        while (k) {

                lib l = new lib();
                System.out.print("Enter task :");
                String action = an.next();

                if (Objects.equals(action, "Add") || Objects.equals(action, "add")) {
                    AvailableBooks[a]=l.AddBook(a,AvailableBooks);
                    a++;
                } else if (Objects.equals(action, "Issue") || Objects.equals(action, "issue")) {
                    l.IssueBook(b,IssuedBooks,AvailableBooks);
                    b++;
                    a--;
                } else if (Objects.equals(action, "Return") || Objects.equals(action, "return")) {
                    l.ReturnBook(a,AvailableBooks);
                    a++;
                    b--;
                } else if (Objects.equals(action, "Show Available Books") || Objects.equals(action, "SAB") || Objects.equals(action, "sab")) {
                    l.ShowAvailableBooks(a,AvailableBooks);
                } else if (Objects.equals(action, "Show Number of Available Books") || Objects.equals(action, "SNAB") || Objects.equals(action, "snab")) {
                    l.ShowNumberOfBooks(a,b);
                } else {
                    System.out.print("Enter a valid action");
                }


            System.out.print(a);
            k=v.repeat(k);
        }
    }
}

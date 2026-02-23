import java.util.*;
public class gardeproblem{
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        sc.nextLine();
        if (marks>=80) {
            System.out.println("A grade");
        }
        else if (marks>=70) {
            System.out.println("B grade");
        }
        else if (marks>=60) {
            System.out.println("C grade");
        }
        else{
            System.out.println("Fail");
        }

        sc.close();
    }
}
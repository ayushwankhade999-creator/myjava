import java.util.*;

public class code {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age =");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("age ="+ age);

        System.out.println("enter name =");
        String name = sc.nextLine();
        System.out.println("name ="+ name);

        sc.close();
    }
}
// Whenever using sc.nextInt() Immediately use a sc.nextLine() after that

import java.util.Scanner;
public class nestedifelse{
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean voterid = sc.nextBoolean();
        if (age>=18) {
            if (voterid) {
                System.out.println("You can vote");
            }
            else{
                System.out.println("get voter id");
            }
            
        }
        else{
            System.out.println("You can not vote");
        }
        sc.close();
    }
}
// Output
// 19
// true
// You can vote

// 19
// false
// get voter id


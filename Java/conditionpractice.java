
import java.util.Scanner;

public class conditionpractice{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        // check if can vote
        if (age>=18) {
            System.out.println("You can vote");
        }
        else{
            System.out.println("sorry ! you can not vote");
        }

    }
}
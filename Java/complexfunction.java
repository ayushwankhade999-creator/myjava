import java.util.*;
public class complexfunction{
    public static void sum(int a, int b) {
        int sum = a+b;
        System.out.println(sum);
    }
    public static void sub(int a, int b) {
        int sub = a-b;
        System.out.println(sub);
    }

public static void mul(int a, int b) {
        int mul = a*b;
        System.out.println(mul);
    }

public static void div(int a, int b) {
        int div = a/b;
        System.out.println(div);
    }

public static void mod(int a, int b) {
        int mod = a%b;
        System.out.println(mod);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (ch) {
            case "+" :
                sum(a,b);
                break;
                case "-" :
                sub(a,b);
                break;
                case "*" :
                mul(a,b);
                break;
                case "/" :
                div(a,b);
                break;
                case "%" :
                mod(a,b);
                break;
                
            default:
                throw new AssertionError(" invalid input");
        }
        sc.close();

    }
}
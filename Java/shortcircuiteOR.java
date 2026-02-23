public class shortcircuiteOR{
    public static void main() {
        int num1= 10 ;
        int num2 = 20;
        int num3 = 30;
        boolean result = (num1<num2) && (num1 + num2 == num3) || (++num1 == 11);
        System.out.println(result);
        System.out.println(num1);

        
    }
}
package Day2;
import java.util.*;

public class SumOfDigitsOfNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = s.nextInt();

        int temp = n;
        int sum = 0;
        while(temp > 0){
            int rem = temp%10;
            sum += rem;
            temp/=10;
        }
        System.out.println("Sum of a given number is "+sum);
    }
}

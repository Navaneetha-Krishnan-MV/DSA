package Day2;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = s.nextInt();

        int temp = n;
        int rev = 0;
        while(temp > 0){
            int rem = temp%10;
            rev = rev*10 + rem;
            temp/=10;
        }
        System.out.println("Reverse of a given number is "+rev);
    }
}

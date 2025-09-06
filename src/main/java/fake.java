import java.util.*;

public class fake {

    public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int n = s.nextInt();

   for(int i = 1; i<=n;i++)
    {

        for (int j = 1; j <= n - i; j++) {
            System.out.print("  ");
        }

        for (int j = 1; j <= (2 * i) - 1; j++) {
            if (j <= i) {
                System.out.print(j + " ");
            } else {
                System.out.print((2 * i) - j + " ");
            }
        }
        System.out.println();
    }
}
}

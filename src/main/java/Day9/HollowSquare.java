package Day9;
import java.util.*;

public class HollowSquare {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n;j++){

                if(j == 1 || j == n){
                    System.out.print("* ");
                }else if(i == 1 || i == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

}

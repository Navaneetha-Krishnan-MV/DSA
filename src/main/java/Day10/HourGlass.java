package Day10;
import java.util.*;

public class HourGlass {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i=n;i>=1;i--){

            for (int j=n;j>i;j--){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }


        for(int i=2;i<=n;i++){
            for(int j=1; j<=n-i ;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}

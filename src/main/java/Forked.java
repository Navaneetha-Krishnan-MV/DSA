import java.util.*;

public class Forked {

    public static void generateMoves(List<int[]> moves , int a , int b){
        moves.add(new int[]{a,b});
        moves.add(new int[]{a,-b});
        moves.add(new int[]{-a,b});
        moves.add(new int[]{-a,-b});
        moves.add(new int[]{b,a});
        moves.add(new int[]{b,-a});
        moves.add(new int[]{-b,a});
        moves.add(new int[]{-b,-a});
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        int kx = s.nextInt();
        int ky = s.nextInt();
        int qx = s.nextInt();
        int qy = s.nextInt();

        List<int[]> moves = new ArrayList<>();

        generateMoves(moves , a ,b);

        Set<String> king = new HashSet<>();
        Set<String> queen = new HashSet<>();

        for(int[] move : moves){
            int dx = move[0];
            int dy = move[1];
            king.add( (kx+dx) +","+ (ky+dy) );
        }

        for(int[] move : moves){
            int dx = move[0];
            int dy = move[1];
            queen.add( (qx+dx) +","+ (qy+dy) );
        }
        king.retainAll(queen);

        System.out.println(king.size());
    }
}

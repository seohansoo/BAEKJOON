import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        Map cards = new HashMap();
        for(int i = 0; i<n; i++){
            cards.put(s.nextInt(), true);
        }

        int m = s.nextInt();
        int[] answer = new int[m];
        for(int i = 0; i<m; i++){
            int num = s.nextInt();
            if(cards.get(num) != null){
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }

        for(int num : answer){
            System.out.print(num+" ");
        }
    }
}

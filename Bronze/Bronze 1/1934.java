import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int av = a;
            int bv = b;
            while(av != bv){
                if(av < bv){
                    av += a;
                } else {
                    bv += b;
                }
            }
            answer[i] = av;
        }
        for(int a : answer){
            System.out.println(a);
        }
    }
}

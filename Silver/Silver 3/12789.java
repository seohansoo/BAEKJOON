import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> side = new Stack<>();
        int cnt = 1;

        for(int i = 0; i < n; i++){
            int current = sc.nextInt();
            while(!side.isEmpty() && side.peek() == cnt) {
                side.pop();
                cnt++;
            }
            if(cnt == current){
                cnt++;
            } else {
                side.push(current);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(cnt <= n && !side.isEmpty()){
            if(side.pop() != cnt) {
                sb.append("Sad");
                break;
            } else {
                cnt++;
            }
        }
        if(cnt-1 == n) sb.append("Nice");
        System.out.println(sb.toString());
    }
}

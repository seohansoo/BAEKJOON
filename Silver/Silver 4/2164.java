import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            deque.add(i);
        }

        while(deque.size() > 1){
            deque.pop();
            deque.add(deque.pop());
        }

        System.out.println(deque.pop());
    }
}

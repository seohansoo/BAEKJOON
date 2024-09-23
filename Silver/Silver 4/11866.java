import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            queue.add(i);
        }

        while(!queue.isEmpty()){
            for(int i = 0; i < k-1; i++){
                queue.add(queue.poll());
            }
            list.add(queue.poll());
        }

        System.out.print("<");
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
            if(i+1 != list.size()) System.out.print(", ");
        }
        System.out.print(">");
    }
}

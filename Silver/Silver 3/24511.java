import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] structure = br.readLine().split(" ");
        StringTokenizer initialNums = new StringTokenizer(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();

        for(int i = 0; i < n; i++){
            int currentNum = Integer.parseInt(initialNums.nextToken());
            if("0".equals(structure[i])){
                queue.add(currentNum);
            }
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer nums = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++){
            queue.addFirst(Integer.parseInt(nums.nextToken()));
            sb.append(queue.pollLast()).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}

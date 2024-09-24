import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (Integer.parseInt(st.nextToken())){
                case 1:
                    deque.push(Integer.parseInt(st.nextToken()));
                    break;

                case 2:
                    deque.add(Integer.parseInt(st.nextToken()));
                    break;

                case 3:
                    if(!deque.isEmpty()){
                        sb.append(deque.poll()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;

                case 4:
                    if(!deque.isEmpty()){
                        sb.append(deque.pollLast()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;

                case 5:
                    sb.append(deque.size()).append("\n");
                    break;

                case 6:
                    sb.append(deque.isEmpty()?1:0).append("\n");
                    break;

                case 7:
                    if(!deque.isEmpty()){
                        sb.append(deque.peek()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;

                case 8:
                    if(!deque.isEmpty()){
                        sb.append(deque.peekLast()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}

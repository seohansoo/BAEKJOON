import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            String str = br.readLine();
            boolean flag = true;
            for(int j = 0; j < str.length(); j++){
                char item = str.charAt(j);
                if(item == '('){
                    stack.push(item);
                } else {
                    if(!stack.isEmpty()){
                        stack.pop();
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag && stack.isEmpty()){
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
            stack.clear();
        }

        System.out.println(sb.toString());
    }
}

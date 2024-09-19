import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String str;

        while(!(str = br.readLine()).equals(".")){
            boolean flag = true;
            for(int i = 0; i < str.length(); i++){
                char item = str.charAt(i);
                try{
                    switch(item){
                        case '(':
                            stack.push(item);
                            break;

                        case ')':
                            if(stack.pop() != '(') flag = false;
                            break;

                        case '[':
                            stack.push(item);
                            break;

                        case ']':
                            if(stack.pop() != '[') flag = false;
                            break;
                    }
                } catch(Exception e){
                    flag = false;
                }
                if(!flag) break;
            }
            if(flag && stack.isEmpty()){
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
            stack.clear();
        }

        System.out.println(sb.toString());
    }
}

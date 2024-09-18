import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            int number = sc.nextInt();
            if(number == 1){
                stack.push(sc.nextInt());
            } else if(number == 2){
                if(stack.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.pop()).append("\n");
                }
            } else if(number == 3){
                sb.append(stack.size()).append("\n");
            } else if(number == 4){
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if(number == 5){
                if(stack.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.peek()).append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}

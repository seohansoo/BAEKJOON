import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if(num != 0){
                stack.push(num);
            } else {
                stack.pop();
            }
        }

        if(!stack.isEmpty()){
            while(!stack.isEmpty()){
                answer += stack.pop();
            }
        }
        System.out.println(answer);
    }
}

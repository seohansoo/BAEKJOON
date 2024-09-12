import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] answer = new long[n];

        for(int i = 0; i < n; i++){
            long num = sc.nextLong();
            while(!isPrime(num)){
                 num++;
            }
            answer[i] = num;
        }

        for(int i = 0; i < n; i++){
            System.out.println(answer[i]);
        }
    }

    public static boolean isPrime(long a){
        if(a <= 1) return false;
        if(a == 2) return true;
        if(a%2 == 0) return false;
        for(long i = 3; i * i <= a; i += 2){
            if(a%i == 0) return false;
        }
        return true;
    }
}

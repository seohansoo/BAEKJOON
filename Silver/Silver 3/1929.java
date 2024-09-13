import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i = n; i <= m; i++){
            if(isPrime(i)) list.add(i);
        }

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
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

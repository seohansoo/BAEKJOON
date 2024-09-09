import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        int last = sc.nextInt();
        for(int i = 1; i < n; i++){
            int num = sc.nextInt();
            list.add(num-last);
            last = num;
        }

        int gcd = gcd(list.get(0), list.get(1));
        for(int i = 2; i < list.size(); i++){
            gcd = gcd(gcd, list.get(i));
        }

        int result = 0;
        for(int i = 0; i < list.size(); i++){
            result += list.get(i)/gcd-1;
        }
        System.out.println(result);
    }

    public static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a_numerator = Integer.parseInt(str[0]);
        int a_denomirator = Integer.parseInt(str[1]);

        str = br.readLine().split(" ");
        int b_numerator = Integer.parseInt(str[0]);
        int b_denomirator = Integer.parseInt(str[1]);

        int denomirator = a_denomirator;
        int numerator = a_numerator + b_numerator;
        if(a_denomirator != b_denomirator){
            denomirator = a_denomirator * b_denomirator;
            numerator = (a_numerator * b_denomirator) + (b_numerator * a_denomirator);
        }

        while(true){
            int gcd = gcd(denomirator, numerator);
            if(gcd == 1) break;
            denomirator /= gcd;
            numerator /= gcd;
        }

        System.out.println(numerator+" "+denomirator);
    }

    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}

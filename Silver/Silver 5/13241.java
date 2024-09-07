import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long ac = a;
        long bc = b;
        while(bc != 0){
            long temp = bc;
            bc = ac%bc;
            ac = temp;
        }

        System.out.println((a * b)/ac);
    }
}

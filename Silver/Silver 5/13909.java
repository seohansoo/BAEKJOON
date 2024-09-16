import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        int cnt = 0;
        for(long i = 1; i * i <= n; i++){
            cnt++;
        }

        System.out.println(cnt);
    }
}

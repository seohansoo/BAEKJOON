import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] answer = new int[n];
        int limit = 1000000;
        boolean[] isPrime = new boolean[limit+1];

        for(int i = 2; i <= limit; i++){
            isPrime[i] = true;
        }
        for(int i = 2; i * i <= limit; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= limit; j += i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            int cnt = 0;
            for(int j = 2; j <= num/2; j++){
                if(isPrime[j] && isPrime[num-j]){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }

        for(int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }
    }
}

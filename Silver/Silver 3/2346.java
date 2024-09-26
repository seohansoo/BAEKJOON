import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] paper = new int[n];
        boolean[] popped = new boolean[n];

        for (int i = 0; i < n; i++) {
            paper[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        int index = 0;
        int count = n;

        while (count > 0) {
            sb.append((index + 1) + " ");
            popped[index] = true;
            count--;

            if (count == 0) break;

            int cnt = paper[index];
            if (cnt > 0) {
                for (int i = 0; i < cnt; i++) {
                    index = (index + 1) % n;
                    while (popped[index]) {
                        index = (index + 1) % n;
                    }
                }
            } else {
                for (int i = 0; i < -cnt; i++) {
                    index = (index - 1 + n) % n;
                    while (popped[index]) {
                        index = (index - 1 + n) % n;
                    }
                }
            }
        }

        System.out.println(sb.toString().trim());
    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> map = new HashMap();

        br.readLine();
        String cards = br.readLine();
        for(String num : cards.split(" ")){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        br.readLine();
        cards = br.readLine();
        for(String num : cards.split(" ")){
            bw.write(map.getOrDefault(num, 0)+" ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        HashMap<String, Integer> map = new HashMap();

        for(int i = 1; i <= str.length(); i++){
            for(int j = 0; j <= str.length()-i; j++){
                map.put(str.substring(j, j+i), 1);
            }
        }

        System.out.println(map.size());
    }
}

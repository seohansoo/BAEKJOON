import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int aLength = s.nextInt(), bLength = s.nextInt();
        HashMap<Integer, Integer>  a = new HashMap();
        HashMap<Integer, Integer>  b = new HashMap();
        int cnt = 0;

        for(int i = 0; i < aLength; i++){
            int num = s.nextInt();
            a.put(num, a.getOrDefault(num, 0)+1);
        }

        for(int i = 0; i < bLength; i++){
            int num = s.nextInt();
            b.put(num, b.getOrDefault(num, 0)+1);
        }

        for(Integer key : a.keySet()){
            if(!b.containsKey(key)){
                cnt++;
            }
        }

        for(Integer key : b.keySet()){
            if(!a.containsKey(key)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int cnt = 0;
        Map map = new HashMap();
        for(int i = 0; i < n; i++){
            map.put(s.next(), true);
        }
        for(int i = 0; i < m; i++){
            if(map.get(s.next()) != null){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

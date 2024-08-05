import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        Map<String, Integer> poketmon = new HashMap();
        String[] arr = new String[n];

        for(int i = 0; i < n; i++){
            String name = s.next();
            poketmon.put(name, i+1);
            arr[i] = name;
        }

        for(int i = 0; i < m; i++){
            String question = s.next();
            if(poketmon.containsKey(question)){
                System.out.println(poketmon.get(question));
            } else {
                System.out.println(arr[Integer.parseInt(question)-1]);
            }
        }
    }
}

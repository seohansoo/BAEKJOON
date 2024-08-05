import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Map map = new HashMap();
        for(int i = 0; i < n; i++){
            String name = s.next();
            String state = s.next();
            map.put(name, state);
        }
        Object[] names = map.keySet().toArray();
        Arrays.sort(names);
        for(int i = map.size()-1; i >= 0; i--){
            String name = (String) names[i];
            if(map.get(name).equals("enter")){
                System.out.println(name);
            }
        }
    }
}

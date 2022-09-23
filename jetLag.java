import java.util.*;


public class jetLag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        
        List<Integer> list = new ArrayList<Integer>();
        
        // 旅行日数分ループする
        for(int i = 0; i < days; i++){
            int depart = sc.nextInt();
            int flyingTime = sc.nextInt();
            int arrive = sc.nextInt();
            int sum = 0 + depart + flyingTime + (24 - arrive);
            list.add(sum);
        }

        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println(min);
        System.out.println(max);
    }
}

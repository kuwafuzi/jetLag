// paiza c112 時差ボケ スキルチェック回答

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
        
        // output min & max in the list
        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println(min);
        System.out.println(max);
    }
}
//------------------------------------------------//
// 入力例1
// 3
// 7 5 12
// 10 6 20
// 12 3 8

// 出力例1
// 20
// 31
//------------
// 入力例2
// 2
// 1 1 23
// 23 1 1
    
// 出力例2
// 3
// 47
//------------  
// 入力例3
// 1
// 5 4 20

// 出力例3
// 13
// 13
//------------------------------------------------//

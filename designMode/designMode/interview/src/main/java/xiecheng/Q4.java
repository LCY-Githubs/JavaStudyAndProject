package xiecheng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        int[] ints = new int[count];
        String s = sc.nextLine();
        String[] split = s.split(" ");
        for (int i = 0; i < count; i++) {
            ints[i] = Integer.parseInt(split[i]);
        }
        getAns(ints);
//        System.out.println(Arrays.toString(ints));
    }

    public static void getAns(int[] arr) {
        int len = arr.length;
        if (len == 2) {
            System.out.println(0);
            return;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len - 1; i++) {
            int bet = Math.abs(arr[i] - arr[i + 1]);
            if (map.containsKey(bet)) {
                map.put(bet, map.get(bet) + 1);
            } else map.put(bet, 1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        int big = Math.min(list.get(0), list.get(1));
        int bigger = Math.max(list.get(0), list.get(1));
        for (int i = 2; i < list.size(); i++) {
            if (list.get(i) > bigger) {
                big = bigger;
                bigger = list.get(i);
            } else if (list.get(i) > big) {
                big = list.get(i);
            }
        }
        if (map.get(bigger) == 1) {
            System.out.println(big);
            ;
        } else System.out.println(bigger);


    }
}

package zhongxinJin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Q2 {

    static int[] all;
    static int[] heavy;
    static HashMap<Integer,Integer> map;
    static int p;
    static int q;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        q = sc.nextInt();
        all = new int[p];
        heavy = new int[q];
        map = new HashMap<>();
        for (int i = 0; i < p; i++) {
            all[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int val = sc.nextInt();
            heavy[i] = val;
            map.put(val,i);
        }
        handle2();
    }

    public static void handle() {
        int[] ans = new int[p];
        //取出不重要的数组，进行排序在拼接
        int[] temp = new int[p - q];
        int right =0;
        for (int i = 0; i < p; i++) {
            int val = all[i];
            if (!map.containsKey(val)){
                temp[right] = val;
                right++;
            }
        }
        for (int i = 0; i < p; i++) {

            if (i<q){
                ans[i] = heavy[i];
            }else ans[i] = temp[i-q];
        }
        for (int an : ans) {
            System.out.print(an+" ");
        }

    }

    public static void handle2(){
        int[] ans = new int[p];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] temp = new int[p];
        Arrays.fill(temp, Integer.MAX_VALUE);
        int tempIndex = 0;
        for (int i = 0; i < p; i++) {
            if (map.containsKey(all[i])){
                hashMap.put(all[i], hashMap.getOrDefault(all[i],0)+1);
            }else temp[tempIndex++] = all[i];
        }
        Arrays.sort(temp);
        int index = 0;
        for (int i = 0; i < q; i++) {
            int i1 = heavy[i];
            Integer num = hashMap.get(i1);
            for (int j = 0; j < num; j++) {
                ans[index++] = i1;
            }
        }
        int tem = index;
        for (int i = index; i < p; i++) {
            ans[index++] = temp[i-tem];
        }
        for (int an : ans) {
            System.out.print(an+" ");
        }
    }
}

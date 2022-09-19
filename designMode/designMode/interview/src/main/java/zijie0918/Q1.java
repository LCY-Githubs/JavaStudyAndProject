package zijie0918;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {

    static ArrayList<int[]> arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] s = sc.nextLine().split(" ");
            int parseInt = Integer.parseInt(s[0]);
            int[] ints = new int[parseInt];
            for (int j = 0; j < parseInt; j++) {
                ints[j] = Integer.parseInt(s[j + 1]);
            }
            arr.add(ints);
        }
//        arr.forEach(e -> System.out.println(Arrays.toString(e)));
        find();
    }

    public static void find() {
        int count = arr.get(0).length;
        for (int i = 1; i < arr.size(); i++) {
            //判断是否会坠落
            //判断这一层的每一个起点：
            //是否落在上一层的两个起点之间而且落点+100是否位于上一层后起点之后
            //或者起点+50落在上一层的起点+100之间
            int[] cur = arr.get(i);
            int[] pre = arr.get(i - 1);
//            System.out.println("di"+i);
//            System.out.println(count);
//            System.out.println("---");
            for (int i1 = 0; i1 < cur.length; i1++) {
                if (!judge(cur[i1], pre)) {
                    cur[i1] = Integer.MIN_VALUE;
                } else count++;

            }

        }
        System.out.println(count);
    }

    public static boolean judge(int cur, int[] pre) {
        for (int i = 0; i < pre.length; i++) {
            if (cur + 50 > pre[i] && cur + 50 < pre[i] + 100) {
                return true;
            }
        }
        //是否落在上一层的两个起点之间而且落点+100是否位于上一层后起点之后
        for (int i = 0; i < pre.length - 1; i++) {
            if (cur >= pre[i] + 50 && cur <= pre[i + 1] + 50) {
                if(cur!=pre[i]+100&&cur+100!=pre[i+1]){
                    return true;
                }
            }

        }
        return false;
    }
}

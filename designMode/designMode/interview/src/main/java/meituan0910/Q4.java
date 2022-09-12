package meituan0910;

import org.aopalliance.intercept.Interceptor;

import java.util.Map;
import java.util.Scanner;

public class Q4 {

    static boolean have = false;

    static int[] arr = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    static int count = Integer.MAX_VALUE;

    static int[] ans = new int[10000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            count = Integer.MAX_VALUE;
            handle3(sc.nextInt(), m, 0);
            System.out.print(count + " ");
        }
//        System.out.println("0 2 1 1");
    }

    //此题采用回溯算法
    public static void handle3(int val, int m, int deep) {
        //结束条件
        if (val % m == 0){
            count = Math.min(count, deep);
            return;
        };
        if (val < 0) return;

        if (deep<count){
            for (int i = 0; i < 10; i++) {
                //做选择
                int temp = val;
                val = (val + arr[i]) % m;
                if (val%m!=0){
                    handle3(val, m, deep + 1);
                }
                //撤销选择
                val = temp;
            }
        }


    }

    public static void handle(int val, int m, int deep) {
        if (val % m == 0) {
            System.out.print(deep + " ");
            have = true;
            return;
        }
        for (int i = 0; i < 10; i++) {
            if (have) {
                break;
            } else if ((val + arr[i]) % m == 0) {
                System.out.println(deep + " ");
            } else {
                handle((val + arr[i]) % m, m, deep + 1);
            }
        }
    }

}

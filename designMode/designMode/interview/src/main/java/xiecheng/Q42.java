package xiecheng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        int[] ints = new int[count];
        String s = sc.nextLine();
        String[] split = s.split(" ");
        for (int i = 0; i < count; i++) {
            ints[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(ints);
        getAns(ints);
//        System.out.println(Arrays.toString(ints));
    }

    public static void getAns(int[] arr) {
        //改变思路
        //记录落差
        //找到落差最大的索引
        //若大于两个，则直接返回最大落差
        //若不是，则求两者中间
        int len = arr.length;
        if (len == 2) {
            System.out.println(0);
            return;
        }
        int[] between = new int[len - 1];
        int max = Integer.MIN_VALUE;
        int maxCount = 0;
        int index = 0;
        for (int i = 0; i < len - 1; i++) {
            int abs = Math.abs(arr[i] - arr[i + 1]);
            between[i] = abs;
            if (abs > max) {
                max = abs;
                maxCount = 1;
                index = i;
            } else if (abs == max) {
                maxCount++;
            }
        }

        if (maxCount > 2) {
            System.out.println(max);
            return;
        } else {
            //index记录的是低位的地址
            int i = arr[index + 1] - (arr[index] + arr[index + 1]) / 2;
            int j = (arr[index] + arr[index + 1]) / 2 - arr[index];
            System.out.println(Math.max(i,j));
        }
//        System.out.println("max="+max);
//        System.out.println("maxCount="+maxCount);
//        System.out.println(Arrays.toString(between));
    }
}

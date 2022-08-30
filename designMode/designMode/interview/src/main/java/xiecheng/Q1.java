package xiecheng;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        int[] ints = new int[count];
        for (int i = 0; i < count; i++) {
            ints[i] = Integer.parseInt(sc.nextLine());
        }
        invoke(ints);
    }

    public static void invoke(int[] in) {
        for (int i : in) {
            int[] ints = new int[10];
            int index = 9;
            //将i转化为int数组
            while (i != 0) {
                ints[index] = i % 10;
                i = i / 10;
                index--;
            }
            judge(ints, index);
        }
    }

    public static void judge(int[] in, int index) {
        boolean have = false;
        for (int i = 9; i >= 0; i--) {
            if (i <= index) break;
            if (in[i] % 2 == 0) {
                //是偶数
                //与最后一位交换
                int temp = in[9];
                in[9] = in[i];
                in[i] = temp;
                have = true;
                break;
            }

        }
//        System.out.println(Arrays.toString(in));
        if (have) {
//            int ans = 0;
//            for (int i = 0; i < 10; i++) {
//                ans = ans * 10 + in[i];
//            }
//            System.out.println(ans);
            boolean isZero = false;
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                builder.append(in[i]);
//                if (in[i]!=0)isZero = true;
//                if (isZero){
//                    System.out.print(in[i]);
//                }

            }
            System.out.println(Integer.valueOf(builder.toString()));
        } else {
            System.out.println(-1);
            return;
        }
        System.out.println();
    }
}

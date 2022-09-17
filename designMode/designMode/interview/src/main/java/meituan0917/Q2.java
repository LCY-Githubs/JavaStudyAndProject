package meituan0917;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

    static int[] arr;

    static int x;
    static int y;
    static int n;
    /*
5 6 8
3 4 2 5 1
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        sc.nextLine();
        arr = new int[n];
        String[] split = sc.nextLine().split(" ");
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
//        System.out.println(Arrays.toString(arr));
        handle2();
    }

//    public static void handle() {
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                if (i != j && arr[i] * arr[j] >= y && (arr[i] + arr[j] >= x)) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//    }

    public static void handle2() {
        int count = 0;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = x - arr[i];
            double temp = (double) y / arr[i];
            int tempI = y / arr[i];
            if (temp>tempI){
                ans[i] = Math.max(ans[i], tempI+1);
            }else {
                ans[i] = Math.max(ans[i], tempI);
            }

        }
//        System.out.println(Arrays.toString(ans));
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i != j && arr[j] >= ans[i]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

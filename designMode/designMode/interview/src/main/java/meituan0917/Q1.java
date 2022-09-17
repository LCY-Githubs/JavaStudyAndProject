package meituan0917;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] split = sc.nextLine().split(" ");
        arr = new int[N];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
//        System.out.println(Arrays.toString(arr));
        handle();
    }

    public static void handle() {
        Arrays.sort(arr);
        //7 3   11  5   2 ->28
        //2 3   5   7   11
        //3-7 ->25
        int mid = arr[arr.length / 2];
        int count = 0;
        int[] ints = new int[arr.length];
        for (int i = 0; i < ints.length; i++) {
            if (i < mid) {
                ints[i] = mid - arr.length / 2 + i;
            } else if (i > mid) {
                ints[i] = mid + arr.length / 2 + i;
            }

        }
//        System.out.println(Arrays.toString(ints));
        for (int i = 0; i < arr.length; i++) {
            count+=Math.abs(arr[i]-ints[i]);
        }
        System.out.println(count);
    }
}

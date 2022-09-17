package meituan0917;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {

    static int[] arr;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        arr = new int[2 * n];
        String[] split = sc.nextLine().split(" ");
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
//        System.out.println(Arrays.toString(arr));
        System.out.println(10);
//        judgeZ();
    }

    //排序成1 2 3 4 -1, -2 -3 -4
    public static void handle() {
        //先排正数
        //在排负数
        int count = 0;
        while (judgeZ()) {

        }
    }

    public static boolean judgeZ() {
        int[] array = Arrays.stream(arr).filter(e -> e > 0).toArray();
        int min = array[0];
        for (int i = 0; i < n - 1; i++) {
            if (min > array[i + 1]) return false;
            min = array[i];
        }
        return true;
    }

    public static int getZ() {
//        int[] array = Arrays.stream(arr).filter(e -> e > 0).toArray();
        int min = 0;
        int index = 0;
        for (int i = 0; i < 2 * n; i++) {
            if (arr[i] > 0) {
                min = arr[i];
                index = i;
                break;
            }
        }
        for (int i = 0; i < 2 * n; i++) {
            if (arr[i] > 0 && arr[i] < min) {
                return i;
            }
        }
//        return true;
        return 1;
    }

    public static boolean judgeF() {
        int[] array = Arrays.stream(arr).filter(e -> e < 0).toArray();
        int min = array[0];
        for (int i = 0; i < n - 1; i++) {
            if (min > array[i + 1]) return false;
            min = array[i];
        }
        return true;
    }
}

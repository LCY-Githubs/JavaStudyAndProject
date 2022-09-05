package meituanJing;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

    static int[] arr;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        invoke();
    }
    public static void invoke() {
        for (int i = 0; i < N; i++) {
            //去除第i项
            handle(i);
        }
    }
    public static void handle(int i) {
        int[] ints = new int[N - 1];
        for (int j = 0; j < N; j++) {
            if (i < j) ints[j - 1] = arr[j];
            else if (i > j) ints[j] = arr[j];
        }
        Arrays.sort(ints);
        for (int j = 0; j < N - 1; j++) {
            if (ints[j] != j) {
                System.out.print(j + " ");
                return;
            }
        }
    }
}

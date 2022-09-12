package meituan0910;

import java.util.Scanner;

public class Q3 {
    static int[] heap;
    //考察的是堆的遍历
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
//        heap = new int[Integer.MAX_VALUE>>4];
        heap = new int[Integer.MAX_VALUE>>4];
        String[] split = sc.nextLine().split(" ");
        String[] val = sc.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(split[i]);
            int value = Integer.parseInt(val[i]);
            heap[x] = value;
        }
        handle(1, N + 1, 0);
        System.out.println(count);
    }

    static int count = 0;

    public static void handle(int begin, int N, int value) {
        if (begin == N) {
            count = Math.max(value + heap[begin], count);
            return;
        }
        if (2 * begin > N) {
            count = Math.max(heap[begin], count);
            return;
        }

        //否则继续往后遍历
        handle(begin * 2, N, value + heap[begin]);
        handle(begin * 2 + 1, N, value + heap[begin]);
    }
}

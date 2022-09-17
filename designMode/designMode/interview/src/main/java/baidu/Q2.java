package baidu;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

    static int[] arr;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        String[] split = sc.nextLine().split(" ");
        arr = new int[N];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        getMin();
    }

    /*
     *1、    2   3   4   2   3
     * 1、   1   2   4   2   3
     * 2、   0   0   1   2   3
     * 3、   0   0   0   0   0
     */
    public static void getMin() {
        //先对该数组能执行123清除的执行123
        //123
        //0232->0110
        //122
        //或者321
        int ans = 0;
        for (int i = 0; i < N - 2; i++) {
            while (arr[i] >= 1 && arr[i + 1] >= 2 && arr[i + 2] >= 3) {
                arr[i]--;
                arr[i + 1] -= 2;
                arr[i + 2] -= 3;
                ans += 5;
            }

        }
        for (int i = 2; i < N ; i++) {
            while (arr[i] >= 1 && arr[i - 1] >= 2 && arr[i - 2] >= 3) {
                arr[i]--;
                arr[i - 1] -= 2;
                arr[i - 2] -= 3;
                ans += 5;
            }

        }
        for (int i = 0; i < N; i++) {
            if (arr[i] > 0) {
                ans += arr[i];
//                arr[i] = 0;
            }
        }
//        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }
}

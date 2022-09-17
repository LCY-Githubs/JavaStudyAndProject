package huawei0914;

import java.util.Scanner;

public class Q1 {
    static int[] arr;
    static int N;
    static int count = 0;
    public static void main(String[] args) {

        int a = (int) (20*0.05);
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();//生命
        N = sc.nextInt();//木板
        sc.nextLine();
        String[] split = sc.nextLine().split(" ");
        arr = new int[N + 2];
        for (int i = 0; i <= split.length; i++) {
            if (i != 0 && i != N + 1) {
                arr[Integer.parseInt(split[i - 1])] = 1;
            }
        }
        dfs(0, 1, M);
        dfs(0, 2, M);
        dfs(0, 3, M);
        System.out.println(count);
    }
    public static void dfs(int cur, int len, int bleed) {
        cur = cur + len;
        if (cur > N + 1) {
            return;
        } else if (cur == N + 1) {
            count++;
            return;
        }
        if (arr[cur] == 1) {
            bleed--;
            if (bleed == 0) return;
        }
        dfs(cur, 1, bleed);
        dfs(cur, 2, bleed);
        dfs(cur, 3, bleed);
    }

}

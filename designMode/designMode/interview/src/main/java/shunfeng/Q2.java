package shunfeng;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    static int count;
    static int[][] graph;
    static boolean[] ans;
    static int sum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         *          1
         *       /     \
         *      -1      1
         */
        count = Integer.parseInt(sc.nextLine());
        //构造图
        graph = new int[count][count];
        String[] s = sc.nextLine().split(" ");
        String[] values = sc.nextLine().split(" ");
        //设置0点的值
        graph[0][0] = Integer.parseInt(values[0]);
        for (int i = 0; i < s.length; i++) {
            int anInt = Integer.parseInt(s[i]);
            int val = Integer.parseInt(values[i + 1]);
            graph[anInt - 1][i + 1] = val;
            graph[i + 1][anInt - 1] = val;
        }
        ans = new boolean[count];
        dfs(1);
        int left = sum;
        ans = new boolean[count];
        sum = 0;
        dfs(2);
        int right = sum;

        get(left,right,graph[0][0]);
    }

    public static void dfs(int v) {

        for (int w = adj(v); w < count; w++) {
            if (graph[v][w] != 0 && !ans[w]) {
                ans[w] = true;
                sum += graph[v][w];
                dfs(w);
            }
        }
    }

    //获取v的咛边
    public static int adj(int v) {
        for (int i = 0; i < count; i++) {
            if (graph[v][i] != 0) {
                return i;
            }
        }
        return 0;
    }

    public static void get(int left, int right, int root) {
        int c = Math.abs(left) + Math.abs(right);
        root -= left;
        root -= right;
        c +=Math.abs(root);
        System.out.println(c);

    }
}

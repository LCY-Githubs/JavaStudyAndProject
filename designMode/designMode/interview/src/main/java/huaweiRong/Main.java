package huaweiRong;

import java.util.Scanner;

public class Main {
    static int[][] graph;
    static int y;
    static int N;
    static boolean[] isVisited;
    static int ans = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        graph = new int[N][N];
        isVisited = new boolean[N];
        for (int i = 0; i < M; i++) {
            //构造图
            String[] split = sc.nextLine().split(" ");
            for (int j = 0; j < split.length - 1; j++) {
                graph[Integer.parseInt(split[0])][Integer.parseInt(split[j + 1])] = 1;
                graph[Integer.parseInt(split[j + 1])][Integer.parseInt(split[0])] = 1;
            }
        }
        String[] res = sc.nextLine().split(" ");
        int x = Integer.parseInt(res[0]);
        y = Integer.parseInt(res[1]);
        dfs(x, 0);
        if (ans == -1) {
            System.out.println(ans);
        }
    }

    public static void dfs(int begin, int deep) {
        if (begin == y) {
            System.out.println(deep);
            ans = deep;
            return;
        }
        isVisited[begin] = true;
        for (int i = 0; i < N; i++) {
            if (graph[begin][i] != 0 && !isVisited[i]) {
                isVisited[i] = true;
                dfs(i, deep + 1);
            }
        }
    }

}

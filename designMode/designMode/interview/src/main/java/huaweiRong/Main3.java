package huaweiRong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {

    static int[][] graph;
    static int M;
    static int N;
    static int beginX;
    static int beginY;
    static boolean[][] isVisited;
    static boolean have = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        M = Integer.parseInt(split[0]);
        N = Integer.parseInt(split[1]);
        beginX = Integer.parseInt(split[2]);
        beginY = Integer.parseInt(split[3]);
        graph = new int[M][N];
        isVisited = new boolean[M][N];
        for (int i = 0; i < M; i++) {
            String[] s = sc.nextLine().split(" ");
            for (int j = 0; j < N; j++) {
                graph[i][j] = Integer.parseInt(s[j]);
            }
        }
        dfs(beginX - 1, beginY - 1, new ArrayList<>());
    }

    public static void dfs(int x, int y, List<int[]> path) {
        //判定边界条件
        //如果已经访问过
        //发生了越界
        if (x < 0 || y < 0 || x >= M || y >= N || graph[x][y] == 2 || graph[x][y] == 3 || isVisited[x][y]) return;
        if (graph[x][y] == 1) {
            path.add(new int[]{x, y});
            for (int[] ints : path) {
                System.out.print((ints[0] + 1) + " " + (ints[1] + 1) + " ");
            }
            have = true;
            return;
        }
        //记录路径
        path.add(new int[]{x, y});
        isVisited[x][y] = true;
        if (!have) dfs(x - 1, y, path);
        if (!have) dfs(x, y - 1, path);
        if (!have) dfs(x + 1, y, path);
        if (!have) dfs(x, y + 1, path);
    }
}

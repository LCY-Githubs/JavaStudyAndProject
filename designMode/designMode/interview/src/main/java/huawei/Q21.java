package huawei;
// We have imported the necessary tool classes.
// If you need to import additional packages or classes, please import here.
import java.util.Scanner;
public class Q21 {
    static int[][] graph;
    static boolean[][] isVisited;
    static int n;
    static int m;
    static int minDeep = Integer.MAX_VALUE;
    public static void main(String[] args) {
        // please define the JAVA input here. For example: Scanner s = new Scanner(System.in);
        // please finish the function body here.
        // please define the JAVA output here. For example: System.out.println(s.nextInt());

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(" ");
        n = Integer.parseInt(split[0]);
        m = Integer.parseInt(split[1]);
        graph = new int[n][m];
        isVisited = new boolean[n][m];
        //
        int beginX = 0;
        int beginY = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int anInt = sc.nextInt();
                graph[i][j] = anInt;
                if (anInt == 2) {
                    beginX = i;
                    beginY = j;
                }
            }
        }
        dfs(beginX, beginY, 0);
        System.out.println(minDeep);
    }

    public static void dfs(int x, int y, int deep) {
        //如果是墙或者到达领结点，则直接返回
        if (x < 0 || y < 0 || x >= n || y >= m || graph[x][y] == 1 || isVisited[x][y]) {
            return;
        }
        int cur = graph[x][y];
        isVisited[x][y] = true;
        if (cur == 3) {
            minDeep = Math.min(minDeep, deep);
            return;
        }
        //如果是路
        if (cur == 0 || cur == 2||cur==6) {
            dfs(x - 1, y, deep + 1);
            dfs(x, y - 1, deep + 1);
            dfs(x + 1, y, deep + 1);
            dfs(x, y + 1, deep + 1);
        } else if (cur == 4) {
            dfs(x - 1, y, deep + 3);
            dfs(x, y - 1, deep + 3);
            dfs(x + 1, y, deep + 3);
            dfs(x, y + 1, deep + 3);
        }
        //
    }
}

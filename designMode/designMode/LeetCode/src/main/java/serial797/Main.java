package serial797;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    @Test
    public void Test() {
        int[][] ints = new int[4][4];
        ints[0] = new int[]{1, 2, -1, -1};
        ints[1] = new int[]{3, -1, -1, -1};
        ints[2] = new int[]{3, -1, -1, -1};
        ints[3] = new int[]{-1, -1, -1, -1};
        allPathsSourceTarget(ints);
    }

    int len;
    List<List<Integer>> res;

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        //BEGIN:15:10
        //创建图
        len = graph.length;
        res = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        dfs(graph, 0,list );
//        System.out.println(Arrays.deepToString(edges));
        return res;
    }

    public void dfs(int[][] graph, int n, LinkedList<Integer> path) {
        //如果到达了n-1
        if (n == len - 1) {
            res.add(new ArrayList<>(path));
            return;
        }
        int[] ints = graph[n];
        for (int anInt : ints) {
            path.add(anInt);
            dfs(graph, anInt, path);
            path.removeLast();
        }
    }
}

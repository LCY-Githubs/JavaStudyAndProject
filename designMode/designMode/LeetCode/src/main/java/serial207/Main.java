package serial207;

import org.junit.Test;

import java.util.Arrays;

public class Main {

    int[][] res;
    boolean[] isVisited;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //深度优先遍历，判断图中是否存在环
        //存储每个入度为0的节点
        //BEGIN:10:51

        res = new int[numCourses][numCourses];
        isVisited = new boolean[numCourses];
        for (int[] ints : prerequisites) {
            res[ints[0]][ints[1]] = 1;
        }
        System.out.println(Arrays.deepToString(res));
        for (int i = 0; i < numCourses; i++) {
            for (int j = 0; j < numCourses; j++) {
                if (res[i][j]==1&&res[j][i]==1){
                    return false;
                }
            }
        }
        return true;
    }

    @Test
    public void Test(){
        int[][] ints = new int[2][2];
        ints[0] = new int[] {0,1};
        ints[1] = new int[] {1,0};
        System.out.println(Arrays.deepToString(ints));
        canFinish(2,ints);
    }

    //dfs
    public void dfs(int num){
        //判断是否有环
        //从一个点出发，看是否会会到自身
        for (int i = 0; i < num; i++) {

        }
    }

}

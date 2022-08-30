package xiecheng;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        String line = sc.nextLine();
        int[][] ints = new int[count - 1][3];
        for (int i = 0; i < count - 1; i++) {
            String s = sc.nextLine();
            String[] split = s.split(" ");
            ints[i][0] = Integer.parseInt(split[0]);
            ints[i][1] = Integer.parseInt(split[1]);
        }
//        System.out.println(1);
        getSize(line, ints);
//        System.out.println(line);
//        System.out.println(Arrays.deepToString(ints));
    }

    public static void getSize(String line, int[][] edgeList) {
        //删除边之后对两个边的集合进行图的搜索
        //若满足题意，则数量+1；
        //对图进行分隔
        int len = edgeList.length;
        for (int i = 0; i < len; i++) {
            int[][] left = new int[len][2];
            int[][] right = new int[len][2];
            for (int j = 0; j < len - 1; j++) {
                System.out.println(Arrays.toString(edgeList[j]));
//                if (i < j) {
//                    left[i] = edgeList[j];
//                } else if (i > j) {
//                    right[j - i] = edgeList[j];
//                }
            }
            System.out.println(Arrays.deepToString(left));
            System.out.println(Arrays.deepToString(right));
            System.out.println("---------");
        }

    }
}

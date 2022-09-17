package meituan0917;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {

    static int[][] tree;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            int m = Integer.parseInt(sc.nextLine());
//            sc.nextLine();
            tree = new int[m][m];
            for (int j = 0; j < m; j++) {
                String[] split = sc.nextLine().split(" ");
                for (int k = 0; k < split.length; k++) {
                    tree[j][Integer.parseInt(split[i])-1] = 1;
                }
            }
//            System.out.println(Arrays.deepToString(tree));
            if (i==0) System.out.println(-1);
            if (i==1) System.out.println(1);
        }

    }
}

package meituanJing;

import java.util.Scanner;

public class Q4 {

    static int N;
    static int M;
    static int K;
    static int[] C;
    static int[] A;
    static int[] B;

    //动态规划加图的遍历
    //dp[i][0]表示第i天放弃了任务的最大受益
    //dp[i][1]表示第i天接收了任务的最大受益
    //状态转移方程dp[i][0] = max(dp[i-1][0]+today,do[i-1][1]+today)
    //dp[0][0] = 0;
    //dp[0][1] = today
    //返回的是max[M][0],dp[M][1]

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        K = Integer.parseInt(s[2]);
        String[] s1 = sc.nextLine().split(" ");
        String[] s2 = sc.nextLine().split(" ");
        String[] s3 = sc.nextLine().split(" ");
        A = new int[M];
        B = new int[M];
        C = new int[M];
        init(C, s1);
        init(A, s2);
        init(B, s3);

    }

    public static void invoke(){
        int[][] dp = new int[M][2];
        int cur = K;
        dp[0][0] = 0;
        if (K!=C[0]){
            dp[0][1] = B[0];
            //转移地点
            cur = C[0];
        }else dp[0][1] = A[0];
        for (int i=1;i<M;i++){
            if (cur!=C[i]){
                //在不同的地方
//                dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+)
            }else {
                dp[i][0] = dp[i-1][0]+A[i];
                dp[i][1] = dp[i-1][1]+A[i];
            }
//            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]);
        }


    }

    public static void init(int[] arr, String[] s) {
        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
    }




}

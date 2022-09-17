package meituan0910;


import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String[] arg = sc.nextLine().split(" ");
            int n = Integer.parseInt(arg[0]);
            int x = Integer.parseInt(arg[1]);
            int y = Integer.parseInt(arg[2]);
            int k = Integer.parseInt(arg[3]);
            judge(n,x,y,k);

        }
    }
    public static void judge(int n,int x,int y,int k){
        //题目为    1  2    3    4    5
        //x做完第k道题所需要的时间为
        float a = (float)k/x;
        float b = (float)(n-k+1)/y;
        if (a==b){
            System.out.println("Tie");
        }else if (a<b){
            System.out.println("Win");
        }else{
            System.out.println("Lose");
        }

    }
}

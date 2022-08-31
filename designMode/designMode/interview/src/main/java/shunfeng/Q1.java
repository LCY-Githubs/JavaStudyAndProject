package shunfeng;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        //1  2  3  4  5
        //猜测第一个
        //需要的次数为：5->2->1  共需要3次
        //猜测第二个
        //需要的次数为：5->2
        double log = Math.log(n);
//        System.out.println(log);
        int res = 0;
        if (log>(int)log){
            res = (int)log+1;
        }else res = (int)log;
        System.out.println(res*n+1);
    }
}

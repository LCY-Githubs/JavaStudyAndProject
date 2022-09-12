package meituan0910;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(arr));
        handle();
    }

    public static void handle(){
        //有0就加0
        //没有0就加正数
        int sum = Arrays.stream(arr).sum();
        int count =0;
        while (merge()||sum==0){
            //遍历看是否有0
            int index = -1;
            int zheng = -1;
            //第一个正数
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]==0){
                    index = i;
                }else if (arr[i]>0){
                    zheng = i;
                }
            }
            if (index==-1){
                //选择正数+1
                arr[zheng]++;
            }else {
                arr[index]++;
            }
            sum = Arrays.stream(arr).sum();
            count++;
        }
        System.out.println(count);
    }

    public static boolean merge(){
        for (int j : arr) {
            if (j==0)return true;
        }
        return false;
    }
}

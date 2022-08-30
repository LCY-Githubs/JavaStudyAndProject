package xiecheng;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < count; i++) {
            int[] ints = new int[3];
            String s = sc.nextLine();
            String[] split = s.split(" ");
            ints[0] = Integer.parseInt(split[0]);
            ints[1] = Integer.parseInt(split[1]);
            ints[2] = Integer.parseInt(split[2]);
            invoke(ints);
        }
    }

    public static void invoke(int[] arg) {
        //求三个数的最大公因数x
        //求剩下的o的数量b-x/2的和
        int a = arg[0];
        int b = arg[1];
        int c = arg[2];
        int sum = 0;
        int min = a;
        min = Math.min(min,b);
        min = Math.min(min,c);
        sum +=2*min;
        b = b-min;
//        while (a != 0 && b != 0 && c != 0) {
//            a--;
//            b--;
//            c--;
//            sum+=2;
//        }
        //求剩下的0
        if (b>=2){
            sum+=b-1;
        }
        System.out.println(sum);
    }
}

package rongyao;

import java.util.Scanner;

public class Q1 {
    //记录各个位上的数字


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int val = Integer.parseInt(s);
        invoke(val);
    }

    public static String invoke(int i){
        System.out.println(i/1024);
        while ((double)i/1024>1024){
            i = i/1024;
        }
        return null;
    }
}

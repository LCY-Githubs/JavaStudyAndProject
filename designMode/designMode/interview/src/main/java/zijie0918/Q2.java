package zijie0918;

import java.util.Scanner;
import java.util.Stack;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        find(s);
    }

    public static void find(String s) {
        int max = 0;
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c!=stack.peek()){
                stack.push(c);
                max = Math.max(stack.size(), max);
            }else {
                stack = new Stack<>();
                stack.push(c);
            }
        }
        System.out.println(max);
    }
}

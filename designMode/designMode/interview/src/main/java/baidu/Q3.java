package baidu;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int count =0;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if ("".equals(s)) {
                count++;
            };
            if (count>1)break;
            sb.append(s);
        }
        String replace = sb.toString().replace(" ", "");
//        System.out.println(replace);
        deal(replace);
    }

    public static void deal(String s) {
        int ifCount = 0;
        int ret = 0;
        int left = 0;
        int right = 0;
        int len = s.length();
        int index = 0;
        for (; index < len - 2; index++) {
            if (s.charAt(index) == 'f' && s.charAt(index + 1) == 'o' && s.charAt(index + 2) == 'r') {
                while (index < len) {
                    if (s.charAt(index) == '{') {
                        left++;
                    } else if (s.charAt(index) == '}') {
                        right++;
                    } else if (s.charAt(index) == 'i' && s.charAt(index + 1) == 'f') {
                        ifCount++;
                    }
                    if (right == left && left != 0) {
                        ret = Math.max(ret, left - ifCount);
                        left = 0;
                        right = 0;
                        ifCount = 0;
                        break;
                    } else index++;
                }
            }
        }
        System.out.println(ret);
    }

    public static void judge(String s){
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i]=='f'&&chars[i+1]=='o'&&chars[i+2]==)
//        }
    }

}

package zijie0918;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        find(s);
    }

    public static void find(String s) {
        //ASAFASAFADDD
        //A:5 S:2 F:2 D:3
        char[] chars = s.toCharArray();
        int num = chars.length / 4;
        int[] arr = new int[4];
        /*
        A:0
        S:1
        D:2
        F:3
         */
        for (char aChar : chars) {
            if (aChar == 'A') arr[0]++;
            else if (aChar == 'S') arr[1]++;
            else if (aChar == 'D') arr[2]++;
            else if (aChar == 'F') arr[3]++;
        }
        //找出最大的字母
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < 4; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        //最大的字母是maxIndex，最大值为max
//        System.out.println(Arrays.toString(arr));
        //找出字符串中包含有max-num的最大的maxIndex的子串长度
        char c;
        if (maxIndex == 0) c = 'A';
        else if (maxIndex == 1) c = 'S';
        else if (maxIndex == 2) c = 'D';
        else c = 'F';
        findStr(chars, max - num, c);
    }


    public static void findStr(char[] chars, int count, char c) {
        int left = 0;
        int min = Integer.MAX_VALUE;
        int len = 1;
        //先找到最左边的这个字母的位置
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                left = i;
                break;
            }
        }
        for (int i = left+1; i < chars.length; i++) {
            if (chars[i] != c) {

            } else if (len != count) {
                len++;
            }
            if (chars[i] == c && len == count) {
                min = Math.min(i - left + 1, min);
                left++;
                while (left < chars.length && chars[left] != c) {
                    left++;
                }
            }
        }
        System.out.println(min);
    }
}

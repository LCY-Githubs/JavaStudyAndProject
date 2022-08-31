package huawei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1new {

    static HashMap<String, Integer> map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s2 = sc.nextLine().toLowerCase().split(" ");
        map = new HashMap<>();
        for (int i = 0; i < s2.length; i++) {
            map.put(s2[i], i);
        }
        handleText(s);
    }

//    public static void printMap(HashMap<String, Integer> map) {
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.print("key=" + entry.getKey() + "    ");
//            System.out.println("value=" + entry.getValue());
//        }
//    }

    public static void handleText(String s) {
        char[] chars = s.toCharArray();
        int right = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (right < chars.length) {
            char c = chars[right];
            if (c == ' ') {
                //往后跳两格
                right++;
                stringBuilder.append(c);
            } else if (c == '"') {
                //一直走到下一个双引号
                stringBuilder.append(c);
                right++;
                if (right == chars.length) break;
                c = chars[right];
                stringBuilder.append(c);
                while (c != '"') {
                    right++;
                    c = chars[right];
                    stringBuilder.append(c);
                }
                right++;
            } else if (c == '.' || c == ',') {
                right++;
//                left = right;
                stringBuilder.append(c);
            } else {
                StringBuilder builder = new StringBuilder();
                while ((c - 'a' >= 0 && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    builder.append(c);
                    right++;
                    c = chars[right];
                }
                if (map.containsKey(builder.toString().toLowerCase())) {
                    stringBuilder.append(map.get(builder.toString().toLowerCase()));
                } else stringBuilder.append(builder);
            }
        }
        System.out.println(stringBuilder);
    }

}

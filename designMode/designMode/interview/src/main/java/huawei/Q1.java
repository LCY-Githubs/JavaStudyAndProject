package huawei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1 {
    static HashMap<String, Integer> map;
    static HashMap<String, Integer> countMap;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<String> list = new ArrayList<>();
        String s = sc.nextLine();
        String[] s2 = sc.nextLine().toLowerCase().split(" ");
        map = new HashMap<>();
//        countMap = new HashMap<>();
        for (int i = 0; i < s2.length; i++) {
            map.put(s2[i], i);
//            countMap.put(s2[i], countMap.getOrDefault(s2[i], 0) + 1);
        }
//        printMap(map);
//        printMap(countMap);
        handleText(s);
        System.out.println(s2);
    }

//    public static void printMap(HashMap<String, Integer> map) {
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.print("key=" + entry.getKey() + "    ");
//            System.out.println("value=" + entry.getValue());
//        }
//    }

    public static void handleText(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (right<chars.length){
            char c = chars[right];
            if (c==' '){
                //往后跳两格
                right++;
                left = right;
                continue;
            }else if (c== '"'){
                //一直走到下一个双引号
                right++;
                if (right==chars.length)break;
                c = chars[right];
                while (c!='"'){
                    right++;
                    c = chars[right];
                }
                continue;
            }else if (c=='.'||c==','){
                right++;
                left = right;
                continue;
            }else {
                StringBuilder builder = new StringBuilder();
                while (c-'a'>=0&&c<='z'){
                    builder.append(c);
                    right++;
                    c = chars[right];
                }
                if (map.containsKey(builder.toString())){
                    Integer integer = countMap.get(builder.toString());
                    if (integer>1){
                        stringBuilder.append(map.get(builder.toString()));
                    }else stringBuilder.append(builder);
                }

            }
//            right++;
//            System.out.println(c);
            System.out.println(stringBuilder);
        }
    }
}

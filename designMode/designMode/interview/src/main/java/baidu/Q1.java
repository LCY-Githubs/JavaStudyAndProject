package baidu;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q1 {

    static Set<Character> set = new HashSet<>() {
        {
            add('a');
            add('e');
            add('i');
            add('o');
            add('u');
        }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        judge(line);
    }

    public static void judge(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length - 3; i++) {
            if (!set.contains(chars[i])
                    && !set.contains(chars[i + 3])
                    && set.contains(chars[i + 1])
                    && set.contains(chars[i + 2])
                    && set.contains(chars[i + 4])
                    ) {
                //每个字母都不相同
                HashSet<Character> hashSet = new HashSet<>();
                hashSet.add(chars[i]);
                hashSet.add(chars[i+1]);
                hashSet.add(chars[i+2]);
                hashSet.add(chars[i+3]);
                hashSet.add(chars[i+4]);
                if (hashSet.size()==5){
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}

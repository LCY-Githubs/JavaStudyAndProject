package serial49;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class main {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "acb";
        String s3 = "bca";
        String s4 = "cba";


    }

    @Test
    public void Test01(){
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(strs);
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        int len = strs.length;
        int[][] res = new int[len][26];
        int index = 0;
        ArrayList<List<String>> arrayList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int strIndex = 0;
        for (String s : strs) {
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                res[index][chars[i]-'a']++;
            }
            System.out.println(Arrays.toString(res[index]));
            //生成该字符串样例
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                int i1 = res[index][i];
                if (i1!=0){
                    System.out.println(i1);
                    String value = String.valueOf((char) (i + 'a'));
                    String repeat = value.repeat(i1);
                    builder.append(repeat);
                }
            }
            System.out.println(builder);
            if (map.containsKey(builder.toString())){
                Integer integer = map.get(builder.toString());
                List<String> strings = arrayList.get(integer);
                strings.add(s);
            }else {
                map.put(builder.toString(),strIndex++);
                ArrayList<String> strings = new ArrayList<>();
                strings.add(s);
                arrayList.add(strings);
            }

            index++;
        }
        return arrayList;
    }

}

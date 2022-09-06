package serial1754;

import org.junit.Test;

public class Main {

    public String largestMerge(String word1, String word2) {
        //每次选择最后面的
        int index = 0;
        StringBuilder builder = new StringBuilder();
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        int index1 = 0;
        int index2 = 0;
        while (index1 < chars1.length && index2 < chars2.length) {
            if (chars1[index1] > chars2[index2]) {
                builder.append(chars1[index1++]);
            }else builder.append(chars2[index2++]);
        }
        //将剩下的元素补充完成
        if (index1!=chars1.length-1){
            for (int i = index1; i < chars1.length; i++) {
                builder.append(chars1[i]);
            }
        }
        if (index2!=chars2.length-1){
            for (int i = index2; i < chars2.length; i++) {
                builder.append(chars2[i]);
            }
        }
        return builder.toString();
    }

    @Test
    public void Test(){
        System.out.println(largestMerge("cabaa", "bcaaa"));
    }


    public String largestMerge2(String word1, String word2) {
        //每次选择最后面的
        int index = 0;
        StringBuilder builder = new StringBuilder();
        int i = 0,j =0;
        while (i<word1.length()||j<word2.length()){
            if (word1.substring(i).compareTo(word2.substring(j))<0){
                builder.append(word2.charAt(j++));
            }else builder.append(word1.charAt(i++));
        }
        return builder.toString();
    }

}

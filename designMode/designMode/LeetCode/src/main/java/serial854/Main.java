package serial854;

public class Main {

    int result = Integer.MAX_VALUE;

    public int kSimilarity(String s1, String s2) {
        //解题思路
        return execute(s1.toCharArray(),s2.toCharArray(),0,0);
    }

    public int execute(char[] s1,char[] s2,int start,int cur){
        //在start>result的时候终止
        if (cur>=result) return result;
        if (start==s1.length-1)return  result=Math.min(result,cur);
        for (int i = start; i < s1.length; i++) {
            if (s1[i]!=s2[i]){
                for (int j = i+1; j < s2.length; j++) {
                    if (s2[j]==s1[i]&&s2[j]!=s1[j]){
                        //交换
                        swap(s2,i,j);
                        //继续寻找
                        execute(s1,s2,i+1,cur+1);
                        swap(s2,i,j);
                    }
                }
                return result;
            }
        }
        return result = Math.min(result,cur);
    }

    public void swap(char[] sc,int i,int j){
        char temp = sc[i];
        sc[i] = sc[j];
        sc[j] = temp;
    }


}

package serial1769;

import org.junit.Test;

import java.util.Arrays;

public class Main {


    public int[] minOperations(String boxes) {
        //
        char[] chars = boxes.toCharArray();
        int N = chars.length;
        int[] ans = new int[N];
        //暴力解法
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (chars[j]=='1'){
                    if (j>i){
                        ans[i] +=j-i;
                    }else {
                        ans[i]+=i-j;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    @Test
    public void Test(){
        minOperations("001011");
    }
}

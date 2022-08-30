package serial93;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Serial93 {
    int[] ins = new int[4];
    List<String> res = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        // 回溯算法求解
    /*id                   25525511135
                  /           /              \
       0      2               25              255
            /   \     \
       1   5    55    552
        ---
       2
       ---
       3
     */
        int len = s.length();
        dfs(s, 0, 0, len);
        return res;
    }

    public void dfs(String s, int id, int start, int len) {

        //如果id==4而且遍历完成，则证明该字符串就是一种答案
        if (id == 4 ) {
            if (start == len){
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < 4; i++) {
                    builder.append(ins[i]);
                    if (i != 3) {
                        builder.append(".");
                    }
                }
                res.add(builder.toString());
            }
            return;
        }
        //如果遍历完了整个字符串但是还没找到4段IP,则提前回溯
        if (start == len) {
            return;
        }
        //如果是前导零，则当前这一段IP智能为0
        if (s.charAt(start) == '0') {
            ins[id] = 0;
            dfs(s, id + 1, start + 1, len);
        }
        //没有特殊情况了，进行一遍情况的枚举
        //记录当前值
        int addr = 0;
        for (int end = start; end < len; end++) {
            addr = addr * 10 + (s.charAt(end) - '0');
            if (addr > 0 && addr <= 255) {
                ins[id] = addr;
                dfs(s, id + 1, end + 1, len);
            }else break;
        }
//        if (start < s.length()) {
//            System.out.println(s.charAt(start));
//            dfs(s,id,start+1);
//        }
    }

    @Test
    public void Test() {
        restoreIpAddresses("25525511135");
    }

}

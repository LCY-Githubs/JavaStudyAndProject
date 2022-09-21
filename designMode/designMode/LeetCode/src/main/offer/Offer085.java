import java.util.ArrayList;
import java.util.List;

public class Offer085 {

    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        backtrack(list,new StringBuilder(),0,0,n);
        return list;
    }

    public void backtrack(List<String> ans, StringBuilder builder, int open, int close, int max) {
        //完成条件是
        if (builder.length() == max * 2) {
            ans.add(builder.toString());
            return;
        }
        if (open < max) {
            builder.append("(");
            backtrack(ans, builder, open + 1, close, max);
            //回溯
            builder.deleteCharAt(builder.length() - 1);
        }
        if (close < open) {
            builder.append(")");
            backtrack(ans, builder, open, close + 1, max);
            builder.deleteCharAt(builder.length() - 1);
        }
    }


}

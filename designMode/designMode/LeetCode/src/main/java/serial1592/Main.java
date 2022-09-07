package serial1592;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public String reorderSpaces(String text) {

        //计算空格数目
        //计算单词数目
        char[] chars = text.toCharArray();
        int num = 0;
        for (char c : chars) {
            if (c == ' ') num++;
        }
        String replace = text.replace("  ", "");
        String[] s = replace.split(" ");
        if (s.length == 1) return text;
        int backspace = num / (s.length - 1);
        int lost = num % (s.length - 1);
        StringBuilder builder = new StringBuilder();
        for (String s1 : s) {
            builder.append(s1);
            builder.append(" ".repeat(backspace));
        }
        builder.append(" ".repeat(lost));
        return builder.toString();
    }

    @Test
    public void test() {
        String s = "  this   is  a sentence ";
        reorderSpaces2(s);
    }

    public String reorderSpaces2(String text) {
        List<String> list = Arrays.stream(text.split(" ")).filter(e -> !"".equals(e)).collect(Collectors.toList());
        int num = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') num++;
        }
        //计算空格数目
        //计算单词数目
        int backNum = num / (list.size() - 1);
        int last = num % (list.size() - 1);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                builder.append(list.get(i));
                builder.append(" ".repeat(backNum));
            }
        }
        builder.append(" ".repeat(last));
        return builder.toString();
    }

}

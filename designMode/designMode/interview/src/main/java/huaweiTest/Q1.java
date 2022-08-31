package huaweiTest;


import java.math.BigDecimal;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(" ");
        int length = split.length;
        int sum = 0;
        for (String s1 : split) {
            sum += s1.length();
        }
        //BigDecimal decimal = BigDecimal.valueOf((double) sum / length);
        String format = String.format("%.2f", (double) sum / length);
        System.out.println(Double.parseDouble(format));
    }
}

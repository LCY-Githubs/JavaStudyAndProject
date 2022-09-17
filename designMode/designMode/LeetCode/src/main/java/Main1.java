import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class Main1 {

    @Test
    public void test() {
        maximumSwap(2736);
    }


    public int maximumSwap(int num) {
        //先转化为数组
        ArrayList<Integer> list = transfer(num);
//        System.out.println(list);
        //找出最大值和从头开始的小于等于最大值的索引
        int max = list.get(0);
        int maxIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>max){
                max = list.get(i);
                maxIndex = i;
            }
        }
        //找到了最大值和最大值的索引
        //找从头开始的小于最大值的索引并交换
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<max&&i<maxIndex){
                int temp = max;
                list.set(maxIndex, list.get(i));
                list.set(i,temp);
                break;
            }
        }
//        System.out.println(list);
        //拼接并返回
        int ans =0;
        for (Integer integer : list) {
            ans = ans * 10 + integer;
        }
//        System.out.println(ans);
        return ans;
    }

    public ArrayList<Integer> transfer(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        while (num != 0) {
            list.add(num % 10);
            num = num / 10;
        }
        Collections.reverse(list);
        return list;
    }
}

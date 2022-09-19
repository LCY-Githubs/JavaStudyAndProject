package serial1636;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {

    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        Collections.sort(list,(a,b)->{
            int x = map.get(a);
            int y = map.get(b);
            return x!=y?x-y:b-a;
        });
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }

        return nums;
    }
}

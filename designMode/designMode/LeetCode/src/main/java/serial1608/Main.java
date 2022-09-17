package serial1608;

import java.util.Arrays;

public class Main {

    public int specialArray(int[] nums) {
        int N = nums.length;
        if (N == 0) return 0;
        int x = 1;
        int pre = nums[0];
        Arrays.sort(nums);
        for (int i = 0; i < N; i++) {
            if (pre == nums[i]) {
                continue;
            }
            if (nums[i] >= i && N - i == i) {
                return i;
            }
        }

        return -1;
    }
    public int specialArray2(int[] nums) {
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int num : nums) {
                if (num >= i) {
                    count++;
                }
            }
            if (count==i)return i;
        }
        return -1;
    }

}

package serial1640;

import java.util.HashMap;

public class Main {

    public boolean canFormArray(int[] arr, int[][] pieces) {
        int n = arr.length;
        int m = pieces.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            map.put(pieces[i][0],i);
        }
        for (int i = 0; i < n; ) {
            if (!map.containsKey(arr[i]))return false;
            int j = map.get(arr[i]);
            int len = pieces[j].length;
            for (int k = 0; k < len; k++) {
                if (arr[k+i]!=pieces[j][k]) return false;
            }
            i +=len;
        }
        return true;
    }
}

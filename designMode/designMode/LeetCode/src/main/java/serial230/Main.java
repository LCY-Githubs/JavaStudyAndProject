package serial230;

import commonStruct.TreeNode;

import java.util.*;

public class Main {

    List<Integer> list = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {
        //深度优先搜索
        dfs(root);
//        list.sort((a, b) -> b - a);
        Collections.sort(list);
        return list.get(k);
    }

    public void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }
}

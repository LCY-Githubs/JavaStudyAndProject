package serial652;

import commonStruct.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    //建立一个存放不同序列的字符串集合
    HashMap<String, TreeNode> map = new HashMap<>();
    //建立如果存在重复的情况，则将节点放进set集合
    HashSet<TreeNode> set = new HashSet<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return new ArrayList<>(set);
    }

    //1（2（4()()）（））（3（2（4()()）（））（4()()））
    public String dfs(TreeNode node){
        if (node==null){
            return "";
        }
        StringBuilder builder = new StringBuilder();
        builder.append(node.val);
        builder.append("(");
        builder.append(dfs(node.left));
        builder.append(")(");
        builder.append(dfs(node.right));
        builder.append(")");
        String s = builder.toString();
        if (map.containsKey(s)){
            set.add(map.get(s));
        }else map.put(s,node);
        return s;
    }

}

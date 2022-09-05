package meituanJing;

import java.util.*;

public class Q3 {

    static int N;
    static int[] son;
    static char[] val;
    static Node root;

    /*

     *              1(A)
     *          /       \
     *         2(B)      5(A)
     *      /     \
     *      3(C)    4(C)
     *              \
     *              6(D)
     */

    //主函数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        son = new int[N];
        son[0] = 1;
        for (int i = 1; i < N; i++) {
            son[i] = sc.nextInt();
        }
        sc.nextLine();
        String s = sc.nextLine();
        val = s.toCharArray();
        //将所有节点插入
        root = new Node(1, val[0], null, null);
        for (int i = 1; i < N; i++) {
            insert(i + 1, val[i], son[i], root);
        }

        for (int i = 0; i < N; i++) {
            dfs(root, i + 1);
        }

    }

    //构造树的方法
    public static void insert(int key, char val, int parentKey, Node node) {
        //查找parentKey
        if (node == null) return;
        if (node.key != parentKey) {
            insert(key, val, parentKey, node.left);
            insert(key, val, parentKey, node.right);
        } else {
            if (node.left == null) {
                node.left = new Node(key, val, null, null);
            } else if (node.right == null) {
                node.right = new Node(key, val, null, null);
            }
        }
    }

    //深度优先搜索寻找获取结果的节点
    public static void dfs(Node node, int key) {
        if (node == null) return;
        if (node.key == key) {
            dfsV(node, new HashSet<>());
        } else {
            dfs(node.left, key);
            dfs(node.right, key);
        }

    }

    //打印结果的广度优先搜索
    public static void dfsV(Node node, Set<Character> path) {
        Deque<Node> deque = new LinkedList<>();
        deque.add(node);
        while (!deque.isEmpty()) {
            Node poll = deque.poll();
            path.add(poll.val);
            if (poll.left != null) {
                deque.add(poll.left);
            }
            if (poll.right != null) {
                deque.add(poll.right);
            }
        }
        if (node.key == 1) {
            System.out.print((path.size() + 1) + " ");
        } else System.out.print(path.size() + " ");

    }

    //构造树的节点类
    public static class Node {
        int key;
        char val;
        Node left;
        Node right;

        public Node(int key, char val, Node left, Node right) {
            this.key = key;
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

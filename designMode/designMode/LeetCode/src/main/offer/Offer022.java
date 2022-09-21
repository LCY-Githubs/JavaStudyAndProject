import java.util.HashMap;

public class Offer022 {

    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        int index = 0;
        ListNode node = head;
        while (!map.containsKey(node) && node != null) {
            map.put(node, index);
            index++;
            node = node.next;
        }
        if (node==null)return null;
        return node;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

import java.util.ArrayList;

public class Offer021 {

//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        //记录链表的长度
//        ListNode node =head;
//        int len =0;
//        while (node!=null){
//            len++;
//            node = node.next;
//        }
//        System.out.println(len);
//        //找到第n个并删除
//        int m = len-n;
//        ListNode cur = head;
//        ListNode pre =null;
//        int index =0;
//        while (index!=m&&cur!=null){
//            pre = cur;
//            cur = cur.next;
//            index++;
//        }
//        if (pre.next.next!=null){
//            pre.next = pre.next.next;
//        }
//
//
//        return null;
//    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        //记录链表的长度
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode cur = head;
        while (cur!=null){
            list.add(cur);
            cur = cur.next;
        }
        if (list.size()==1&&n==1){
            return new ListNode();
        }
        System.out.println(list);
        list.get(list.size()-n-1).next = list.get(list.size()-n+1);
        return head;
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

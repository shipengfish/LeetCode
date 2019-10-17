package linkedlist;

/**
 * @author shipengfish
 * @version 1.0
 * @date 2019-10-16
 * @description https://leetcode-cn.com/problems/reverse-linked-list/
 * @since 1.0
 */
public class $206_ReverseLinkedList {

    /**
     * 题目需将当前节点的 next 指向前一个节点.所以使用两个指针分别指向当前节点和前一个节点，由于当前节点的 next 已经改变，所以需要使用一个临时节点来存储当时节点的下一个节点。
     */
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;

        while (cur != null) {
            ListNode tempNext = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tempNext;
        }
        return pre;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        node.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        $206_ReverseLinkedList linkedList = new $206_ReverseLinkedList();
        ListNode reverseList = linkedList.reverseList(node);

        System.out.println(reverseList);
    }

    @Override
    public String toString() {
        return "$206_ReverseLinkedList{}";
    }
}

package pps;

/*
 * leetcode 206번
 */
public class A058_LeeInhyeok_0726 {
	
	public ListNode reverseList(ListNode head) {
        ListNode node = null;
        while(head != null) {
            ListNode temp = head;
            head = head.next;
            temp.next = node;
            node = temp;
        }
        return node;
    }
}

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
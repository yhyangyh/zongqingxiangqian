package aimToOffer.test18;

import aimToOffer.test06.ListNode;

/**
 * Created by yyh on 2020/6/23 上午11:50
 */
public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }

        ListNode newHead = new ListNode(-1);
        newHead.next = pHead;
        ListNode p = newHead;
        ListNode q = pHead;

        while (q != null && q.next != null) {
            if (q.val == q.next.val) {
                while (q != null && q.val == q.next.val) {
                    q = q.next;
                }
                p.next = q;
            } else {
                p = q;
                q = q.next;
            }

        }

        return newHead.next;

    }
}

package aimToOffer.test06;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by yyh on 2020/6/18 上午11:10
 */
public class SolutionYh {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> array = new ArrayList();

        if (listNode == null) {
            return array;
        }

        Stack<Integer> stack = new Stack();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        while (!stack.empty()) {
            array.add(stack.pop());
        }

        return array;
    }
}

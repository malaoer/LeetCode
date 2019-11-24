package com.ultimate.leetcode;

public class LeetCode_2 {
	public static void main(String[] args) {
		
	}
	public ListNode addTwoNumbers(ListNode l1,ListNode l2) {
		ListNode newNode = new ListNode(0);
		ListNode p = l1,q=l2,curr = newNode;
		int carry = 0;
		while (p!=null || q!=null) {
			int x = (p!=null)? p.data:0;
			int y = (q!=null)? q.data:0;
			int sum = carry+x+y;
			carry = sum/10;
			curr.next = new ListNode(sum%10);
			curr= curr.next;
			if(p!=null) {
				p = p.next;
			}
			if(q!=null) {
				q = q.next;
			}
		}
		if (carry>0) {
			curr.next = new ListNode(carry);
		}
		return newNode.next;
	}
	
}
class ListNode{
	int data;
	ListNode next = null;
	public ListNode(int data) {
		this.data=data;
	}
}

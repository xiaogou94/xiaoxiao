package com.pjb.xiaoxiao.leetcode;

/**
 * @program: xiaoxiao
 * @description: 两数相加
 * @author: xiao gou
 * @create: 2022-06-18 10:14
 */
public class 两数相加 {

  public static void main(String[] args) {
    //
    ListNode l1 = new ListNode(2);
    l1.add(4);
    l1.add(3);
    ListNode l2 = new ListNode(5);
    l2.add(6);
    l2.add(4);

    System.out.println(addTwoNumbers(l1,l2));
  }

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode head = null, tail = null;
    int carry = 0;
    while (l1 != null || l2 != null) {
      int n1 = l1 != null ? l1.val : 0;
      int n2 = l2 != null ? l2.val : 0;
      int sum = n1 + n2 + carry;
      if (head == null) {
        head = tail = new ListNode(sum % 10);
      }else {
        tail.next = new ListNode(sum % 10);
        tail = tail.next;
      }
      carry = sum / 10;
      if (l1 != null) {
        l1 = l1.next;
      }
      if (l2 != null) {
        l2 = l2.next;
      }
    }
    if (carry > 0) {
      tail.next = new ListNode(carry);
    }
    return head;
  }
  ;

  public static class ListNode {
    int val;
    ListNode next;

    public ListNode() {}

    public ListNode(int val) {
      this.val = val;
    }

    public ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    // 添加结点
    public void add(int newdata) {
      ListNode newNode = new ListNode(newdata);
      if (this.next == null) {
        this.next = newNode;
      } else {
        this.next.add(newdata);
      }
    }
  }
}

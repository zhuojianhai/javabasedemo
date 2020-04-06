package com.zjh.demo.letcode.链表;


import com.zjh.demo.datastructure.List;

/**
 * author     zhuojianhai
 * date       2020/4/4   23:32
 * description  类功能描述
 */
public class _206_反转链表 {
    public ListNode reverseList(ListNode head) {
        if(head == null ||head.next==null){
            return  head;
        }

        ListNode newNode = reverseList(head);
        head.next.next = head;
        head.next = null;
        return newNode;

    }

    public ListNode reverseList1(ListNode head){
        ListNode newHead = null;
        while(head!=null){
         ListNode   temp = head.next;
         head.next = newHead;
         newHead = head;
         head = temp;
        }
        return  newHead;
    }

    public static void main(String[] args) {

    }


}

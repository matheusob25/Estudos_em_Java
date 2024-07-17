package leetcode;

import java.util.Scanner;

public class MergeTwoSortedLists {
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

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1!=null && list2!=null){
            if(list1.val<list2.val){
                list1.next= mergeTwoLists(list1.next,list2);
                return list1;
            }
            else{
                list2.next= mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if(list1==null)
            return list2;
        return list1;
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }


    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
       ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(3);

        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(2);
        listNode2.next.next = new ListNode(4);

        ListNode listNode3 = MergeTwoSortedLists.mergeTwoLists(listNode1, listNode2);
        ListNode head = listNode3;
        ListNode head2 = listNode3;
//
//        while(head!=null){
//            if(head2.next.val == head.next.val){
//                head2.next = head.next;
//            }
//            head = head.next;
//        }
//        System.out.println(head2);


        System.out.println(new MergeTwoSortedLists().deleteDuplicates(head));
    }
  }

package com.example;


import java.util.HashSet;

public class Main {


    public static void main(String[] args) {
        ListNode node3 = new ListNode(7, null);
        ListNode node2 = new ListNode(4, node3);
        ListNode node1 = new ListNode(4, node2);
        ListNode head = new ListNode(5, node1);


        //before
        print(head);

        //test
        //removeDuplicates(head);
        removeDuplicates2(head);

        //after
        System.out.println("*******");
        print(head);

    }


    public static void removeDuplicates(ListNode head) {
        ListNode current = head;
        ListNode cursor = null;

        while (current.next != null) {
            // first case
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                cursor = current.next;
                while (cursor.next != null) {
                    if (current.val == cursor.next.val) {
                        // remove duplicate
                        cursor.next = cursor.next.next;

                    } else {
                        cursor = cursor.next;
                    }
                }

                current = current.next;
            }

        }
    }

    public static void removeDuplicates2(ListNode head) {
        ListNode current = head;
        HashSet<Integer> set = new HashSet<>();
        set.add(head.val);

        while (current.next != null) {
            if(set.contains(current.next.val))
            {
                //delete node
                current.next = current.next.next;
            }
            else{
                set.add(current.next.val);
                current = current.next;
            }
        }
    }

    public static void print(ListNode head) {
        ListNode current = head;
        while (current.next != null) {
            System.out.println(current.val);
            current = current.next;
        }

        System.out.println(current.val);
    }
}

package com.example;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        ListNode node3 = new ListNode(7, null);
        ListNode node2 = new ListNode(4, node3);
        ListNode node1 = new ListNode(4, node2);
        ListNode head = new ListNode(5, node1);


        //

    }


    public static void removeDublicates(ListNode head) {
        ListNode current = head;
        ListNode cursor = head.next;

        while (current.next != null) {
            // first case
            if(current.val == current.next.val){
                current.next = current.next.next;
            }

            while (cursor.next != null) {
                if (current.val == cursor.next.val) {
                    // remove duplicate
                    cursor.next = cursor.next.next;

                } else {
                    cursor = cursor.next;
                }
            }
        }
    }
}

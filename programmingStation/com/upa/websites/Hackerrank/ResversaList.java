
/*
 * Author : Saarthak Pandey Question :
 * https://www.hackerrank.com/challenges/reverse-a-linked-list
 */
/*
 * Reverse a linked list and return pointer to the head The input list will have
 * at least one element Node is defined as class Node { int data; Node next; }
 */
// This is a "method-only" submission.
// You only need to complete this method.
/*
 * Node Reverse(Node head) { Node prev=null,cur,nex; cur=head; while(cur!=null)
 * { nex = cur.next; cur.next= prev; prev = cur; cur = nex; } return prev;
 * 
 * }
 */
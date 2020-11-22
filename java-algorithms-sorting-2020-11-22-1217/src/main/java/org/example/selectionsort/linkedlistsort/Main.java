package org.example.selectionsort.linkedlistsort;

/**
 * References:
 * https://www.softwaretestinghelp.com/selection-sort-java/
 */
public class Main {
    // add a node to the beginning of the linked list
    static Node addNode(Node head_ref, int new_data) {
        // create a node
        Node newNode = new Node();

        // assign data to node
        newNode.data = new_data;

        // link the node to linked list
        newNode.next = (head_ref);

        //head now points to new node
        (head_ref) = newNode;
        return head_ref;
    }

    // method to swap nodes
    static Node swapNodes(Node head_ref, Node curr_node1, Node curr_node2, Node prev_node) {
        // curr_node2 is new head
        head_ref = curr_node2;
        // realign links
        prev_node.next = curr_node1;

        // now swap next pointers of nodes
        Node temp = curr_node2.next;
        curr_node2.next = curr_node1.next;
        curr_node1.next = temp;
        return head_ref;
    }

    // sort the linked list using selection sort
    static Node Selection_Sort(Node head) {
        // only a single node in linked list
        if (head.next == null)
            return head;

        // minNode => node with minimum data value
        Node minNode = head;

        // prevMin => node previous to minNode
        Node prevMin = null;
        Node ptr;

        // traverse the list from head to last node
        for (ptr = head; ptr.next != null; ptr = ptr.next) {
            // check if current node is minimum
            if (ptr.next.data < minNode.data) {
                minNode = ptr.next;
                prevMin = ptr;
            }
        }
        // minimum node becomes head now
        if (minNode != head)
            head = swapNodes(head, head, minNode, prevMin);

        // sort remaning list recursively
        head.next = Selection_Sort(head.next);

        return head;
    }

    // sort the given linked list
    static Node sort(Node head_ref) {
        // linked list is empty
        if ((head_ref) == null)
            return null;

        // call Selection_Sort method to sort the linked list
        head_ref = Selection_Sort(head_ref);
        return head_ref;
    }

    // print nodes of linked list
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String args[]) {
        Node oddList = null;

        // create linked list using addNode method
        oddList = addNode(oddList, 11);
        oddList = addNode(oddList, 1);
        oddList = addNode(oddList, 5);
        oddList = addNode(oddList, 3);
        oddList = addNode(oddList, 9);
        oddList = addNode(oddList, 7);
        //print the original list
        System.out.println("Original Linked list:");
        printList(oddList);

        // sort the linked list
        oddList = sort(oddList);

        //print the sorted list
        System.out.println("\nLinked list after sorting:");
        printList(oddList);
    }

    /**
     * Linked list Node.  This inner class is made static so that
     * main() can access it
     */
    static class Node {
        int data;
        Node next;

        Node() {
            data = 0;
            next = null;
        }

        Node(int d) {
            data = d;
            next = null;
        } // Constructor
    }
}


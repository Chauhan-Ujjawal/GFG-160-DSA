class Solution {
    Node sortedInsert(Node head, int key) {
        Node newNode = new Node(key);

        // Case 1: empty list
        if (head == null) {
            return newNode;
        }

        // Case 2: insert before head
        if (key <= head.data) {
            newNode.next = head;
            return newNode;
        }

        // Case 3: insert somewhere after head
        Node curr = head;
        while (curr.next != null && curr.next.data < key) {
            curr = curr.next;
        }

        // insert newNode after curr
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }
}

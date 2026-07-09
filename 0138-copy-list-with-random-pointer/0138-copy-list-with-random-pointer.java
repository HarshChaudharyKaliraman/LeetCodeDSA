/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> mp = new HashMap<>();
        Node temp = head;
        while(temp!=null){
            mp.put(temp, new Node(temp.val));
            temp=temp.next;
        }

        temp=head;
        while(temp!=null){
            Node copy = mp.get(temp);
            copy.random = mp.get(temp.random);
            copy.next=mp.get(temp.next);
            temp=temp.next;
        }
        return mp.get(head);
    }
}
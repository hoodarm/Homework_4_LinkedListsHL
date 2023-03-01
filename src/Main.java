public class Main {
    public static void main(String[] args) {
        Node head = new Node (5);
        remove(head,5).print();
    }

    static Node remove (Node head, int v)
    {
        Node temp = head.next;
        Node prev = head;

        if (head.value==v) {
            head = head.next;
            return head;
        }

        while (temp!=null){
            if (temp.value==v){
                prev.next = temp.next;
                return head;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
}

class Node {
    Node (int v) { value = v; next = null; }
    void add (int v)
    { if (next == null) next = new Node (v); else next.add (v); }
    void print () {
        System.out.print (value + " ");
        if (next != null) next.print ();
    }
    int value;
    Node next; // pointer (reference) to next node
}
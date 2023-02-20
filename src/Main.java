import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Node head = new Node (5); head.add (13); head.add (-2); head.add (0); head.add (4);
        head.add (-19);  head.add (1);  head.add (14);  head.add (2);
        Objects.requireNonNull(remove(head, 14)).print();
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
            if (prev.next.value==v){
                prev.next = temp.next;
                return head;
            }
            prev = prev.next;
            temp = temp.next;
        }

        if (head.next==null)
            return null;

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
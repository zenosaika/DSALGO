public class LinkedList{
    Node head = null;

    public static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public void insert(int data){
        Node new_node = new Node(data);

        if (this.head == null) {
            this.head = new_node;
        } else {
            Node curr = this.head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new_node;
        }
    }

    public void remove(int index){
        if (index == 0) {
            this.head = this.head.next;
            return;
        }

        int cnt = 0;
        Node curr = this.head;

        // move to the node before target node)
        while (cnt < index-1) { 
            if (curr != null && curr.next != null) {
                curr = curr.next;
            } else {
                System.out.println("[ERROR]: Index out of bound.");
            }
            cnt ++;
        }

        Node node_before = curr;

        // move to the node after target node
        Node target_node = node_before.next;
        if (target_node != null) {
            Node node_after = target_node.next;

            // remove target node
            node_before.next = node_after;
        } else {
            System.out.println("[ERROR]: Index out of bound.");
        }
    }

    public void print(){
        Node curr = this.head;
        
        System.out.print("{");
        while (curr != null) {
            System.out.print(String.format("%d, ", curr.val));
            curr = curr.next;
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(0);
        list.insert(1);
        list.print();

        list.remove(0);
        list.print();
    }
}
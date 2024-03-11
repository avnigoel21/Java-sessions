package session16_17;

public class prog {

    static Node head;
    static int size;

    prog (){
        size = 0;
    }

    static class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data){
        
    }

    public void deleteLast(String data){
        
    }

    public void deleteFirst(String data){
        
    }

    public int getSize(){
        return size;
    }

    public void printlist(){
        Node currNode = head;

        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void printList1(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static Node reverse(Node head){
        Node curr = head; 
        Node prev = null;

        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }
        return prev;
    }

    public  static Node reverse1 (Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node newHead = reverse1(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        prog  list = new prog();

        // list.addFirst("a");
        // list.addFirst("b");
        // list.addFirst("c");
        // list.addFirst("d");

        list.head = new Node("1");
        list.head.next = new Node ("2");
        list.head.next.next = new Node ("3");

        //list.printlist();

        // a -> null
        // b -> a -> null
        // c -> b -> a -> null
        // d -> c -> b -> a-> null

        // reverse a linkedlist
        //      head
        //      1 -> 2 -> 3 -> 4 -> null
        //prev curr temp
        System.out.println("Original list: ");
        list.printList1(head);
        //head = list.reverse(head);
        head = list.reverse1(head);
        System.out.println("\n");

        System.out.println("Reversed list: ");
        System.out.println("\n");

        list.printList1(head);


       

    }

}

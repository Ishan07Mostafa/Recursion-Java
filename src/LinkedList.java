public class LinkedList {
    public Node head;


    // The linked list is implemented with the help of an array, with the head being the first element
    public LinkedList(int[] array){
        this.head = new Node(array[0], null);
        Node tail = this.head;
        for(int i = 1; i<array.length; i++){
            Node over = new Node(array[i], null);
            tail.next = over;
            tail = tail.next;
        }
    }

    //This is a recursive algorithm to add all the elements of the list
    public int addList(Node node){
        if(node.next==null) return node.element;
        else return node.element + addList(node.next);
    }

    //This is a recursive algorithm to print all the elements of the list in reverse order
    public void printListReverse(Node node){
        if(node.next!=null) printListReverse(node.next);
        System.out.print(node.element+" ");
    }
}

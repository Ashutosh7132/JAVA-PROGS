public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){

        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead(){
        System.out.println("Head:  " + head.value);
    }
    public void getTail(){
        System.out.println("Tail:  " + tail.value);
    }
    public void getLength(){
        System.out.println("Length:  " + length);
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
        }
        else{
            tail.next = newNode;

        }
        tail = newNode;
        length++;
    }

    public Node removeLast(int length){
        if(length == 0){return null;}
        Node pre = head;
        Node temp = head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            temp = null;
        }
        return temp;
    }

}

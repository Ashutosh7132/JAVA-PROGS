public class CustomLL {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList(1);


        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();
        linkedList.printList();
        System.out.println(linkedList.removeLast(4).value);
        linkedList.getLength();

    }
}

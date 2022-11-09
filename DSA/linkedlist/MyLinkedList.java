package DSA.bai_tap.linkedlist;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    //Phần tử đầu tiên của danh sách liên kết
    private Node head;
    //Số lượng phần tử trong danh sách
    private int numNodes = 0;

    //khai bao constructor
    public MyLinkedList() {
    }

    //add 1 phan tu vao dau danh sach
    public void addFirst(E e) {
        //khai bao 1 bien temp TRO den 1 gia tri cua HEAD
        Node temp = head;
        //Bien Head se nhan gia tri cua 1 node new
        head = new Node(e);
        //head.next tro den temp
        head.next = temp;
        numNodes++;
    }

    //add 1 phan tu vao vi tri cuoi cung danh sach
    public void addLast(E e) {
        //khia bao bien temp tro den head
        Node temp = head;
        //Se cho con tro chay den phan tu cuoi cung danh sach
        while (temp.next != null) {
            temp = temp.next;
        } // vong lap chay den khi nao ma phan tu cuoi cung no = null dung vong lap
        // phan tu cuoi cung khong tro den node khac nen null
        //moi vong chay thi bien temp no tro den bien ke tiep den bien cuois cung
        //tai bien cuoi cung
        temp.next = new Node(e);
        numNodes++;
    }
    public  Object get(int index){
        //khai bao bien temp tro toi head
        Node temp = head;
        for( int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.data;
    }
    public int size(){
        return numNodes;
    }

}

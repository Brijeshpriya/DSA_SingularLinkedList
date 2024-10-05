public class S_deleteFirst {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;

        }
        Node currNode=head;
        while (currNode.next!=null) {
            currNode=currNode.next;

        }
        currNode.next=newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while (currNode!=null) {
            System.out.print(currNode.data +" ->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
    }
    public static void main(String[] args) {
        S_deleteFirst list =new S_deleteFirst();
        list.addLast("this");
        list.addLast("is");
        list.addLast("list");
       
        list.printList();
        list.deleteFirst();
        list.printList();
    }
}

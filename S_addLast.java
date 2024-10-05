public class S_addLast {
    Node head;
    class Node {
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
        System.out.print("NULL");

    }
    public static void main(String[] args) {
        S_addLast list=new S_addLast();
        list.addLast("this");
        list.addLast("is");
        list.addLast("car");
        list.printList();
    }
    
}


public class S_addFirst {
    Node head;
        class Node{
            String data;
            Node next;
            
            Node(String data){
                this.data=data;
                this.next=null;
            }
        }
    public void addFirst(String data){
        Node newNode=new  Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

        
    }
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" -->");
            currNode=currNode.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        S_addFirst list=new S_addFirst();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.printList();
        
    }
}
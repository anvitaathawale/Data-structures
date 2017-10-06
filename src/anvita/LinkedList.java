package anvita;


public class LinkedList {

	    Node head;

	    public class Node{

	        int data;
	        Node next;
	        Node(int d){

	            data=d;
	            next=null;
	        }
	    }

	    public void append(int new_data)
	    {
	        if(head==null) {
	            head=new Node(new_data);
	            return;
	        }
	        Node current=head;
	        while(current.next!=null) {
	            current=current.next;
	        }
	        current.next=new Node(new_data);
	    }


	    //INSERT
	    public void insert(int data, Node prev_node)
	    {
	        if(prev_node==null) {
	            return;

	        }
	        Node new_node=new Node(data);
	        new_node.next=prev_node.next;
	        prev_node.next=new_node;
	    }

	    public void prepend(int data) {

	        Node newHead=new Node(data);
	        newHead.next=head;
	        head=newHead;
	    }

	    //DELETE
	    public void deleteWithValue(int data) {

	        if(head==null)
	            return;
	        //if the node you want to delete is head
	        if(head.data==data)
	        {
	            //cut me out of the linked list
	            head=head.next;
	            return;
	        }

	        //walk through the linked list starting from head value
	        Node current=head;
	        while(current.next!=null) {

	            if(current.next.data==data) {

	                current.next=current.next.next;
	                return;

	            }
	            current=current.next;
	        }
	    }

	    public void printList()
	    {
	        Node tnode=head;
	        while(tnode!=null)
	        {
	            System.out.println(tnode.data+" ");
	            tnode=tnode.next;
	        }
	    }
	    public static void main(String[] args)
	    {
	        LinkedList list=new LinkedList();
	        list.append(4);

	        list.prepend(5);
	        list.insert(8,list.head.next);
	        System.out.println("linked list");
	        list.printList();



	    }
	}







package project;

import java.util.*;

public class Node 
{
	  String data;
	  Node next,head;
	  static Node Create() 
	  {
		  String y;
		  Scanner sc = new Scanner(System.in);
		  Node head = new Node();
		  head = null;
		  Node temp = new Node();
		  System.out.println("Enter data: ");
		  y = sc.next();
		  String ss = "stop";
		  while(y.equalsIgnoreCase(ss))
		  {
			  Node newnode = new Node();
			  newnode.data=y;
			  if(head==null)
			  {
				  head = newnode;
				  temp = newnode;
			  }
			  else
			  {
				  temp.next = newnode;
				  temp = temp.next;
			  }
			  y = sc.next();
		  }
		  return head;
	  }
	  static void display(Node head)
	  {
		  Node temp = head;
		  while(temp!=null)
		  {
			  System.out.print(temp.data+"-->");
			  temp=temp.next;
		  }
	  }
	  static Node delete(Node head)
	  {
		  if (head == null)
			  return null;
		  Node temp = head;
		  head = head.next;
		  return head;
	  }
	  static void search(Node l,String y)
	  {
		  Node temp = l;
		  while(temp!=null)
		  {
			  if(temp.data == y)
			  {
				  System.out.println("FOUND");
				  return;
			  }
			  temp=temp.next;
		  }
		  System.out.println("NOT FOUND");
	  }
	  static Node insert(Node head, String y)
	  {
		  Node new_node = new Node();
		  new_node.data = y;
		  new_node.next = (head);
		  (head) = new_node;
		  return head;
	  }
	  
	  static Node deleteLastNode(Node head)
	  {
		  if (head == null)
		  return null;
		  if (head.next == null) 
		  {
			  return null;
		  }
		  Node second_last = head;
		  while (second_last.next.next != null)
		  second_last = second_last.next;
		  second_last.next = null;
		  return head;
	  }
	  static void deleteAtmid(Node head)
	  {
		  int c=0;
		  Node temp=head;
		  Node temp1=head;
		  while(temp !=null) 
		  {
			  c++;
			  temp=temp.next;
		  }
		  c=c/2;
		  int i=1;
		  while(i!=c-1) 
		  {
			  temp1=temp1.next;
			  i++;
		  }
		  temp1.next=temp1.next.next;
	  }
	  static Node deleteNthFromEnd(Node head, int B)
	  {
		  int len = 0;
		  Node temp = head;
		  while (temp != null)
		  {
			  len++;
			  temp = temp.next;
		  }
		  if (B > len)
		  {
			  System.out.print("Length of the linked list is " + len);
			  System.out.print(" we can't remove "+ B +
			  "th node from the");
			  System.out.print(" linked list\n");
			  return head;
		  }
		  else if (B == len)
		  {
			  return head.next;
		  }
		  else
		  {
			  int diff = len - B;
			  Node prev= null;
			  Node curr = head;
			  for(int i = 0; i < diff; i++)
			  {
				  prev = curr;
				  curr = curr.next;
			  }
			  prev.next = curr.next;
			  return head;
		  }
	  }
	  static void insertAtLast(Node head,String y) 
	  {
		  Node newnode=new Node();
		  newnode.data=y;
		  newnode.next=null;
		  Node temp=head;
		  while(temp.next!=null) 
		  {
			  temp=temp.next;
		  }
		  temp.next=newnode;
	  }
	  static void inserafter(Node head,String y,String key) 
	  {
		  Node newnode=new Node();
		  newnode.data=y;
		  Node temp=head;
		  while(temp.data!=key)
		  temp=temp.next;
		  newnode.next=temp.next;
		  temp.next=newnode;
	  }
	  static void insertAtmid(Node head,String y) 
	  {
		  int c=0;
		  Node newnode=new Node();
		  newnode.data=y;
		  Node temp=head;
		  Node temp1=head;
		  while(temp!=null)
		  {
			  c++;
			  temp=temp.next;
		  }
		  c=c/2;
		  int i=1;
		  while(i!=c)
		  {
			  temp1=temp1.next;
			  i++;
		  }
		  newnode.next=temp1.next;
		  temp1.next=newnode;
	  }
	  public static void main(String[] args) 
	  {
		  Scanner scan = new Scanner(System.in);
		  int ch;
		  Node head = new Node();
		  boolean b = true;
		  while(b)
		  {
			  System.out.println("MENU\n1.Create\n2.Display\n3.insert at first\n"
			  		+ ""+ "4.insert at middle\n5.insert at last\n6.insert after specific "
			  				+ "node\n"+ "7.delete at first\n8.delete nth node "
			  						+ "from end\n9.delete at last\n10.delete "
			  						+ "at mid\n11.search\n12.exit\nENTER YOUR CHOICE");
			  ch = scan.nextInt();
			  switch(ch)
			  {
			  	case 1: head = Create();
			  		break;
			  	case 2: display(head);
			  		break;
			  	case 3: System.out.println("Enter data");
			  		head=insert(head ,scan.next()) ;
			  		break;
			  	case 4: System.out.println("Enter data");
			  		insertAtmid(head,scan.next());
			  		break;
			  	case 5:System.out.println("Enter data");
			  		insertAtLast(head,scan.next());
			  		break;
			  	case 6: System.out.println("Enter data and after which value u want to add the node");
			  	inserafter(head,scan.next(),scan.next());
			  		break;
			  	case 7: head=delete(head);
			  		break;
			  	case 8: System.out.println("Enter node u want to delete from end");
			  		break;
			  	case 9:deleteLastNode(head);
			  		break;
			  	case 10:deleteAtmid(head);
			  		break;
			  	case 11: System.out.println("Enter data u want to search");
			  		search(head,scan.next()) ;
			  		break;
			  	case 12:b=false;
			  		break;
			  }
		  }
	  }
 }

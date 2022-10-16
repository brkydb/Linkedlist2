package LinkedList2;

public class SingleList {

	Node head = null;
	Node tail = null;

	void addhead(int x) {
		
		Node eleman = new Node();
		eleman.data = x;
		
		if (head == null) {
			
			eleman.next = null;
			head = eleman;
			tail=eleman ;
			System.out.println("Liste yapýsý oluþturuldu.");
			
		}
		
		else {
			eleman.next = head;
			head = eleman;
			System.out.println("Baþa eleman eklendi");
		}
	}
	
	void addtail(int x) {
		
		Node eleman = new Node();
		eleman.data = x;
		
		if (head == null) {
			
			eleman.next = null;
			head = eleman;
			tail=eleman ;
			System.out.println("Liste yapýsý oluþturuldu.");
			
		}
		
		else {

			eleman.next = null;
			tail.next = eleman ;
			tail = eleman;
			System.out.println("Sona eleman eklendi");
		
		}

	}
	void yazdir() {
		
		if (head == null) {
			System.out.println("Liste yapýsý boþ");
			
		}
		else {
			
			Node temp = head;
			
			System.out.print("Liste: ");
		
		while (temp != null) {
			System.out.print(temp.data + " - " );
			temp=temp.next;
		}
		System.out.print(" son");
		}
	}





















}


public class LinkedListt {

	Node head = null;
	Node tail = null;
	
	void add(int x) {
		
		Node eleman = new Node();
		eleman.data = x;
		eleman.next = null;
		
		if (head == null) {
		
			head = eleman;
			tail = eleman;
			
			System.out.println("Liste olu�turuldu ve ilk obje eklendi.");
		}
		else {
			
			tail.next = eleman ;
			tail = eleman ;
			
			System.out.println("Listenin sonuna eleman eklendi.");
			
		}
	}
	
	public void print() {
		
		if (head == null) {
			System.out.println("Liste yap�s� bo�.");
		}
		else {
			Node temp = head;
			
			System.out.println("Ba�lang��:");
			while (temp!= null) {
				
				System.out.println(temp.data);
				temp = temp.next;
			}
			
			System.out.println("Son:");
		}
		
	}
}

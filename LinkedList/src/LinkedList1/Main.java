package LinkedList1;

public class Main {
	
	public static void main(String[] args) {
		
		ClassOne object1 = new ClassOne();
		
		ClassOne object2 = new ClassOne();

		ClassOne object3 = new ClassOne();
		
		object1.sayi = 11;
		object2.sayi = 2;
		object3.sayi = 22;
		
		
		object1.next = object2;
		object2.next = object3;
		object3.next = null;
		
		//System.out.println(object2.sayi);
		
		ClassOne temp = object1;
		
		
		
		while (temp.next != null) {
			
			System.out.println(temp.sayi);
			
			temp = temp.next;
		}

		
		
	}

}
package LinkedList2;

public class Main {

	public static void main(String[] args) {

		SingleList tekyonliste = new SingleList();
		
		tekyonliste.addhead(10);
		tekyonliste.addhead(15);
		tekyonliste.addhead(12);
		tekyonliste.addtail(20);
		tekyonliste.addhead(456);
		tekyonliste.addtail(123);
		
		//System.out.println("En baştaki sayı :" + tekyonliste.head.data);
		//System.out.println("En sondaki sayı :" + tekyonliste.tail.data);
		
		tekyonliste.yazdir();
		
	}

}

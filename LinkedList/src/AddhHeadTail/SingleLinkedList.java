package AddhHeadTail;

public class SingleLinkedList {

	Node head = null;
	Node tail = null;

	void BasaElemanEkle(int x) {

		Node eleman = new Node();
		eleman.data = x;

		if (head == null) {

			eleman.next = null;
			head = eleman;
			tail = eleman;

			System.out.println("liste oluþturuldu. ilk eleman eklendi.");
		} else {
			eleman.next = head;
			head = eleman;
			System.out.println("baþa eleman eklendi");

		}

	}

	void SonaElemanEkle(int x) {

		Node eleman = new Node();
		eleman.data = x;

		if (head == null) {

			eleman.next = null;
			head = eleman;
			tail = eleman;

			System.out.println("liste oluþturuldu. ilk eleman eklendi.");
		} else {

			eleman.next = null;
			tail.next = eleman;
			tail = eleman;
			System.out.println("sona eleman eklendi");

		}

	}

	void print() {

		if (head == null) {
			System.out.println("liste yok");
		} else {
			Node temp = head;
			System.out.print("Baþlangýç: ");
			while (temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println(" liste sonu.");

		}

	}

	void ArayaElemanEkle(int indis, int x) {

		Node eleman = new Node();
		eleman.data = x;

		if (head == null && indis == 0) {

			eleman.next = null;
			head = eleman;
			tail = eleman;

			System.out.println("liste oluþturuldu. ilk eleman eklendi.");
		} else if (head != null && indis == 0) {
			eleman.next = head;
			head = eleman;
			System.out.println(indis + ". sýraya yeni eleman eklendi");

		} else if (head == null && indis >= 0) {
			System.out.println("Listede henüz eleman yok");
		} else {

			int n = 0;
			Node temp = head;
			Node temp2 = head;

			while (temp.next != null) {

				n++;
				temp2 = temp;
				temp = temp.next;

			}
			if (n == indis) {

				temp2.next = eleman;
				eleman.next = temp;
				System.out.println("Eleman eklendi ");
			} else {

				temp = head;
				temp2 = head;
				int i = 0;
				while (i != indis) {
					temp2 = temp;
					temp = temp.next;
					i++;
				}
				temp2.next = eleman;
				eleman.next = temp;
				System.out.println(indis + ". sýraya yeni eleman eklendi");

			}

		}

	}

	void BastanElemanSil() {

		if (head == null) {
			System.out.println("Liste Boþ. Silecek eleman yok.");
		} else if (head.next == null) {
			head = null;
			tail = null;
			System.out.println("Lsitedeki son eleman da silindi.");
		} else {
			head = head.next;
		}
	}

	void SondanElemanSil() {

		if (head == null) {
			System.out.println("Liste Boþ. Silecek eleman yok.");
		} else if (head.next == null) {
			head = null;
			tail = null;
			System.out.println("Lsitedeki son eleman da silindi.");
		} else {

			Node temp = head;
			Node temp2 = head;
			while (temp.next != null) {

				temp2 = temp;
				temp = temp.next;

			}
			temp2.next = null;
			tail = temp2;
			System.out.println("Sondan eleman silindi.");

		}

	}

	void AradanElemanSil(int indis) {

		if (head == null) {
			System.out.println("Liste Boþ. Silinecek Eleman Yok.");
		} 
		
		else if (head.next == null && indis == 0) {
			head = null;
			tail = null;
			System.out.println("Listede kalan son eleman da silindi.");
		}
		
		else if (head.next != null && indis == 0) {
			head = head.next;
			System.out.println("Baþtaki eleman silindi");

		}

		else {

			int i = 0;
			Node temp = head;
			Node temp2 = head;

			while (temp != null) {
				i++;
				temp2 = temp;
				temp = temp.next;
			}
			if (i == indis) {
				temp2.next = null;
				tail = temp2;
				System.out.println("Listedeki son eleman silindi.");
			} else {

				temp = head;
				temp2 = head;
				
				int j = 0;
				while (j != indis) {

					temp2 = temp;
					temp = temp.next;
					j++;
				}

				temp2.next = temp.next;
				System.out.println("Aradaki nesne silindi");
			}

		}

	}

}

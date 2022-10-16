package AddhHeadTail;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		SingleLinkedList singlelist = new SingleLinkedList();

		int se�im = 1;

		Scanner scan = new Scanner(System.in);

		int sayi;
		int indis;

		while (se�im != 0) {

			System.out.println("Listenin ba��na eleman eklemek i�in -> 1");
			System.out.println("Listenin sonuna eleman eklemek i�in -> 2");
			System.out.println("Listeye ara eleman eklemek i�in -> 3");
			System.out.println("Listenin ba��ndan eleman silmek i�in -> 4");
			System.out.println("Listenin sonundan eleman silmek i�in -> 5");
			System.out.println("Listeden ara eleman silmek i�in -> 6");
			System.out.println("��k�� i�in -> 0");
			se�im = scan.nextInt();
		

		if (se�im == 1) {

			System.out.println("Listenin ba��na eklemek istedi�iniz say�y� giriniz: ");
			sayi = scan.nextInt();
			singlelist.BasaElemanEkle(sayi);
			singlelist.print();
			System.out.println("----------------");

		} else if (se�im == 2) {

			System.out.println("Listenin sonuna eklemek istedi�iniz say�y� giriniz: ");
			sayi = scan.nextInt();
			singlelist.SonaElemanEkle(sayi);
			singlelist.print();
			System.out.println("----------------");

		}

		else if (se�im == 3) {

			System.out.println("Listeye eklemek istedi�iniz ara eleman� giriniz: ");
			sayi = scan.nextInt();
			System.out.println("Ka��nc� s�raya eklemek istersiniz ?");
			indis = scan.nextInt();
			singlelist.ArayaElemanEkle(indis, sayi);
			singlelist.print();
			System.out.println("----------------");

		}
		else if (se�im == 4) {

			singlelist.BastanElemanSil();
			singlelist.print();
			System.out.println("----------------");

		}

		else if (se�im == 5) {

			singlelist.SondanElemanSil();
			singlelist.print();
			System.out.println("----------------");

		}
		else if (se�im == 6) {

			System.out.println("Ka��nc� Eleman� Silmek �stersiniz ?");
			indis = scan.nextInt();
			singlelist.AradanElemanSil(indis);
			singlelist.print();
			System.out.println("----------------");

		}
		else if (se�im == 0) {
			System.out.println("Program sonland�r�ld�.");
			System.out.println("----------------");
		}
		else {
			System.out.println("Hatal� se�im yapt�n�z.");
			System.out.println("----------------");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		/*
		 * singlelist.BasaElemanEkle(11); singlelist.BasaElemanEkle(22);
		 * singlelist.BasaElemanEkle(5); singlelist.SonaElemanEkle(33);
		 * singlelist.BasaElemanEkle(44); singlelist.BasaElemanEkle(55);
		 * singlelist.BasaElemanEkle(66); singlelist.SonaElemanEkle(77);
		 * singlelist.SonaElemanEkle(88); singlelist.BasaElemanEkle(99);
		 * 
		 * System.out.println("-----------------------");
		 * 
		 * System.out.println("Ba�taki eleman: " +singlelist.head.data);
		 * System.out.println("Sondaki eleman: " +singlelist.tail.data);
		 * 
		 * System.out.println("-----------------------");
		 * 
		 * singlelist.ArayaElemanEkle(3, 25); singlelist.ArayaElemanEkle(6, 50);
		 * singlelist.ArayaElemanEkle(0, 3);
		 * 
		 * System.out.println("-----------------------");
		 * 
		 * singlelist.BastanElemanSil(); singlelist.BastanElemanSil();
		 * singlelist.SondanElemanSil();
		 * 
		 * singlelist.AradanElemanSil(2); singlelist.AradanElemanSil(3);
		 * 
		 * singlelist.print();
		 */

	}

}

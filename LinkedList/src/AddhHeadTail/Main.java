package AddhHeadTail;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		SingleLinkedList singlelist = new SingleLinkedList();

		int seçim = 1;

		Scanner scan = new Scanner(System.in);

		int sayi;
		int indis;

		while (seçim != 0) {

			System.out.println("Listenin baþýna eleman eklemek için -> 1");
			System.out.println("Listenin sonuna eleman eklemek için -> 2");
			System.out.println("Listeye ara eleman eklemek için -> 3");
			System.out.println("Listenin baþýndan eleman silmek için -> 4");
			System.out.println("Listenin sonundan eleman silmek için -> 5");
			System.out.println("Listeden ara eleman silmek için -> 6");
			System.out.println("Çýkýþ için -> 0");
			seçim = scan.nextInt();
		

		if (seçim == 1) {

			System.out.println("Listenin baþýna eklemek istediðiniz sayýyý giriniz: ");
			sayi = scan.nextInt();
			singlelist.BasaElemanEkle(sayi);
			singlelist.print();
			System.out.println("----------------");

		} else if (seçim == 2) {

			System.out.println("Listenin sonuna eklemek istediðiniz sayýyý giriniz: ");
			sayi = scan.nextInt();
			singlelist.SonaElemanEkle(sayi);
			singlelist.print();
			System.out.println("----------------");

		}

		else if (seçim == 3) {

			System.out.println("Listeye eklemek istediðiniz ara elemaný giriniz: ");
			sayi = scan.nextInt();
			System.out.println("Kaçýncý sýraya eklemek istersiniz ?");
			indis = scan.nextInt();
			singlelist.ArayaElemanEkle(indis, sayi);
			singlelist.print();
			System.out.println("----------------");

		}
		else if (seçim == 4) {

			singlelist.BastanElemanSil();
			singlelist.print();
			System.out.println("----------------");

		}

		else if (seçim == 5) {

			singlelist.SondanElemanSil();
			singlelist.print();
			System.out.println("----------------");

		}
		else if (seçim == 6) {

			System.out.println("Kaçýncý Elemaný Silmek Ýstersiniz ?");
			indis = scan.nextInt();
			singlelist.AradanElemanSil(indis);
			singlelist.print();
			System.out.println("----------------");

		}
		else if (seçim == 0) {
			System.out.println("Program sonlandýrýldý.");
			System.out.println("----------------");
		}
		else {
			System.out.println("Hatalý seçim yaptýnýz.");
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
		 * System.out.println("Baþtaki eleman: " +singlelist.head.data);
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

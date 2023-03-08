package lesson018;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueOrnek2 {

	public static void main(String[] args) throws InterruptedException {

		// Bir tane queue oluşturalım
		// 10-12 tane isim queueya
		// daha sonra 1-10 arasın bir sayı üretcez bu sayi bizim pide sayımız

		// pide yazdıralım

		// kuyruga göre pideleri dağıtıcaz pideler bittiğinde pideler bitti yazdıralım
		// pideyi alan kişileri kuyruktan çıkarcaz
		// pideyi alamayan kişileir yazdıralım

		Queue<String> queue = new LinkedList<String>();

		queue.offer("Ahmet");
		queue.offer("Ali");
		queue.offer("Hasan");
		queue.offer("Hüseyin");
		queue.offer("Aslı");
		queue.offer("zeynep");
		queue.offer("mert");
		queue.offer("baran");
		queue.offer("tuna");
		queue.offer("hakan");

		Random random = new Random();
		int sayi = random.nextInt(1, 10);
		System.out.println(sayi);

		for (int i = 0; i < sayi; i++) {
			System.out.println(queue.poll() + " pidesini aldı");
			Thread.sleep(2000);
		}
		System.out.println(queue);
		for (String string : queue) {
			System.out.println(string + " pideyi alamadı");
		}
	}
}
package lesson003;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {
		// Kullanıcıdan sürekli sayı alalım sıfıra basınca sayıların çarpımını
		// yazdıralım

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz, ve 0'a basarak çıkın");

		int sayi = scanner.nextInt();
		int carpim = 1;
		int ilkDeger = 0;

		while (sayi != 0) {
			carpim = carpim * sayi;
			System.out.println("Bir sayı daha giriniz veya çıkış için 0'a basınız");
			sayi = scanner.nextInt();
			ilkDeger = 1;
		}
		if (ilkDeger == 0) {
			System.out.println("Programdan çıktınız");
		} else {
			System.out.println(carpim);
		}

	}

}

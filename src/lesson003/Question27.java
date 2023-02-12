package lesson003;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		// Girilen sayının basamaklarının toplamını bulan program

		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayi giriniz:");
		int sayi = scanner.nextInt();

		int toplam = 0;

		do {
			toplam += sayi % 10;
			sayi = sayi / 10;
		} while (sayi > 0);
		System.out.println(toplam);

	}

}

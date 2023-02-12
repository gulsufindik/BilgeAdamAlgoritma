package lesson003;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		// Girilen sayıya kadar tek olan sayıların toplamını bulan program

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");

		int sayi = scanner.nextInt();

		int toplam = 0;
		while (sayi != 0) {
			if (sayi % 2 != 0) {
				toplam += sayi;
			}
			sayi--;
		}
		System.out.println(toplam);

	}

}

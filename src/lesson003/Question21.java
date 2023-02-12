package lesson003;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		// Girilen sayıya kadar olan sayıların toplamını yazdıralım

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi = scanner.nextInt();

		int toplam = 0;

		for (int i = 1; i <= sayi; i++) {
			toplam = toplam + i;
		}
		System.out.println(toplam);

	}

}

package lesson003;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		// Girilen sayının asal olup olmadığını bulan program

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi = scanner.nextInt();
		if (sayi != 2 && sayi != 1 && sayi != 0) {
			for (int i = 2; i < sayi; i++) {
				if (sayi % i == 0) {
					System.out.println("Girdiğiniz sayı asal değildir");
					break;
				} else {
					System.out.println("Girdiğiniz sayı asal değildir");
					break;
				}
			}
		} else if (sayi == 2) {
			System.out.println("Girdiğiniz sayı asal sayıdır");
		} else {
			System.out.println("Girdiğiniz sayı asal sayı değildir");
		}

	}

}

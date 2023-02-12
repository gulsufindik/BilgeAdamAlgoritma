package lesson003;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		// Girilen sayının faktöriyelini hesaplayan program

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz...");
		int sayi = scanner.nextInt();
		int faktoriyel = 1;

		for (int i = 1; i <= sayi; i++) {
			faktoriyel = faktoriyel * i;
		}
		System.out.println("Girilen sayının faktoriyeli: " + faktoriyel);

	}

}

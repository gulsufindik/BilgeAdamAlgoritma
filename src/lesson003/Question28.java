package lesson003;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		// Girilen sayının 5'in kuvveti olup olmadığını bulan program

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz...");
		int sayi2 = scanner.nextInt();
		boolean kontrol = true;

		if (sayi2 == 0) {
			System.out.println("sıfırdan farklı bir değer girin");
		} else {
			while (kontrol == true) {
				if (sayi2 % 5 == 0) {
					sayi2 = sayi2 / 5;
					if (sayi2 == 1) {
						System.out.println("5'in kuvvetidir.");
						kontrol = false;
					}
				} else {
					System.out.println("5'in kuvveti değildir");
					kontrol = false;
				}
			}
		}

	}

}

package lesson001;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// Girilen sayının tek mi çift mi olduğunu bulan program

		Scanner scanner = new Scanner(System.in);

		System.out.println("Lütfen sayı giriniz: ");
		int sayi = scanner.nextInt();

		if (sayi % 2 == 0) {
			System.out.println("sayi çift sayıdır");
		} else
			System.out.println("girdiğiniz sayı tek sayıdır");
	}

}

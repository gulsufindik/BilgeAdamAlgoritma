package lesson001;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		String isim = "Gülsu";
		String soyisim = "Fındık";

		System.out.print("Hello: " + isim + " " + soyisim);

		System.out.println("\n\n*****\n");

		// Girilen isim ve soyisim yazdıralım.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Lütfen isminizi giriniz: ");
		String isim2 = scanner.nextLine();

		System.out.println("Lütfen soyisminizi giriniz: ");
		String soyisim2 = scanner.nextLine();

		System.out.print("girilen isim: " + isim2 + " " + " soyisim: " + soyisim2);
	}
}

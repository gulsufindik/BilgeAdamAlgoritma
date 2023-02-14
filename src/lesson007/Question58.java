package lesson007;

import java.util.Scanner;

public class Question58 {

	public static void main(String[] args) {
		// parametre olarak int alan ve int döndüren
		// girilen sayının kaç basamaklı olduğunu bulan methodu yazalım
		// 1000 -> string -> length

		// daha sonra farklı bir method yazalım
		// sayının 1000'den büyük olup olamadığını kontrol edelim
		// "10001 -> length 4'ten büyükse 1000'den büyük

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi = scanner.nextInt();
		bindenBuyukMu(sayi);
	}

	private static int kacBasamakli(int x) {
		String sayi = String.valueOf(x);
		int basamak = sayi.length();
		return basamak;
	}

	public static void bindenBuyukMu(int x) {
		int sayiniUzunlugu = kacBasamakli(x);
		if (sayiniUzunlugu >= 4) {
			System.out.println("sayi 1000 den büyüktür veya eşit");
		} else {
			System.out.println("sayi 1000 den büyüktür");
		}
	}

}

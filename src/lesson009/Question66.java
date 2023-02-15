package lesson009;

import java.util.Scanner;

public class Question66 {

	// menuyu oluşturalım
	// toplama methodu
	// kullanıcıdan 0 girene kadar sayıları alıyoruz
	// 0 girince sonucu gösterip tekrar menuyu gösteriyoruz.

	// kullanıcıdan ilk başta kaç adet sayı gireceksiniz onu alalım
	// kaç sayı girdiyse program bizden o kadar sayı alacak
	// sayıları çıkartıp sonucu verecek

	// bölme methodu
	// kullanıcıdan kaç adet sayı gireceğini alalım
	// girilen sayı 1 olduğunda girilen sayıların birbirlerine bölümünü versin

	public static void main(String[] args) {

		 menu();

	}

	public Scanner scanner = new Scanner(System.in);

	public static void menu() {
		boolean check = true;

		while (check) {
			System.out.println("1.Toplama");
			System.out.println("2.Çıkartma");
			System.out.println("Seçiminiz: ");
			Scanner scanner = new Scanner(System.in);
			int secim = scanner.nextInt();
			scanner.nextLine();
			switch (secim) {
			case 1:
				toplam();
				break;
			case 2:
				cikarma();
				break;
			case 3:
				bolme();
				break;
			case 4:
				usAlma();
				break;

			default:
				System.out.println("geçerli sayı giriniz");

			}

		}

	}

	private static void usAlma() {
		Scanner scanner = new Scanner(System.in);

		int usSonuc = 1;
		System.out.println("Taban: ");
		int sayi = scanner.nextInt();

		System.out.println("Us: ");
		int kuvvet = scanner.nextInt();
		for (int i = 0; i < kuvvet; i++) {
			usSonuc *= sayi;
		}
		System.out.println(usSonuc);
	}

	private static void bolme() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("kaç adet sayi gireceksiniz: ");
		int sayi = scanner.nextInt();
		float bolme = 0;
		for (int i = 0; i <= sayi; i++) {
			System.out.println(i + 1 + ". sayi");
			float a = scanner.nextFloat();

			if (i == 0) {
				bolme = a;
			} else {
				bolme = bolme / a;
			}

		}
		System.out.println("Sonuc " + bolme);
	}

	private static void cikarma() {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		int result = 0;
		System.out.println("kaç adet sayı girilecek");
		int n = scanner.nextInt();
		while (i < n) {
			System.out.println(i + " .sayi");
			int sayi = scanner.nextInt();
			if (i == 1) {
				result += sayi;
			}
			result -= sayi;
			i++;
			continue;
		}
		System.out.println("Sonuc " + result);

	}

	private static void toplam() {
		Scanner scanner = new Scanner(System.in);
		int toplam = 0;
		int i = 1;
		boolean check = true;

		while (check) {
			System.out.println(i++ + ". sayi");
			int sayi = scanner.nextInt();
			if (sayi != 0) {
				toplam += sayi;

			} else {
				check = false;
				System.out.println("Sonuc: " + toplam);
			}
		}
	}
}

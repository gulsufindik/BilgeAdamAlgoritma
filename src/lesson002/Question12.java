package lesson002;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// Dışarıdan iki tane değer alalım
		// Değerlerin toplamı çift ise true değilse false yazdıralım
		// Ardından sayıların toplamının yarısını yazdıralım

		Scanner scanner = new Scanner(System.in);
		boolean tekMi;
		int sayi1, sayi2, toplam;

		System.out.println("Birinci sayıyı giriniz: ");
		sayi1 = scanner.nextInt();

		System.out.println("İkinci sayiyi giriniz: ");
		sayi2 = scanner.nextInt();
		toplam = sayi1 + sayi2;
		if (toplam % 2 == 0) {
			tekMi = true;
		} else {
			tekMi = false;
		}
		System.out.println(tekMi);
		System.out.println("\n");
		System.out.println("Sayıların ortalaması: " + toplam / 2);
	}
}

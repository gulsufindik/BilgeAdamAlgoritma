package Marathon01;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir metin giriniz: ");
		String metin = scanner.nextLine();
		System.out.print("Bir harf giriniz: ");
		char harf = scanner.next().charAt(0);

		harfBul(metin, harf);
	}

	static void harfBul(String metin, char harf) {
		int karakterSayici = 0;
		for (int i = 0; i < metin.length(); i++) {
			if (metin.charAt(i) == harf) {
				karakterSayici++;
			}
		}
		System.out.println(karakterSayici);
	}

}
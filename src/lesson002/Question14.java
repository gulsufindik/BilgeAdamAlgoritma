package lesson002;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// Girilen 3 sayıyı büyükten küçüğe doğru sıralayan program

		Scanner scanner = new Scanner(System.in);
		System.out.println("Birinci sayıyı giriniz");
		double sayi1 = scanner.nextDouble();
		System.out.println("İkinci sayıyı giriniz ");
		double sayi2 = scanner.nextDouble();
		System.out.println("Üçüncü sayıyı giriniz");
		double sayi3 = scanner.nextDouble();

		if (sayi1 <= sayi2) {
			if (sayi2 <= sayi3) {
				System.out.println("sayi3 > sayi2 > sayi1");
			} else if (sayi3 <= sayi1) {
				System.out.println("sayi2 > sayi1 > sayi3");
			} else if (sayi1 < sayi3) {
				System.out.println("sayi2 > sayi3 > sayi1");
			}
		}
		if (sayi2 < sayi1) {
			if (sayi3 <= sayi2) {
				System.out.println("sayi1 > sayi2 > sayi3");
			} else if (sayi3 <= sayi1) {
				System.out.println("sayi1 > sayi3 > sayi2");
			} else if (sayi1 < sayi3) {
				System.out.println("sayi3 > sayi1> sayi2");
			}
		}

	}

}

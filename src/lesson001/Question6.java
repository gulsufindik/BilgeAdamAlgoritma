package lesson001;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// kullanıcıdan alınan vize ve final notlarını hesaplayarak
		// geçip geçmediğini hesaplayan program

		// vize %40
		// final %60
		// Ortalama 50'ye eşit veya büyükse geçer
		// ortalama 50'den küçükse kalır.

		Scanner scanner = new Scanner(System.in);

		System.out.println("vize :");
		float vizeNotu = scanner.nextFloat();

		System.out.println("Final :");
		float finalNotu = scanner.nextFloat();

		float ortalama = (vizeNotu * 0.4f) + (finalNotu * 0.6f);
		if (ortalama < 50) {
			System.err.println("Dersten kaldınız");
		} else
			System.out.println("Dersten geçtiniz");
	}
}

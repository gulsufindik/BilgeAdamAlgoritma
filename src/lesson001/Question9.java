package lesson001;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// Girilen ortalamanın harf notuna göre geçip geçmediğini bulan program

		// 90 > AA
		// 80 >= 90 BB
		// 70 >= 80 CC
		// 60 >= 70 DD
		// 60 < FF kaldı

		Scanner scanner = new Scanner(System.in);

		double ortalama;
		System.out.println("Ortalama giriniz ");

		ortalama = scanner.nextDouble();
		if (ortalama > 100 || ortalama < 0) {
			System.out.println("lütfen geçerli değerler girin");
		} else {
			if (ortalama >= 90) {
				System.out.println("AA");
			} else if (ortalama >= 80 && ortalama < 90) {
				System.out.println("BB");
			} else if (ortalama >= 70 && ortalama < 80) {
				System.out.println("CC");
			} else if (ortalama >= 60 && ortalama > 70) {
				System.out.println("DD");
			} else {
				System.out.println("FF");
			}

		}
	}
}

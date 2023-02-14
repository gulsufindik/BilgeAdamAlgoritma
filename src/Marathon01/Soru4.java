package Marathon01;

import java.util.Scanner;

public class Soru4 {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		System.out.println("Alanını veya çevresini hesaplamak istediğiniz şekli seçiniz: ");
		System.out.println("1.Kare alan hesaplama");
		System.out.println("2.Kare çevre hesaplama");
		System.out.println("3.Dikdörtgen alan hesaplama");
		System.out.println("4.Dikdörtgen çevre hesaplama");
		System.out.println("5.Daire alan hesaplama");
		System.out.println("6.Daire çevre hesaplama");
		System.out.println("7.Çıkış");

		int işlem = input.nextInt();
		if (işlem == 1) {

			int a = input.nextInt();
			int h = input.nextInt();
			double alan;
			alan = a * h;

			System.out.println("Karenin bir kenarını giriniz: ");
			double kenar = input.nextDouble();
			System.out.println("Karenizin alanı: " + alan);

		} else if (işlem == 2) {

			System.out.println("Karenin bir kenarını giriniz: ");
			int a = input.nextInt();
			int cevre = 4 * (a);
			System.out.println("Karenizin çevresi: " + cevre);

		}

		else if (işlem == 3) {

			System.out.println("Dikdörtgenin kısa kenar yüksekliğini giriniz: ");
			int a = input.nextInt();
			System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz: ");
			int b = input.nextInt();

			int alan = a * b;
			System.out.println("Dikdörtgeninizin alanı: " + alan);

		} else if (işlem == 4) {

			System.out.println("Dikdörtgenin kısa kenar uzunluğunu giriniz: ");
			int a = input.nextInt();
			System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz: ");
			int b = input.nextInt();

			int cevre = 2 * (a + b);
			System.out.println("Dikdörtgeninizin çevresi: " + cevre);

		} else if (işlem == 5) {

			System.out.println("Dairenin yarıçapını giriniz: ");

			int r = input.nextInt();
			double alan;
			alan = Math.PI * (r * r);

			System.out.println("Dairenizin alanı: " + alan);

		} else if (işlem == 6) {

			System.out.println("Daire yarı çapını giriniz : ");
			int r = input.nextInt();
			double cevre;
			cevre = Math.PI * 2 * r;

			System.out.println("Dairenizin çevresi: " + cevre);

		}

		else if (işlem == 7) {

			System.out.println("Çıkış");
		}
	}

}

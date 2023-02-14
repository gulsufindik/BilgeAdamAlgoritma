package lesson005;

import java.util.Arrays;

public class Question41 {

	public static void main(String[] args) {
		int[] sayilar = { 0, 120, -5, -85, -256, 16, 1258, 81, 14 };
		// 0 dan küçük sayılar yerine 100 koyalım;

		int enKuck = 0;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] <= enKuck) {
				sayilar[i] = 100;

				int yeniSayi = sayilar[i];
				System.out.println(i + ".index değişti " + yeniSayi);
			}
		}
	}
}

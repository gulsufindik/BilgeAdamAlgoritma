package lesson001;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// Girilen Tl değerin USD'ye çeviren program
		// 1 USD = 18.90 Tl

		Scanner input = new Scanner(System.in);
		System.out.println("Tl değerini giriniz: ");
		float tlDeger = input.nextFloat();

		float usd = 18.90f;
		float usdDegeri = tlDeger / usd;
		System.out.println("usd değeri -> %.2f" + usdDegeri);
		String kusuratliSayi = String.format("USD Değeri: %.2f", usdDegeri);
		System.out.println(kusuratliSayi);
	}
}

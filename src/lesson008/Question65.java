package lesson008;

import java.util.Random;
import java.util.Scanner;

public class Question65 {

	public static void main(String[] args) {
		// randomSayiUret methodu yazalım burda 1'den 500'e kadar random sayı üretelim
		// ortalama hesapla diye bir method yazalım
		
		// kullanıcıdan kaç tane sayıyla işlem yapmasını istediğini soralım
		// girdiği veriye göre içerde bir array aluşturalım ve random üretilen sayıları bu arreye
		// atalım daha sonra ortalamasını bulalım
		
		int[] array= sayiUret();
		System.out.println("ortalama " + ortalamaHesapla(array));

	}
	
	public static int[] sayiUret() {
		Scanner scanner = new Scanner(System.in)
				System.out.println("dizi uzunlugu ");
		int uzunluk = scanner.nextInt();
		int[] array = new int[uzunluk];
		for (int i=0; i < array.length; i++) {
			Random random = new Random();
			array[i] = random.nextInt(1,500);
			System.out.println(array[i]);
			
		}
		return array;
	}
	public static double ortalamaHesapla(int[] array) {
		double toplam = 0;
		double ortalama = 0;
		for (int i=0; i< array.length; i++) {
			toplam += array[i];
		}
		ortalama = toplam / array.length;
		return ortalama;
	}

}

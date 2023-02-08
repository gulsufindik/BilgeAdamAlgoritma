package lesson007;

import java.util.Scanner;

public class Question53 {

	public static void main(String[] args) {
		// iki kez üst üste aynı sayı
		// klavyeden girilene kadar döngü devam edecek
		// üst üste iki sayı girildiğinde o zamana kadar girilen sayıların ortalamasını veren program
		
		Scanner scanner = new Scanner(System.in);
		
		boolean kontrol = true;
		int eskiSayi = 0;
		int sayi = 0;
		int toplam = 0;
		int ortalama = 0;
		int sayac = 0;
		
		while(kontrol) {
			System.out.println("Lütfen bir sayı giriniz");
			sayi = scanner.nextInt();
			if( sayi != eskiSayi) {
				toplam += sayi;
				eskiSayi = sayi;
				sayac++;
			} else {
				kontrol = false;
			}
		} ortalama = toplam/sayac;
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

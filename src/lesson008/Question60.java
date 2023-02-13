package lesson008;

import java.util.Scanner;

public class Question60 {
	
	
	public static void main(String[] args) {
		// Doğum yılınızı girerek yaşınızı ve
		// hangi yüzyılda doğduğunu hesaplayan program
		
		// 3 farklı metod yazıcaz
		// yasHesapla
		// yuzYıl hesapla
		// bilgileriyazdır
		
		// bilgileriYazdir(1992);
		// hangi yüzyılda hemde yaşını söyleyecek
		bilgileriYazdir(1998);
	}
		public static int yasHesapla(int yil) {
			int yas = 2023 - yil;
			return yas;
			
		}
		public static int yuzYilhesapla(int yil) {
			int yuzyil = yil / 100 +1;
			return yuzyil;
		}
		public static void bilgileriYazdir(int yil) {
			Scanner scanner = new Scanner(System.in);
			int dogumYili = scanner.nextInt();
			int  yas = yasHesapla(yil);
			int hesaplanmısYuzYil = yasHesapla(yil);
			
			System.out.println("Yaşınız: "+ yas+ "Kaçıncı yüzyıl "+yuzYil);
		}

	}



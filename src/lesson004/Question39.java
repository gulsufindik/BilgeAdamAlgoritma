package lesson004;

import java.util.Scanner;

public class Question39 {

	public static void main(String[] args) {
		// Sayi tahmin uygulaması yapalım
		// sürekli kullanıcıdan sayıyı tahmin etmesini isteyelim
		// eğer kullanıcının girdiği sayı bulması gereken sayıdan az ise tahminleri yükseltin
		// fazla ise tahmininizi azaltın diyelim
		// doğru tahmin ettiği zaman kaçıncı denemesinde bulduğunu yazınız.
		
		public static void main(String[] args) {
			
		}
			
		Random random = new Random();
		int randomnumber = random.nextInt(0,101);
		
		int tahminSayisi = 0;
		int secim = -1;
		
		while(secim !=0) {
			System.out.println("üretilen -->"+ randomnumber);
			int tahmin = scanner.nextInt();
			
			tahminSayisi++;
			if (tahmin == randomnumber) {
				System.out.println("Tebrikler "+ tahminsayisi+ "Denemede buldunuz" );
				System.out.println("devam etmek istiyomusunuz Evetse 1 hayırsa 0")
			}
			
			System.out.println("üretilen -->" + randomnumber);
			int tahmin = scanner.nextInt();
			tahminSayisi++;
			
			if(tahmin == randomnumber) {
				tahminSayisi ++;
				System.out.println("Tebrikler "+ tahminSayisi+ "Denemede buldunuz");
				tahminSyasisi = 0;
			} else if (tahmin > rast) {
				System.out.println("Sayi artırın");
				tahminSayisi++;
			} else {
				System.out.println("sayacı artıcın");
				tahminSayici ++;
			}
		}
		
		
		System.out.println(randomnumber);

	}

}

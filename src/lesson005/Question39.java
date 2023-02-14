package lesson005;

import java.util.Random;
import java.util.Scanner;

public class Question39 {

	// Sayi tahmin uygulaması yapalım
	// sürekli kullanıcıdan sayıyı tahmin etmesini isteyelim
	// eğer kullanıcının girdiği sayı bulması gereken sayıdan az ise tahminleri
	// yükseltin
	// fazla ise tahmininizi azaltın diyelim
	// doğru tahmin ettiği zaman kaçıncı denemesinde bulduğunu yazınız.

	public static void main(String[] args) {
		// int rastgele = (int) (Math.random() *100);
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomnumber = random.nextInt(0, 101);

		int tahminSayisi = 0;
		int secim = -1;

		while (secim != 0) {

			System.out.println("üretilen -->" + randomnumber);
			int tahmin = scanner.nextInt();
			tahminSayisi++;
			if (tahmin == randomnumber) {
				System.out.println("Tebrikler " + tahminSayisi + " Denemede buldunuz");
				System.out.println("devam etmek istiyo musnuz Evetse 1 hayırsa 0");
				secim = scanner.nextInt();
				tahminSayisi = 0;
				randomnumber = random.nextInt(0, 101);
			} else if (tahmin > randomnumber) {
				System.out.println("Sayi azaltın");
			} else {
				System.out.println("sayacı artırın");

			}
		}

	}

}

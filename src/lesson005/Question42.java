package lesson005;

public class Question42 {

	public static void main(String[] args) {

		int[] sayilar = { 2, 4, 10, 5 };

		// bu sayı çiftdir ve bu sayı tekdir şeklinde çıktı alan ve.
		// dizi deki tüm sayıların toplamını veren program
		// dizinin içindeki elemanların toplamını yazdıralım

		int toplam = 0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam = toplam + sayilar[i];
			if (sayilar[i] % 2 == 0) {
				System.out.println(sayilar[i] + " Çifttir");
			} else {
				System.out.println(sayilar[i] + " Tektir");
			}
		}
		System.out.println(toplam);
	}

}

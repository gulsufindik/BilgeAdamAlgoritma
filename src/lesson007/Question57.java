package lesson007;

public class Question57 {

	public static void main(String[] args) {
		// topla methodu yazalım
		// toplam sonucunu kontrol edelim
		// sayının 10'dan büyük olup olmadığını bulalım

		int toplamSonuc = toplayici(5, 5);
		if (toplamSonuc > 10) {
			System.out.println("10'dan büyük");
		} else {
			System.out.println("10'dan küçük veya eşit");
		}
	}

	private static int toplayici(int sayi1, int sayi2) {
		int toplam = sayi1 + sayi2;
		return toplam;
	}

	private static boolean ondanByukKontrol(int sayi) {
		if (sayi < 18) {
			return toplam;
		}
	}

}

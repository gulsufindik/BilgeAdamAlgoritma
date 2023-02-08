package lesson001;

public class Question3 {

	public static void main(String[] args) {
		// Verilen ürünün satış fiyatının içinde
		// %18 kdv, %15 kar, ham fiyatı bulunuz.

		float satisFiyati = 100;
		float hamFiyat;
		float kar = 0.15f;
		float kdv = 0.18f;

		hamFiyat = satisFiyati - (satisFiyati * kar) - (satisFiyati * kdv);
		System.out.println("Ham Fiyatı =" + hamFiyat);

	}

}

package lesson005;

public class Question44 {

	public static void main(String[] args) {
		// negatif sayıları farklı bir arraye atalım

		int[] sayilar = { -2, -4, 10, 5, 4, 5, -5, -3, -3, -4, -3 };
		int count = 0;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] < 0) {
				count++;
			}
		}

		int[] negatifSayilar = new int[count];
		int index = 0;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] < 0) {
				negatifSayilar[index] = sayilar[i];
				index++;
			}
		}
		for (int i = 0; i < negatifSayilar.length; i++) {
			System.out.println(negatifSayilar[i]);
		}

	}

}
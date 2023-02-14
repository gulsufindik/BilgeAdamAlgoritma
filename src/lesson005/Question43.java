package lesson005;

public class Question43 {

	public static void main(String[] args) {
		// Dizi içerisinde 2 ve 4'ün kaç kere geçtiğini
		// Hangisinin daha fazla olduğunu bulan program
		// Output--> 4 ler 2 lerden daha fazla dizinin içinde 4 tane 4 var;
		// ÖDEV--> kaçları saymak istiyorsak kullanıcıdan alalım

		int[] array = { 1, 4, 4, 2, 4, 4, 2, 2, 9, 2, 8 };

		int sayac2 = 0;
		int sayac4 = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 2) {
				sayac2++;
			} else if (array[i] == 4) {
				sayac4++;
			}
		}
		System.out.println(sayac2 + " tane 2 var");
		System.out.println(sayac4 + " tane 4 var");

		if (sayac4 > sayac2) {
			System.out.println("4ler daha fazla");
		} else if (sayac4 < sayac2) {
			System.out.println("2ler daha fazla");
		} else {
			System.out.println("eşit");
		}
	}
}

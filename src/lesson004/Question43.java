package lesson004;

public class Question43 {

	public static void main(String[] args) {
		// dizi içerisinde 2 ve 4'ün kaç kere geçtiğini
		// hangisinin daha fazla olduğunu bulan program yazalım
		
		//output --> 4'ler 2'lerdn daha fazla dizinin içinde 4 tane 4 var;
		int[] array = {1, 3, 4, 4, 4, 4, 2, 2, 9, 8, 8};
		
		int sayac2 = 0;
		int sayac4 = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] == 2) {
				sayac ++;
			} else if(array[i] == 4) {
				sayac4 ++;
			}
		}
		System.out.println(sayac2 + " tane 2 var");
		System.out.println(sayac4 + " tane 4 var");
		
		if(sayac4 > sayac2) {
			System.out.println("4'ler daha fazla");
		}

	}

}

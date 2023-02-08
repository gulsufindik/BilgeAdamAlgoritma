package lesson007;

public class Question54 {

	public static void main(String[] args) {
		// Verilen dizide rakamların farkının en az olduğu syıların farkını bulalım
		
		int[] array2 = { 1, -10, -4, 3};
		//mutlak değer alabiliriz
		int mutlakDeger = Math.abs(-4);
		
		int[] fark = new int[array2.length];
		
		boolean kosul = true;
		
		while (kosul) {
			for (int i = 0; i < array2.length; i++) {
				if(i != array2.length-1) {
					fark[i] = Math.abs(array2[i]- array2[i+1]);
				} else if (i == array2.length -1) {
					kosul = false;
				}
			}
		}
		int max = fark[];
		
		for (int i=0; i < fark.length; i++) {
			if(fark[i] >max) {
		}
		
		
		
		
		
		
		
		

	}

}

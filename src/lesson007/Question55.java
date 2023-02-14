package lesson007;

public class Question55 {

	public static void main(String[] args) {

		// Verilen arrayda en büyük ve küçük değerleri bulan program
		String[] array = { "100", "8", "7", "5", "99", "85" };

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		// min 8
		// max
		for (int i = 0; i < array.length; i++) {
			if (Integer.parseInt(array[i]) < min) {
				min = Integer.parseInt(array[i]);
				// primitive int döndürüyor
				// ikisinin farkı

				min = Integer.valueOf(array[i]);
				// Nesne(Obje) döndürüyor

			} else if (Integer.parseInt(array[i]) > max) {
				max = Integer.parseInt(array[i]);
			}
		}
		System.out.println(min + " " + max);
	}

}

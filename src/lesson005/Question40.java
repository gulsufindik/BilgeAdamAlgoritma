package lesson005;

public class Question40 {

	public static void main(String[] args) {

		// a ile biten kelimelerin yerine ? koycaz
		// 0 index değişti diyelim --> yeni değeri(?)
		// 0. indexi değişti --> ?
		// 1. indexi değişti --> ?
		// 4. indexi değişti --> ?

		String[] dizi = { "Amerika", "Almayna", "İsveç", "Türkiye", "Danimarka" };

		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].endsWith("a")) {
				dizi[i] = "?";
				String yeniDeger = dizi[i];
				System.out.println(i + ".indexi değişti--> " + yeniDeger);
			}
		}
	}

}

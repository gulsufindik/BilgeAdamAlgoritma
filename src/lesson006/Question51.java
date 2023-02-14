package lesson006;

import java.util.Scanner;

public class Question51 {

	public static void main(String[] args) {

		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };

		// girilen metinde türkçe karakterleri ingilizce karaktere çeviriyoruz
		// Şeydaağ
		// Seydaag

		Scanner scanner = new Scanner(System.in);

		System.out.println("kelime: ");
		String newMetin = scanner.nextLine();
		for (int i = 0; i < turkceKarakter.length; i++) {
			newMetin = newMetin.replace(turkceKarakter[i], ingilizceKarakter[i]);
		}
		System.out.println(newMetin);
	}
}
package lesson007;

import java.util.Scanner;

public class Question56 {

	public static void main(String[] args) {
		// parametre olarak girilen isim ve soyisimi alıp ekrana yazdıralım
		
		private static String inputName(String name) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("isim giriniz");
			name = scanner.nextLine();
			return name;

		}

	}

}

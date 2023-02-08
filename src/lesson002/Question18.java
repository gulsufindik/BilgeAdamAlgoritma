package lesson002;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// Girilen char değerlerinin alfabenin 
		// içinde olup olmadığını kontrol eden program yazalım
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir karakter giriniz...");
		char ch = scanner.next().charAt(0);
		
		int asciiCode = ch;

		if ((ch <= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println(ch + " alfabetik bir karakterdir.");
		} else {
			System.out.println(ch + " alfabetik bir karakter değildir.");
		}
	}
}

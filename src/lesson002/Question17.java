package lesson002;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// Girilen karakterlerin asci kodunu bulan programı yazalım
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir karakter giriniz...");
		char ch = scanner.next().charAt(0);
		
		int asciiCode = ch;
		System.out.println("asciKodu " + asciiCode);
	}
}

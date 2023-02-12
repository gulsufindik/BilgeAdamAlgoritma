package lesson003;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		// Girilen sayı için çarpım tablosunu veren program

		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı giriniz:");
		int sayi = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(sayi + "x" + i + "=" + sayi * i);
		}

		// iç içe for kullanalım
		// bütün çarpım tablosunu yazdıralım

//		for(int i=1; i<=10; i++) {
//			for(int j=1; j<=10; j++) {
//				System.out.println(i +"x"+ j + "=" + i*j);
//			}
//		}

	}

}

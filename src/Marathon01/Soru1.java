package Marathon01;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {

		int a, b;
		int yildiz = 1;
		for (b = 0; b < 7; b++) {
			for (a = 0; a < yildiz; a++) {
				System.out.print("*" + " ");
			}
			System.out.println(" ");
			yildiz++;
		}

		for (b = 0; b < 4; b++) {
			for (a = 0; a < yildiz; a++) {
				System.out.print("*" + " ");
			}
			System.out.println(" ");

		}

	}

}

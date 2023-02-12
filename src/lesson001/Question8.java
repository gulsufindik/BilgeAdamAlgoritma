package lesson001;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// Kenarları girilen üçgenin nasıl bir üçgen olduğunu bulan program

		Scanner scanner = new Scanner(System.in);

		System.out.println("Birinci kenar sayısını giriniz: ");
		int kenar1 = scanner.nextInt();

		System.out.println("İkinci kenar sayısını giriniz: ");
		int kenar2 = scanner.nextInt();

		System.out.println("Üçüncü kenar sayısını giriniz: ");
		int kenar3 = scanner.nextInt();

		if (kenar1 > kenar2 && kenar2 > 0 && kenar3 > 0) {
			if (kenar1 == kenar2 && kenar2 == kenar3) {
				System.out.println("Eşkenar üçgendir");
			} else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
				if (kenar1 == 4) {
					System.out.println("kenar1 4tür");
				}
					System.out.println("İkizkenar üçgendir");
				} else {
					System.out.println("Çeşitkenar üçgendir");
				}
			} else {
				System.out.println("Üçgen oluşturamazsınız girdiğiniz sayılar sıfırdan büyük olması gerekiyor");
			}
		}
	}
}

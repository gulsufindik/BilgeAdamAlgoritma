package lesson002;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// Telefona ve maile gönderilen bir kod tanımlayalım.
		// E-maile ve telefona gelen kod uyuşuyorsa sisteme kayıt oldunuz diyelim
		// Uyuşmuyorsa ya mail yada telefon yada ikiside hatalıdır diye kullanıcıyı
		// bilgilendirelim.

		int telKod = 243;
		int mailKod = 333;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Telefona gelen kodu giriniz: ");
		int kod1 = scanner.nextInt();
		System.out.println("E-maile gelen kodu giriniz: ");
		int kod2 = scanner.nextInt();

		if (kod2 == mailKod && kod1 == telKod) {
			System.out.println("Sisteme kayıt oldunuz");
		} else if (kod2 != mailKod && kod1 == telKod) {
			System.out.println("E-mail kodunuzu hatalı girdiniz!");
		} else if (kod2 == mailKod && kod1 != telKod) {
			System.out.println("Telefon kodunu hatalı girdiniz!");
		} else {
			System.out.println("Girilen her iki koduda hatalı girdiniz!");
			System.out.println("Üzgünüm sisteme kaydınız gerçekleşemedi.");
		}
	}
}

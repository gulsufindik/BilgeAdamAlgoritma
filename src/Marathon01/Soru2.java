package Marathon01;

import java.util.Scanner;
import java.util.Arrays;

public class Soru2 {

	public static void main(String[] args) {

		System.out.print("Lütfen sayı dizinizin basamak sayısınız giriniz: ");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();

		int sayiDizisi[] = new int[x];
		int sayiDizisi2[] = new int[x];

		for (int i = 0; i < sayiDizisi.length; i++) {
			System.out.print((i + 1) + ". Sayıyı giriniz : ");
			sayiDizisi[i] = input.nextInt();
		}
		Arrays.sort(sayiDizisi);
		System.out.println("int sayiDizisi[]= " + Arrays.toString(sayiDizisi));

		int tekrarEden = 0;
		for (int t : sayiDizisi) {
			int a = 0;
			for (int j = 0; j < sayiDizisi.length; j++) {
				if (t == sayiDizisi2[j]) {
					a++;
				}
			}
			if (a == 0) {
				int counter = 0;
				for (int i : sayiDizisi) {
					if (t == i) {
						counter++;
					}
				}
				sayiDizisi2[tekrarEden] = t;
				tekrarEden++;
				System.out.println(t + " sayısı " + counter + " kez tekrar ediyor. ");
			}

		}
	}
}

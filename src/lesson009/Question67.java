package lesson009;

public class Question67 {

	public static void main(String[] args) {
		// Cosenio

		// girilen sayı arraydaki kaç tane sayıdan büyük olduğunu bulan method
		// array uzunluğu 1 ile 100 arasında olsun
		// girilen sayi 1 ile 100 arasında olsun
		// arrayin içindeki sayılarda 1 ile 100 arasında olsun
		// method int bir değer dönsün

		int[] myNum = { 1, 3, 4, 6, 9 };

		// buyukleriSay(myNum, 6); // -> 3
		// buyukleriSay(muNum, 3); // -> 1
		System.out.println(kucukleriSayi(myNum, 90));
	}

	public static int kucukleriSayi(int[] arr, int sayi) {
		if (arr.length < 0 || arr.length > 100) {
			System.out.println("arrayin uzunluğu hatalı");
		}
		if (sayi < 0 || sayi > 100) {
			System.out.println("sayi hatalı");
		}
		for (int number : arr) {
			if (number < 0 || number > 100) {
				System.out.println("arrayin elemanları hatalı");
			}
		}
		int sayac = 0;

		for (int i = 0; i < arr.length; i++) {
			if (sayi < arr[i]) {
				sayac++;
			}
		}
		return sayac;
	}

}

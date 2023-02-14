package lesson003;

public class Question24 {

	public static void main(String[] args) {
		// 1'den 100'e kadar olan çift sayıların toplamını
		// tek sayıların toplamına oranını bulan program

		double cift = 0;
		double tek = 0;

		for (int i = 1; i <= 99; i += 2) {
			tek += i;
		}
		for (int i = 2; i <= 100; i += 2) {
			cift += i;
		}
		double oran = cift / tek;
		System.out.println(oran);

	}

}
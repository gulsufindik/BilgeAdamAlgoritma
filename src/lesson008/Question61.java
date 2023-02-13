package lesson008;

public class Question61 {

	public static void main(String[] args) {
		// 1'den 1000'e kadar olan sayıların asal olanlarını bulan methodu yazalım
		// asalMi methodunu yazacağız, bu methotta sadece asal mı diye bakıyoruz
		// daha sonra mainde for döngüsüne sokup bulalım
		
		for (int i=2; i<1000; i++) {
			asalMi(i);
		}
		
			
	private static void asalMi(int sayi) {
		
		boolean asalMi = true;
			
			for(int j=2; j<sayi; j++) {
				if(sayi%j ==0) {
					asalMi = false;
				}
			}
			if(asalMi) {
				System.out.println(sayi+" asaldır");
			}
			
		}

	}

	}

}

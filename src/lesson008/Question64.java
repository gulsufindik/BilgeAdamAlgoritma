package lesson008;

public class Question64 {

	public static void main(String[] args) {
		// Cosenio
		// girilen kelimesini ilk ve son harfini değiştirelim
		// girilen kelime 0 ile 100 arasında olması lazım
		System.out.println(harfDegistir("cosenio"));

	}

	public static String harfDegistir(String kelime) {
		if (kelime.length() < 2) {
			return kelime;
		}

		if (kelime.length() > 100 || kelime.length() < 0) {
			System.out.println("yanlış");
		}
		
		/* StringBuilder stringBuilder = new StringBuilder(kelime);
		 * char first = kelime.carAt(0);
		 * char last = kelime.charAt(kelime.length()-1, first);
		 * stringBuilder.setCharAt(0,last);
		 * stringBuilder.setCharAt(kelime.length()-1,first);
		 * return stringBuilder.toString();
		 */
		
		char[] ch = kelime.toCharArray();
		char ilkHarf = ch[0];
		char sonHarf = ch[ch.length - 1];
		ch[0] = sonHarf;
		ch[ch.length - 1] = ilkHarf;
		return String.valueOf(ch);

	}
	public static boolean isPalindrome(String kelime) {
		//kelime -> kayak
		//ters çevrilmiş kelime -> kayak
		//bu ikisi eşit mi
		String tersi = new StringBuilder(kelime).reverse().toString();
		boolean kontrol = kelime.equals(tersi);
		return kontrol;
		
		
		
	}
}

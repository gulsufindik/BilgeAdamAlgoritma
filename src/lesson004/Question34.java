package lesson004;

public class Question34 {

	public static void main(String[] args) {
		// Verilen kelimenin harflerini alt alta yazdıralım
		
		String text = "java";
		for(int i=0; i<text.length(); i++) {
			System.out.println(text.charAt(i));
		}
		
		// kullanıcıdan bir string değer alalım
		// aldığımız değeri
		// java
		// 0. indexi -> j
		// 1. indexi -> a
		
		Scanner scanner = new Scanner(System.in);
		String text2 = scanner.nextLine();
		
		for(int i = 0; i<text2.lenght(); i++) {
			System.out.println(+ ". indexi " + text2.charAt(i));
		}
		
		

	}

}

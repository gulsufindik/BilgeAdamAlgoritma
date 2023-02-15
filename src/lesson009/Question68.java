package lesson009;

public class Question68 {

	public static void main(String[] args) {
		// girilen kelimedeki sesli harflerin sayısını bulan methodu yazalım
		// method int dönsün parametre olarak String alsın

		System.out.println(sesliHarfleriSay("javaaa"));
	}

	private static int sesliHarfleriSay(String kelime) {
		int count = 0;
		for (int i = 0; i < kelime.length(); i++) {
			char karakter = kelime.charAt(i);

			switch (karakter) {
			case 'a', 'e', 'i', 'o', 'u':
				count++;
				continue;

			default:
				break;
			}
		}
		return count;
	}

}

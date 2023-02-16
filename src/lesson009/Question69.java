package lesson009;

import java.util.Scanner;

public class Question69 {

	static String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
			"Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
			"Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
			"Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
			"Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
			"Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };

	// parametre olarak girilen metine göre ikinci harfinden harf ile
	// bulunan şehirlerin ilk üç harfini büyük bastıran method
	// "a"
	// Bayburt -> BAY
	// Karaman -> KAR

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String deger = scanner.nextLine();
//		ilMethodu(deger.charAt(1));

	}

	public static void ilMethodu(char x) {
		for (int i = 0; i < iller.length; i++) {
			if (iller[i].charAt(1) == x) {
				System.out.println(iller[i] + "-->" + iller[i].substring(0, 3).toUpperCase());
			}
		}
	}

	// B harfi ile başlayan şehirlerin ilk üç harfini alalım
	// metot parametre olarak dizi alsın
	// for each kullanalım

	public static void bIleBslayanlar(String[] array) {
		for (String kelime : array) {
			if (kelime.startsWith("B")) {
				System.out.println(kelime + "-->" + kelime.substring(0, 3).toUpperCase());
			}
		}
	}
	// Sesli harfleri silip silinmiş halini return eden bir method yazalım
	// metot String array dönsün parametre almasın
	// return eden arrayi mainde yazdıralım

	public static String[] sesliHarfleriSil() {
		String[] sesliHarfler = { "a", "e", "ı", "i", "o", "ö", "u", "ü" };
		String[] yeniDizi = new String[iller.length];
		for (int i = 0; i < iller.length; i++) {
			for (int j = 0; j < sesliHarfler.length; j++) {

				if (iller[i].toLowerCase().contains(sesliHarfler[j])) {
					iller[i] = iller[i].toLowerCase().replace(sesliHarfler[j], "");
				}
			}
			yeniDizi[i] = iller[i];
		}
		return yeniDizi;

	}
	// plakaBul(iller,"Ankara","Karaman");
	// parametre olarak array ve sınırsız sayıda String olarak şehir alsın
	// girilen şehirlerin plakalarını yazdırsın
	
	public static void plakaBul(String[] array, String...strings il) {
		for (int i = 0; i < array.length; i++) {
			for (int j= 0; j< il.length; j++) {
				if(array[i].equals(il[j])) {
					if(i<9) {
						System.out.println("0"+(i+1)+"-"+ array[i]);
					} else {
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
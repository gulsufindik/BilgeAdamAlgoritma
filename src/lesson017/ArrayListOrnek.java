package lesson017;

import java.util.ArrayList;

public class ArrayListOrnek {

	public static void main(String[] args) {
		//Bir tane array list oluşturalım
		//bu arraylistin içine manuel şehir atalım
		//bu şehirlerden an ile başlayan varsa bu şehri "xxx";
		
		ArrayList<String> ulkeSehirleri = new ArrayList<>();
		
		ulkeSehirleri.add("ankara");
		ulkeSehirleri.add("izmir");
		ulkeSehirleri.add("istabul");
		ulkeSehirleri.add("bursa");
		ulkeSehirleri.add("bodrum");
		
		degerDegistirme(ulkeSehirleri);
		
		
	}
	public static void degerDegistirme(ArrayList<String> sehirler) {
		for (String sehir : sehirler) {
			if(sehir.toLowerCase().startsWith("an")) {
				sehir = "xxx";
			}
			System.out.println(sehir);
		}

	}
	
	public static void degerDegistirme2(ArrayList<String> sehirler) {
		for (int i = 0; i < sehirler.size(); i++) {
			if (sehirler.get(i).toLowerCase().startsWith("an")) {
				sehirler.set(i,  "xxx");
			}
			
		}
	}
	
	

}

package soru2;

public class Main {

	public static void main(String[] args) {
		
		CustomStringTR customStr = new CustomStringTR("Merhaba");
		
		System.out.println(customStr.bosMu("Mer haba"));
		System.out.println(customStr.uzunluk());
		System.out.println(customStr.indextekiKarakter(5));
		System.out.println(customStr.kucukHarfYap());
		System.out.println(customStr.buyukHarfYap());
		System.out.println(customStr.dizeKarmaKod('e'));
		System.out.println(customStr.ileMiBasliyor());
		System.out.println(customStr.karakterinKonumu("er"));
		
	}

}

package lesson022;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiOrnek {
	


	public static void main(String[] args) {
	
		List<Integer> sayilar = new ArrayList<>();
		sayilar.add(61);
		sayilar.add(55);
		sayilar.add(78);
		sayilar.add(42);
		sayilar.add(25);
		
		
		List<Integer> sayilar2 = new ArrayList<>();
		sayilar2.stream().forEach(sayi -> {
			if(sayi %5 == 0) {
				sayilar2.add(sayi);
			}
		});
		sayilar.stream().forEach(sayi -> {
			if(sayi %5 ==0) {
				sayilar2.add(sayi);
			}
		});
		System.out.println(sayilar2);
		
		List<Integer> kalansizBolunenlerListesi = 
				sayilar.stream()
				.filter(sayi -> sayi %5==0)
				.collect(Collectors.toList());
		System.out.println(kalansizBolunenlerListesi);
		
		// 5 ile bölünen sayıları bir listeye atalım ve listeyi yazdıralım StreamApi kullanalım
		// sayıların kendisi ile çarpıp bir liste yapalım
		
		List<Integer> mapList = sayilar.stream() //Stream
				.map(sayi -> sayi * sayi) //Stream
				.collect(Collectors.toList()); //List
		mapList.forEach(sayi -> System.out.println(sayi));
		
		//kaç tane 5 e bölünen sayı var onu bulalım
		int baseBolunen = (int) sayilar.stream().filter(sayi -> sayi %5 ==0).count();
		System.out.println(baseBolunen);
	}

}

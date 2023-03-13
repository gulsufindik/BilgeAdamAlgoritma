package soru3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class HayvanatBahcesi {
	
	Map<String, Hayvan> hayvanlar = new HashMap<>();
	Set<String> hayvanAdlari = new HashSet<>();

	public void bahceyeMemeliHayvanEkle(MemeliHayvan m) {
		if (ayniİsimdeBaskaHayvanVarmi(m)) {
			System.out.println("Lütfen başka bir isim giriniz");
		} else {
			hayvanlar.put(m.getAd(), m);
		}
	}

	public void bahceyeSurungenEkle(Surungen s) {
		if (ayniİsimdeBaskaHayvanVarmi(s)) {
			System.out.println("Lütfen başka bir isim giriniz");
		} else {
			hayvanlar.put(s.getAd(), s);
		}
	}

	public void hayvanSesCikarsin(Hayvan h) {
		h.sesCikar();
	}

	public void hayvaninCinsiniBul(String hayvanAdi) {
		String message = "";
		if (hayvanlar.get(hayvanAdi) != null) {
			message = hayvanlar.get(hayvanAdi).getAd() + " bir " + hayvanlar.get(hayvanAdi).getUstSinifAdi();
		} else
			message = hayvanAdi + " isimli hayvan Hayvanat Bahçesinde yok";
		System.out.println(message);

	}

	public void hayvanBilgileriniYazdir(String hayvanAdi) {
		if (hayvanlar.get(hayvanAdi) != null)
			System.out.println(hayvanlar.get(hayvanAdi));
		else
			System.out.println(hayvanAdi + " isminde bir hayvan Hayvanat Bahçesinde yok");
	}

	public void hayvaniHareketEttir(String hayvanAdi) {
		if (hayvanlar.get(hayvanAdi).getSinifAdi().equalsIgnoreCase("aslan")) {
			Aslan tempA = (Aslan) hayvanlar.get(hayvanAdi);
			tempA.yuru();
		} else if (hayvanlar.get(hayvanAdi).getSinifAdi().equalsIgnoreCase("yilan")) {
			Yilan tempA = (Yilan) hayvanlar.get(hayvanAdi);
			tempA.surun();
		} else if (hayvanlar.get(hayvanAdi).getSinifAdi().equalsIgnoreCase("kertenkele")) {
			Kertenkele tempA = (Kertenkele) hayvanlar.get(hayvanAdi);
			tempA.surun();
		} else if (hayvanlar.get(hayvanAdi).getSinifAdi().equalsIgnoreCase("maymun")) {
			Maymun tempA = (Maymun) hayvanlar.get(hayvanAdi);
			tempA.yuru();
		}

	}

	public boolean ayniİsimdeBaskaHayvanVarmi(Hayvan h) {
		boolean isAnyWithSameName = !hayvanAdlari.add(h.getAd());
		return isAnyWithSameName;

	}

}
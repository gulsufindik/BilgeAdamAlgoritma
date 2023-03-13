package soru3;

public class Main {
	
	public static void main(String[] args) {
		
		HayvanatBahcesi hayvanatBahcesi = new HayvanatBahcesi();
		
		Maymun maymun = new Maymun("Şila" , 50,60);
		Aslan aslan = new Aslan("Mişa", 100, 120);	
		Yilan yilan = new Yilan("Çiko", 30, 110);
		Kertenkele kertenkele = new Kertenkele("Leylim", 2, 10);
		
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(maymun);
		hayvanatBahcesi.bahceyeSurungenEkle(kertenkele);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(aslan);
		hayvanatBahcesi.bahceyeSurungenEkle(yilan);
		
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("Oslo",35,60));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("Karlo",40,80));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan("Şarla",80,200));
		hayvanatBahcesi.bahceyeSurungenEkle(new Yilan("Lala", 60,200));
		hayvanatBahcesi.bahceyeSurungenEkle(new Yilan("Lolo",50,100));
		
		hayvanatBahcesi.hayvanBilgileriniYazdir("Şila");
		hayvanatBahcesi.hayvaninCinsiniBul("Şila");
		hayvanatBahcesi.hayvaniHareketEttir("Şila");
		hayvanatBahcesi.hayvanSesCikarsin(maymun);
		
		System.out.println("\n * * * ");
		
		hayvanatBahcesi.hayvanBilgileriniYazdir("Mişa");
		hayvanatBahcesi.hayvaninCinsiniBul("Mişa");
		hayvanatBahcesi.hayvaniHareketEttir("Mişa");
		hayvanatBahcesi.hayvanSesCikarsin(aslan);
		
		System.out.println("\n * * * ");
		
		hayvanatBahcesi.hayvanBilgileriniYazdir("Anna");
		hayvanatBahcesi.hayvaninCinsiniBul("Polo");
		
		hayvanatBahcesi.hayvanBilgileriniYazdir("Çiko");
		hayvanatBahcesi.hayvaninCinsiniBul("Çiko");
		hayvanatBahcesi.hayvaniHareketEttir("Çiko");
		hayvanatBahcesi.hayvanSesCikarsin(yilan);
		
		System.out.println("\n * * * ");
		
		hayvanatBahcesi.hayvanBilgileriniYazdir("Leylim");
		hayvanatBahcesi.hayvaninCinsiniBul("Leylim");
		hayvanatBahcesi.hayvaniHareketEttir("Leylim");
		hayvanatBahcesi.hayvanSesCikarsin(kertenkele);
		
		System.out.println("\n * * * ");
		hayvanatBahcesi.hayvanBilgileriniYazdir("Oslo");
		hayvanatBahcesi.hayvaninCinsiniBul("Oslo");
		hayvanatBahcesi.hayvaniHareketEttir("Oslo");
		
		System.out.println("\n * * * ");
		hayvanatBahcesi.hayvanBilgileriniYazdir("Şarla");
		hayvanatBahcesi.hayvaninCinsiniBul("Şarla");
		hayvanatBahcesi.hayvaniHareketEttir("Şarla");
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
		
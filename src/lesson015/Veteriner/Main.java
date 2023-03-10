package lesson015.Veteriner;

public class Main {

	public void bilgileriGoster(Hayvan hayvan) {
		hayvan.bilgileriGoster();
	}

	public static void karneOlustur(Hayvan hayvan) {
		hayvan.karneOlustur();
	}

	public static void main(String[] args) {

		/*
		 * Hayvan sınıfından 2 tane abstract method oluşturalım bilgileriGoster()
		 * toString karneOlustur() --> Cins ve tür alıp bize karne oluştursun
		 * 
		 * 
		 * Hayvan ekle metodu
		 * 
		 * Hayvanları listele
		 */

		Kedi kedi1 = new Kedi("Boncuk", true, "2010", "Tekir");
		Kedi kedi2 = new Kedi("Fıstık", true, "2010", "Scotish");
		Kedi kedi3 = new Kedi("Yaramaz", true, "2010", "British");

		kedi1.bilgileriGoster();

		Kopek kopek1 = new Kopek("Karabaş", true, "2015", "Golden", 3);
		Kopek kopek2 = new Kopek("Karabaş", true, "2015", "Rot", 3);
		Kopek kopek3 = new Kopek("Karabaş", true, "2015", "Pitbull", 3);

		kopek1.bilgileriGoster();

		System.out.println(kedi1.getKarne());
		System.out.println(kopek1.getKarne());

		Hayvan hayvan = new Kedi("Yaramaz", true, "2010", "Tekir");
		karneOlustur(kopek3);
		karneOlustur(kedi3);
		karneOlustur(hayvan);

		System.out.println("\n\n**************************\n\n");

		Musteri m = new Musteri("Eskişehir", "23546", "Ahmet");
		m.hayvanEkle(kopek3);
		m.hayvanEkle(kopek1);
		m.hayvanEkle(kedi1);
		m.hayvanEkle(hayvan);

		System.out.println("\n\n**************************\n\n");
		m.bilgileriGoster();

		System.out.println("\n\n**************************\n\n");
		m.hayvanlariListele();

		Veteriner v = new Veteriner("ESOGU", 5, "125", "Ahmet");
		Musteri m2 = new Musteri("Adana", "23546", "Kaya");
		v.musteriEkle(m);
		v.musteriEkle(m2);
		v.musterileriGoster();

		System.out.println("\n\n**************************\n\n");
		v.musteriHayvanlari(m);
	}

}
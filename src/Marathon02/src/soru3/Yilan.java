package soru3;

public class Yilan extends Surungen {
	
	private String sinifAdi;

	public Yilan(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		this.sinifAdi = "Yılan";
		setUstSinifAdi("Sürüngen");
		setTehlikeliMi(true);
	}

	public String getSinifAdi() {
		return sinifAdi;
	}

	@Override
	public void surun() {
		System.out.println(getAd() + " isimli " + sinifAdi + " yürüyor..");

	}

	@Override
	public void sesCikar() {
		System.out.println(getAd() +" isimli " + sinifAdi+ " tısssss diye ses çıkartıyor");

	}

}
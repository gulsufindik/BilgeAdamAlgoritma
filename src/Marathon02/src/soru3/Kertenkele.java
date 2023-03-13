package soru3;

public class Kertenkele extends Surungen {
	
	private String sinifAdi;

	public Kertenkele(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		this.sinifAdi = "Kertenkele";
		setUstSinifAdi("Sürüngen");
		setTehlikeliMi(false);
	}

	public String getSinifAdi() {
		return sinifAdi;
	}
	
	@Override
	public void surun() {
		System.out.println(getAd()+" isimli "+sinifAdi+ " sürünüyor");
		
	}

	@Override
	public void sesCikar() {
		System.out.println(getAd()+" isimli " + sinifAdi+ " tısss diye ses çıkartıyor");
		
	}

}
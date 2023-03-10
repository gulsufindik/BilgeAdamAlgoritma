package lesson015.Veteriner;

public class Kopek extends Hayvan {

	private int asiSayisi;
	private String cins;
	private String tur;
	private String karne;

	public Kopek(String name, boolean kayitliMi, String dogumTarihi, String cins, int asiSayisi) {
		super(name, kayitliMi, dogumTarihi);
		this.asiSayisi = asiSayisi;
		this.cins = cins;
		this.tur = "Köpek";
	}

	public int getAsiSayisi() {
		return asiSayisi;
	}

	public void setAsiSayisi(int asiSayisi) {
		this.asiSayisi = asiSayisi;
	}

	public String getCins() {
		return cins;
	}

	public void setCins(String cins) {
		this.cins = cins;
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	public String getKarne() {
		return karne;
	}

	public void setKarne(String karne) {
		this.karne = karne;
	}

	@Override
	public void karneOlustur() {
		System.out.println("*******************");
		System.out.println("***Köpek Karnesi****");
		System.out.println("*******************");
		this.setKarne("Cinsi : " + this.getCins() + " Türü : " + this.getTur());
		System.out.println("Karneniz oluşturuldu =>  Cinsi : " + this.getCins() + " Türü : " + this.getTur());

	}

	@Override
	public void bilgileriGoster() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Kopek [asiSayisi=" + asiSayisi + ", cins=" + cins + ", tur=" + tur + ", karne=" + karne + ", getName()="
				+ getName() + ", isKayitliMi()=" + isKayitliMi() + ", getDogumTarihi()=" + getDogumTarihi() + "]";
	}
}
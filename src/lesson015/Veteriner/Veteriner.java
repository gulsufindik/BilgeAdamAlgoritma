package lesson015.Veteriner;

import java.util.ArrayList;

public class Veteriner extends Insan {

	private String mezunOlduguOkul;
	private int calismaSuresi;
	private ArrayList<Musteri> musteriList;

	public Veteriner(String mezunOlduguOkul, int calismaSuresi, String tcKimlik, String isim) {
		super(tcKimlik, isim);
		this.mezunOlduguOkul = mezunOlduguOkul;
		this.calismaSuresi = calismaSuresi;
		this.musteriList = new ArrayList<>();
	}

	public String getMezunOlduguOkul() {
		return mezunOlduguOkul;
	}

	public void setMezunOlduguOkul(String mezunOlduguOkul) {
		this.mezunOlduguOkul = mezunOlduguOkul;
	}

	public int getCalismaSuresi() {
		return calismaSuresi;
	}

	public void setCalismaSuresi(int calismaSuresi) {
		this.calismaSuresi = calismaSuresi;
	}

	public void musteriEkle(Musteri musteri) {
		this.musteriList.add(musteri);
		System.out.println(musteri.getIsim() + " Adlı müşteri başarıyla eklendi.");
	}

	public void musterileriGoster() {
		System.out.println("Müşteri Listesi");
		for (Musteri musteri : musteriList) {
			System.out.println(musteri.getIsim());
		}
	}

	public void musteriHayvanlari(Musteri musteri) {
		for (Hayvan hayvan : musteri.getHayvanList()) {
			if (hayvan.isKayitliMi()) {
				System.out.println(hayvan.getName());
			} else {
				emailGonder(musteri);
			}
		}
	}

	public void emailGonder(Musteri musteri) {
		System.out.println(musteri.getIsim() + " Lütfen kayıt ettiriniz");
	}

	@Override
	public void bilgileriGoster() {
		System.out.println(toString());

	}

	@Override
	public String toString() {
		return "Veteriner [getMezunOlduguOkul()=" + getMezunOlduguOkul() + ", getCalismaSuresi()=" + getCalismaSuresi()
				+ ", getTcKimlik()=" + getTcKimlik() + ", getIsim()=" + getIsim() + "]";
	}

}
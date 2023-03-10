package lesson015.Veteriner;

import java.util.ArrayList;

public class Musteri extends Insan {

	private String adres;
	private ArrayList<Hayvan> hayvanList;

	public Musteri(String adres, String tcKimlik, String isim) {
		super(tcKimlik, isim);
		this.adres = adres;
		this.hayvanList = new ArrayList<>();
	}

	public ArrayList<Hayvan> getHayvanList() {
		return hayvanList;
	}

	public void setHayvanList(ArrayList<Hayvan> hayvanList) {
		this.hayvanList = hayvanList;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public void hayvanEkle(Hayvan hayvan) {
		if (hayvanList.size() < 3) {
			if (this.hayvanList.add(hayvan)) {
				System.out.println(hayvan + " " + this.getIsim() + " e eklendi");
			}

		} else {
			System.err.println("Maksimum hayvan sayısına ulaştınız.1!!!");

		}
	}

	public void hayvanlariListele() {
		System.out.println(getIsim() + " sahip olduğu hayvanlar ");
		for (Hayvan hayvan : hayvanList) {
			System.out.println(hayvan.getName());
		}
	}

	@Override
	public void bilgileriGoster() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Musteri [getHayvanList()=" + getHayvanList() + ", getAdres()=" + getAdres() + ", getTcKimlik()="
				+ getTcKimlik() + ", getIsim()=" + getIsim() + "]";
	}

}
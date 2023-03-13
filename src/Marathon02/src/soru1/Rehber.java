package soru1;

public class Rehber {

	private String adSoyad;
	private int telNo;

	public Rehber(String adSoyad, int telNo) {
		super();
		this.adSoyad = adSoyad;
		this.telNo = telNo;
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public int getTelNo() {
		return telNo;
	}

	public void setTelNo(int telNo) {
		this.telNo = telNo;
	}

	@Override
	public String toString() {
		return "Rehber [adSoyad=" + adSoyad + ", telNo=" + telNo + "]";
	}

}

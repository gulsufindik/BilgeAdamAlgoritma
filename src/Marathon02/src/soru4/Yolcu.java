package soru4;

import java.util.ArrayList;
import java.util.List;

public abstract class Yolcu {
	
	private String ad;
	private String soyAd;
	private int koltukNo;
	private int iD;
	private final int BASEFIYAT = 100;
	private boolean checkIn;
	
	static List<Integer> biletNumaraları = new ArrayList<>(); 
	
	public Yolcu(String ad, String soyAd, int koltukNo, int iD, boolean checkIn) {
		super();
		this.ad = ad;
		this.soyAd = soyAd;
		this.koltukNo = koltukNo;
		this.iD = iD;
		this.checkIn = checkIn;
	}
	
	public abstract void yolcuBilgileriniGetir();
	
	public abstract void checkInYap();
	
	public abstract void ucagaBin();

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyAd() {
		return soyAd;
	}

	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}

	public int getKoltukNo() {
		return koltukNo;
	}

	public void setKoltukNo(int koltukNo) {
		this.koltukNo = koltukNo;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public boolean isCheckIn() {
		return checkIn;
	}

	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}

	public static List<Integer> getBiletNumaraları() {
		return biletNumaraları;
	}

	public static void setBiletNumaraları(List<Integer> biletNumaraları) {
		Yolcu.biletNumaraları = biletNumaraları;
	}

	public int getBASEFIYAT() {
		return BASEFIYAT;
	}
	
	
	
	
	

}

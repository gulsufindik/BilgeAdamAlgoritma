package lesson014.HomeWork;

public class Takim {
	private String name;
	private int puan;
	private int kasa;

	public Takim(String name) {
		super();
		this.name = name;
		this.puan = 0;
		this.kasa = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}

	public int getKasa() {
		return kasa;
	}

	public void setKasa(int kasa) {
		this.kasa = kasa;
	}

}
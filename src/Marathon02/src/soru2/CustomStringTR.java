package soru2;

public class CustomStringTR {
	
	private String string;

	public CustomStringTR(String string) {
		super();
		this.string = string;
	}
	
	public boolean bosMu(String test) {
		boolean bosMu = string.isEmpty();
		return bosMu;
	}

	public int uzunluk() {
		int uzunluk = string.length();
		return uzunluk;
	}
	
	public String boslukSil() {
		String boslukSil = string.trim();
		return boslukSil;
	}

	public char[] karakterDizisi() {
		char[] dizi = string.toCharArray();
		return dizi;
	}

	public String kucukHarfYap() {
		String kucukHarf = string.toLowerCase();
		return kucukHarf;
	}

	public String buyukHarfYap() {
		String buyukHarf = string.toUpperCase();
		return buyukHarf;
	}

	public char indextekiKarakter(int index) {
		char c = string.charAt(index);
		return c;
	}

	public int dizeKarmaKod(char c) {
		int dizeKarmaKod = string.hashCode();
		return dizeKarmaKod;
	}

	public boolean ileMiBasliyor() {
		boolean ileMiBasliyor = string.startsWith(string);
		return ileMiBasliyor;
	}

	public int karakterinKonumu(String test) {
		int karakterinKonumu = string.indexOf(test);
		return karakterinKonumu;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
}
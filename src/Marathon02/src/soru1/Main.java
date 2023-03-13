package soru1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static HashMap<String, String> rehber = new HashMap<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Main main = new Main();
		main.dosyaOku();

		String key = main.AdSoyadAl();

		main.hataliGiris(key);

	}

	public void dosyaOku() {

		Main main = new Main();
		String path = "rehber.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

			String s = null;
			while ((s = reader.readLine()) != null) {
				rehber.put(main.MetinDüzenle(s)[0], main.MetinDüzenle(s)[1]);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Girilen dosya adı veya yolunu kontrol ediniz (FileNotFoundException)");
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}

	public String[] MetinDüzenle(String string) {
		String[] strTemp = string.split(";");
		String[] str = { strTemp[0].trim(), strTemp[2].trim() };
		return str;
	}

	public String AdSoyadAl() {
		System.out.print("Lütfen telefonunu aradığınız kişinin adını giriniz: ");
		String adi = scanner.nextLine().trim();
		System.out.print("Lütfen telefonunu aradığınız kişinin soyadını giriniz: ");
		String soyadi = scanner.nextLine().trim();
		String key = "";
		try {
			key = adi.substring(0, 1).toUpperCase() + adi.substring(1).toLowerCase() + " "
					+ soyadi.substring(0, 1).toUpperCase() + soyadi.substring(1).toLowerCase();
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("İsim ve ya soyisim en az iki karakter içermelidir");
		}

		return key;
	}

	public void hataliGiris(String key) {
		if (null == rehber.get(key)) {
			System.out.println("Aradığınız kişi rehberde kayıtlı değil!");
		} else {
			System.out.println(key + " isimli kişinin telefon numarası: " + rehber.get(key));
		}
	}

}
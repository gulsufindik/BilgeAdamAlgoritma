package lesson014.HomeWork;

import java.util.Random;

public class TakimManager {

	public void macYap(Takim takim, Takim takim2) {
		Random random = new Random();
		int durum = random.nextInt(1, 4);
		if (durum == 1) {
			takim.setPuan(takim.getPuan() + 3);
			takim.setKasa(takim.getKasa() + 10000);
			System.out.println(takim.getName() + " Kazanmıştır ");
		} else if (durum == 2) {
			takim2.setPuan(takim2.getPuan() + 3);
			takim2.setKasa(takim2.getKasa() + 10000);
			System.out.println(takim2.getName() + " Kazanmıştır ");
		} else {
			takim.setPuan(takim.getPuan() + 1);
			takim.setKasa(takim.getKasa() + 5000);

			takim2.setPuan(takim2.getPuan() + 1);
			takim2.setKasa(takim2.getKasa() + 5000);
			System.out.println(takim2.getName() + " " + takim.getName() + " Berabere kalmıştır");
		}
	}

	public void kasaDurum(Takim takim) {
		System.out.println(takim.getName() + " Kasası--> " + takim.getKasa());
	}

	public void puanlariGoster(Takim[] takimlar) {
		System.out.println("Puan Durumu");
		for (Takim takimx : takimlar) {
			System.out.println(takimx.getName() + " Puanı--> " + takimx.getPuan());
		}
	}

	public void iflasDurumundakiler(Takim[] takimlar) {
		System.out.println("Puan Durumu");
		for (Takim takimx : takimlar) {
			if (takimx.getKasa() < 5000) {
				System.out.println(takimx.getName() + " İflas etmek üzere " + takimx.getKasa());
			}
		}
	}
	
	public void sampiyonuGoster(Takim[] takimlar) {
		Takim sampiyon = takimlar[0];
		for (int i = 0; i < takimlar.length; i++) {
			if(takimlar[i].getPuan() > sampiyon.getPuan()) {
				sampiyon = takimlar[i];
			}
		}
		System.out.println("Şampiyon --> "+ sampiyon.getName());
	}
	
	
}
package lesson014;

public class UserManger {

	private final String emailFormat = "@xbanka.com";

	public void generetaAutoEmail(User user) {
		user.setEmail(
				user.getName().toLowerCase().replace(" ", ".") + '.' + user.getSurname().toLowerCase() + emailFormat);
	}

	public void alternatifOtomatikEmailOlustur(User user) {
		String otomatikOlusanEmail = user.getName().toLowerCase().replaceAll(" ", ("."))
				.concat("." + user.getSurname().toLowerCase().replace(' ', ('.'))) + emailFormat;
		user.setEmail(otomatikOlusanEmail);
	}

	public void krediBasvurusundaBulun(Account account, int para) {
		account.setKrediBasvurusu(true);
		account.setIstenenKredi(para);

		System.out.println(para + " Değerinde kredi başvursu yaptınız");
		System.out.println("Lütfen onay bekleyin... ");
	}

	public void krediBorcunuOde(Account account, int taksit) {
		if (account.isKrediAlindimi()) {
			if (account.getKrediBorcu() < taksit) {
				System.out.println("Kart Borcunuz yatırılan miktardan az");
			} else {
				account.setKrediBorcu(account.getKrediBorcu() - taksit);
				System.out.println(taksit + " Kadar ödeme yaptınız Güncel Borcunuz--> " + account.getKrediBorcu());
			}
		} else {
			System.out.println("Kredi Borcunu Bulunmamakta");
		}
	}
	
	//
	
	public void hesaptanKrediBorcuOde(Account account, int taksit) {
		if (account.isKrediAlindimi()) {
			if (account.getKrediBorcu() < taksit) {
				System.out.println("Kart Borcunuz yatırılan miktardan az");
			} else {
				if (account.getMoney() >= taksit) {
					account.setKrediBorcu(account.getKrediBorcu() - taksit);
					account.setMoney(account.getMoney() - taksit);
					System.out.println(taksit + " Hesaptan ödeme yaptınız Güncel Borcunuz: " + account.getKrediBorcu());
					System.out.println("Hesabınızdaki bakiye : " + account.getMoney());
				} else {
					System.out.println("Bakiyeniz yetersiz");
				}
			}

		} else {
			System.out.println("Kredi Borcunu Bulunmamakta");
		}
	}

}
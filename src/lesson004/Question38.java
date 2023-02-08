package lesson004;

import java.util.Scanner;

public class Question38 {

	public static void main(String[] args) {
		// Menu 1-Dışarıdan bir kelime ve bir harf girilsin eğer kelimemizin için de o 
		//        harf varsa kaç tane olduğunu ve index numaralarını yazdırın.
		//        eğer harfi içermiyorsa bir çıktı aradağınız harf yok gibi
		//      2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz harfi
		//          giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer kelimemiz
		//          içerisinde o harf varsa değiştirsin.
		//      3-Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Polindrom olup
		//         * olmadığını bulunuz(kek,iki,kabak,kayak)
		//		4-Sistemden çıksın
		
		Scanner scanner = new Scanner(System.in);
		boolean kontrol = true;
		while (kontrol) {
			System.out.println("====String İşlemleri====");
			System.out.println("1-Harf Saydırma");
			System.out.println("2-Harf Değiştirme");
			System.out.println("3-Polindrom Kontrolu");
			System.out.println("4- kelimenin harflerinin arasına ? koy"); //en sona koymicaz
			System.out.println("5- kelimenin ilk üç indexinin alıp sonuna ... koyun");
			System.out.println("6
			System.out.println("0-çıkış");
			int secim = scanner.nextInt();
			scanner.nextLine();
			
			switch (secim) {
			case 1:
				int sayac =0;
				String indexler = "";
				System.out.println("Lütfen bir kelime giriniz: ");
				String kelime = scanner.nextLine();
				System.out.println("Hangi harfi saymak istiyorsunuz ");
				String harf = scanner.nextLine();
				if(!kelime.contains(harf)) {
					System.out.println("Aradığınız harf kelimenin içinde yoktur");
				} else {
					for(int i=0; i<kelime.length(); i++) {
						if(kelime.charAt(i) == harf.charAt(0)) {
							sayac ++;
							indexler +=i + ",";
						}
					}
					System.out.println(sayac);
					//System.out.println(); 
				}
				
				break;
			case 2:
				System.out.println("Lütfen bir kelime giriniz: ");
				String kelime2 = scanner.nextLine();
				System.out.println("Değiştirmek istediğiniz harf: ");
				String eskiHarf = scanner.nextLine();
				System.out.prinln("Neyle değiştireceğiz: ");
				String yeniHarf = scanner.nextLine();
				if(kelime2.contains(eskiHarf)) {
					kelime2= kelime.raplace(eskiHarf, yeniHarf);
				}else {
					System.out.println(eskiHarf + "mevcut değil");
				}
				System.out.println(kelime2);
				//kelime
				//eski harf
				//kontrol edicez harf kelimenin içinde var mı
				//yeni harf
				//varsa raplace
				
				
				break;
			case 3:
				
				break;
			case 4:
				StringBuilder stingBuilder = new  StringBuilder();
				System.out.println("Kelime giriniz");
				String kelime
				
				
				break;
			case 5:
				System.out.println("Kelime giriniz");
				String kelime5 = kelime5.scannernextLine();
				String kelime6 =kelime5.subsring(0,3);
				String eklencekSekil = "...";
				System.out.println(kelime6 + eklencekSekil);
				
				
			case 6:
				System.out.println("Kelime giriniz");
				String kelime7 = scanner.nextLine();
				String kelime8 = "";
				for (int i=0; i< kelime7.length(); i++) {
					if(i<3) {
						kelime8 += kelime7
					}
				}
				
			default;
			    break;
			}
			
		}

		
	}

}

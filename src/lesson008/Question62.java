package lesson008;

import java.util.Scanner;

public class Question62 {

	public static void main(String[] args) {
		// 2.metot yazacağız
		// 1.kullanıcıdan aldığımız email değerinin doğru format olduğunu kontrol edelim
		// @ var mı
		// hotmail.com veya gmail.com ile mi bitiyor
		
		//password ve repassword bunların uyuşup uyuşmadığını kontrol edicez
		
		
	}
		
		public static void emailKontrol() {
			boolean mailKontrol = true;
			Scanner scanner = new Scanner(System.in);
			System.out.println("mail giriniz: ");
			
			String mail = scanner.nextLine();
			
			String mail = scanner.nextLine();
			mail.trim();
			if(!mail.endsWith("@hotmail.com") || mail.endsWith("@gmail.com")) {
				mailKontrol = false;
			}
			if(mailKontrol) {
				System.out.println("doğru mail formatı");
			} else {
				System.out.println("yanlış mail formatı");
			}
			
		}
		
		public static void passwordKontrol(String password, String rePassword) {
			boolean check1 =true;
			if(password.equals(rePassword)) {
				System.out.println("password uyuşuyor");
			} else {
				System.out.println("uyuşmuyor");
			}
		}
		
		public static void login() {
		if(passwordKontrol()) {
			System.out.println("giriş yaptınız");
		} else {
			System.out.println("bilgiler yanlış");
		}

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

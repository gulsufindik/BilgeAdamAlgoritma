package lesson004;

import java.util.Scanner;

public class Question37 {

	public static void main(String[] args) {
		// kullanıcıdan email, password, repassword alalım
		
		//emaili kontrol edip '@hotmail.com' , '@outlook.com' var mı?
		//emailiniz email formatına uygun değildir
		//password repassword
		//ikisi aynı değilse passwordler uyuşmuyor
		//password min 8 karakter olsun
		
	    Scanner scanner = new Scanner(System.in);
		boolean check =true;
		boolean check2 = true;
		
		while (check) {
			System.out.print("mail girin : ");
			String mail = scanner.nextLine();
			
			if(!(mail.contains)"@hotmail.com") || mail.contains("@outlook.com"))) {
				System.out.println("email formatına uygun değildir");
			} else {
				while(check2) {
					System.out.println("şifrenizi girin : ");
					String password = scanner.nextLine();
					
					System.out.print("tekrar şifre girin : ");
					String rePassword = scanner.nextLine();
					
					if(password.equals(rePassword) && (password.length() >=8)) {
						System.out.println("Giriş yaptınız -> " +mail);
						check2=false;
						check = false;
					} else {
						System.out.println("ya şifreler uyuşmuyor ya da şifre 8'den küçük");
					}
				}
			}
		}

	}

}

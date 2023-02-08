package lesson004;

import java.util.Scanner;

public class Question37 {

	public static void main(String[] args) {
		// kullanıcıdan email, password, repassword alalım
		
		//emaili kontrol edip '@hotmail.com' , '@outlook.com' var mı?
		//emailiniz email formatına uygun değildir
		//password repassword
		//ikisi aynı değilse passwordler uyusmuyo
		//password min 8 karakter olsun
		
		Scanner scanner = new Scanner(System.in);
		boolean check =true;
		
		while (check) {
			System.out.print("mail girin : ");
			String mail = scanner.nextLine();
			
			System.out.println("şifrenizi girin : ");
			String password = scanner.nextLine();
			
			System.out.print("tekrar şifre girin : ");
			String rePassword = scanner.nextLine();
			
			if(!(mail.contains)"@hotmail.com") 
		}

	}

}

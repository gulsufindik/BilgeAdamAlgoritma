package lesson006;

import java.util.Scanner;

public class Question45 {

	public static void main(String[] args) {
		String[][] matris1 = { { "Bilge","Advanced" }, { "Postgre", "Data"} };
		String[][] matris2 = { { "Adam"," Java" }, { " SQL", "Base"} };
		
		// BilgeAdam
		// Advanced Java
		
		
//		System.out.println(matris1[0][0] + matris2[0][0]);
//		System.out.println(matris1[0][1] + matris2[0][1]);
//		System.out.println(matris1[1][0] + matris2[1][0]);
//		System.out.println(matris1[1][1] + matris2[1][1]);
	
		// for döngüsü
		for (int i = 0; i < matris1.length; i++) {
			for (int j=0 ; j< matris1[i].length; j++) {
				System.out.println(matris1[i][j] + matris2[i][j]);
				System.out.println();
			}
		}

	}

}

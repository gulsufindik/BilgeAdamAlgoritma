package lesson004;

public class Question35 {

	public static void main(String[] args) {
		// Java, Spring, Postgre, React
		
		//Java
		//Spring
		//Postgre
		//React
		
		String list = "Java,Spring,Postgre,React";
		
		String[] str = list.split(",");
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		
		//Alternatif
		
		String stringText= "Java,Spring,Postgre,React";
		int index = 0;
		
		for (int i=0; i<stringText.lenght(); i++) {
			if(stringText.charAt(i) == ',') {
				System.out.println(stringText.substring(index, i));
				//index = 0 , i=4
				//index = 5 , i=11
				index = i+1;
				// index 5
			}
		}
		System.out.println("stringText.substring(index"));
		
		// Alternatif -2 
	
	}

}

package lesson014.HomeWork;

public class Main {
	public static void main(String[] args) {
		Takim[] takimlar = new Takim[4];
		
		TakimManager takimManager = new TakimManager();
		
		Takim takim1 = new Takim("Barcelona");
		Takim takim2 = new Takim("RealMadrid");
		Takim takim3 = new Takim("Sevilla");
		Takim takim4 = new Takim("Atletico Madrid");
		
		takimManager.macYap(takim1, takim2);
		takimManager.macYap(takim1, takim2);
		takimManager.macYap(takim3, takim4);
		takimManager.macYap(takim4, takim1);
		takimManager.macYap(takim3, takim2);
		takimManager.macYap(takim2, takim4);
		takimManager.macYap(takim1, takim2);
		
		takimlar[0]= takim1;
		takimlar[1] = takim2;
		takimlar[2] = takim3;
		takimlar[3] = takim4;
		
		takimManager.puanlariGoster(takimlar);
		takimManager.sampiyonuGoster(takimlar);
	}
}
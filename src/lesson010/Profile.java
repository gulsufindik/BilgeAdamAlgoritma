package lesson010;

public class Profile {
	
		//attribute, property, field
	
		//nesne özellikleri
		public String profilResmi;
		public String kullaniciAdi;
		public String isim;
		
		public int takipciSayisi;
		public int takipSayisi;
		
		public int postSayisi ;
		public String[] posts = new String[10];
		boolean maviTik;
		
		
		// post oluştur metodu
		// isim -> post oluşturdu desin
		
		public String postOlustur(String posts) {
			String metin = isim+" Post Oluşturuldu";
			this.postSayisi++;
			this.posts[postSayisi] = posts;
			
			
			//this -> bulunduğu sınıfı gösterir
			return metin;
		}
		
		// profilIsminiGüncelle methodu
		// method isim alsın ve ismini güncellesin
		
		public void profilIsminiGuncelle(String isim) {
			this.isim = isim;
		}
		
		// gelenIstegiKabulEt metodu
		// takipçi sayımız artacak
		
		public void ıstegiKabulEt() {
			this.takipciSayisi +=1 ;
			verifiedCheck();
		}
		public void kullaniciSil() {
			this.takipciSayisi -=1;
			verifiedCheck();
		}
		
		// takipçi sayısı 5'ten fazla ise kullanıcıya mavitik verelim
		// maviTik
		
		public void verifiedCheck() {
			if(this.takipciSayisi > 5) {
				this.maviTik = true;
			} else {
				this.maviTik = false;
			}
		}
		
		// bilgileri Göster
		// isim, takipçi sayımız, maviTik, postSayisi
		
		public String bilgileriGöster() {
			return "KullaniciAdi:"+this.kullaniciAdi+"MatiTik"+this.maviTik+"TakipcçiSayisi"+this.takipciSayisi+"PostSayisi: "+this.postSayisi;
		}

}

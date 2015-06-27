package praktikum7;

import prak7.bentuk.BujurSangkar;
import prak7.bentuk.bentuk;
import prak7.bentuk.segitigaSamaKaki;
import prak7.bentuk.segitigaSamaSisi;

public class cobaBentuk {
	public static void cetakBangun(bentuk b){
		System.out.println(b.hitungLuas());
		b.tulis();
		b.geser(5, 5);
	}
	public static void main(String[] args) {
		cetakBangun(new BujurSangkar());
		cetakBangun(new segitigaSamaKaki());
		cetakBangun(new segitigaSamaSisi());
	}

}

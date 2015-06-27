package prak6.utama;
import praktikum6.rangka;
public class mobil {
	private rangka Rangka;
	private praktikum6.mesin Mesin;
	
	public mobil(){
		Rangka = new rangka();
		Mesin = new praktikum6.mesin();
		
	}
	public static void main(String[] args) {
		new mobil();
	}

}

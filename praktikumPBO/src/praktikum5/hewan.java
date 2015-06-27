package praktikum5;

public class hewan {
	public static int jumlah_hewan =0;
	public String spesies;
	
	public static void tambahHewan(){
		jumlah_hewan++;
	}
	public static void main(String[] args) {
		hewan objekHewan = new hewan();
		objekHewan.spesies = "kucing";
		hewan.tambahHewan();
		System.out.println(hewan.jumlah_hewan);
		
		hewan objekHewan2 = new hewan();
		objekHewan2.spesies = "anjing";
		hewan.tambahHewan();
		System.out.println(hewan.jumlah_hewan);
		
		System.out.println(objekHewan.jumlah_hewan);
		System.out.println(objekHewan2.jumlah_hewan);
	}

}

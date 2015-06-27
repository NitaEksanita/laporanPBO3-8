package praktikum5;

public class orang {

	public static void main(String[] args) {
		orang objekOrang = new orang();
		hewan objekHewan = null;
		if (objekOrang instanceof orang){
			System.out.println("objekOrang adalah instan dari kelas " +"Orang");
		}
		if (objekHewan ==null){
			System.out.println("objekHewan belum diinisalisasi");
		}
	}

}


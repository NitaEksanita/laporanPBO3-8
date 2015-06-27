package praktikum4;

public class breakDemo {

	public static void main(String[] args) {
		int [] angka = {
				32, 87,3,589,12,1076,2000,8,622,127
		};
		int cari =12;
		
		int i;
		boolean ketemu = false;
		
		for (i = 0; i<angka.length;i++){
			if (angka[i]==cari){
				ketemu = true;
				break;
			}
		}
		if  (ketemu){
			System.out.println("ditemukan "+cari+" pada indeks ke "+i);
		}
		else {
			System.out.println(cari+" tidak ditemukan");
		}
	}

}

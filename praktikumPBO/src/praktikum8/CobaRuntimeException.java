package praktikum8;

public class CobaRuntimeException {
	public static void main(String[] args){
		try{
			int a[]=new int[2];
			System.out.println("akses elemet ke empat"+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("IndexOutOfBoundsException ditemukan");
		}
		System.out.println("Keluar blok exception");
	}
}

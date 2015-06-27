package praktikum8;

public class CobaCallStack {
	public void metodeSatu(){
		int a[]=new int[2];
		System.out.println("akses elemet ke empat"+a[3]);
		System.out.println("ini tidak tercetak");
	}
	public void metodeDua(){
		try {
			metodeSatu();
			System.out.println("ini tidak tercetak");
		}
		catch (IndexOutOfBoundsException e){
			System.out.println("IndexOutOfBoundsException ditemukan");
		}
	}
	public static void main(String[] args){
		new CobaCallStack().metodeDua();
	}
}

package prak7.bentuk;

public class BujurSangkar extends bentuk{
	private float sisi;
	
	public BujurSangkar(){
		sisi=5;
	}
	
	public float hitungLuas(){
		return sisi*sisi;
	}
	
	public void tulis(){
		System.out.println("Bujur Sangkar");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

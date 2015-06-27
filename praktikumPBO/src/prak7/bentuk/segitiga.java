package prak7.bentuk;

public abstract class segitiga extends bentuk {
	protected float alas;
	protected float tinggi;
	
	public segitiga(){
		alas = 5;
		tinggi=5;
		
	}
	
	public float hitungLuas(){
		return (alas*tinggi)/2;
	}
}

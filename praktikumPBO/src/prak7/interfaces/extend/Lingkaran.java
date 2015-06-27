package prak7.interfaces.extend;

public class Lingkaran implements HitungKeliling, HitungLuas {
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	@Override
	public void tulis() {
		System.out.println("Lingkaran");
		
	}
	@Override
	public double hitungLuas() {
		// TODO Auto-generated method stub
		return 2*PHI*jariJari;
	}
	@Override
	public double hitungKeliling() {
		// TODO Auto-generated method stub
		return PHI*Math.pow(jariJari, 2);
	}
}

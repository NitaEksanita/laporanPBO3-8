package prak7.interfaces;

public class Lingkaran implements BentukLuas, BentukKeliling{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari=jariJari;
	}
	public double hitungKeliling(){
		return 2*BentukKeliling.PHI*jariJari;
	}
	public double hitungLuas(){
		return BentukLuas.PHI*Math.pow(jariJari, 2);
	}
}

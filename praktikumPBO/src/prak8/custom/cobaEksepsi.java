package prak8.custom;

import praktikum8.CobaRuntimeException;

public class cobaEksepsi {
	public static void cobaMetode(int i){
		if(i>=0){
			throw new cobaRuntimeException();
		}
		System.out.println("Nilai i= "+i);
	}
	public static void cobaMetodeDua(int i) throws cobaCheckedException{
		if(i>=0){
			throw new cobaCheckedException();
		}
		System.out.println("Nilai i= "+i);
	}
	public static void main(String[] args) {
		try{
			cobaMetode(-2);
			cobaMetodeDua(3);
		}
		catch(cobaRuntimeException e){
			System.out.println(e.getMessage());
		}
		catch (cobaCheckedException e) {
			System.out.println(e.getMessage());
		}

	}

}

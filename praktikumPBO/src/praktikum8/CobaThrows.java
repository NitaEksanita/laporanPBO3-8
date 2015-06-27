package praktikum8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CobaThrows {
	
	public static void CobaMetode() throws FileNotFoundException, ParseException{
		FileInputStream file = new FileInputStream("c:/coba.txt");
		SimpleDateFormat.getInstance().parse("1234");
	}
	public static void cobaMetodeDua(){
		try{
			CobaMetode();
			
		}catch (FileNotFoundException e){
			System.out.println("fileNotFoundException terjadi");
		}catch (ParseException e) {
			System.out.println("ParseException ditemukan");
		}
	}
	public static void main(String[] args) {
		cobaMetodeDua();
	}

}

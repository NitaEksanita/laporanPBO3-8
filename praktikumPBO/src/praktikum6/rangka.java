package praktikum6;

public class rangka {

	private Ban ban;
	public rangka(){
		ban = new Ban();
		System.out.println("konstruktor rangka");
	}
}

class Ban{
	public Ban(){
		System.out.println("konstruktor ban");
	}
}

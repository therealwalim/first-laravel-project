
public class TestZoo {

	public static void main(String[] args) {
		
		Animal R1 = new Requins();
		Animal C1 = new Chimpanze();
		Animal R2 = new Requins();
		
		R1.setNom("Jaws");
		C1.setNom("Cheetah");
		R2.setNom("Ham");
		
		System.out.println(R1.toString() + Requins.DESCRIPTION);
		System.out.println(C1.toString() + Chimpanze.DESCRIPTION);
		System.out.println(R2.toString() + Requins.DESCRIPTION);
	}

}

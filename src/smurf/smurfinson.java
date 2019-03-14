package smurf;

public class smurfinson {
	public static void main(String[] args) {

		Smurf hs = new Smurf("Handy Smurf");
		hs.eat();
		System.out.println(hs.getName());
		Smurf ps = new Smurf("Papa Smurf");
		System.out.println(ps.getName() + ", " + ps.getHatColor() + "," + ps.isGirlOrBoy());
		Smurf s = new Smurf("Smurfette");
		System.out.println(s.getName() + ", " + s.getHatColor() + "," + s.isGirlOrBoy());
	}
}

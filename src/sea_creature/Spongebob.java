package sea_creature;

public class Spongebob {
	public static void main(String[] args) {

		SeaCreature spongebob = new SeaCreature("Spongebob");
		spongebob.eat();
		spongebob.laugh();
		System.out.println(spongebob.getName());
		SeaCreature patrick = new SeaCreature("Patrick");
		patrick.eat();
		patrick.laugh();
		System.out.println(patrick.getName());
	}

}

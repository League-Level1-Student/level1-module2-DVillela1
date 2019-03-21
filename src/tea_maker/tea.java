package tea_maker;

public class tea {

	public static void main(String[] args) {
		TeaBag chamomile = new TeaBag("Chamomile");
		chamomile.getFlavor();
		Kettle kettle = new Kettle();
		kettle.boil();
		Cup cup = new Cup();
		cup.makeTea(chamomile, kettle.getWater());
	}
}

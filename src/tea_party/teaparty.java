package tea_party;

public class teaparty {
	private String name;
	private boolean isWoman;
	private boolean isKnighted;
	public String welcome(String name, boolean isWoman, boolean isKnighted)
    {
		String x;
		if (isWoman && isKnighted) {
			x = "Lady";
		return "Hello " + x + " " + name;
		}
		if (isWoman && isKnighted == false) {
			x = "Ms.";
		return "Hello" + x + " " + name;
		}
		if (isWoman == false && isKnighted) {
			x = "Sir";
		return "Hello" + x + " " + name;
		}
		if (isWoman == false && isKnighted == false) {
			x = "Mr.";
		return "Hello" + x + " " + name;
		}
		return "ok";
    }
	
}

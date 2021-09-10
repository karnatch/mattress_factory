package mattress;

public class MattressFactory {
	public static AbstractMattress getMattress(String ch) {
		if(ch.equalsIgnoreCase("Size")) {
			return new MattressSize();
		} else if(ch.equalsIgnoreCase("Thickness")) {
			return new MattressThickness();
		}
		return null;
	}
}
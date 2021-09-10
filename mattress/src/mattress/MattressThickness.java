package mattress;

public class MattressThickness extends AbstractMattress {
	public Size getSize(String size) {
		return null;
	}
	@Override
	Thickness getThickness(String thickness) {
		if(thickness == null ) {
			return null;
		}
		if(thickness.equalsIgnoreCase("Eight")) {
			return new Inch8();
		} else if(thickness.equalsIgnoreCase("Ten")) {
			return new Inch10();
		} else if(thickness.equalsIgnoreCase("Fifteen")) {
			return new Inch15();
		}
		return null;
	}
}
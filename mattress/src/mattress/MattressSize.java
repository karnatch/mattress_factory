package mattress;

public class MattressSize extends AbstractMattress {
	public Size getSize(String size) {
		if(size == null ) {
			return null;
		}
		if(size.equalsIgnoreCase("Four")) {
			return new Fourby6();
		} else if(size.equalsIgnoreCase("Five")) {
			return new Fiveby6();
		} else if(size.equalsIgnoreCase("Six")) {
			return new Sixby6();
		}
		return null;
	}
	@Override
	Thickness getThickness(String thickness) {
		return null;
	}
}
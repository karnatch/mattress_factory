package mattress;

public class Mattress {
	public static void main(String[] args) {
		AbstractMattress mattress_size = MattressFactory.getMattress("Size");
		Size size1 = mattress_size.getSize("Four");
		size1.showSize();
	}
}
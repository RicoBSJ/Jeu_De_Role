import comportement.*;

class OtherTest {

	public static void main(String[] args) {
		Personnage pers = new Guerrier();
		pers.soigner();
		pers.setSoin(new Operation());
		pers.soigner();
	}
}
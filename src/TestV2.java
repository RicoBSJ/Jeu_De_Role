import comportement.*;

class TestV2 {

	public static void main(String[] args) {
		Personnage pers = new Guerrier();
		pers.soigner();
		pers.setSoin(new Operation());
		pers.soigner();

		// Utilisation d'une classe anonyme
		pers.setSoin(new Soin() {
			public void soigne() {
				System.out.println("Je soigne avec une classe anonyme ! ");
			}
		});
		pers.soigner();
	}
}

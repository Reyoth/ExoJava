package exo2;

/**
 * @author Reyoth
 */
public class Main {

	public static void main(String[] args) {
		Cle cle1 = new Cle(123456);
		Coffre coffre1 = new Coffre(cle1);

		coffre1.getCadenas().fermer();

		Cle cle2 = new Cle(4563);

		coffre1.ouvrir();
		coffre1.getCadenas().ouvrir(cle2);

		coffre1.getCadenas().ouvrir(cle1);
		coffre1.ouvrir();

	}

}

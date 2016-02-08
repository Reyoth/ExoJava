package exo2;

/**
 * @author Reyoth
 */
public class Cadenas {
	private boolean ouvert;
	private Cle cle;

	public Cadenas(Cle cle) {
		this.cle = cle;
		ouvert = true;
	}

	public void ouvrir(Cle cle) {
		if (this.cle.getValue() == cle.getValue()) {
			ouvert = true;
			System.out.println("Le cadena est ouvert");
		}
		else {
			System.out.println("Impossible d'ouvrir le cadena, ce n'est pas la bonne clé");
		}
	}

	public void fermer() {
		ouvert = false;
		System.out.println("Le cadena est fermé");
	}

	public boolean isOuvert() {
		return ouvert;
	}

}

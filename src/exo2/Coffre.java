package exo2;

/**
 * @author Reyoth
 */
public class Coffre {
	private Cadenas cadenas;
	private boolean ouvert;

	public Coffre(Cle cle) {
		this.cadenas = new Cadenas(cle);
		ouvert = false;
	}

	public void ouvrir() {
		if (cadenas.isOuvert()) {
			ouvert = true;
			System.out.println("Le coffre est ouvert");
		}
		else {
			System.out.println("Impossible d'ouvrir le coffre, son cadena est verrouillé");
		}
	}

	public void fermer() {
		ouvert = false;
		System.out.println("Le coffre est fermé");
	}

	public Cadenas getCadenas() {
		return cadenas;
	}

	public boolean isOuvert() {
		return ouvert;
	}

}

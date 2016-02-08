package exo1;

/**
 * @author Reyoth
 */
public class Point {
	private char nom;
	private double abscisse;

	public Point(char nom, double abscisse) {
		this.nom = nom;
		this.abscisse = abscisse;
	}

	public String affiche() {
		return "Point " + nom + " abscisse=" + abscisse;
	}

	public void translate(double abscisse) {
		this.abscisse += abscisse;
	}

}

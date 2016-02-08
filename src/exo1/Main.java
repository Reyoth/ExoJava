package exo1;

import java.util.Scanner;

/**
 * @author Reyoth
 */
public class Main {

	public static void main(String[] args) {
		transPoint();
	}

	public static void transPoint() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez donner une lettre à votre point");
		char l = sc.next().charAt(0);
		System.out.println("Veuillez donner une abscisse a votre point");
		double a = sc.nextDouble();

		Point p = new Point( l, a );
		System.out.println("Vous avez créez :\n" + p.affiche());

		boolean b = false;
		do {
			System.out.println("Pour operer une translation de votre point, entrez le nombre correspondant");
			p.translate(sc.nextDouble());
			System.out.println(p.affiche());

			System.out.println("\nVoulez vous continuer ? O/n");
			if (sc.next().toLowerCase().charAt(0) == 'o') {
				b=true;
			}
		}while (b);
		sc.close();
	}
}

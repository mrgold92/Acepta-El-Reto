package aceptaElReto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author David Salazar
 */
public class P123 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] verb = sc.nextLine().split(" ");

		while (!verb[1].toUpperCase().equals("T")) {
			Verbo verbo = new Verbo(verb[0], verb[1]);
			ArrayList<String> c = verbo.conjugar();

			for (String v : c) {
				System.out.println(v);
			}
			verb = sc.nextLine().split(" ");

		}

		sc.close();

	}

}

class Verbo {
	private String verbo;
	private String tiempo;
	private String terminacion;

	public Verbo(String verbo, String tiempo) {
		this.verbo = verbo;
		this.tiempo = tiempo;
	}

	public String getVerbo() {
		return verbo;
	}

	public void setVerbo(String verbo) {
		this.verbo = verbo;
	}

	private void splitVerbo() {

		int cantidad = 2;

		int m = Math.max(0, this.verbo.length() - cantidad);

		this.terminacion = this.verbo.substring(m, this.verbo.length()).toString().toLowerCase();
		this.verbo = this.verbo.substring(0, m).toString();

	}

	public ArrayList<String> conjugar() {
		this.splitVerbo();

		ArrayList<String> verbosList = new ArrayList<>();

		switch (this.tiempo.toUpperCase()) {
		case "A":

			if (this.terminacion.equals("ar")) {
				verbosList.add("yo " + this.verbo + "o");
				verbosList.add("tu " + this.verbo + "as");
				verbosList.add("el " + this.verbo + "a");
				verbosList.add("nosotros " + this.verbo + "amos");
				verbosList.add("vosotros " + this.verbo + "ais");
				verbosList.add("ellos " + this.verbo + "an");

			}

			if (this.terminacion.equals("er")) {
				verbosList.add("yo " + this.verbo + "o");
				verbosList.add("tu " + this.verbo + "es");
				verbosList.add("el " + this.verbo + "e");
				verbosList.add("nosotros " + this.verbo + "emos");
				verbosList.add("vosotros " + this.verbo + "eis");
				verbosList.add("ellos " + this.verbo + "en");

			}

			if (this.terminacion.equals("ir")) {

				verbosList.add("yo " + this.verbo + "o");
				verbosList.add("tu " + this.verbo + "es");
				verbosList.add("el " + this.verbo + "e");
				verbosList.add("nosotros " + this.verbo + "imos");
				verbosList.add("vosotros " + this.verbo + "is");
				verbosList.add("ellos " + this.verbo + "en");
			}

			break;

		case "P":

			if (this.terminacion.equals("er") || this.terminacion.equals("ir")) {
				verbosList.add("yo " + this.verbo + "i");
				verbosList.add("tu " + this.verbo + "iste");
				verbosList.add("el " + this.verbo + "io");
				verbosList.add("nosotros " + this.verbo + "imos");
				verbosList.add("vosotros " + this.verbo + "isteis");
				verbosList.add("ellos " + this.verbo + "ieron");
			} else {
				verbosList.add("yo " + this.verbo + "e");
				verbosList.add("tu " + this.verbo + "aste");
				verbosList.add("el " + this.verbo + "o");
				verbosList.add("nosotros " + this.verbo + "amos");
				verbosList.add("vosotros " + this.verbo + "asteis");
				verbosList.add("ellos " + this.verbo + "aron");
			}

			break;

		case "F":
			if (this.terminacion.equals("ar")) {
				verbosList.add("yo " + this.verbo + "are");
				verbosList.add("tu " + this.verbo + "aras");
				verbosList.add("el " + this.verbo + "ara");
				verbosList.add("nosotros " + this.verbo + "aremos");
				verbosList.add("vosotros " + this.verbo + "areis");
				verbosList.add("ellos " + this.verbo + "aran");

			}

			if (this.terminacion.equals("er")) {
				verbosList.add("yo " + this.verbo + "ere");
				verbosList.add("tu " + this.verbo + "eras");
				verbosList.add("el " + this.verbo + "era");
				verbosList.add("nosotros " + this.verbo + "eremos");
				verbosList.add("vosotros " + this.verbo + "ereis");
				verbosList.add("ellos " + this.verbo + "eran");

			}

			if (this.terminacion.equals("ir")) {
				verbosList.add("yo " + this.verbo + "ire");
				verbosList.add("tu " + this.verbo + "iras");
				verbosList.add("el " + this.verbo + "ira");
				verbosList.add("nosotros " + this.verbo + "iremos");
				verbosList.add("vosotros " + this.verbo + "ireis");
				verbosList.add("ellos " + this.verbo + "iran");

			}

			break;

		default:
			break;

		}

		return verbosList;
	}

}
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
		String[] p = { "yo ", "tu ", "el ", "nosotros ", "vosotros ", "ellos " };

		String[] verb = sc.nextLine().split(" ");

		while (!verb[1].toUpperCase().equals("T")) {

			Verbo verbo = new Verbo(verb[0], verb[1]);
			ArrayList<String> c = verbo.conjugar();

			for (int i = 0; i < p.length; i++) {

				System.out.println(p[i] + verbo.getVerbo() + c.get(i));

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

			verbosList.add("o");

			if (this.terminacion.equals("ar")) {

				verbosList.add("as");
				verbosList.add("a");
				verbosList.add("amos");
				verbosList.add("ais");
				verbosList.add("an");

			}

			if (this.terminacion.equals("er")) {
				verbosList.add("es");
				verbosList.add("e");
				verbosList.add("emos");
				verbosList.add("eis");
				verbosList.add("en");

			}

			if (this.terminacion.equals("ir")) {
				verbosList.add("es");
				verbosList.add("e");
				verbosList.add("imos");
				verbosList.add("is");
				verbosList.add("en");
			}

			break;

		case "P":

			if (this.terminacion.equals("er") || this.terminacion.equals("ir")) {
				verbosList.add("i");
				verbosList.add("iste");
				verbosList.add("io");
				verbosList.add("imos");
				verbosList.add("isteis");
				verbosList.add("ieron");
			} else {
				verbosList.add("e");
				verbosList.add("aste");
				verbosList.add("o");
				verbosList.add("amos");
				verbosList.add("asteis");
				verbosList.add("aron");
			}

			break;

		case "F":
			if (this.terminacion.equals("ar")) {
				verbosList.add("are");
				verbosList.add("aras");
				verbosList.add("ara");
				verbosList.add("aremos");
				verbosList.add("areis");
				verbosList.add("aran");

			}

			if (this.terminacion.equals("er")) {
				verbosList.add("ere");
				verbosList.add("eras");
				verbosList.add("era");
				verbosList.add("eremos");
				verbosList.add("ereis");
				verbosList.add("eran");

			}

			if (this.terminacion.equals("ir")) {
				verbosList.add("ire");
				verbosList.add("iras");
				verbosList.add("ira");
				verbosList.add("iremos");
				verbosList.add("ireis");
				verbosList.add("iran");

			}

			break;

		default:
			break;

		}

		return verbosList;
	}

}
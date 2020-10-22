package aceptaElReto;

import java.util.Scanner;

public class P536 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tamano, abono, agua, distancia;
		String nombre;
		Persona p;

		while (sc.hasNext()) {
			p = null;

			for (int i = sc.nextInt(); i > 0; i--) {

				tamano = sc.nextInt();
				abono = sc.nextInt();
				agua = sc.nextInt();
				distancia = sc.nextInt();
				nombre = sc.nextLine();

				if (p == null) {
					p = new Persona(tamano, abono, agua, distancia, nombre);
				} else {
					if (p.tamano == tamano) {
						if (p.agua == agua) {
							if (distancia == p.distancia) {
								if (abono < p.abono) {
									p = new Persona(tamano, abono, agua,
											distancia, nombre);
								}
							} else if (distancia < p.distancia) {
								p = new Persona(tamano, abono, agua, distancia,
										nombre);
							}
						} else if (agua < p.agua) {
							p = new Persona(tamano, abono, agua, distancia,
									nombre);
						}
					} else if (tamano > p.tamano) {
						p = new Persona(tamano, abono, agua, distancia, nombre);
					}
				}

			}

			System.out.println(p.nombre.trim());
		}

	}
}

class Persona {
	int tamano;
	int abono;
	int agua;
	int distancia;
	String nombre;

	public Persona(int tamano, int abono, int agua, int distancia,
			String nombre) {
		this.tamano = tamano;
		this.abono = abono;
		this.agua = agua;
		this.distancia = distancia;
		this.nombre = nombre;
	}

}
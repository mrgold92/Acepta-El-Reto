package aceptaElReto;

import java.util.Scanner;

public class P108 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] valores = new double[5];
		String[] tipos = { "DESAYUNOS#", "COMIDAS#", "MERIENDAS#", "CENAS#", "COPAS#" };
		char letra;
		double cantidad;
		double suma = 0;
		int dia = 0, comida = 0;
		int empateMinimo, empateMaximo;
		int indiceMinimo, indiceMaximo;
		double valorMaximo, valorMinimo;
		while (sc.hasNextLine()) {
			String valor = sc.nextLine();
			String[] val = valor.split(" ");
			letra = val[0].charAt(0);
			cantidad = Double.parseDouble(val[1]);
			switch (letra) {
			case 'D':
				valores[0] += cantidad;
				suma += cantidad;
				dia++;
				break;
			case 'A':
				valores[1] += cantidad;
				suma += cantidad;
				dia++;
				comida++;
				break;
			case 'M':
				valores[2] += cantidad;
				suma += cantidad;
				dia++;
				break;
			case 'I':
				valores[3] += cantidad;
				suma += cantidad;
				dia++;
				break;
			case 'C':
				valores[4] += cantidad;
				suma += cantidad;
				dia++;
				break;
			default:
				valorMaximo = valores[0];
				valorMinimo = valores[0];
				empateMinimo = 1;
				empateMaximo = 1;
				indiceMinimo = indiceMaximo = 0;

				for (int i = 1; i < 5; i++) {

					if (valores[i] < valorMinimo) {
						valorMinimo = valores[i];
						indiceMinimo = i;
						empateMinimo = 1;
					} else if (valores[i] == valorMinimo) {
						empateMinimo++;
					}

					if (valores[i] > valorMaximo) {
						valorMaximo = valores[i];
						indiceMaximo = i;
						empateMaximo = 1;
					} else if (valores[i] == valorMaximo) {
						empateMaximo++;
					}
				}

				

				if (empateMaximo > 1) {
					System.out.print("EMPATE#");
				} else {
					System.out.print(tipos[indiceMaximo]);
				}
				
				if (empateMinimo > 1) {
					System.out.print("EMPATE#");
				} else {

					System.out.print(tipos[indiceMinimo]);
				}

				if (valores[1] / comida > suma / dia) {
					System.out.print("SI\n");
				} else {
					System.out.print("NO\n");
				}

				for (int i = 0; i < 5; i++) {
					valores[i] = 0;
				}
				suma = dia = comida = 0;

				break;

			}

		}
	}

	public static void medias(double desayunos, double comidas, double meriendas, double cenas, double copas, int i,
			int contadordia) {
		double mediaComida = comidas / i;
		double mediaDia = (desayunos + comidas + meriendas + cenas + copas) / 5;

		if (mediaComida > mediaDia) {
			System.out.print("SI\n");
		} else {
			System.out.print("NO\n");
		}
	}

}

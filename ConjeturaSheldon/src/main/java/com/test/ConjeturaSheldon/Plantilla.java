package com.test.ConjeturaSheldon;

public class Plantilla {

	int inicio = 0, fin = 1000000;

	public int Inver(int num) {
		int invertido = 0, resto;

		while (num > 0) {
			resto = num % 10;
			invertido = invertido * 10 + resto;
			num /= 10;
		}
		return invertido;
	}

	public int PrimosMillon(int num) {
		int contador = 0, x;
		for (x = inicio; x <= fin; x++) {
			if (esPrimo(x)) {
				contador++;
				if (x == num) {
					break;
				}
			}
		}
		return contador;
	}

	public static boolean esPrimo(int num) {
		if (num == 0 || num == 1 || num == 4) {
			return false;
		}
		for (int x = 2; x < num / 2; x++) {
			if (num % x == 0)
				return false;
		}
		return true;
	}

	public int Multi(int num) {
		int total = 1, d;

		while (num > 0) {
			d = num % 10;
			total = total * d;
			num = num / 10;
		}
		return total;
	}

	public void Llamados() {
		for (int i = inicio; i <= fin; i++) {
			if (esPrimo(i)) {
				if (Multi(i) == PrimosMillon(i) && PrimosMillon(i) >= 20) {
					System.out.println("Numero de sheldon: " + i);
				}
			}
		}
	}
}
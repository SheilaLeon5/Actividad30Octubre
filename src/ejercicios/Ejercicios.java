
package ejercicios;

import java.util.Random;

/**
 * @author Sheila León Santana
 *
 */
public class Ejercicios {
	public float calcularSaldoFinal(float saldoInicial, float[] movimientos) {
		
		return saldoInicial;

	}

	public int ejercicio2(int n, int inferior, int superior) {
		int numero;
		int acumulador = 0;
		Random rnd = new Random();
		for (int i = 0; i < n; i++) {
			numero = inferior + rnd.nextInt(superior);
			acumulador += numero;
		}
		return acumulador / n;
	}

	public static void main(String[] args) {
		//Ejercicios ejercicios = new Ejercicios();
		//int media = ejercicios.ejercicio2(5, 1, 100);
		//System.out.println(media);
		
		
		Ejercicios ejercicios = new Ejercicios();
		int media = ejercicios.calcularSaldoFinal(100, movimientos);
		float [] movimienots = new float[]
	}

}

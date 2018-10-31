
package ejercicios;

import java.util.Random;

/**
 * @author Sheila León Santana
 *  30/10/2018
 *
 */
public class Ejercicios {
	public float calcularSaldoFinal(float saldoInicial, float[] movimientos) {
		float saldofin = saldoInicial;
		for (int i = 0; i < movimientos.length; i++) {
			saldofin += movimientos[i]; 
		}
		return saldofin;
	}

	public int ejercicio2(int n, int inferior, int superior) {
		int numero;
		int acumulador = 0;
		Random rnd = new Random();
		for (int i = 0; i < n; i++) {
			numero = inferior + rnd.nextInt(superior);    // acumulador += inferior + rnd.nextInt(superior);  Otra manera que nos ahorra una variable y una linea
			acumulador += numero;
		}
		return acumulador / n;
	}

	public static void main(String[] args) {
		
		/* -- Actividad 1 -- Dado un saldo inicial y una lista de movimientos, se pide obtener el saldo final.
		 * 
		 */
		Ejercicios ejercicios = new Ejercicios();
		float [] movimientos = {100,-50,2,-8};
		float  calcSaldo = ejercicios.calcularSaldoFinal(100, movimientos);
		System.out.println("Saldo Actual de su cuenta: " + calcSaldo + "€");
		
		
		
		
		/* -- Actividad 2--   obtener un método que devuelva la media de  n números aleatorios.
		   
		 Ejercicios ejercicios = new Ejercicios();
		 int media = ejercicios.ejercicio2(5, 1, 100);
		 System.out.println(media);
		*/
				
		
	}

}

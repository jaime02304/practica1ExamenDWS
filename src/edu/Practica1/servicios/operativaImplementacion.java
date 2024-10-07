package edu.Practica1.servicios;

import java.util.Scanner;

/**
 * Implementacion que esta implementando la operativa de interfaz
 * @author vspc - 7/10/2024
 */
public class operativaImplementacion implements operativaInterfaz {


	public long aniadirVenta(Scanner sc) {
		System.out.println("Buenas, ¿podrias meter la cantidad que quieres añadir, por favor?(no hace falta que metas nada mas que la cantidada)");
		long cantidad = sc.nextLong();
		System.out.println("Muchas gracias se acaba de añadir " + cantidad + "€ a la cantidad total");
		return cantidad;
	}

	
	public long aniadirGastos(Scanner sc) {
		System.out.println("Buenas, ¿podrias meter la cantidad de gastos que quieres añadir, por favor? (no hace falta que metas nada mas que la cantidada)");
		long cantidad = sc.nextLong();
		System.out.println("Muchas gracias se acaba de eliminar " + cantidad + "€ a la cantidad total");
		return cantidad;

		
	}

	
	public void mostrarTotal(long cantidadTotal,Scanner sc) {
		System.out.println("Buenas ahora a continuacion se mostrara la cantidad final que ha obtenido en el dia.");
		if(cantidadTotal>0) {
			System.out.println(cantidadTotal + "€" + " Excelente el dia de hoy");
		}else if(cantidadTotal==0) {
			System.out.println(cantidadTotal + "€"  + " Vamos mal");
		}else if (cantidadTotal<0) {
			System.out.println(cantidadTotal + "€"  + " Vamos muy mal");
		}
	}
}

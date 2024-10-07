package edu.Practica1.controladores;

import java.util.Scanner;

import edu.Practica1.servicios.logsImplementacion;
import edu.Practica1.servicios.logsInterfaz;
import edu.Practica1.servicios.menuImplementacion;
import edu.Practica1.servicios.menuInterfaz;
import edu.Practica1.servicios.operativaImplementacion;
import edu.Practica1.servicios.operativaInterfaz;

public class inicioApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		menuInterfaz mi = new menuImplementacion();
		operativaInterfaz op = new operativaImplementacion();
		logsInterfaz lg = new logsImplementacion();
		long cantidadTotal = 0;
		byte opcionMenu = 0;
		boolean cerrarMenu = false;

		try {

			do {
				switch (opcionMenu = mi.menuPrincipal(sc)) {
				case 1:
					cantidadTotal += op.aniadirVenta(sc);
					lg.comentarioLog("Opcion 1. Añadir venta");
					break;
				case 2:
					cantidadTotal -= op.aniadirGastos(sc);
					if (cantidadTotal == 0) {
						System.out.println("[WARNING] - La cantidad total de la tienda ha llegado a 0.");
					} else if (cantidadTotal < 0) {
						System.out.println("[WARNING] - La cantidad total ha llegado en numeros negativos");
					}
					lg.comentarioLog("Opcion 2. Añadir gasto");
					break;
				case 3:
					op.mostrarTotal(cantidadTotal, sc);
					System.out.println("A continuacion se cerrara el menu.");
					lg.comentarioLog("Opcion 3. Mostrar total");
					cerrarMenu = true;
					break;
				default:
					System.out.println("Por favor no ha elegido ninguna opcion valida, intentelo de nuevo.");
					break;
				}

			} while (!cerrarMenu);

		} catch (Exception e) {
		}

	}
}

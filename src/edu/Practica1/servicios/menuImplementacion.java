package edu.Practica1.servicios;

import java.util.Scanner;

/**
 * Implementacion de la interfaz de menus
 * @author vspc - 7/10/2024
 */
public class menuImplementacion implements menuInterfaz {


	public byte menuPrincipal(Scanner sc) {
		System.out.println("Opcion 1. Añadir ventas");
		System.out.println("Opcion 2. Añadir gastos");
		System.out.println("Opcion 3. Mostrar cantidad final y cerrar menu");
		byte opcion= sc.nextByte();
		return opcion;
	}



}

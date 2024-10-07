package edu.Practica1.servicios;

import java.util.Scanner;

/**
 * Interfaz donde se encontrara toda la cabecera de los metodos de la operativa
 * 
 * @author vspc - 7/10/2024
 */
public interface operativaInterfaz {

	/**
	 * Metodo que añade la venta a la cantidad total
	 * 
	 * @author vspc - 7/10/2024
	 * @param cantidadTotal
	 */
	public long aniadirVenta( Scanner sc);

	/**
	 * Metodo que añade el gasto a la cantidad total
	 * 
	 * @author vspc - 7/10/2024
	 * @param cantidadTotal
	 */
	public long aniadirGastos(Scanner sc);

	/**
	 * Metodo que muestra la cantidad total entre ventas y gastos
	 * @param cantidadTotal
	 */
	public void mostrarTotal(long cantidadTotal,Scanner sc);

}

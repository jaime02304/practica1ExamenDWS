package edu.Practica1.servicios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Implementacion que implementa el añadir comentario a los logs
 * @author vspc - 7/10/2024
 */
public class logsImplementacion implements logsInterfaz {

	public void comentarioLog(String mensaje) {
		String ficheroLog = "D:\\ProyectosDWS\\Practicsa1\\Logs\\logs.txt";

		try {
			PrintWriter escritorPrintWriter = new PrintWriter(new FileWriter(ficheroLog,true));
				escritorPrintWriter.println(mensaje);
				escritorPrintWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

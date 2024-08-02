package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SistemaTickets {

	public static void main(String[] args) {
		
		// Estructura de datos
		List<Tickets> listaTickets = new ArrayList<Tickets>();
		
		// Creacion de Ticket mediante el constructor con parametros
		Tickets ticket1 = new Tickets(2,2,2,new Date(),new Date(),2150);
		Tickets ticket2 = new Tickets(3,2,3,new Date(),new Date(),1150);
		
		// Creacion de Ticket usando constructor vacio. Se aplica encapsulamiento
		Tickets ticket3 = new Tickets();
		ticket3.setAsiento(4);
		ticket3.setFechaCompra(new Date());
		ticket3.setFechaValidez(new Date());
		ticket3.setFila(4);
		ticket3.setNumero(8);
		ticket3.setPrecio(1200);
		
		//Almacenar numero indeterminado de tickets
		listaTickets.add(ticket1);
		listaTickets.add(ticket2);
		listaTickets.add(ticket3);
		
		// Suma de precio de todos los tickets
		
		
		// Solicitar al usuario que ingrese un numero de fila
		Scanner input = new Scanner(System.in);
		int numFila;
		
		System.out.print("Ingrese numero de fila: ");
		numFila = input.nextInt();
		
		for (int i = 0; i < listaTickets.size(); i++) {
			if(numFila == listaTickets.get(i).getFila()) {
				System.out.println(listaTickets.get(i));
			}
		}
		
	}
}

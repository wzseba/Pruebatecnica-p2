package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SistemaTickets {

	public static void main(String[] args) {
		
		// Estructura de datos
		List<Tickets> listaTickets = new ArrayList<Tickets>();
		
		// Creacion de Clientes
		Clientes cliente1 = new Clientes(85,"sebastian","vera");
		Clientes cliente2 = new Clientes(20,"daniela","rodriguez");
		Clientes cliente3 = new Clientes(8,"jose","lopez");
		
		// Creacion de Ticket mediante el constructor con parametros
		Tickets ticket1 = new Tickets(2,2,2,new Date(),new Date(),2150,cliente1);
		Tickets ticket2 = new Tickets(3,2,3,new Date(),new Date(),1150,cliente2);
		
		// Creacion de Ticket usando constructor vacio. Se aplica encapsulamiento
		Tickets ticket3 = new Tickets();
		ticket3.setAsiento(4);
		ticket3.setFechaCompra(new Date());
		ticket3.setFechaValidez(new Date());
		ticket3.setFila(4);
		ticket3.setNumero(8);
		ticket3.setPrecio(1200);
		ticket3.setCliente(cliente3);
		
		//Almacenar numero indeterminado de tickets
		listaTickets.add(ticket1);
		listaTickets.add(ticket2);
		listaTickets.add(ticket3);
		
		// Suma de precio de todos los tickets
		double total= 0;
		for (Tickets tick : listaTickets) {
			total += tick.getPrecio();
		}
		System.out.println("Total: $" + total);
		
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

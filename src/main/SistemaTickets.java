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
		Tickets ticket1 = new Tickets(1,2,2,new Date(),new Date(),2150);
		Tickets ticket2 = new Tickets(2,2,3,new Date(),new Date(),1150);
		
		// Creacion de Ticket usando constructor vacio. Se aplica encapsulamiento
		Tickets ticket3 = new Tickets();
		ticket3.setAsiento(4);
		ticket3.setFechaCompra(new Date());
		ticket3.setFechaValidez(new Date());
		ticket3.setFila(4);
		ticket3.setNumero(3);
		ticket3.setPrecio(1200);
		
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
		
		Boolean bandera = false;
		for (int i = 0; i < listaTickets.size(); i++) {
			if(numFila == listaTickets.get(i).getFila()) {
				System.out.print(listaTickets.get(i));
				bandera = true;
			}
		}
		
		System.out.println();
		
		if(!bandera) {
			System.out.println("No hay informacion para esa fila");
		}
		
		// Creacion de Clientes
		Clientes cliente1 = new Clientes();
		cliente1.setId(48);
		cliente1.setNombre("roberto");
		cliente1.setApellido("perez");
		cliente1.getListaTickets().add(ticket3);
		
		Tickets ticket4 = new Tickets(4,2,3,new Date(),new Date(),3250);
		cliente1.getListaTickets().add(ticket4);
		
		// Mostrar tickets asociados a un cliente
		System.out.println();
		System.out.print(cliente1.toString());
		
	}
}

package main;

import java.util.ArrayList;
import java.util.List;

public class Clientes {

	private int id;
	private String nombre;
	private String apellido;
	private List<Tickets> listaTicketsCliente = new ArrayList<Tickets>();

	public Clientes() {
	}

	public Clientes(int id, String nombre, String apellido, List<Tickets> listaTicketsCliente) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.listaTicketsCliente = listaTicketsCliente;
	}

	public List<Tickets> getListaTickets() {
		return listaTicketsCliente;
	}

	public void setListaTickets(List<Tickets> listaTickets) {
		this.listaTicketsCliente = listaTickets;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Cliente id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", lista de Tickets:"+ listaTicketsCliente;
	}

}

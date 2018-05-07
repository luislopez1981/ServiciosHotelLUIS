package com.computerspace.servicios.hoteles.modelo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="habitaciones")
public class Habitacion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idhabitacion;
	@Column
	private String nombre;
	@Column
	private String descripcion;
	@Column
	private long pax;
	@Column
	private long libre;
	
	

	@OneToMany (fetch=FetchType.EAGER, mappedBy="habitacion", cascade=CascadeType.ALL)
	private Set<HabitacionReservada> listaReservadas;
	
	@ManyToMany(mappedBy="habitacionesReservadas")
	private Set<Reserva> reservas;
	
	
	public Habitacion() {
		super();
	}

	

	public Habitacion(String nombre, String descripcion, long pax, long libre) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.pax = pax;
		this.libre = libre;
	}



	public long getIdhabitacion() {
		return idhabitacion;
	}

	public void setIdhabitacion(long idhabitacion) {
		this.idhabitacion = idhabitacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public long getPax() {
		return pax;
	}

	public void setPax(long pax) {
		this.pax = pax;
	}

	public long getLibre() {
		return libre;
	}

	public void setLibre(long libre) {
		this.libre = libre;
	}



	public Set<HabitacionReservada> getListaReservadas() {
		return listaReservadas;
	}



	public void setListaReservadas(Set<HabitacionReservada> listaReservadas) {
		this.listaReservadas = listaReservadas;
	}

	
	
	
	

}

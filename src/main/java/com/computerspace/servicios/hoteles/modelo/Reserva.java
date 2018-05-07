package com.computerspace.servicios.hoteles.modelo;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="reservas")
public class Reserva {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idreserva;
	@Column
	private Date fechainicio;
	@Column
	private Date fechafin;
	@Column
	private long checkin;
	@Column
	private long anulada;
	
	
	@ManyToOne
	@JoinColumn(name="idcliente")
	private Cliente cliente;
	
	@OneToMany  (fetch=FetchType.EAGER, mappedBy="reserva", cascade=CascadeType.ALL)
	private Set<HabitacionReservada> listaReservadas;
	
	@ManyToMany(targetEntity=Habitacion.class)
	@JoinTable(name="habitacionesreservadas",
	joinColumns={@JoinColumn(name="idreserva")},
	inverseJoinColumns={@JoinColumn(name="idhabitacion")})
	private Set<Habitacion> habitacionesReservadas;
	
	
	public Reserva() {
		super();
	}


	public Reserva(Date fechainicio, Date fechafin, Cliente cliente) {
		super();
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.cliente = cliente;
	}


	public long getIdreserva() {
		return idreserva;
	}


	public void setIdreserva(long idreserva) {
		this.idreserva = idreserva;
	}


	public Date getFechainicio() {
		return fechainicio;
	}


	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}


	public Date getFechafin() {
		return fechafin;
	}


	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}


	public long getCheckin() {
		return checkin;
	}


	public void setCheckin(long checkin) {
		this.checkin = checkin;
	}


	public long getAnulada() {
		return anulada;
	}


	public void setAnulada(long anulada) {
		this.anulada = anulada;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Set<HabitacionReservada> getListaReservadas() {
		return listaReservadas;
	}


	public void setListaReservadas(Set<HabitacionReservada> listaReservadas) {
		this.listaReservadas = listaReservadas;
	}


	public Set<Habitacion> getHabitacionesReservadas() {
		return habitacionesReservadas;
	}


	public void setHabitacionesReservadas(Set<Habitacion> habitacionesReservadas) {
		this.habitacionesReservadas = habitacionesReservadas;
	}
	
	
	

}

package com.computerspace.servicios.hoteles.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="habitacionesreservadas")
public class HabitacionReservada {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idhabitacionesreservadas;
	
	@ManyToOne
	@JoinColumn(name="idreserva")
	private Reserva reserva;
	
	@ManyToOne
	@JoinColumn(name="idhabitacion")
	private Habitacion habitacion;
	

}

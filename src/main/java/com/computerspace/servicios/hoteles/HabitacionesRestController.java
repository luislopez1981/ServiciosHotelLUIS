package com.computerspace.servicios.hoteles;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.computerspace.servicios.hoteles.dtos.HabitacionDTO;
import com.computerspace.servicios.hoteles.modelo.Cliente;
import com.computerspace.servicios.hoteles.modelo.Habitacion;
import com.computerspace.servicios.hoteles.modelo.IClienteRepository;
import com.computerspace.servicios.hoteles.modelo.IHabitacionRepository;
import com.computerspace.servicios.hoteles.modelo.IReservaRepository;
import com.computerspace.servicios.hoteles.modelo.Reserva;
import com.computerspace.servicios.hoteles.servicios.HabitacionServicios;

@CrossOrigin
@RestController
@RequestMapping("/habitaciones")
public class HabitacionesRestController {

	@Autowired
	IHabitacionRepository hr;
	
	@Autowired
	IClienteRepository  cr;
	
	@Autowired
	IReservaRepository rr;
	
	@Autowired
	HabitacionServicios hs;
	
	@RequestMapping("/lista")
	public List<Habitacion> listadoHabitaciones(){
		//List<Habitacion> listado = new ArrayList<Habitacion>();
//		listado.add(new Habitacion(1, "101", "Con vistas al mar", 3, 0));
//		listado.add(new Habitacion(2, "102", "Con vistas al parking", 5, 2));
//		listado.add(new Habitacion(3, "103", "Para pajilleros", 1, 1));
//		listado.add(new Habitacion(4, "Suite Cassandra", "Con jacuzzi", 4, 0));
		
		//listado =hr.findAll();
		
//		Habitacion h1 = new Habitacion("101", "Exterior balcon", 2, 0);
//		Habitacion h2 = new Habitacion("201", "Exterior jacuzzy", 2, 0);
//		Habitacion h3 = new Habitacion("301", "Interior doble", 4, 0);
//		Habitacion h4 = new Habitacion("401", "Interior standard", 2, 0);
//		
//		hr.save(h1);
//		hr.save(h2);
//		hr.save(h3);
//		hr.save(h4);
		
//		Cliente c1 = new Cliente("Cristiano", "Ronaldo", "cristiano@ronaldo.com", "cr7");
//		Cliente c2 = new Cliente("Jose Luis", "Torrente", "joseluis@torrente.com", "torrente");
//		cr.save(c1);
//		cr.save(c2);
				
//		Cliente c = cr.findById(13L).get();
//		Reserva r1 = new Reserva(new Date(), new Date(), c);
//		rr.save(r1);
		
		return hs.listarTodas();
	}

}

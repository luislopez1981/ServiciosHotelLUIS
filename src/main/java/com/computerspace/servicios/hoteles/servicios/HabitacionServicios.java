package com.computerspace.servicios.hoteles.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.computerspace.servicios.hoteles.dtos.HabitacionDTO;
import com.computerspace.servicios.hoteles.modelo.Habitacion;
import com.computerspace.servicios.hoteles.modelo.IHabitacionRepository;

@Service
public class HabitacionServicios {

	@Autowired
	IHabitacionRepository hr;

	public List<Habitacion> listarTodas() {

		return hr.findAll();

	}
}

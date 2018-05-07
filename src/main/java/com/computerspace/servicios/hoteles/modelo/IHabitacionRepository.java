package com.computerspace.servicios.hoteles.modelo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.computerspace.servicios.hoteles.dtos.HabitacionDTO;

public interface IHabitacionRepository extends JpaRepository<Habitacion, Long>{
	
}

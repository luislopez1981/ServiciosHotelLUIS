package com.computerspace.servicios.hoteles.dtos;

public class HabitacionDTO {

	private long idhabitacion;
	private String nombre;
	private String descripcion;
	private int pax;
	private int libre;
	
	
	
	
	public HabitacionDTO() {
		super();
	}
	
	
	public HabitacionDTO(long idhabitacion, String nombre, String descripcion, int pax, int libre) {
		super();
		this.idhabitacion = idhabitacion;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.pax = pax;
		this.libre = libre;
	}

	

	public HabitacionDTO(String nombre, String descripcion, int pax, int libre) {
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
	public int getPax() {
		return pax;
	}
	public void setPax(int pax) {
		this.pax = pax;
	}
	public int getLibre() {
		return libre;
	}
	public void setLibre(int libre) {
		this.libre = libre;
	}
	
	
}

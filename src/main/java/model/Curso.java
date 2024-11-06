package model;

public class Curso {
	
	private int codigo;
	private String nombre;
	private int nivel;
	private int modalidad;
	private int creditos;
	private double precio;
	
	
	public Curso(String nombre, int nivel, int modalidad, int creditos, double precio) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.modalidad = modalidad;
		this.creditos = creditos;
		this.precio = precio;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getNivel() {
		return nivel;
	}


	public void setNivel(int nivel) {
		this.nivel = nivel;
	}


	public int getModalidad() {
		return modalidad;
	}


	public void setModalidad(int modalidad) {
		this.modalidad = modalidad;
	}


	public int getCreditos() {
		return creditos;
	}


	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
	
}

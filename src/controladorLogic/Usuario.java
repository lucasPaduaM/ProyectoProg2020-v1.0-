package controladorLogic;

import java.time.LocalDate;

public class Usuario {
	private int ci;
	private String contrasenia;
	private String nombre;
	private String apellido;
	private String mail;
	private LocalDate fechaNacimiento;
	
	Usuario(int ci, String contrasenia, String nombre, String apellido, String mail, LocalDate fechaNacimiento){
		this.ci=ci;
		this.contrasenia=contrasenia;
		this.nombre=nombre;
		this.apellido=apellido;
		this.contrasenia=contrasenia;
		this.mail=mail;
		this.fechaNacimiento=fechaNacimiento;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}

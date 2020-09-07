package controladorLogic;

import java.time.LocalDate;

public class Docente extends Usuario {
	Docente(int ci, String contrasenia, String nombre, String apellido, String mail, LocalDate fechaNacimiento) {
		super(ci, contrasenia, nombre, apellido, mail, fechaNacimiento);
	}
}

package controladorLogic;

import java.time.LocalDate;

public class Funcionario extends Usuario {

	Funcionario(int ci, String contrasenia, String nombre, String apellido, String mail, LocalDate fechaNacimiento) {
		super(ci, contrasenia, nombre, apellido, mail, fechaNacimiento);
	}
}

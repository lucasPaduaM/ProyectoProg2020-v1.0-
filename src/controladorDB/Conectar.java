package controladorDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {
	private static Connection conn;
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String user = "root";
	private static final String password = "";
	private static final String url = "jdbc:mysq://localhost:3306/prueba";

	public Conectar() {
		conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("Conectado");
			} else {
				System.out.println("Conexion fallida");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	public Connection getConnection() {
		return conn;
	}

	public void desconectar() {
		conn = null;
		if (conn != null) {
			System.out.println("Desconectado");
		}
	}

}
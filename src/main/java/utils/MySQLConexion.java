package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConexion {

	public static Connection getConexion() {
		Connection con = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/bd_ventas_cursos";
			String usr="root";
			String psw="";
			
			//Establecemos conexión
			con= DriverManager.getConnection(url, usr, psw);
										
		} catch (ClassNotFoundException ex) {
			System.out.println("Error >> Driver no instalado !" + ex.getMessage());
		} catch (SQLException ex) {
			System.out.println("Error >> Conexión con la BD !" + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Error >> General!" + ex.getMessage());
		} 
		return con;
	}
}
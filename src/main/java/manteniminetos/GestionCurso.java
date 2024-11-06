package manteniminetos;

import java.sql.Connection;
import java.sql.PreparedStatement;



import interfaces.CursoInterface;
import model.Curso;
import utils.MySQLConexion;


public class GestionCurso implements CursoInterface {
		

	
	public int registrar(Curso curso) {
		
		//Variables 
		int rs=0;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		try {
			
			//Estableciendo conexion a la BD
			con = MySQLConexion.getConexion();
			
			//Armar el query de insert
			String sql = " insert into tb_cursos values (null, ?,?,?,?,?)";
			
			//Pasando la cnx y el sql al PreparedStatement
			pst = con.prepareStatement(sql);
			
			//parametrizar
			pst.setString(1,curso.getNombre());
			pst.setInt(2,curso.getNivel());
			pst.setInt(3,curso.getModalidad());
			pst.setInt(4,curso.getCreditos());
			pst.setDouble(5,curso.getPrecio());
			
			//Ejecucion
			rs=pst.executeUpdate();
			
			 } catch (Exception e) {
				 System.out.println("Error en la sentencia" + e.getMessage());
			
				 } finally {
					 try {
						if (pst!=null) pst.close();
						if (con!=null) con.close();
					} catch (Exception e2) {
						System.out.println("Error al cerrar" + e2.getMessage());
					}
			
			}

		return rs;
		
		}	
}

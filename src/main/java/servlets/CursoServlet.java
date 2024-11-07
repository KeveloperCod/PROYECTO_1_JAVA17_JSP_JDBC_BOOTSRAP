package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import manteniminetos.GestionCurso;
import model.Curso;

import java.io.IOException;

/**
 * Servlet implementation class CursoServlet
 */
@WebServlet("/cursoServlet")
public class CursoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CursoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		String opcion = request.getParameter("opcion");
		System.out.println("Valor del boton :" + opcion);
		
		switch (opcion) {
		case "reg":  
			 	registrar (request, response);
			 	break;
		case "act":
				break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
		
		
	}

	private void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // Variables
	    String mensaje = "";

	    // Entradas
	    String nombre = request.getParameter("txtNombre");
	    int nivel = Integer.parseInt(request.getParameter("cboNivel"));
	    int modalidad = Integer.parseInt(request.getParameter("cboModalidad"));
	    int creditos = Integer.parseInt(request.getParameter("txtCreditos"));
	    double precio = Double.parseDouble(request.getParameter("txtPrecio"));

	    // Creo el objeto Curso
	    Curso objCurso = new Curso(nombre, nivel, modalidad, creditos, precio);

	    // Proceso de registro
	    GestionCurso gestionCurso = new GestionCurso();

	    // Pasamos el objeto a registrar
	    int ok = gestionCurso.registrar(objCurso);

	    // Establecer el mensaje según el resultado de la operación
	    if (ok == 0) {
	        mensaje = "Error al registrar los datos.";
	    } else {
	        mensaje = "Registro exitoso.";
	    }

	    // Enviar el mensaje al JSP
	    request.setAttribute("mensaje", mensaje);
	    request.getRequestDispatcher("curso/registrarCurso.jsp").forward(request, response);
	}

}

package app.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.modelo.Agenda;

import app.persistencia.AccesoAgenda;

/**
 * Servlet implementation class Control
 */
@WebServlet("/control")
public class Control extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Control() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { 
		//obtener todos
		consultarTodos(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String opcion = request.getParameter("op");

		switch (opcion) {
		case "1":
			alta(request, response);

			break;

		case "2":
			baja(request, response);

			break;

		case "3":
			modificar(request, response);

			break;

		case "4":
			consultarUno(request, response);

			break;

		default:
			break;
		}

	}

	private void alta(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Agenda a1 = (Agenda) request.getAttribute("a1");
		AccesoAgenda ae1 = new AccesoAgenda();
		try {
			ae1.altaContacto(a1);
			request.setAttribute("mensaje", "Alta exitosa");
		
			RequestDispatcher rq = request.getRequestDispatcher("/mensaje.jsp");
			
			System.out.println("entra aqui");
			rq.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		
	
		
	}
	
	
	private void baja(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		
		Agenda a1 = (Agenda) request.getAttribute("a1");
		AccesoAgenda ae1 = new AccesoAgenda();
		try {
			ae1.eliminarContacto(a1.getIdcontacto());
			request.setAttribute("mensaje", "Baja exitosa");
			RequestDispatcher rq = request.getRequestDispatcher("/mensaje.jsp");
			rq.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}
	

	private void modificar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Agenda a1 = (Agenda) request.getAttribute("a1");
		AccesoAgenda ae1 = new AccesoAgenda();
		try {
			if (ae1.modificarContacto(a1)) {
				request.setAttribute("mensaje", "Cambios Realizados");
			} else {

				request.setAttribute("mensaje", "No se ha podido modificar");
			}

			RequestDispatcher rq = request.getRequestDispatcher("/mostrar.jsp");
			System.out.println("entra aqui");
			rq.forward(request, response);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}

	}
	

	private void consultarUno(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		
		Agenda a1 = (Agenda) request.getAttribute("a1");
		AccesoAgenda ae1= new AccesoAgenda();
		try {
			a1 = ae1.obtenerUno(a1.getIdcontacto());
			System.out.println(a1.toString());
			request.setAttribute("a1", a1);
			RequestDispatcher rq = request.getRequestDispatcher("/mostrar.jsp");
			
			rq.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		
	
		
		
	}
	
	private void consultarTodos (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		AccesoAgenda ae1 = new AccesoAgenda();
		List<Agenda> todos = new ArrayList<Agenda>();
		
	
		try {
			todos= ae1.obtenerTodos();
			System.out.println(todos.toString());
			request.setAttribute("todos", todos);
			RequestDispatcher rq = request.getRequestDispatcher("/mostrartodos.jsp");
			rq.forward(request, response);
			
		} catch (ClassNotFoundException | SQLException e) {

			System.out.println(e.toString());
		}	
		
		
	}
	
}
